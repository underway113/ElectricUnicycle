package com.example.electricunicycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.example.electricunicycle.adapter.EucCardAdapter
import com.example.electricunicycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setTitle(R.string.about_title)

        binding.rvMain.adapter = EucCardAdapter(applicationContext, EucCardAdapter.OnClickListener {
            intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(EXTRA_DETAIL_EUC, it)
            startActivity(intent)
        })

        binding.rvMain.setHasFixedSize(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.btnAbout -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    public companion object {
        const val EXTRA_DETAIL_EUC = "detailEuc"
    }

}