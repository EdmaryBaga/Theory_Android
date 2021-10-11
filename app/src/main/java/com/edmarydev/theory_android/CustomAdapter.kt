package com.edmarydev.theory_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    val titles = arrayOf(
        "Android",
        "Flutter",
        "Angular",
        "DJango"
    )

    val details = arrayOf(
        "Desarrollo nativo para el SO Android de Google",
        "Desarrollo multiplataforma utilizando el lenguaje Dart",
        "Desarrollo web con typscript y bootstrap ",
        "Desarrollo de back y big data"
    )
    val images = intArrayOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
    )

    override fun onCreateViewHolder(viewGroup: ViewGroup, i:Int): ViewHolder {
        //inflamos la vista
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder:ViewHolder, i: Int){
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemview:View) : RecyclerView.ViewHolder(itemview){
        //declaramos los 3 elementos que tendremos en la vista
        var itemImage : ImageView
        var itemTitle : TextView
        var itemDetail : TextView

        init {
            //agregamos el valor de nuestros elementos del xml por id a cada variable que creamso
            itemImage = itemview.findViewById(R.id.item_image)
            itemTitle = itemview.findViewById(R.id.item_title)
            itemDetail = itemview.findViewById(R.id.item_detail)
        }
    }

}