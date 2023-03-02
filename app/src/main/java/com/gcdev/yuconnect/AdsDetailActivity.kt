package com.gcdev.yuconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import com.gcdev.yuconnect.adapter.adsCategory.AdsData
import com.gcdev.yuconnect.adapter.adsList.AdsListData
import com.gcdev.yuconnect.databinding.ActivityAdsDetailBinding
import com.gcdev.yuconnect.databinding.ActivityDetailBinding

class AdsDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdsDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdsDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adsItem: AdsListData = intent.getSerializableExtra("adDetails") as AdsListData

        binding.titleAdDetail.setText(adsItem.titulo)
        binding.locationAd.setText(adsItem.location)
        binding.priceAdDetail.setText(adsItem.price)
        binding.adDescriptionDetail.setText(adsItem.description)
        binding.adHorarioDetail.setText(adsItem.time)
        binding.imgAdDetail.setImageResource(adsItem.imgBackground)
        binding.adImgBackground.setImageResource(adsItem.logo)

        val checkFavorites = findViewById<CheckBox>(R.id.adCheckFavorites)
        checkFavorites.setOnCheckedChangeListener{checkBox, isChecked ->
            if (isChecked){
                showToast("Item agregado a Favoritos")

            } else{
                showToast("Item eliminado de Favoritos")
            }
        }

    }

    private fun showToast(str: String){
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }

}