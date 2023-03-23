package com.gcdev.yuconnect

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gcdev.yuconnect.adapter.service.ServicesAdapter
import com.gcdev.yuconnect.adapter.service.ServicesData
import com.gcdev.yuconnect.adapter.store.StoreData
import com.gcdev.yuconnect.databinding.ActivityDetailBinding
import com.gcdev.yuconnect.network.ApiServicesInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    lateinit var request: ApiServicesInterface
    var adapter: ServicesAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //RecyclerView Others Services Test
        request = ApiClient.buildService(ApiServicesInterface::class.java)

        val menu2: StoreData = intent.getSerializableExtra("details") as StoreData

        binding.titleStoreDetail.setText(menu2.storeName)
        binding.categoryDetail.setText(menu2.category)
        binding.priceDetail.setText(menu2.price)
        binding.descriptionDetail.setText(menu2.description)
        binding.horarioDetail.setText(menu2.workDays)
        binding.contactDetail.setText(menu2.contact)
        binding.hourDetail.setText(menu2.time)
        binding.streetDetail.setText(menu2.directionStreet)
        binding.locationDetail.setText(menu2.location)

        //binding.imgLogoDetail.setImageResource(menu2.imgBackground)
        Glide
            .with(binding.imgLogoDetail)
            .load(menu2.logo)
            .placeholder(R.drawable.logo)
            .into(binding.imgLogoDetail);
        //binding.imageBackgroundPgDetail.setImageResource(menu2.logo)
        Glide
            .with(binding.imageBackgroundPgDetail)
            .load(menu2.imgBackground)
            .placeholder(R.drawable.ic_menu_abarrotes_kart)
            .into(binding.imageBackgroundPgDetail);

        //go to the maps view "test1"
        binding.test.setOnClickListener(View.OnClickListener {
            val intentUri = Uri.parse(menu2.maps)
            val intent = Intent(Intent.ACTION_VIEW, intentUri)
            startActivity(intent)
        })

        binding.phoneAction.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            val contact = menu2.contact.replace("tel ", "tel: ")
            intent.data = Uri.parse(contact)
            startActivity(intent)
        })


        //back to list of stores per category
        val returnHome = supportActionBar
        returnHome?.title = menu2.storeName
        returnHome?.setDisplayHomeAsUpEnabled(true)

        //favorite icon actions and toast
        val checkFavorites = findViewById<CheckBox>(R.id.checkFavorites)
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