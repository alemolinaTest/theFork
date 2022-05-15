package com.amolina.theforkapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ForkApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}