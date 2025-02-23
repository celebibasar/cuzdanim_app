package com.basarcelebi.cuzdanim_app.presentation.viewmodel.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor() : ViewModel() {
    private val _text = MutableLiveData("Welcome to Home Screen")
    val text: LiveData<String> get() = _text
}