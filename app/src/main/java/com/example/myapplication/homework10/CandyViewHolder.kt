package com.example.myapplication.homework10

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ItemCandyBinding

class CandyViewHolder(
    private val binding: ItemCandyBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Candy) {
        binding.tvBrand.text = item.brand
        binding.tvBarcode.text = item.barcode.toString()
        addPicture()
    }

    private fun addPicture() {
        val resultValue = binding.tvBrand.text
        when (resultValue) {
            CandyGenerate.BRAND_SNICKERS -> {
                Glide
                    .with(itemView.context)
                    .load(CandyGenerate.URL_SNICKERS)
                    .into(binding.ivPictureCandy)
            }
            CandyGenerate.BRAND_MARS -> {
                Glide
                    .with(itemView.context)
                    .load(CandyGenerate.URL_MARS)
                    .into(binding.ivPictureCandy)
            }
            CandyGenerate.BRAND_BOUNTY -> {
                Glide
                    .with(itemView.context)
                    .load(CandyGenerate.URL_BOUNTY)
                    .into(binding.ivPictureCandy)
            }
        }
    }
}