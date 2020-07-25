package com.example.daggersample.student

import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Akash Saini on 13/07/20.
 */
class Address(val city: String, val pinCode: Int, val state: String) {

    fun getAddress(): String {
        return "Indra coloney, $city, $state ($pinCode)"
    }
}

