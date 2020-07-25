package com.example.daggersample.student

import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Akash Saini on 13/07/20.
 */
class Address @Inject constructor(
    @Named("city") val city: String,
    @Named("pincode") val pinCode: Int,
    @Named("state") val state: String
) {

    fun getAddress(): String {
        return "Indra coloney, $city, $state ($pinCode)"
    }
}

