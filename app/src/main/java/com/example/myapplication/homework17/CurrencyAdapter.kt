package com.example.myapplication.homework17

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemCurrencyBinding

class CurrencyAdapter : ListAdapter<Currency, CurrencyViewHolder>(DiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder =
        CurrencyViewHolder(
            ItemCurrencyBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )


    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class DiffUtilCallback : DiffUtil.ItemCallback<Currency>() {
    override fun areItemsTheSame(oldItem: Currency, newItem: Currency): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Currency, newItem: Currency): Boolean {
        return oldItem.name == newItem.name && oldItem.id == newItem.id && oldItem.symbol == newItem.symbol
    }
}


class CurrencyViewHolder(
    private val binding: ItemCurrencyBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Currency) {
        binding.tvId.text = item.id.toString()
        binding.tvName.text = item.name
        binding.tvSymbol.text = item.symbol

    }

}
