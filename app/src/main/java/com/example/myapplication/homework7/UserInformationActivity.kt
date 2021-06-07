package com.example.myapplication.homework7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R

class UserInformationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_information)
        val intent = intent
        val userLogin = findViewById<TextView>(R.id.user_login)
        val userPassword = findViewById<TextView>(R.id.user_password)
        userLogin.text = intent.getStringExtra("login")
        userPassword.text = intent.getStringExtra("password")
    }
}