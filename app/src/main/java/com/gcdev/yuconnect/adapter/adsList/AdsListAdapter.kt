package com.gcdev.yuconnect.adapter.adsList

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gcdev.yuconnect.AdsDetailActivity
import com.gcdev.yuconnect.DetailActivity
import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.adapter.store.StoreData

class AdsListAdapter(var adList: List<AdsListData>) : RecyclerView.Adapter<AdsListAdapter.ViewHolder>() {
    //this is to do dinamic the recyclerview about first page like results of category, planets or other list about some category topic
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var imgStore = view.findViewById<ImageView>(R.id.logoStore)
        var iconCategory = view.findViewById<ImageView>(R.id.iconCategory)
        var storeName = view.findViewById<TextView>(R.id.tvTitleStore)
        var storeDescription = view.findViewById<TextView>(R.id.tvSubtitleStore)
        var serviceTime = view.findViewById<TextView>(R.id.tvTime_Service)
        var storeRank = view.findViewById<TextView>(R.id.tvRanking_Service)

    }

    //here relation our recyclerview's item and change from our item custom design
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.store_item, parent, false)
        return ViewHolder(itemView)

    }

    //here we serialice our list of items
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.storeName.text = adList[position].storeName

        //holder.iconCategory.setImageResource(adList[position].iconCategory)
        Glide
            .with(holder.iconCategory.context!!)
            .load(adList[position].iconCategory)
            .placeholder(R.drawable.logo)
            .into(holder.iconCategory!!);

        holder.storeDescription.text = adList[position].location

        //holder.imgStore.setImageResource(adList[position].logo)
        Glide
            .with(holder.imgStore.context!!)
            .load(adList[position].logo)
            .placeholder(R.drawable.logo)
            .into(holder.imgStore!!);

        holder.serviceTime.text = adList[position].time
        holder.storeRank.text = adList[position].ranking

        //Vista Ads Detalles
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, AdsDetailActivity::class.java)
            intent.putExtra("adDetails", adList[position])
            holder.itemView.context.startActivity(intent)
        }

    }

    //this fragment code help us to know how many items we can see in the page
    override fun getItemCount(): Int {
        return adList.size

    }
}