package com.amolina.theforkapp.common

sealed class Interval {

    abstract fun delay(): Long

    class PollerInterval(private val eta: Long) : Interval() {

        private var nextDelay: Long = eta / 5

        var totalDelay: Long = 0
            private set

        override fun delay(): Long {
            val delay = nextDelay

            if (delay > eta * 4) {
                throw TimeOutIntervalException(eta)
            }

            nextDelay *= 2
            totalDelay += delay
            return delay
        }
    }

    class FixInterval(private val delay: Long) : Interval() {
        override fun delay() = delay
    }
}