package com.example.twoactivities

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var message = findViewById<TextView>(R.id.message_text)

        var text2 = intent.getStringExtra("INPUT_TEXT")

        message.text = text2.toString()

        var button_send = findViewById<Button>(R.id.button_send)
        var edit_message = findViewById<EditText>(R.id.edit_message)

        button_send.setOnClickListener {
            var edit_message = findViewById<EditText>(R.id.edit_message)
            val stringToPassBack = edit_message.text.toString()

            // Put the String to pass back into an Intent and close this activity
            val intent = Intent()
            intent.putExtra("keyName", stringToPassBack)
            setResult(Activity.RESULT_OK, intent)
            Log.d(LOG_TAG, "End SecondActivity");
            finish()

        }

    }
    companion object{
        private const val LOG_TAG = "Lifecycle_SecondActivity"
    }
}