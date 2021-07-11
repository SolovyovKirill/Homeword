package com.example.myapplication.homework12

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {

    private var counter = 0
    private lateinit var binding: ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNextFragment.setOnClickListener {
            counter++
            replaceFragment()
        }
    }

    fun replaceFragment() {
        when (counter) {
            1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container_view, FirstFragment())
                    .commit()
            }
            2 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container_view, SecondFragment())
                    .commit()
            }
            3 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container_view, ThirdFragment())
                    .commit()
            }
            4 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container_view, FourthFragment())
                    .commit()
            }
            5 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container_view, FifthFragment())
                    .commit()
            }
        }
    }

}