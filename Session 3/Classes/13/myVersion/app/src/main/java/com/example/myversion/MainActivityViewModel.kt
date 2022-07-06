package com.example.myversion

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel(){
    private var count = MutableLiveData<Int>()
    val countData:LiveData<Int>
    get() = count
    init {

        count.value = 0
    }

    fun UpdateCount() {
        count.value = (count.value)?.plus(1);
    }
}