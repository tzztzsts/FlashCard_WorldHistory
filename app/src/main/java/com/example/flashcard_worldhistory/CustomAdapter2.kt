package com.example.flashcard_worldhistory

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card.view.*


class CustomAdapter2(private val customList: ArrayList<FlashCard>) :
    RecyclerView.Adapter<CustomAdapter2.CustomViewHolder>() {


    private lateinit var listener: OnItemClickListener


    class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val txt1 = view.txt1
        val txt2 = view.txt2
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val item = layoutInflater.inflate(R.layout.card, parent, false)
        return CustomViewHolder(item)
    }


    override fun getItemCount(): Int {
        return customList.size
    }


    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.view.txt1.text = customList[position].word
        holder.view.txt2.text = customList[position].mean

        holder.view.setOnClickListener {
            listener.onItemClickListener(it, position, customList[position].mean)
        }
    }


    interface OnItemClickListener {
        fun onItemClickListener(view: View, position: Int, clickedText: String)
    }


    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }
}