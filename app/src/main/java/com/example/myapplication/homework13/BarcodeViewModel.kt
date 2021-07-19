package com.example.myapplication.homework13

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.homework10.Candy
import com.example.myapplication.homework10.CandyGenerate

class BarcodeViewModel : ViewModel() {

    val liveData: MutableLiveData<MutableList<Candy>> = MutableLiveData()

    init {
        genBarcodeFromCandyGenerate()
    }

    private fun genBarcodeFromCandyGenerate() {
        liveData.value = CandyGenerate.getCandiesList()
    }
}