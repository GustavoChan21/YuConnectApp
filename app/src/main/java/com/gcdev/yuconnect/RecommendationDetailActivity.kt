package com.gcdev.yuconnect

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gcdev.yuconnect.adapter.adsList.AdsListAdapter
import com.gcdev.yuconnect.adapter.adsList.AdsListData
import com.gcdev.yuconnect.adapter.recomendados.RecommendedAdapter
import com.gcdev.yuconnect.adapter.recomendados.RecommendedData
import com.gcdev.yuconnect.databinding.ActivityAdsDetailBinding
import com.gcdev.yuconnect.databinding.ActivityRecommendationDetailBinding
import com.gcdev.yuconnect.network.ApiServicesInterface

class RecommendationDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecommendationDetailBinding
    lateinit var request: ApiServicesInterface
    var adapter: RecommendedAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecommendationDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        request = ApiClient.buildService(ApiServicesInterface::class.java)
        val recItem: RecommendedData = intent.getSerializableExtra("adDetails") as RecommendedData

        binding.titleRecDetail.setText(recItem.storeName)
        binding.locationRec.setText(recItem.location)
        binding.priceRecDetail.setText(recItem.price)
        binding.recDescriptionDetail.setText(recItem.description)
        binding.recHorarioDetail.setText(recItem.time)
        binding.recContactDetail.setText(recItem.contact)
        //binding.imgAdDetail.setImageResource(adsItem.imgBackground)
        Glide
            .with(binding.imgRecDetail)
            .load(recItem.logo)
            .placeholder(R.drawable.logo)
            .into(binding.imgRecDetail);

        //binding.adImgBackground.setImageResource(adsItem.logo)
        Glide
            .with(binding.recImgBackground)
            .load(recItem.imgBackground)
            .placeholder(R.drawable.logo)
            .into(binding.recImgBackground);

        //go to the maps view respective the ad item "test1"
        binding.test.setOnClickListener(View.OnClickListener {
            val intentUri = Uri.parse(recItem.maps)
            val intent = Intent(Intent.ACTION_VIEW, intentUri)
            startActivity(intent)
        })
        binding.phoneAction.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            val contact = recItem.contact.replace("tel ", "tel: ")
            intent.data = Uri.parse(contact)
            startActivity(intent)
        })
        val returnHome = supportActionBar
        returnHome?.title = recItem.storeName
        returnHome?.setDisplayHomeAsUpEnabled(true)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showToast(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }

}