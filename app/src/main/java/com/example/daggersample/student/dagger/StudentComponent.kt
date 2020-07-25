package com.example.daggersample.student.dagger

import com.example.daggersample.ActivityScope
import com.example.daggersample.AppComponent
import com.example.daggersample.MainActivity
import com.example.daggersample.student.SchoolModule
import com.example.daggersample.student.Student
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

/**
 * Created by Akash Saini on 13/07/20.
 */

@ActivityScope
@Subcomponent(
    modules = [AddressModule::class, RecordModule::class]
)
interface StudentComponent {
    fun getStudent(): Student

    fun inject(activity: MainActivity)

    @Subcomponent.Factory
    interface Factory {

        fun getStudentComponent(
            @BindsInstance @Named("city") city: String,
            @BindsInstance @Named("pincode") pinCode: Int,
            @BindsInstance @Named("state") state: String,
            addressModule: AddressModule
        ): StudentComponent
    }
}


















