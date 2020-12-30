package com.li.usernavigation

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StringAdapter(var context: Context, var list: Array<String>) :
    RecyclerView.Adapter<StringAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_string,parent,false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: StringAdapter.ViewHolder, position: Int) {
    }

}