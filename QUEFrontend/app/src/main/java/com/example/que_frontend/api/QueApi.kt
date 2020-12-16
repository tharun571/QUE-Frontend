package com.example.que_frontend.api

import android.provider.SyncStateContract
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)


val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(interceptor) // same for .addInterceptor(...)
        .connectTimeout(30, TimeUnit.SECONDS) //Backend is really slow
        .writeTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .build()
private val gson = GsonBuilder()
        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssz")
        .create()

private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create(gson))
        .baseUrl("https://que-backend.herokuapp.com/api/user/")
        .client(okHttpClient)
        .build()

object QueApi {
    val authApiService: authservice by lazy {
        retrofit.create(authservice::class.java)
    }

    val ownerApiService: ownerService by lazy {
        retrofit.create(ownerService::class.java)
    }

}

