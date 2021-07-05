package com.example.myapplication.homework10

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityCandyBinding

class CandyActivity : AppCompatActivity() {

    var listCandy = mutableListOf<Candy>()
    private lateinit var binding: ActivityCandyBinding
    private val candyViewModel: CandyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCandyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val candyAdapter = CandyAdapter(listCandy)


        binding.rvCandy.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvCandy.adapter = candyAdapter

        candyViewModel.candyLiveData.observe(this, {
            candyAdapter.update(it)
        })

    }

}