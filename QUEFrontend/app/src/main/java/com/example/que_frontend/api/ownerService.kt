package com.example.que_frontend.api

import com.example.que_frontend.model.DeleteQueResponse
import com.example.que_frontend.model.TotalCountResponse
import com.example.que_frontend.model.TotalNamesResponse
import com.example.que_frontend.model.createQueResponse
import retrofit2.Response
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ownerService {

    @POST("create/{id}")
    suspend fun getCreateResponse(@Path("id") id:String): Response<createQueResponse>

    @DELETE("{queId}/delete/{userId}")
    suspend fun deleteQue(@Path("queId") queId :String,@Path("userId") userId :String): Response<DeleteQueResponse>

    @GET("{queId}/count")
    suspend fun getCount(@Path("queId") queId: String): Response<TotalCountResponse>

    @GET("{queId}/getNames")
    suspend fun getNames(@Path("queId") queId: String): Response<TotalNamesResponse>
}