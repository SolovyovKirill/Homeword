package com.example.myapplication.homework4

class Worker(name: String, wages: Int) : Employee(name, wages) {
    fun work(){
        println("$name работает")
    }
}