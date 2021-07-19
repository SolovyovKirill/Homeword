package com.example.myapplication.homework13

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemBarcodeBinding
import com.example.myapplication.homework10.Candy

class BarcodeViewHolder(
    private val binding: ItemBarcodeBinding,
    private val barcodeClickListener: (Candy) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Candy) {
        itemView.setOnClickListener {
            barcodeClickListener(item)
        }
        binding.tvBarcode.text = item.barcode.toString()
    }

}