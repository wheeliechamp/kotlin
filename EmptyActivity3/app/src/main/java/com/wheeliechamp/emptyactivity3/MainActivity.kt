package com.wheeliechamp.emptyactivity3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.wheeliechamp.emptyactivity3.databinding.ActivityMainBinding
import com.wheeliechamp.emptyactivity3.data.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //binding.user = User("Your Name", "Your lastName")
        var aaa = User()
        aaa.firstName = "Your Name"
        aaa.lastName = "Your lastName"
        binding.user = aaa



    }
}