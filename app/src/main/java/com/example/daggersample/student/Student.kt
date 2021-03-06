package com.example.daggersample.student

import android.util.Log
import javax.inject.Inject

/**
 * Created by Akash Saini on 13/07/20.
 */
class Student @Inject constructor(
    private val address: Address,
    private val record: Record,
    private val school: School
) {
    fun getStudentRecord() {
        Log.d("testTag", "address: ${address.getAddress()} and record: ${record.getRecord()}")
        Log.d("testTag", "record: $record and school is $school")
    }
}