package com.example.que_frontend.repository

import com.example.que_frontend.api.QueApi
import com.example.que_frontend.model.DeleteQueResponse
import com.example.que_frontend.model.TotalCountResponse
import com.example.que_frontend.model.TotalNamesResponse
import com.example.que_frontend.model.createQueResponse
import retrofit2.Response
import retrofit2.http.Path

class OwnerRepository {
    suspend fun getCreateResponse( id: String): Response<createQueResponse> {
        return QueApi.ownerApiService.getCreateResponse(id)
    }

    suspend fun deleteQue(queId: String,  userId: String): Response<DeleteQueResponse> {
        return QueApi.ownerApiService.deleteQue(queId, userId)
    }

    suspend fun getCount(queId: String): Response<TotalCountResponse> {
        return QueApi.ownerApiService.getCount(queId)
    }

    suspend fun getNames( queId: String): Response<TotalNamesResponse> {
        return QueApi.ownerApiService.getNames(queId)
    }
}