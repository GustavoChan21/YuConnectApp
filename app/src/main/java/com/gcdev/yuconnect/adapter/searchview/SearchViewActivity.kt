package com.gcdev.yuconnect.adapter.searchview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MenuItem
import androidx.core.graphics.green
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.adapter.adsCategory.AdsAdapter
import com.gcdev.yuconnect.adapter.adsCategory.AdsData
import com.gcdev.yuconnect.adapter.adsList.AdsListAdapter
import com.gcdev.yuconnect.adapter.service.ServicesData
import com.gcdev.yuconnect.adapter.store.StoreAdapter
import com.gcdev.yuconnect.databinding.ActivitySearchViewBinding

class SearchViewActivity : AppCompatActivity() {
    private lateinit var adapter: resultAdapter
    private lateinit var binding: ActivitySearchViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = resultAdapter(Helper.setResultSearch())
        binding.recyclerViewSearch.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerViewSearch.adapter = adapter

        binding.se.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                filter(p0.toString())

            }
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        //back to home or menu services
        val returnHome2 = supportActionBar
        returnHome2?.title = "Buscador"
        returnHome2?.setDisplayHomeAsUpEnabled(true)
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

    fun filter(text: String) {
        val filteredCourseAry: ArrayList<resultList> = ArrayList()
        for (eachCourse in Helper.setResultSearch()) {
            if (eachCourse.nombre.toLowerCase().contains(text.toLowerCase())) {
                filteredCourseAry.add(eachCourse)
            }
        }
        adapter.filterList(filteredCourseAry);
    }
}