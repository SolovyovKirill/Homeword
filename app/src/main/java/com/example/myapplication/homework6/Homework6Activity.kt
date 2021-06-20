package com.example.myapplication.homework6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityHomework6Binding

class Homework6Activity : AppCompatActivity() {
    private lateinit var binding: ActivityHomework6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomework6Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}