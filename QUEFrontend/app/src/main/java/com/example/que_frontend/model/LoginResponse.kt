package com.example.que_frontend.model

data class LoginResponse (
        val success: Boolean,
        val message: String,
        val token: String,
        val data: OwnerData
)