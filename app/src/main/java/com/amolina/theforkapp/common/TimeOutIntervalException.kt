package com.amolina.theforkapp.common

import java.lang.Exception

class TimeOutIntervalException(delay:Long):Exception("Timeout: $delay") {
}