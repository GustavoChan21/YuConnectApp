package com.gcdev.yuconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.adapter.service.ServicesData
import com.gcdev.yuconnect.adapter.store.StoreSetData
import com.gcdev.yuconnect.adapter.store.StoreAdapter
import com.gcdev.yuconnect.databinding.ActivityCategoryResultBinding

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

        binding.categoryTitleBar.setText(menu.categoryService)

    }

}
