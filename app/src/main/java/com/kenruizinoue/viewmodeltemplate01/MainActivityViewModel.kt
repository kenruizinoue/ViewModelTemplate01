package com.kenruizinoue.viewmodeltemplate01

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    val firstName = MutableLiveData<String>()
    val lastName = MutableLiveData<String>()
    val age = MutableLiveData<String>()

    init {
        firstName.value = "Your first name"
        lastName.value = "Your last name"
        age.value = "Your age"
    }
}