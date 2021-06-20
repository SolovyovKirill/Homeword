package com.example.myapplication.homework7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivityUserInformationBinding

class UserInformationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserInformationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val userLogin = binding.userLogin
        val userPassword = binding.userPassword
        userLogin.text = intent.getStringExtra("login")
        userPassword.text = intent.getStringExtra("password")
        binding.buttonClose.setOnClickListener {
            this.finish()
        }

        Glide
            .with(this)
            .load("https://icdn.lenta.ru/images/2021/04/27/16/20210427163138131/square_320_c09ebae17387b7d6eeb9fa0d42afe5ee.jpg")
            .into(binding.ivImage)
    }

}