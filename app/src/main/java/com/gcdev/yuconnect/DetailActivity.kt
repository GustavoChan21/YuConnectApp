package com.gcdev.yuconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.Toast
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

        //favorite icon actions and toast
        val checkFavorites = findViewById<CheckBox>(R.id.checkFavorites)
        checkFavorites.setOnCheckedChangeListener{checkBox, isChecked ->
            if (isChecked){
                showToast("Item agregado a Favoritos")

            } else{
                showToast("Item eliminado de Favoritos")
            }
        }

        //back to list of stores per category
        val returnHome = supportActionBar
        returnHome?.title = menu.storeName
        returnHome?.setDisplayHomeAsUpEnabled(true)
//        val btnBack: ImageButton = findViewById(R.id.backToList)
//        btnBack.setOnClickListener{
//            val intent = Intent(this, CategoryResultActivity::class.java)
//            startActivity(intent)
//        }

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