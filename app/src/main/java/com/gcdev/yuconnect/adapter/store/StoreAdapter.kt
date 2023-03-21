package com.gcdev.yuconnect.adapter.store

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gcdev.yuconnect.DetailActivity
import com.gcdev.yuconnect.R

class StoreAdapter(var menu: List<StoreData>) : RecyclerView.Adapter<StoreAdapter.ViewHolder>() {
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

        holder.storeName.text = menu[position].storeName
        //holder.iconCategory.setImageResource(menu[position].iconCategory)
        Glide
            .with(holder.iconCategory)
            .load(menu[position].iconCategory)
            .placeholder(R.drawable.logo)
            .into(holder.iconCategory!!);

        holder.storeDescription.text = menu[position].description
        //holder.imgStore.setImageResource(menu[position].logo)
        Glide
            .with(holder.imgStore)
            .load(menu[position].imgBackground)
            .placeholder(R.drawable.logo)
            .into(holder.imgStore!!);

        holder.serviceTime.text = menu[position].time
        holder.storeRank.text = menu[position].ranking

        //Vista Negocios Detalles
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("details", menu[position].categoryId)
            holder.itemView.context.startActivity(intent)
        }

    }

    //this fragment code help us to know how many items we can see in the page
    override fun getItemCount(): Int {
        return menu.size

    }
}