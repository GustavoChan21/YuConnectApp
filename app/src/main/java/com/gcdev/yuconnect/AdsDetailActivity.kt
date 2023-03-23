package com.gcdev.yuconnect

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gcdev.yuconnect.adapter.adsCategory.AdsData
import com.gcdev.yuconnect.adapter.adsList.AdsListAdapter
import com.gcdev.yuconnect.adapter.adsList.AdsListData
import com.gcdev.yuconnect.adapter.service.ServicesAdapter
import com.gcdev.yuconnect.adapter.service.ServicesData
import com.gcdev.yuconnect.databinding.ActivityAdsDetailBinding
import com.gcdev.yuconnect.databinding.ActivityDetailBinding
import com.gcdev.yuconnect.network.ApiServicesInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AdsDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdsDetailBinding
    lateinit var request: ApiServicesInterface
    var adapter: AdsListAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdsDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        request = ApiClient.buildService(ApiServicesInterface::class.java)
        val adsItem: AdsListData = intent.getSerializableExtra("adDetails") as AdsListData

        binding.titleAdDetail.setText(adsItem.storeName)
        binding.locationAd.setText(adsItem.location)
        binding.priceAdDetail.setText(adsItem.price)
        binding.adDescriptionDetail.setText(adsItem.description)
        binding.adHorarioDetail.setText(adsItem.time)
        binding.adContactDetail.setText(adsItem.contact)
        //binding.imgAdDetail.setImageResource(adsItem.imgBackground)
        Glide
            .with(binding.imgAdDetail)
            .load(adsItem.logo)
            .placeholder(R.drawable.logo)
            .into(binding.imgAdDetail);

        //binding.adImgBackground.setImageResource(adsItem.logo)
        Glide
            .with(binding.adImgBackground)
            .load(adsItem.imgBackground)
            .placeholder(R.drawable.logo)
            .into(binding.adImgBackground);

        //go to the maps view respective the ad item "test1"
        binding.test.setOnClickListener(View.OnClickListener {
            val intentUri = Uri.parse(adsItem.maps)
            val intent = Intent(Intent.ACTION_VIEW, intentUri)
            startActivity(intent)
        })

        binding.phoneAction.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            val contact = adsItem.contact.replace("tel ", "tel: ")
            intent.data = Uri.parse(contact)
            startActivity(intent)
        })

        val returnHome = supportActionBar
        returnHome?.title = adsItem.storeName
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

    private fun showToast(str: String){
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }


}