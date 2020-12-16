package com.example.que_frontend.api

import com.example.que_frontend.model.JoinQueResponse
import com.example.que_frontend.model.LeaveQueResponse
import com.example.que_frontend.model.QuePositionResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface userService {

    @GET("/{queId}/enqueue/{userId}")
    suspend fun joinQue(@Path("queId") queId:String,@Path("userId") userId: String): Response<JoinQueResponse>

    @GET("/{queId}/leave/{userId}")
    suspend fun leaveQue(@Path("queId") queId:String,@Path("userId") userId: String): Response<LeaveQueResponse>

    @GET("/{queId}/position/{userId}")
    suspend fun quePosition(@Path("queId") queId:String,@Path("userId") userId: String): Response<QuePositionResponse>


}