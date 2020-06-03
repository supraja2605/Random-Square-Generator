package com.example.randomsquaregenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.generate)
        rollButton.setOnClickListener { buttonPressed() }
    }

    fun higherOrder(number:Int,operation:(Int)->Int):Int{
        return square(number)
    }

    val square={value:Int->value*value}

    fun buttonPressed(){
        //random generator
        val number=(1..9).random()
        val result=higherOrder(number,square)
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text="The random number is $number and its square is $result"
    }
}
