package com.john.history.mykotlindemo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.util.*

class SavedStateViewModel(private val state: SavedStateHandle):ViewModel() {
//    init {
//        viewModelScope.launch{
//        }
//    }

    var planet:String="Mars"
    fun setNumber(number:Int){
        state.set("number",number)
    }
    fun getNumber():LiveData<Int>{
        return state.getLiveData<Int>("number")
    }
}