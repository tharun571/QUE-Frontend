package com.example.que_frontend.api

import com.example.que_frontend.model.DeleteQueResponse
import com.example.que_frontend.model.TotalCountResponse
import com.example.que_frontend.model.TotalNamesResponse
import com.example.que_frontend.model.createQueResponse
import retrofit2.Response
import retrofit2.http.*

interface ownerService {

    @POST("queue/create/{id}")
    suspend fun getCreateResponse(@Path("id") id:String, @Header("Authorization") token:String ): Response<createQueResponse>

    @DELETE("queue/{queId}/delete/{userId}")
    suspend fun deleteQue(@Path("queId") queId :String,@Path("userId") userId :String , @Header("Authorization") token:String): Response<DeleteQueResponse>

    @GET("queue/{queId}/count")
    suspend fun getCount(@Path("queId") queId: String,  @Header("Authorization") token:String): Response<TotalCountResponse>

    @GET("queue/{queId}/getNames")
    suspend fun getNames(@Path("queId") queId: String,  @Header("Authorization") token:String): Response<TotalNamesResponse>
}