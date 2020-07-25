package com.example.daggersample.student.dagger

import com.example.daggersample.student.Address
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by Akash Saini on 25/07/20.
 */

@Module
class AddressModule() {

    @Provides
    fun getAddress(
        @Named("city") city: String,
        @Named("pincode") pinCode: Int,
        @Named("state") state: String
    ): Address {
        return Address(city, pinCode, state)
    }
}