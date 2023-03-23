package com.gcdev.yuconnect.adapter.service

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gcdev.yuconnect.CategoryResultActivity
import com.gcdev.yuconnect.R

class ServicesAdapter(var categorias: List<ServicesData>) : RecyclerView.Adapter<ServicesAdapter.ViewHolder>() {
    //this is to do dinamic the recyclerview about first page like results of category, planets or other list about some category topic
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var imgService = view.findViewById<ImageView>(R.id.img_child)
        var serviceName = view.findViewById<TextView>(R.id.tv_category_name)

    }

    //here relation our recyclerview's item and change from our item custom design
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.child_item, parent, false)
        return ViewHolder(itemView)

    }

    //here we serialice our list of items
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.serviceName.text = categorias[position].categoryService
        //holder.imgService.setImageResource(categorias[position].iconService)
        Glide
            .with(holder.imgService.context!!)
            .load(categorias[position].iconService)
            .placeholder(R.drawable.logo)
            .into(holder.imgService!!);

        //Vista Menu Detalles
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, CategoryResultActivity::class.java)
            intent.putExtra("id_services", categorias[position].id)
            intent.putExtra("categoryService", categorias[position].categoryService)
            Log.e("Position", position.toString())
            holder.itemView.context.startActivity(intent)
        }




    }

    //this fragment code help us to know how many items we can see in the page
    override fun getItemCount(): Int {
        return categorias.size

    }
}