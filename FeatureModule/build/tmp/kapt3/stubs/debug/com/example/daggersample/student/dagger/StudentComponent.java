package com.example.daggersample.student.dagger;

import java.lang.System;

/**
 * Created by Akash Saini on 13/07/20.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/daggersample/student/dagger/StudentComponent;", "", "inject", "", "activity", "Lcom/example/featuremodule/student/MainActivity;", "FeatureModule_debug"})
@dagger.Subcomponent(modules = {com.example.daggersample.student.dagger.AddressModule.class, com.example.daggersample.student.dagger.RecordModule.class})
@com.example.featuremodule.student.dagger.ActivityScope()
public abstract interface StudentComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.featuremodule.student.MainActivity activity);
}