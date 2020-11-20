package com.example.daggersample.student

import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Akash Saini on 13/07/20.
 */
class Address @Inject constructor() {

    fun getAddress(): String {
        return "Indra coloney"
    }
}

