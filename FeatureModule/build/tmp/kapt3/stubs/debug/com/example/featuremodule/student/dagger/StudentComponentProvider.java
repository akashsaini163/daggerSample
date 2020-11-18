package com.example.featuremodule.student.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/featuremodule/student/dagger/StudentComponentProvider;", "", "getStudentComponent", "Lcom/example/daggersample/student/dagger/StudentComponent;", "addressModule", "Lcom/example/daggersample/student/dagger/AddressModule;", "FeatureModule_debug"})
public abstract interface StudentComponentProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.daggersample.student.dagger.StudentComponent getStudentComponent(@org.jetbrains.annotations.NotNull()
    com.example.daggersample.student.dagger.AddressModule addressModule);
}