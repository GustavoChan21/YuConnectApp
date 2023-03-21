package com.gcdev.yuconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
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

        val menu3: AdsData = intent.getSerializableExtra("adsListResult") as AdsData

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerAdsResults)
        //recyclerView.adapter = AdsListAdapter(menu3.itemAds)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val returnHome = supportActionBar
        returnHome?.title = menu3.tituloAd
        returnHome?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home ->{
                finish()
                true
            }
            else ->super.onOptionsItemSelected(item)
        }
    }
}