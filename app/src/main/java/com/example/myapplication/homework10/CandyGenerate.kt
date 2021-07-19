package com.example.myapplication.homework10

object CandyGenerate {

    private val listCandy = mutableListOf<Candy>()
    const val TAG = "TAG"
    const val BRAND_SNICKERS = "Snickers"
    const val BRAND_MARS = "Mars"
    const val BRAND_BOUNTY = "Bounty"
    const val THREEHUNDRED = 300
    const val URL_SNICKERS =
        "https://telegka.com/image/cache/catalog/category/shokolad/07bd376b340e4ff36ccb113fe96cb2ce-1000x1000.jpg"
    const val URL_MARS =
        "https://ae01.alicdn.com/kf/Ue81e157831af483c93f86e98b611f80dh/Mars.jpg"
    const val URL_BOUNTY =
        "http://storage.googleapis.com/p24-photos/products/4011100977624/site/1_4011100977624.jpg"


    fun getCandiesList(): MutableList<Candy> {
        for (i in 1..THREEHUNDRED) {
            when (i) {
                in 1..(THREEHUNDRED / 3) -> {
                    listCandy.add(Candy(BRAND_SNICKERS, generateBarcode()))
                }
                in ((THREEHUNDRED / 3) + 1)..((THREEHUNDRED / 3) * 2) -> {
                    listCandy.add(Candy(BRAND_MARS, generateBarcode()))
                }
                in (((THREEHUNDRED / 3) * 2) + 1)..THREEHUNDRED -> {
                    listCandy.add(Candy(BRAND_BOUNTY, generateBarcode()))
                }
            }
        }
        return listCandy
    }

     fun generateBarcode() = (10000000..99999999).random()

}