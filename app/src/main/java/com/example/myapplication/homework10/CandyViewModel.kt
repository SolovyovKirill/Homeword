package com.example.myapplication.homework10

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CandyViewModel(
    val candyLiveData: MutableLiveData<MutableList<Candy>> = MutableLiveData()
) : ViewModel() {

    fun getCandyGenerate() {
        candyLiveData.value = CandyGenerate.getCandiesList()
    }

    init {
        getCandyGenerate()
    }

}