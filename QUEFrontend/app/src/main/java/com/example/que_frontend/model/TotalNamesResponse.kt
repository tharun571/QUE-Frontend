package com.example.que_frontend.model

data class TotalNamesResponse(
        val success: Boolean,
        val message: String,
        val data : List<String>
)