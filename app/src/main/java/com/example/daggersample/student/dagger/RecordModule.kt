package com.example.daggersample.student.dagger

import com.example.daggersample.student.IRecord
import com.example.daggersample.student.Record
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by Akash Saini on 25/07/20.
 */

    @Module
    abstract class RecordModule {

        @Binds @Named("StudentRecord")
        abstract fun bindRecord(record: Record): IRecord

        @Binds @Named("TestRecord")
        abstract fun bindTestRecord(record: TestRecord): IRecord
    }



