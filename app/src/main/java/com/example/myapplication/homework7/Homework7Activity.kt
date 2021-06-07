package com.example.myapplication.homework7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import com.example.myapplication.R

class Homework7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework7)
        var timerNumber = 10
        val timerText = findViewById<TextView>(R.id.timer_text)
        val button = findViewById<Button>(R.id.button)
        val loginEditText = findViewById<EditText>(R.id.login_edit)
        val passwordEditText = findViewById<EditText>(R.id.password_edit)
        button.setOnClickListener {
            if (!timerText.isVisible){
                val intent = Intent(this@Homework7Activity, UserInformationActivity::class.java)
                intent.putExtra("login", "Login: " + loginEditText.text)
                intent.putExtra("password", "Password: " + passwordEditText.text)
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
}