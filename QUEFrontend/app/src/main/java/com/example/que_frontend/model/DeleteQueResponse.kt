package com.example.que_frontend.model

data class DeleteQueResponse(
        val success: Boolean ,
        val data : QueueData,
        val message : String
)