package com.example.myapplication.homework2

object Garage {
    fun list(){
        val bmw = Car (brand = "BMW", color = "black", engineCapacity = 2.0, licensePlate = null)
        bmw.printCar()
        val mersedes = Car (brand = "Mersedes", color = "white", engineCapacity = 3.0, licensePlate = "AM-2020")
        mersedes.printCar()
        val lada = Car (brand = "Lada", color = "gray", engineCapacity = 1.6, licensePlate = "KM-1513")
        lada.printCar()
        val audi = Car (brand = "Audi", color = "white", engineCapacity = 4.2, licensePlate = "LK-1646")
        audi.printCar()
        val nissan = Car (brand = "Nissan", color = "green", engineCapacity = 1.9, licensePlate = "IO-6156")
        nissan.printCar()
        val ford = Car (brand = "Ford", color = "black", engineCapacity = 2.4, licensePlate = "FD-1661")
        ford.printCar()
    }
}