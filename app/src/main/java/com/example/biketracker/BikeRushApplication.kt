package com.example.biketracker

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class BikeRushApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // This function will let us use Timber for Debugging in our app
        Timber.plant(Timber.DebugTree())
    }
}