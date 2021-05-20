package com.example.myapplication.homework2

class Car (var brand: String,
           var color: String = "black",
           var engineCapacity: Double,
           var licensePlate: String?){

    fun printCar ():String {
        return println("Марка $brand, цвет $color, объём двигателя $engineCapacity, номер автомобиля ${licensePlate ?: "Transit"}.").toString()
    }
}