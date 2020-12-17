package com.example.que_frontend.UserScreen

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.que_frontend.R
import com.example.que_frontend.UserData.Data
import com.example.que_frontend.helpers.Resource
import com.example.que_frontend.viewmodel.OwnerViewModel
import com.example.que_frontend.viewmodel.UserViewModel

class User : AppCompatActivity() {

    lateinit var joinque : EditText
    private val viewModel: UserViewModel by lazy {
        ViewModelProvider(this).get(com.example.que_frontend.viewmodel.UserViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        joinque = findViewById(R.id.code)

        

    }

    private fun observeLiveData(){

        viewModel.joinQueResponse.observe(this, Observer {
            response ->
            when(response) {
                is Resource.Success -> {

                    Toast.makeText(this, "Que Created", Toast.LENGTH_SHORT).show()



                }
                is Resource.Error -> {

                    Toast.makeText(this, response.message, Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
}