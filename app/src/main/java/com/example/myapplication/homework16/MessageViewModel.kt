package com.example.myapplication.homework16

import androidx.lifecycle.*

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class MessageViewModel(
    private val messageRepository: MessageRepository
) : ViewModel() {
    val messageLiveData: LiveData<List<Message>> = messageRepository.getMessageList().asLiveData()

    fun addMessageToDb(text: String) {
        val message =
            Message(
                text,
                SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.ROOT).format(System.currentTimeMillis())
            )
        viewModelScope.launch(Dispatchers.IO) {
            messageRepository.addMessage(message)
        }

    }

    fun deleteMessageFromDb(message: Message) {
        viewModelScope.launch {
            messageRepository.deleteMessage(message)
        }

    }


    class MessageViewModelFactory(
        private val messageRepository: MessageRepository
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MessageViewModel(messageRepository) as T
        }
    }

}