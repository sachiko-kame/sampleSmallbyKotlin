package com.example.kameko.samplesmallbykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
        println(readWriteMap["foo"])

        for ((key, value) in readWriteMap) {
            println("$key と $value")
        }
    }
}

