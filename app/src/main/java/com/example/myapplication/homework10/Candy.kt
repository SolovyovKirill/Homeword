package com.example.myapplication.homework10

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Candy(
    val brand: String,
    val barcode: Int
) : Parcelable