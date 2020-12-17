package com.example.que_frontend

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.example.que_frontend.helpers.Resource
import com.example.que_frontend.model.LoginRequest
import com.example.que_frontend.viewmodel.AuthViewModel
import com.example.que_frontend.viewmodel.OwnerViewModel

class Login: AppCompatActivity() {
    private val viewModel: AuthViewModel by lazy {
        ViewModelProvider(this).get(AuthViewModel::class.java)
    }
    private val ownerViewModel: OwnerViewModel by lazy {
        ViewModelProvider(this).get(com.example.que_frontend.viewmodel.OwnerViewModel::class.java)
    }
    private lateinit var loginRequest: LoginRequest
    lateinit var loginButton:Button
    lateinit var emailEditText: EditText
    lateinit var pwdEditText: EditText
    lateinit var registerTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginButton = findViewById(R.id.login)
        emailEditText = findViewById(R.id.emailEditText)
        pwdEditText = findViewById(R.id.pwdEditText)
        registerTextView = findViewById(R.id.register)
        observeLiveData()
        registerTextView.setOnClickListener{
            val intent:Intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
        loginButton.setOnClickListener {
            var allOk = true
            var error:String

            val email = emailEditText.text.toString()
            if (email.isEmpty()) {
                allOk = false
                Toast.makeText(this,"Enter Email",Toast.LENGTH_SHORT).show()
            }

            val password = pwdEditText.text.toString()
            if (password.length < 6 ) {
                allOk = false
                Toast.makeText(this,"Password should be at least 6 letters",Toast.LENGTH_SHORT).show()
            }

            if (allOk) {
                loginRequest = LoginRequest(email, password)
                viewModel.sendLoginRequest(loginRequest)

            }
        }





    }

    private fun observeLiveData(){
        viewModel.loginResponse.observe(this, Observer {
            response ->
            when(response) {
                is Resource.Success -> {
                    saveToken(response.data!!.token)

                    Toast.makeText(this, "Logged in User", Toast.LENGTH_SHORT).show()
                    
                  //  val intent:Intent = Intent(this, UserScreen::class.java)
                  //  startActivity(intent)

                }
                is Resource.Error -> {

                    Toast.makeText(this, response.message, Toast.LENGTH_SHORT).show()
                }
            }
        })
        }

    private fun saveToken(token:String){
        val context = applicationContext
        val masterKey = MasterKey.Builder(context)
                .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                .build()

        EncryptedSharedPreferences.create(
                context,
                "encrypted_Shared_Pref",
                masterKey,
                EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        ).edit {
            putString("token", token)
            putString("username", loginRequest.mail)
            commit()
        }
    }




}