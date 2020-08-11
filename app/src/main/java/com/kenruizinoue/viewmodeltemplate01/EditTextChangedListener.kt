package com.kenruizinoue.viewmodeltemplate01

import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.MutableLiveData

// accept mutableLiveData so you can specify the property to update
class EditTextChangedListener(private val mutableLiveData: MutableLiveData<String>) : TextWatcher {
    override fun afterTextChanged(p0: Editable?) {

    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        mutableLiveData.value = p0.toString()
    }
}