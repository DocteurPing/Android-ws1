package com.example.drping.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun launchActivity2(view: View) {
        val Intent = Intent(this, Main2Activity::class.java)
        startActivity(Intent)
    }

    fun getRandom(view: View) {
        val text = findViewById<TextView>(R.id.textView2)
        val random = Random()
        var randomInt = 0
            randomInt = random.nextInt(100)

        // Display the random number.
        text.text = Integer.toString(randomInt)
    }
}
