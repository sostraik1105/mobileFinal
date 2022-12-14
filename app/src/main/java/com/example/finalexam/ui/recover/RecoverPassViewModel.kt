package com.example.finalexam.ui.recover

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecoverPassViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Recover Password"
    }
    val text: LiveData<String> = _text
}