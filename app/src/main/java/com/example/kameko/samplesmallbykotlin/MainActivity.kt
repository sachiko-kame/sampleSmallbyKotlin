package com.example.kameko.samplesmallbykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val animals = arrayListOf(aString.dog, aString.cat, aString.turtle)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (one in animals){
            when (one) {
                aString.dog -> println("犬か")
                aString.cat -> println("猫か")
                else -> {
                    println("亀かもしれない")
                }
            }
        }
    }
}

enum class aString(val text: String){
    dog("犬"),
    cat("猫"),
    turtle("かめ")
}
