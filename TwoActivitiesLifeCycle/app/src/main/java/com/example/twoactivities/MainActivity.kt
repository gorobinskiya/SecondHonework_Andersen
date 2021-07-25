package com.example.twoactivities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val SECOND_ACTIVITY_REQUEST_CODE = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val m_button = findViewById<Button>(R.id.button_main)
        val input_text = findViewById<EditText>(R.id.editText_main)
        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onCreate")

        

        m_button.setOnClickListener {
            val text1 = input_text.text.toString()
            val intent = Intent(this, SecondActivity::class.java).also {
                it.putExtra("INPUT_TEXT", text1)
            }
            startActivityForResult(intent, SECOND_ACTIVITY_REQUEST_CODE)


        }





    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == SECOND_ACTIVITY_REQUEST_CODE ){
            if (resultCode == Activity.RESULT_OK){
                val returnString = data!!.getStringExtra("keyName")
                val textView = findViewById(R.id.message_act) as TextView
                textView.text = returnString

            }
        }
    }
    companion object{
        private const val LOG_TAG = "Lifecycle_MainActivity"
    }
}