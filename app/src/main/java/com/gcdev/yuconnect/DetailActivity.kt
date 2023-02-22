package com.gcdev.yuconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gcdev.yuconnect.adapter.store.StoreData
import com.gcdev.yuconnect.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menu: StoreData = intent.getSerializableExtra("details") as StoreData

        binding.titleStoreDetail.setText(menu.storeName)
        binding.categoryDetail.setText(menu.category)
        binding.priceDetail.setText(menu.price)
        binding.descriptionDetail.setText(menu.description)
        binding.horarioDetail.setText(menu.workDays)
        binding.imgLogoDetail.setImageResource(menu.imgBackground)
        binding.imageBackgroundPgDetail.setImageResource(menu.logo)

    }
}