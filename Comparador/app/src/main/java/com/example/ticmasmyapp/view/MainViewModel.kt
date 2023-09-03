package com.example.ticmasmyapp.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ticmasmyapp.model.Comparador


class MainViewModel: ViewModel() {
    val texto1: LiveData<Comparador> get() = _texto1
    private var _texto1 = MutableLiveData<Comparador>(null)
    val texto2: LiveData<Comparador> get() = _texto2
    private var _texto2 = MutableLiveData<Comparador>(null)
}

