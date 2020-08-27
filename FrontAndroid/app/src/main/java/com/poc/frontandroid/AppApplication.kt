package com.poc.frontandroid

import android.app.Application
import com.poc.frontandroid.beagle.BeagleSetup

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }
}
