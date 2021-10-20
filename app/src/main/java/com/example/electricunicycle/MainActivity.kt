package com.example.electricunicycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvTest = findViewById<TextView>(R.id.tvTest)
        tvTest.text = "Henlo From Jakarta"
    }
}