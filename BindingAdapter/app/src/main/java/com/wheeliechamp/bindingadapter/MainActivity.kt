package com.wheeliechamp.bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.wheeliechamp.bindingadapter.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.url = "https://www.google.com/logos/doodles/2021/girls-day-2021-6753651837108874-law.gif"
        binding.now = Date(System.currentTimeMillis())
        binding.lifecycleOwner = this
    }
}