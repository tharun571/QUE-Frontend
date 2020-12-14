package com.example.que_frontend.repository

import com.example.que_frontend.api.QueApi
import com.example.que_frontend.model.LoginRequest
import com.example.que_frontend.model.LoginResponse
import com.example.que_frontend.model.RegisterRequest
import com.example.que_frontend.model.RegisterResponse
import retrofit2.Response

class AuthRepository {
    suspend fun sendRegisterRequest(registerRequest: RegisterRequest): Response<RegisterResponse> {
        return QueApi.authApiService.getRegisterResponse(registerRequest)
    }

    suspend fun sendLoginRequest(loginRequest: LoginRequest): Response<LoginResponse> {
        return QueApi.authApiService.getLoginResponse(loginRequest)
    }
}