package com.gcdev.yuconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.adapter.adsCategory.AdsData
import com.gcdev.yuconnect.adapter.adsList.AdsListAdapter
import com.gcdev.yuconnect.databinding.ActivityAdsListResultBinding

class AdsListResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdsListResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdsListResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menu: AdsData = intent.getSerializableExtra("adsListResult") as AdsData

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerAdsResults)
        recyclerView.adapter = AdsListAdapter(menu.itemAds)
        recyclerView.layoutManager = LinearLayoutManager(this)

        binding.categoryTitleBar.setText(menu.tituloAd)

    }
}