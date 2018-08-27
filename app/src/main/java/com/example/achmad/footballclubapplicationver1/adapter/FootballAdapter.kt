package com.example.achmad.footballclubapplicationver1.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.achmad.footballclubapplicationver1.R

import com.example.achmad.footballclubapplicationver1.entity.Item



class FootballAdapter(private val context: Context, private val items: List<Item>, private val listener: (Item)-> Unit)
    : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}