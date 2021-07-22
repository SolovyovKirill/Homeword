package com.example.myapplication.homework17

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class CurrencyViewModel(
    private val currencyRepository: CurrencyRepository
) : ViewModel() {

    val liveData: MutableLiveData<List<Currency>> = MutableLiveData()

    fun getInfoAboutCurrencyLimit(limit: Int) {
        viewModelScope.launch(Dispatchers.Main) {
            val currencyList = withContext(Dispatchers.IO) {
                currencyRepository.getInfoAboutCurrencyLimit(limit)
            }
            liveData.value = currencyList
        }
    }

}
