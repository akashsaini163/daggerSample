package com.example.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggersample.student.Student
import com.example.daggersample.student.dagger.AddressModule
import com.example.daggersample.student.dagger.DaggerStudentComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val studentComponent = DaggerStudentComponent.builder()
            .appComponent((application as MyApplication).appComponent).build()
        studentComponent.inject(this)
        student.getStudentRecord()
    }

    @Inject
    lateinit var student: Student

    @Inject
    fun init() {
    }
}