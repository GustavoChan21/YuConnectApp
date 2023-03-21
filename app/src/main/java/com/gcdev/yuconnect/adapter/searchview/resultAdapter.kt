package com.gcdev.yuconnect.adapter.searchview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gcdev.yuconnect.AdsDetailActivity
import com.gcdev.yuconnect.R

class resultAdapter(private var dataSet: ArrayList<resultList>) :
    RecyclerView.Adapter<resultAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        val image: ImageView

        init {
            // Define click listener for the ViewHolder's View
            textView = view.findViewById(R.id.text)
            image = view.findViewById(R.id.imageView)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_result, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.textView.text = dataSet[position].nombre
        viewHolder.image.setImageResource(dataSet[position].img)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

    fun filterList(filteredCourseList: ArrayList<resultList>) {
        this.dataSet = filteredCourseList;
        notifyDataSetChanged();
    }
}