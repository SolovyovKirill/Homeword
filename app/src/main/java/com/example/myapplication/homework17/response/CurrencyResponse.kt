package com.example.myapplication.homework17.response

import com.example.myapplication.homework17.response.CurrencyEntity
import com.example.myapplication.homework17.response.Status
import com.google.gson.annotations.SerializedName

data class CurrencyResponse(
    @SerializedName("data") val data: List<CurrencyEntity>,
    @SerializedName("status") val status: Status
)
