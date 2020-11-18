package com.example.daggersample.student.dagger

import com.example.daggersample.student.Address
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Akash Saini on 25/07/20.
 */

@Module
object AddressModule {

    @JvmStatic
    @Provides
    fun getAddress(): Address {
        return Address()
    }
}