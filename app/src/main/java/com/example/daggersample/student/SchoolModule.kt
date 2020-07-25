package com.example.daggersample.student

import com.example.daggersample.ActivityScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Akash Saini on 25/07/20.
 */

@Module
object SchoolModule {

    @Singleton
    @JvmStatic
    @Provides
    fun getSchool(): School {
        return School()
    }
}