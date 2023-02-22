package com.gcdev.yuconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val rvParent = findViewById<RecyclerView>(R.id.rv_parent)
        rvParent.setHasFixedSize(true)
        rvParent.layoutManager = LinearLayoutManager(this)

        setData()

    }

    private fun setData() {

    }
}