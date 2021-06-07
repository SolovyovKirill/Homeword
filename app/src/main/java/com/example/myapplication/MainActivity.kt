package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.homework6.Homework6Activity
import com.example.myapplication.homework7.Homework7Activity

class MainActivity : AppCompatActivity() {

    private lateinit var homework6Button: Button
    private lateinit var homework7Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        homework6Button = findViewById(R.id.btn_homework6)
        homework6Button.setOnClickListener {
            startActivity(Intent(this, Homework6Activity::class.java))
        }

        homework7Button = findViewById(R.id.btn_homework7)
        homework7Button.setOnClickListener {
            startActivity(Intent(this, Homework7Activity ::class.java))
        }
    }
}