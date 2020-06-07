package com.example.flashcard_worldhistory

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.range.view.*


class CustomAdapter1(private val customList: List<String>) :
    RecyclerView.Adapter<CustomAdapter1.CustomViewHolder>() {


    private lateinit var listener: OnItemClickListener


    class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val txt = view.txt
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val item = layoutInflater.inflate(R.layout.range, parent, false)
        return CustomViewHolder(item)
    }


    override fun getItemCount(): Int {
        return customList.size
    }


    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.view.txt.text = customList[position]

        holder.view.setOnClickListener {
            listener.onItemClickListener(it, position, customList[position])
        }
    }


    interface OnItemClickListener {
        fun onItemClickListener(view: View, position: Int, clickedText: String)
    }


    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }
}