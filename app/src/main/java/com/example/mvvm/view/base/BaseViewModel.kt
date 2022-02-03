package com.example.mvvm.view.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.utils.Event


typealias  LiveEvent<T> = LiveData<Event<T>>
typealias MutableLiveEvent<T> = MutableLiveData<Event<T>>

open class BaseViewModel: ViewModel() {

    open fun onResult(result: Any){

    }
}