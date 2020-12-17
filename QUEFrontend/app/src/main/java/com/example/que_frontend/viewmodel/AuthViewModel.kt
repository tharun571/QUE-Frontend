package com.example.que_frontend.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.que_frontend.helpers.Resource
import com.example.que_frontend.model.LoginRequest
import com.example.que_frontend.model.LoginResponse
import com.example.que_frontend.model.RegisterRequest
import com.example.que_frontend.model.RegisterResponse
import com.example.que_frontend.repository.AuthRepository
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Response

class AuthViewModel: ViewModel() {
    private val repository = AuthRepository()
    val registerResponse = MutableLiveData<Resource<RegisterResponse>>()
    val loginResponse = MutableLiveData<Resource<LoginResponse>>()

    fun sendRegisterRequest(registerRequest: RegisterRequest) {
        viewModelScope.launch {
            registerResponse.postValue(Resource.Loading())
            val response = repository.sendRegisterRequest(registerRequest)
            registerResponse.postValue(handleRegisterResponse(response))
        }
    }

    private fun handleRegisterResponse(response: Response<RegisterResponse>): Resource<RegisterResponse> {
        if (response.isSuccessful) {
            response.body()?.let { registerResponse ->
                return Resource.Success(registerResponse)
            }
        }
        val jsonObject = JSONObject(response.errorBody()!!.string())
        var message = jsonObject.getString("message")
        if (message.startsWith("E1100")) {
            message = "A user with given e-mail already registered"
        }
        return Resource.Error(message)
    }

    fun sendLoginRequest(loginRequest: LoginRequest) {
        viewModelScope.launch {
            loginResponse.postValue(Resource.Loading())
            val response = repository.sendLoginRequest(loginRequest)
            loginResponse.postValue(handleLoginResponse(response))
        }
    }

    private fun handleLoginResponse(response: Response<LoginResponse>): Resource<LoginResponse> {
        if (response.isSuccessful) {
            response.body()?.let { loginResponse ->
                Log.i("login",loginResponse.token)
                return Resource.Success(loginResponse)
            }
        }
        val jsonObject = JSONObject(response.errorBody()!!.string())
        val message = jsonObject.getString("message")
        return Resource.Error(message)
    }
}