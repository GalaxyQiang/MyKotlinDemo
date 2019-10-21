package com.john.history.mykotlindemo.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class SavedStateViewModel(private val state: SavedStateHandle):ViewModel() {
    init {
        viewModelScope.launch{
        }
    }

}