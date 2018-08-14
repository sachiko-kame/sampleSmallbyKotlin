package com.example.kameko.samplesmallbykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var sampleString: String
        get() = this.toString()
        set(value) {
            println("あてはめました！$value")
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(sampleString)
        sampleString = "カメ吉です"
        println(sampleString)
    }
}
