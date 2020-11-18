package com.example.daggersample.student.dagger

import com.example.daggersample.MainActivity
import com.example.daggersample.student.Student
import dagger.Component

/**
 * Created by Akash Saini on 13/07/20.
 */
@Component()
interface StudentComponent {
    fun inject(activity: MainActivity)
}


















