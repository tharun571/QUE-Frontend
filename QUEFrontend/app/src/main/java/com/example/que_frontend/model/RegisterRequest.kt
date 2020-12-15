package com.example.que_frontend.model

data class RegisterRequest (
        val name:String,
        val mail:String,
        val password:String,
        val isShopkeeper:Boolean
)