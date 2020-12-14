package com.example.que_frontend.model

data class RegisterResponse (
        val success: Boolean,
        val message: String,
        val token: String
)