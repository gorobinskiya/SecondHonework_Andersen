package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn_toast = findViewById<Button>(R.id.button_toast)
        var btn_count = findViewById<Button>(R.id.button_count)
        var count_text = findViewById<TextView>(R.id.show_count)
        var count = 0


        btn_toast.setOnClickListener {
            Toast.makeText(this, "Hello, Toast", Toast.LENGTH_SHORT).show()
        }

        btn_count.setOnClickListener {
            count++
            count_text.text = "$count"
        }

    }





    fun countUp(view:View){

    }

}