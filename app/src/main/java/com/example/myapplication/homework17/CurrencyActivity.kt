package com.example.myapplication.homework17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityCurrencyBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CurrencyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCurrencyBinding

//    private val viewModel: CurrencyViewModel by viewModels {
//        CurrencyViewModelFactory((application as MyApp).currencyRepository)
//    }

    private val viewModel: CurrencyViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCurrencyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currencyAdapter = CurrencyAdapter()
        with(binding.rvCurrency) {
            layoutManager = LinearLayoutManager(
                this@CurrencyActivity, LinearLayoutManager.VERTICAL, false
            )
            adapter = currencyAdapter
        }

        binding.btnStart.setOnClickListener {
            isChekUserChoose()
        }

        viewModel.liveData.observe(this, {
            currencyAdapter.submitList(it)
        })
    }

    private fun isChekUserChoose() {
        val limit: String = binding.etCount.text.toString()
        viewModel.getInfoAboutCurrencyLimit(limit.toInt())
    }

}