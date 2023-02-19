package com.gcdev.yuconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.adapter.ParentAdapter
import com.gcdev.yuconnect.model.ChildDataClass
import com.gcdev.yuconnect.model.ParentDataClass

class TestActivity : AppCompatActivity() {

    val parentItemsList = ArrayList<ParentDataClass>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val rvParent = findViewById<RecyclerView>(R.id.rv_parent)
        rvParent.setHasFixedSize(true)
        rvParent.layoutManager = LinearLayoutManager(this)

        val adapter = ParentAdapter(parentItemsList)

        setData()

        rvParent.adapter = adapter

    }

    private fun setData() {

    }
}