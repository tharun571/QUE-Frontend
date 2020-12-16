package com.example.que_frontend

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.que_frontend.helpers.Resource
import com.example.que_frontend.model.RegisterRequest
import com.example.que_frontend.viewmodel.AuthViewModel

class Register: AppCompatActivity() {
    private val viewModel: AuthViewModel by lazy {
        ViewModelProvider(this).get(AuthViewModel::class.java)
    }
    lateinit var emailREditText: EditText
    lateinit var nameREditText: EditText
    lateinit var pwdREditText: EditText
    var isShopkeeper:Boolean = false
    lateinit var switch: SwitchCompat
    lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        emailREditText = findViewById(R.id.emailREditText)
        nameREditText = findViewById(R.id.nameREditText)
        pwdREditText = findViewById(R.id.pwdReditText)
        switch = findViewById(R.id.customerSwitch)
        registerButton = findViewById(R.id.registerRButton)
        observeLiveData()
        registerButton.setOnClickListener {
            var allOk = true
            if(emailREditText.text.toString().equals("") ){
                allOk = false
                Toast.makeText(this,"Enter Email!!",Toast.LENGTH_SHORT).show()
            }else if(nameREditText.text.toString().equals("")){
                allOk = false
                Toast.makeText(this,"Enter Name!!",Toast.LENGTH_SHORT).show()
            }else if(pwdREditText.text.toString().length < 6){
                allOk = false
                Toast.makeText(this,"Password should be min 6 characters!!",Toast.LENGTH_SHORT).show()
            }
            if(allOk){
                val registerRequest = RegisterRequest(name = nameREditText.text.toString(),mail =emailREditText.text.toString(),password = pwdREditText.text.toString(),isShopkeeper = !switch.isActivated )
                viewModel.sendRegisterRequest(registerRequest)
            }
        }

    }

    private fun observeLiveData() {
        viewModel.registerResponse.observe(this, Observer { response ->
            when(response) {
                is Resource.Success -> {
                    Toast.makeText(this, "Registered User", Toast.LENGTH_SHORT).show()
                    val intent: Intent = Intent(this, UserScreen::class.java)
                    startActivity(intent)
                }
                is Resource.Error -> {
                    Toast.makeText(this, response.message, Toast.LENGTH_SHORT).show()
                } }
        })

    }

}