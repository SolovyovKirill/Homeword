package com.example.myapplication.homework6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityFlagsBinding


class FlagsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFlagsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFlagsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}