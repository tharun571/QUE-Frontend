package com.example.que_frontend

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.example.que_frontend.OwnerScreen.Owner
import com.example.que_frontend.UserData.Data
import com.example.que_frontend.UserData.Que
import com.example.que_frontend.UserScreen.User
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
    lateinit var loginPreferences: SharedPreferences
    lateinit var loginPreferencesEditor: SharedPreferences.Editor
    lateinit var checkBox: CheckBox
    private lateinit var loginRequest: LoginRequest
    lateinit var loginButton:Button
    lateinit var emailEditText: EditText
    lateinit var pwdEditText: EditText
    lateinit var registerTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        checkBox = findViewById(R.id.saveLoginCheckBox)
//        loginPreferences = getSharedPreferences("loginPrefs", Context.MODE_PRIVATE)
//        loginPreferencesEditor = loginPreferences.edit()
//        var saveLogin = loginPreferences.getBoolean("saveLogin",false)
//        if(saveLogin){
//            emailEditText.setText(loginPreferences.getString("username",""))
//            pwdEditText.setText(loginPreferences.getString("password",""))
//            checkBox.setChecked(true)
//        }






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
//                    if(checkBox.isChecked){
//                        loginPreferences.putBoolean
//                    }
                    saveToken(response.data!!.token)

                    Toast.makeText(this, "Logged in User", Toast.LENGTH_SHORT).show()
                    
                  //  val intent:Intent = Intent(this, UserScreen::class.java)
                  //  startActivity(intent)
                    Data.Name=response.data.data.name;
                    Data.id=response.data.data._id;
                    Data.mail=response.data.data.mail;
                    Data.auth=response.data.token;

                    if (response.data.data.isShopkeeper){

                        Data.que=response.data.data.queue;

                          val intent:Intent = Intent(this, Owner::class.java)
                          startActivity(intent)
                    }
                    else{

                        if(!response.data.data.queue.isNullOrEmpty()){
                            Data.alreadyInQue=true
                            Data.que = response.data.data.queue

                            Log.w("QWE","QWE "+response.data.data.queue)
                        }
                        val intent:Intent = Intent(this, User::class.java)
                        startActivity(intent)
                    }

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