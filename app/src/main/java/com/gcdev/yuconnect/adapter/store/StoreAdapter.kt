package com.gcdev.yuconnect.adapter.store

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.DetailActivity
import com.gcdev.yuconnect.R

class StoreAdapter(var menu: List<StoreData>) : RecyclerView.Adapter<StoreAdapter.ViewHolder>() {
    //this is to do dinamic the recyclerview about first page like results of category, planets or other list about some category topic
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var imgStore = view.findViewById<ImageView>(R.id.logoStore)
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
        holder.storeDescription.text = menu[position].category
        holder.imgStore.setImageResource(menu[position].logo)
        holder.serviceTime.text = menu[position].time
        holder.storeRank.text = menu[position].ranking

        //Vista Menu Detalles
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("details", menu[position])
            holder.itemView.context.startActivity(intent)
        }

    }

    //this fragment code help us to know how many items we can see in the page
    override fun getItemCount(): Int {
        return menu.size

    }
}