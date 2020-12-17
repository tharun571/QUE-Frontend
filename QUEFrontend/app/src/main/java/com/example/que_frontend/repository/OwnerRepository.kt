package com.example.que_frontend.repository

import com.example.que_frontend.api.QueApi
import com.example.que_frontend.model.DeleteQueResponse
import com.example.que_frontend.model.TotalCountResponse
import com.example.que_frontend.model.TotalNamesResponse
import com.example.que_frontend.model.createQueResponse
import retrofit2.Response
import retrofit2.http.Path

class OwnerRepository {
    suspend fun getCreateResponse( id: String, authHeader:String): Response<createQueResponse> {
        return QueApi.ownerApiService.getCreateResponse(id,authHeader)
    }

    suspend fun deleteQue(queId: String,  userId: String, authHeader:String): Response<DeleteQueResponse> {
        return QueApi.ownerApiService.deleteQue(queId, userId, authHeader)
    }

    suspend fun getCount(queId: String ,authHeader: String): Response<TotalCountResponse> {
        return QueApi.ownerApiService.getCount(queId,authHeader)
    }

    suspend fun getNames( queId: String,authHeader: String): Response<TotalNamesResponse> {
        return QueApi.ownerApiService.getNames(queId,authHeader)
    }
}