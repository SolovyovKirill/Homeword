package com.example.myapplication.homework7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.myapplication.databinding.ActivityHomework7Binding

class Homework7Activity : AppCompatActivity() {
    private lateinit var binding: ActivityHomework7Binding
    private  var timerNumber: Int = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomework7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState != null)
        timerNumber = savedInstanceState.getInt("TIMER")

        val timerText = binding.timerText
        val button = binding.button
        val loginEditText = binding.loginEdit
        val passwordEditText = binding.passwordEdit
        timerText.text = timerNumber.toString()

        button.setOnClickListener {
            if (!timerText.isVisible){
                val intent = Intent(this, UserInformationActivity::class.java).apply {
                    putExtra("login", "Login: " + loginEditText.text)
                    putExtra("password", "Password: " + passwordEditText.text)
                }
                startActivity(intent)
            }
            timerNumber--
            if (timerNumber == 0) {
                loginEditText.isVisible = true
                passwordEditText.isVisible = true
                timerText.isVisible = false
            }
            timerText.text = timerNumber.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("TIMER", timerNumber)
    }
}
