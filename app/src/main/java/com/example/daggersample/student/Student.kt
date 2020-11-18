package com.example.daggersample.student

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Akash Saini on 13/07/20.
 */

    class Student @Inject constructor(
        private val address: Address,
        @Named("TestRecord") private val record: IRecord) {
        fun getStudentRecord() {
            Log.d("testTag", "address: ${address.getAddress()} and record: ${record.getRecord()}")
        }
    }


