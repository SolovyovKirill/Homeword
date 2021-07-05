package com.example.myapplication.homework10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemCandyBinding

class CandyAdapter(
    private val candyList: MutableList<Candy>
) : RecyclerView.Adapter<CandyViewHolder>() {

    override fun getItemCount(): Int = candyList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CandyViewHolder =
        CandyViewHolder(
            ItemCandyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: CandyViewHolder, position: Int) {
        holder.bind(candyList[position])
    }

    fun update(updatedListCandy: List<Candy>) {
        candyList.clear()
        candyList.addAll(updatedListCandy)
        notifyDataSetChanged()
    }
}