package com.example.electricunicycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.electricunicycle.adapter.EucCardAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvMain = findViewById<RecyclerView>(R.id.rvMain)
        rvMain.adapter = EucCardAdapter(applicationContext)
        rvMain.setHasFixedSize(true)
    }
}