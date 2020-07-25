package com.example.daggersample

import android.app.Application

/**
 * Created by Akash Saini on 25/07/20.
 */
class MyApplication: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}