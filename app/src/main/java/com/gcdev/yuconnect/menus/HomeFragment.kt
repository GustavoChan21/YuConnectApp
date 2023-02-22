package com.gcdev.yuconnect.menus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.adapter.ads.AdSetData
import com.gcdev.yuconnect.adapter.ads.AdsAdapter
import com.gcdev.yuconnect.adapter.service.ServiceSetData
import com.gcdev.yuconnect.adapter.service.ServicesAdapter


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = requireView().findViewById<RecyclerView>(R.id.rv_parent)
        recyclerView.adapter = ServicesAdapter(ServiceSetData.setService())
        recyclerView.layoutManager = GridLayoutManager(context, 1, RecyclerView.HORIZONTAL, false)

        val recyclerView1 = requireView().findViewById<RecyclerView>(R.id.rv_ads2)
        recyclerView1.adapter = AdsAdapter(AdSetData.setAds())
        recyclerView1.layoutManager = GridLayoutManager(context, 1, RecyclerView.HORIZONTAL, false)

        val recyclerView2 = requireView().findViewById<RecyclerView>(R.id.rv_ads)
        recyclerView2.adapter = AdsAdapter(AdSetData.setAds())
        recyclerView2.layoutManager = GridLayoutManager(context, 1, RecyclerView.HORIZONTAL, false)

    }

}