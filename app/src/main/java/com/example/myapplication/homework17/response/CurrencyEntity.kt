package com.example.myapplication.homework17.response

import com.google.gson.annotations.SerializedName

data class CurrencyEntity(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("sign") val sign: String,
    @SerializedName("symbol") val symbol: String
)
