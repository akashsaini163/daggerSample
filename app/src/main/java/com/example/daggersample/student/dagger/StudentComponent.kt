package com.example.daggersample.student.dagger

import com.example.daggersample.MainActivity
import com.example.daggersample.student.Student
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

/**
 * Created by Akash Saini on 13/07/20.
 */
@Component(modules = [AddressModule::class, RecordModule::class])
interface StudentComponent {
    fun getStudent(): Student

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun getCity(@Named("city") city: String): Builder

        @BindsInstance
        fun getState(@Named("state") state: String): Builder

        @BindsInstance
        fun getPinCode(@Named("pincode") pinCode: Int): Builder

        fun getAddressModule(addressModule: AddressModule): Builder

        fun build(): StudentComponent
    }
}