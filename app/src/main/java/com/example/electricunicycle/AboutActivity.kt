package com.example.electricunicycle

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.electricunicycle.databinding.ActivityAboutBinding


class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setTitle(R.string.about_title)

        binding.tvSource.setOnClickListener {
            clickSource()
        }

        binding.cardGithub.setOnClickListener {
            clickGithub()
        }
        binding.cardLinkedin.setOnClickListener {
            clickLinkedin()
        }
        binding.cardTokopedia.setOnClickListener {
            clickTokopedia()
        }

    }

    private fun clickSource() {
        val url = applicationContext.getString(R.string.about_source_link)
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private fun clickGithub() {
        val url = applicationContext.getString(R.string.about_github_link)
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private fun clickLinkedin() {
        val url = applicationContext.getString(R.string.about_linkedin_link)
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private fun clickTokopedia() {
        val url = applicationContext.getString(R.string.about_tokopedia_link)
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}