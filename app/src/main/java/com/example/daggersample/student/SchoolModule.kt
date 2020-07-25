package com.example.daggersample.student

import com.example.daggersample.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by Akash Saini on 25/07/20.
 */

@Module
object SchoolModule {

    @ActivityScope
    @JvmStatic
    @Provides
    fun getSchool(): School {
        return School()
    }
}