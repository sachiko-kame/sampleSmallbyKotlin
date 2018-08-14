package com.example.kameko.samplesmallbykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numArray = arrayListOf(1, 2, 3, 4, 5)
        println(numArray.size)
    }
}
