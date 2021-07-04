package com.example.myapplication.homework10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class CandyAdapter(
    private val candyList : MutableList<Candy>
) : RecyclerView.Adapter<CandyAdapter.CandyViewHolder>() {

    override fun getItemCount(): Int = candyList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CandyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_candy, parent, false)
        return CandyViewHolder(view)
    }

    override fun onBindViewHolder(holder: CandyViewHolder, position: Int) {
        holder.bind(candyList[position])

    }

    class CandyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        private val tvBrand : TextView = itemView.findViewById(R.id.tv_brand)
        private val tvBarcode : TextView = itemView.findViewById(R.id.tv_barcode)

        fun bind(item: Candy) {
            tvBrand.text = item.brand
            tvBarcode.text = item.barcode.toString()

        }
    }
}