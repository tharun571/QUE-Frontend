package com.example.que_frontend.api

import com.example.que_frontend.model.JoinQueResponse
import com.example.que_frontend.model.LeaveQueResponse
import com.example.que_frontend.model.QuePositionResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface userService {

    @GET("queue/{queId}/enqueue/{userId}")
    suspend fun joinQue(@Path("queId") queId:String,@Path("userId") userId: String ,  @Header("Authorization") token:String): Response<JoinQueResponse>

    @GET("queue/{queId}/leave/{userId}")
    suspend fun leaveQue(@Path("queId") queId:String,@Path("userId") userId: String ,  @Header("Authorization") token:String): Response<LeaveQueResponse>

    @GET("queue/{queId}/position/{userId}")
    suspend fun quePosition(@Path("queId") queId:String,@Path("userId") userId: String,  @Header("Authorization") token:String): Response<QuePositionResponse>


}