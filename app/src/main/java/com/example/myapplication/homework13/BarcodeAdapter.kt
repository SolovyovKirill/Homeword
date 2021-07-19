package com.example.myapplication.homework13

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemBarcodeBinding
import com.example.myapplication.homework10.Candy

class BarcodeAdapter (
    private val barcodeList: MutableList<Candy> = mutableListOf(),
    private val onClickAction: (Candy) -> Unit
) : RecyclerView.Adapter<BarcodeViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BarcodeViewHolder =
        BarcodeViewHolder(
            ItemBarcodeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            ),
            onClickAction
        )

    override fun onBindViewHolder(holder: BarcodeViewHolder, position: Int) {
        holder.bind(barcodeList[position])
    }

    override fun getItemCount(): Int = barcodeList.size

    fun update (newListCandy : List<Candy>) {
        barcodeList.clear()
        barcodeList.addAll(newListCandy)
        notifyDataSetChanged()
    }

}