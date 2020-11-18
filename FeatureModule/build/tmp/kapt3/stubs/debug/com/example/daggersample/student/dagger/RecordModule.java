package com.example.daggersample.student.dagger;

import java.lang.System;

/**
 * Created by Akash Saini on 25/07/20.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/daggersample/student/dagger/RecordModule;", "", "()V", "bindRecord", "Lcom/example/daggersample/student/IRecord;", "record", "Lcom/example/daggersample/student/Record;", "FeatureModule_debug"})
@dagger.Module()
public abstract class RecordModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @com.example.featuremodule.student.dagger.ActivityScope()
    public abstract com.example.daggersample.student.IRecord bindRecord(@org.jetbrains.annotations.NotNull()
    com.example.daggersample.student.Record record);
    
    public RecordModule() {
        super();
    }
}