package com.example.daggersample.student

import javax.inject.Inject

/**
 * Created by Akash Saini on 13/07/20.
 */
class Record @Inject constructor(): IRecord {

    override fun getRecord(): String {
        return "student's record"
    }
}