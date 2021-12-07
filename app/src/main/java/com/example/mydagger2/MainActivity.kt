package com.example.mydagger2

import AppComponent
import Computer
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : Activity() {

    @Inject
    lateinit var computer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appComponent.inject(this)
       // val computer: Computer = appComponent.computer()
       // print(computer)
    }
}