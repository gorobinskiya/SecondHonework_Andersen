package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var message = findViewById<TextView>(R.id.message_text)

        var text2 = intent.getStringExtra("INPUT_TEXT")

        message.text = text2.toString()

        var button_send = findViewById<Button>(R.id.button_send)
        var edit_message = findViewById<EditText>(R.id.edit_message)

        button_send.setOnClickListener {
            val text3 = edit_message.text.toString()
            startActivity(Intent(this, MainActivity::class.java).also {
                it.putExtra("EDIT_TEXT", text3)
            })
        }

    }
}