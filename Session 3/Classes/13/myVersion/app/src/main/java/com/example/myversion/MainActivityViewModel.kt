package com.example.myversion

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel(){
    var count = MutableLiveData<Int>()
    init {
        count.value = 0
    }

    fun UpdateCount() {
        count.value = (count.value)?.plus(1);
    }
}