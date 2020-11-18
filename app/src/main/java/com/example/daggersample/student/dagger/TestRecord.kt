package com.example.daggersample.student.dagger

import com.example.daggersample.student.IRecord
import javax.inject.Inject
import javax.inject.Named

class TestRecord @Inject constructor(): IRecord {
    override fun getRecord(): String {
        return "test record"
    }
}