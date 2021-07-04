package com.example.myapplication.homework10

import kotlin.random.Random

object CandyGenerate {

    private lateinit var listCandy : MutableList<Candy>
    private const val BRAND_SNICKERS = "Snickers"
    private const val BRAND_MARS = "Mars"
    private const val BRAND_BOUNTY = "Bounty"

    fun showCandy(): MutableList<Candy> {
        listCandy = mutableListOf()
        for (i in 1..300){
            when(i) {
                in 1..100 -> {
                    listCandy.add(Candy(BRAND_SNICKERS, generateBarcode()))
                }
                in 101..200 -> {
                    listCandy.add(Candy(BRAND_MARS, generateBarcode()))
                }
                in 201..300 -> {
                    listCandy.add(Candy(BRAND_BOUNTY, generateBarcode()))
                }
            }
        }
        return  listCandy
    }

    private fun generateBarcode() = (10000000..99999999).random()
}