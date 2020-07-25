package com.example.daggersample.student.dagger

import com.example.daggersample.student.IRecord
import com.example.daggersample.student.Record
import dagger.Binds
import dagger.Module

/**
 * Created by Akash Saini on 25/07/20.
 */

@Module
abstract class RecordModule {

    @Binds
    abstract fun bindRecord(record: Record): IRecord
}