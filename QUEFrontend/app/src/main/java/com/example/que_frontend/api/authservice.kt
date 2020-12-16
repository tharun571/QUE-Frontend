package com.example.que_frontend.api

import com.example.que_frontend.model.LoginRequest
import com.example.que_frontend.model.LoginResponse
import com.example.que_frontend.model.RegisterRequest
import com.example.que_frontend.model.RegisterResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface authservice {
    @POST("register")
    suspend fun getRegisterResponse(@Body registerRequest: RegisterRequest): Response<RegisterResponse>

    @POST("login")
    suspend fun getLoginResponse(@Body loginRequest: LoginRequest): Response<LoginResponse>


}