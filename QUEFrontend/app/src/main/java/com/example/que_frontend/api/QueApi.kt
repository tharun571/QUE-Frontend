package com.example.que_frontend.api

import android.provider.SyncStateContract
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val gson = GsonBuilder()
        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssz")
        .create()

private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create(gson))
        .baseUrl("baseurl")
        .build()

object QueApi {
    val authApiService: authservice by lazy {
        retrofit.create(authApiService::class.java)
    }


}