package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.homework6.Homework6Activity
import com.example.myapplication.homework7.Homework7Activity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHomework6.setOnClickListener {
            startActivity(Intent(this, Homework6Activity::class.java))
        }
        binding.btnHomework7.setOnClickListener {
            startActivity(Intent(this, Homework7Activity::class.java))
        }
    }
}