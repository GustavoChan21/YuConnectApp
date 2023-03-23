package com.gcdev.yuconnect.adapter.recomendaciones

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gcdev.yuconnect.AdsListResultActivity
import com.gcdev.yuconnect.R
import com.gcdev.yuconnect.RecommendationDetailActivity
import com.gcdev.yuconnect.RecommendationsActivity
import com.gcdev.yuconnect.adapter.adsList.AdsListData

class RecomendacionesAdapter(var rec: List<RecomendacionesData>) : RecyclerView.Adapter<RecomendacionesAdapter.ViewHolder>() {
    //this is to do dinamic the recyclerview about first page like results of category, planets or other list about some category topic
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var imgAds = view.findViewById<ImageView>(R.id.logoRec)
        var addName = view.findViewById<TextView>(R.id.tvRecTitle)
        var addStatusImg = view.findViewById<ImageView>(R.id.iconStatusRec)
        var addLocation = view.findViewById<TextView>(R.id.tvLocationRec)
        var addDiscountDescription = view.findViewById<TextView>(R.id.tvDiscountRec)
        var addRank = view.findViewById<TextView>(R.id.tvRanking_Rec)
        //var typeRanking = view.findViewById<ImageView>(R.id.typeRanking)

    }

    //here relation our recyclerview's item and change from our item custom design
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rec_item, parent, false)
        return ViewHolder(itemView)

    }

    //here we serialice our list of items
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //holder.imgAds.setImageResource(ads[position].logoAd)
        Glide
            .with(holder.imgAds)
            .load(rec[position].logoAd)
            .placeholder(R.drawable.logo)
            .into(holder.imgAds!!)


        holder.addName.text = rec[position].tituloAd
        //holder.addStatusImg.setImageResource(ads[position].iconStatus)
        Glide
            .with(holder.addStatusImg)
            .load(rec[position].iconStatus)
            .placeholder(R.drawable.logo)
            .into(holder.addStatusImg!!)

        holder.addLocation.text = rec[position].location
        holder.addDiscountDescription.text = rec[position].discountDescription
        holder.addRank.text = rec[position].ranking
        //holder.typeRanking.setImageResource(ads[position].typeRanking)


        //Vista Menu Detalles
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, RecommendationsActivity::class.java)
            intent.putExtra("id_recomendations", rec[position].id)
            intent.putExtra("tituloRec", rec[position].tituloAd)
            Log.e("Position", position.toString())
            holder.itemView.context.startActivity(intent)
        }


    }

    //this fragment code help us to know how many items we can see in the page
    override fun getItemCount(): Int {
        return rec.size

    }
}