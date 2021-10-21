package com.example.electricunicycle

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.electricunicycle.MainActivity.Companion.EXTRA_DETAIL_EUC
import com.example.electricunicycle.databinding.ActivityDetailBinding
import com.example.electricunicycle.model.EucModel
import com.example.electricunicycle.model.EucTypeEnum
import java.text.NumberFormat


class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var detailEuc: EucModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        detailEuc = intent.getSerializableExtra(EXTRA_DETAIL_EUC) as EucModel

        title = detailEuc.name

        binding.tvNameEuc.text = detailEuc.name

        when(detailEuc.type) {
            EucTypeEnum.ENTRY -> {
                binding.tvTypeEuc.setBackgroundResource(R.drawable.type_background_entry)
                binding.tvTypeEuc.text = applicationContext.resources?.getString(R.string.entry_level)
            }
            EucTypeEnum.HIGH -> {
                binding.tvTypeEuc.setBackgroundResource(R.drawable.type_background)
                binding.tvTypeEuc.text = applicationContext.resources?.getString(R.string.high_level)
            }
        }
        binding.tvTypeEuc.setPadding(dpAsPixels(8), dpAsPixels(1), dpAsPixels(8), dpAsPixels(1))

        val convertPrice =  NumberFormat.getInstance().format(detailEuc.price)
        binding.ivEuc.setImageResource(detailEuc.image)
        binding.tvPriceEuc.text = getString(R.string.price_string, convertPrice)
        binding.tvDescEuc.text = detailEuc.description

        binding.tvBatteryCapacity.text = detailEuc.spec.batteryCapacity.toString()
        binding.tvMaxRange.text = detailEuc.spec.maxRange.toString()
        binding.tvMotorPower.text = detailEuc.spec.motorPower.toString()
        binding.tvTopSpeed.text = detailEuc.spec.topSpeed.toString()

        binding.btnBuyNow.setOnClickListener {
            clickBuyNow()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.detail_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.btnShare -> {
                val shareIntent = Intent()
                val textShare = "${detailEuc.name} only for Rp ${NumberFormat.getInstance().format(detailEuc.price)} with top speed ${detailEuc.spec.topSpeed} km/h and max range ${detailEuc.spec.maxRange} km"
                shareIntent.action = Intent.ACTION_SEND
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, textShare)
                startActivity(Intent.createChooser(shareIntent,getString(R.string.share_info)))
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun clickBuyNow() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(detailEuc.spec.url)
        startActivity(intent)
    }

    private fun dpAsPixels(sizeInDp: Int): Int {
        val scale = applicationContext.resources?.displayMetrics?.density
        if (scale != null) {
            return  (sizeInDp * scale + 0.5f).toInt()
        }
        return sizeInDp
    }
}