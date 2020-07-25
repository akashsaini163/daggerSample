package com.example.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggersample.student.Student
import com.example.daggersample.student.dagger.AddressModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val studentComponent =
            (application as MyApplication).appComponent.getStudentComponentFactory()
                .getStudentComponent(
                    "alwar",
                    301001,
                    "rajasthan",
                    AddressModule()
                )
        studentComponent.inject(this)
        student.getStudentRecord()

        studentComponent.getStudent().getStudentRecord()
    }

    @Inject
    lateinit var student: Student

    @Inject
    fun init() {
    }
}