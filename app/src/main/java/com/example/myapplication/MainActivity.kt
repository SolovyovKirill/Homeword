package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.homework3.Animal
import com.example.myapplication.homework3.Cat
import com.example.myapplication.homework3.Leopard

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        descriptionOfTheAnimal(Cat(5.2, "Barsik"))
        descriptionOfTheAnimal(Leopard(16.1, "Leo"))
    }

     fun <T> descriptionOfTheAnimal(animal: T) where T : Animal{
        println("${animal.nameOfAnimal} проебежал за ${animal.timeDistance()} часа")
    }

}