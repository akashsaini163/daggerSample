package com.example.daggersample.student

import com.example.daggersample.ActivityScope
import javax.inject.Inject

/**
 * Created by Akash Saini on 13/07/20.
 */
@ActivityScope
class Record @Inject constructor(): IRecord {

    override fun getRecord(): String {
        return "student's record"
    }
}