package com.example.kameko.samplesmallbykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val sampleText:String = "もしもし"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sampleText.text()
    }
}

fun String.text() {
    println("自分のテキストは$this")
}