package com.example.kameko.samplesmallbykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val nameClass = NameClass("カモメ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameClass.NameText()
    }
}

class NameClass(name: String) {
    var name: String = ""

    init {
        this.name = name
    }

    fun NameText(){
        println(this.name)
    }
}
