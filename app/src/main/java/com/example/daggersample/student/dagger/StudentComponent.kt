package com.example.daggersample.student.dagger

import com.example.daggersample.ActivityScope
import com.example.daggersample.AppComponent
import com.example.daggersample.MainActivity
import com.example.daggersample.student.SchoolModule
import com.example.daggersample.student.Student
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

/**
 * Created by Akash Saini on 13/07/20.
 */

@ActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [AddressModule::class, RecordModule::class]
)
interface StudentComponent {
    fun inject(activity: MainActivity)
}


















