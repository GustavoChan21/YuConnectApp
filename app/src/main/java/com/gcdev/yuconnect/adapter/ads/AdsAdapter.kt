package com.gcdev.yuconnect.adapter.ads

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.CategoryResultActivity
import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.adapter.service.ServicesAdapter
import com.gcdev.yuconnect.adapter.service.ServicesData

class AdsAdapter (var ads: List<AdsData>) : RecyclerView.Adapter<AdsAdapter.ViewHolder>() {
    //this is to do dinamic the recyclerview about first page like results of category, planets or other list about some category topic
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var imgAds = view.findViewById<ImageView>(R.id.logoAd)
        var addName = view.findViewById<TextView>(R.id.tvAdsTitle)
        var addStatusImg = view.findViewById<ImageView>(R.id.iconStatus)
        var addLocation = view.findViewById<TextView>(R.id.tvLocationAds)
        var addDiscountDescription = view.findViewById<TextView>(R.id.tvDiscount)
        var addRank = view.findViewById<TextView>(R.id.tvRanking_Ads)
        var typeRanking = view.findViewById<ImageView>(R.id.typeRanking)

    }

    //here relation our recyclerview's item and change from our item custom design
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.ad_item, parent, false)
        return ViewHolder(itemView)

    }

    //here we serialice our list of items
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgAds.setImageResource(ads[position].logoAdd)
        holder.addName.text = ads[position].tituloAdd
        holder.addStatusImg.setImageResource(ads[position].iconStatus)
        holder.addLocation.text = ads[position].location
        holder.addDiscountDescription.text = ads[position].discountDescription
        holder.addRank.text = ads[position].ranking
        holder.typeRanking.setImageResource(ads[position].typeRanking)


        //Vista Menu Detalles


    }

    //this fragment code help us to know how many items we can see in the page
    override fun getItemCount(): Int {
        return ads.size

    }
}