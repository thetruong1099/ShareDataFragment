package com.example.sharedatafragment

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ShareDataViewModel : ViewModel() {
    private var text = MutableLiveData<String>()

    fun setText(string: String) {
        text.value = string
    }

    fun getText(): MutableLiveData<String> = text


}