package com.kenruizinoue.viewmodeltemplate01

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // KTX extension function from androidx.activity
    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // observe each property from MainActivityViewModel
        viewModel.firstName.observe(this, Observer {
            firstNameTextView.text = it
        })

        viewModel.lastName.observe(this, Observer {
            lastNameTextView.text = it
        })

        viewModel.age.observe(this, Observer {
            ageTextView.text = it.toString()
        })

        // reduce the boilerplate by using the EditTextChangedListener class
        firstNameEditText.addTextChangedListener(EditTextChangedListener(viewModel.firstName))
        lastNameEditText.addTextChangedListener(EditTextChangedListener(viewModel.lastName))
        ageEditText.addTextChangedListener(EditTextChangedListener(viewModel.age))
    }
}