package com.example.myapplication.homework16

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemMessageBinding

class MessageAdapter(
    private var message: MutableList<Message>,
    private val onLongClickListener: (Message) -> Unit
) : RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder =
        MessageViewHolder(
            ItemMessageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onLongClickListener
        )

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.bind(message[position])
    }

    override fun getItemCount(): Int = message.size

    fun update(newMessage: List<Message>) {
        message.clear()
        message.addAll(newMessage)
        notifyDataSetChanged()
    }

    class MessageViewHolder(
        val binding: ItemMessageBinding,
        val onLongClickListener: (Message) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(message: Message) {
            binding.tvText.text = message.text
            binding.tvTime.text = message.time
            binding.root.setOnLongClickListener {
                onLongClickListener(message)
                true
            }
        }

    }
}