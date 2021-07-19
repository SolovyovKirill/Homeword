package com.example.myapplication.homework16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.MyApp
import com.example.myapplication.databinding.ActivityMessageBinding

class MessageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMessageBinding
    private val messageViewModel: MessageViewModel by viewModels() {
        MessageViewModel.MessageViewModelFactory(
            MessageRepository((application as MyApp).messageDao)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvMessage.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val adapter = MessageAdapter(
            mutableListOf()
        ) { message -> messageClickListener(message) }

        binding.rvMessage.adapter = adapter

        messageViewModel.messageLiveData.observe(this, { adapter.update(it) })

        binding.btnAddMessage.setOnClickListener {
            with(binding.etMessage) {
                messageViewModel.addMessageToDb(text.toString())
                setText("")
            }
        }

    }

    private fun messageClickListener(message: Message) {
        messageViewModel.deleteMessageFromDb(message)
    }
}