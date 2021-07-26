package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.homework10.CandyActivity
import com.example.myapplication.homework12.FragmentActivity
import com.example.myapplication.homework13.MyActivity
import com.example.myapplication.homework16.MessageActivity
import com.example.myapplication.homework17.CurrencyActivity
import com.example.myapplication.homework19.AlarmActivity
import com.example.myapplication.homework20.WeatherActivity
import com.example.myapplication.homework6.FlagsActivity
import com.example.myapplication.homework7.CounterActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHomework6.setOnClickListener {
            startActivity(Intent(this, FlagsActivity::class.java))
        }
        binding.btnHomework7.setOnClickListener {
            startActivity(Intent(this, CounterActivity::class.java))
        }
        binding.btnHomework10.setOnClickListener {
            startActivity(Intent(this, CandyActivity::class.java))
        }
        binding.btnHomework12.setOnClickListener {
            startActivity(Intent(this, FragmentActivity::class.java))
        }
        binding.btnHomework13.setOnClickListener {
            startActivity(Intent(this, MyActivity::class.java))
        }
        binding.btnHomework16.setOnClickListener {
            startActivity(Intent(this, MessageActivity::class.java))
        }
        binding.btnHomework17.setOnClickListener {
            startActivity(Intent(this, CurrencyActivity::class.java))
        }
        binding.btnHomework19.setOnClickListener {
            startActivity(Intent(this, AlarmActivity::class.java))
        }
        binding.btnHomework20.setOnClickListener {
            startActivity(Intent(this, WeatherActivity::class.java))
        }
    }
}