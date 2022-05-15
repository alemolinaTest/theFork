package com.amolina.theforkapp.common

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.amolina.theforkapp.utils.Event
import kotlinx.coroutines.*

abstract class AsyncStateViewModel : ViewModel() {

    val error: LiveData<Event<Exception>>
        get() = _error
    val loading: LiveData<Boolean>
        get() = _loading

    private val job = SupervisorJob()

    private var _coroutineScope = CoroutineScope(Dispatchers.Main + job)
    val coroutineScope
        get() = _coroutineScope

    protected val _error = MutableLiveData<Event<Exception>>()
    protected val _loading = MutableLiveData<Boolean>()

    /**
     * Executes the given [block] if there are no other jobs running in the scope and handles the loading
     * and error states.
     */
    protected fun launchIfIdleHandlingStates(block: suspend CoroutineScope.() -> Unit) {
        launchIfIdle { executeHandlingStates(block) }
    }

    /**
     * Executes the given [block] and handles the loading and error states.
     */
    protected fun launchHandlingStates(block: suspend CoroutineScope.() -> Unit) {
        launch { executeHandlingStates(block) }
    }

    /**
     * Executes the given [block] and handles only the error states.
     * */
    protected fun launchHandlingErrors(block: suspend CoroutineScope.() -> Unit) {
        launch { executeHandlingErrors(block) }
    }

    /**
     * Executes the given [block] if there are no other jobs running in the scope and handles only the
     * error states.
     * */
    protected fun launchIfIdleHandlingErrors(block: suspend CoroutineScope.() -> Unit) {
        launchIfIdle { executeHandlingErrors(block) }
    }

    private suspend fun CoroutineScope.executeHandlingStates(block: suspend CoroutineScope.() -> Unit) {
        _loading.value = true
        try {
            block(this)
        } catch (e: Exception) {
            _error.value = Event(content = e)
        } finally {
            _loading.value = false
        }
    }

    private suspend fun CoroutineScope.executeHandlingErrors(block: suspend CoroutineScope.() -> Unit) {
        try {
            block(this)
        } catch (e: Exception) {
            _error.value = Event(content = e)
        }
    }

    protected fun CoroutineScope.executeIntervalAsync(
        interval: Interval, block: suspend CoroutineScope.() -> Unit
    ) =
        async {
            while (isActive) {
                block(this)
                delay(interval.delay())
            }
        }
}