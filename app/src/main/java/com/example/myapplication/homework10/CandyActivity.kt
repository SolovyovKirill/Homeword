package com.example.myapplication.homework10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityCandyBinding

class CandyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCandyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCandyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val candyAdapter = CandyAdapter(CandyGenerate.showCandy())

        binding.rvCandy?.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvCandy?.adapter = candyAdapter
    }
}