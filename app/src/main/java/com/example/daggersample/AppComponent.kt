package com.example.daggersample

import com.example.daggersample.student.School
import com.example.daggersample.student.SchoolModule
import com.example.daggersample.student.dagger.StudentComponent
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Akash Saini on 25/07/20.
 */

@Singleton
@Component(modules = [SchoolModule::class])
interface AppComponent {
    fun getStudentComponent(): StudentComponent
}