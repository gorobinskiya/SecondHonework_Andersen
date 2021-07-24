package com.example.birdcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val count_text1 = findViewById<TextView>(R.id.bird_counter2)


        val text1 = intent.getStringExtra("COUNT_TEXT")

        count_text1.text = text1.toString()
    }



}