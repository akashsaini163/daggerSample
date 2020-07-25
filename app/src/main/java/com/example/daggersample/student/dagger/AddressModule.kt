package com.example.daggersample.student.dagger

import com.example.daggersample.student.Address
import dagger.Module
import dagger.Provides

/**
 * Created by Akash Saini on 25/07/20.
 */

@Module
class AddressModule(val city: String, val pinCode: Int, val state: String) {

    @Provides
    fun getAddress(): Address {
        return Address(city, pinCode, state)
    }
}