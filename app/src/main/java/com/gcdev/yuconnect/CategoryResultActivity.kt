package com.gcdev.yuconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.adapter.service.ServicesAdapter
import com.gcdev.yuconnect.adapter.service.ServicesData
import com.gcdev.yuconnect.adapter.store.StoreAdapter
import com.gcdev.yuconnect.adapter.store.StoreData
import com.gcdev.yuconnect.authentication.AuthActivity
import com.gcdev.yuconnect.databinding.ActivityCategoryResultBinding
import com.gcdev.yuconnect.network.ApiStoresInterface
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class CategoryResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCategoryResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menu: ServicesData = intent.getSerializableExtra("abarrotes") as ServicesData

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerResults)
        recyclerView.adapter = StoreAdapter(menu.itemStores)
        recyclerView.layoutManager = LinearLayoutManager(this)

        //back to home or menu services
        val returnHome = supportActionBar
        returnHome?.title = menu.categoryService
        returnHome?.setDisplayHomeAsUpEnabled(true)
//        val btnBack: ImageButton = findViewById(R.id.backToHome)
//        btnBack.setOnClickListener{
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
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
