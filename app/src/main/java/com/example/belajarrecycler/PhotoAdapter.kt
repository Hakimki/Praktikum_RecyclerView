package com.example.belajarrecycler

import android.annotation.SuppressLint
import android.content.Context
import android.media.Image
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PhotoAdapter(var context : Context) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    var datalist = emptyList<DataModel>()

    internal fun setDataList(datalist : List<DataModel>){
        this.datalist = datalist
        notifyDataSetChanged()
    }

    class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        var image : ImageView
        var title : TextView
        var desc : TextView

        init {
            image = itemView.findViewById(R.id.image)
            title = itemView.findViewById(R.id.title)
            desc = itemView.findViewById(R.id.desc)
        }
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoAdapter.ViewHolder {
      var view = LayoutInflater.from(parent.context).inflate(R.layout.photo_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhotoAdapter.ViewHolder, position: Int) {
      var data = datalist[position]

        holder.title.text = data.title
        holder.desc.text = data.desc
        holder.image.setImageResource(data.image)
    }

    override fun getItemCount() = datalist.size




}