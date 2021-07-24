package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val m_button = findViewById<Button>(R.id.button_main)
        val input_text = findViewById<EditText>(R.id.editText_main)
        m_button.setOnClickListener {
            val text1 = input_text.text.toString()
            startActivity(Intent(this, SecondActivity::class.java).also {
                it.putExtra("INPUT_TEXT", text1)
            })

        }
        val message_act2 = findViewById<TextView>(R.id.message_act)
        var text4 = intent.getStringExtra("EDIT_TEXT")

        message_act2.text = text4.toString()
    }
}