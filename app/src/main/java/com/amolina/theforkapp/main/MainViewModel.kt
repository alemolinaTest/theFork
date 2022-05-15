package com.amolina.theforkapp.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.amolina.domain.model.Data
import com.amolina.domain.model.RestaurantResult
import com.amolina.domain.usecases.GetRestaurantData
import com.amolina.theforkapp.common.AsyncStateViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getRestaurantData: GetRestaurantData
) : AsyncStateViewModel() {

    companion object {
        const val RESTAURANT_DEFAULT_ID = "6861"
    }

    init {
        getRestaurantData(RESTAURANT_DEFAULT_ID)
    }

    private val _allRestaurantData = MutableLiveData<RestaurantResult>()
    val allRestaurantData: LiveData<RestaurantResult> = _allRestaurantData

    private fun getRestaurantData(restaurantId: String) {

        launchHandlingStates {
            val restaurantData = getRestaurantData.invoke(restaurantId)
            restaurantData?.let { res ->
                if (res.result==1) {

                    _allRestaurantData.value = res
                } else {
                    //show no warehouse info
                }
            }
        }
    }


}