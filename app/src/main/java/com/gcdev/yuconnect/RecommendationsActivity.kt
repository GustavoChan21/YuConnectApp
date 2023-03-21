package com.gcdev.yuconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.adapter.adsCategory.AdsData
import com.gcdev.yuconnect.adapter.recomendaciones.RecomendacionesData
import com.gcdev.yuconnect.adapter.store.StoreAdapter
import com.gcdev.yuconnect.adapter.store.StoreData
import com.gcdev.yuconnect.databinding.ActivityAdsListResultBinding
import com.gcdev.yuconnect.databinding.ActivityCategoryResultBinding
import com.gcdev.yuconnect.databinding.ActivityRecommendationsBinding
import com.gcdev.yuconnect.network.ApiServicesInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecommendationsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecommendationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecommendationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menu3: RecomendacionesData = intent.getSerializableExtra("recomendaciones") as RecomendacionesData

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerRecomendationsResults)
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