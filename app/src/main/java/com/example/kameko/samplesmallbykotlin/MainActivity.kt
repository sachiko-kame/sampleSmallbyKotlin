package com.example.kameko.samplesmallbykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val child = Child()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        child.bar()
        child.foo()

    }
}

interface MyInterface {
    fun bar()
    fun foo()
}


class Child : MyInterface {
    override fun bar() {
       println("バー")
    }
    override fun foo(){
        println("ふー")
    }
}