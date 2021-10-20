package com.example.electricunicycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.electricunicycle.adapter.EucCardAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvMain = findViewById<RecyclerView>(R.id.rvMain)
        rvMain.adapter = EucCardAdapter(applicationContext, EucCardAdapter.OnClickListener {
            Log.d("henlo", "Click Item " + it.name)
        })

        rvMain.setHasFixedSize(true)
    }
}