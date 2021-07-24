package com.example.birdcounter

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    var count:Int = 0
    val count_text by lazy { findViewById<TextView>(R.id.bird_counter)}



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_count = findViewById<Button>(R.id.button)

        btn_count.setOnClickListener {
            ++count
            count_text.text = count.toString()
        }

       count_text.setOnClickListener {
startActivity(Intent(this, MainActivity2::class.java).also {
    it.putExtra("COUNT_TEXT", count_text.text)
})

       }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)



        outState.putInt("key_counter", count)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)


        count = savedInstanceState.getInt("key_counter",0)
        count_text.text = count.toString()
    }

}