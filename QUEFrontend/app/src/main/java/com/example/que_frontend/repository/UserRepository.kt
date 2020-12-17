package com.example.que_frontend.repository

import com.example.que_frontend.api.QueApi
import com.example.que_frontend.model.DeleteQueResponse
import com.example.que_frontend.model.JoinQueResponse
import com.example.que_frontend.model.LeaveQueResponse
import com.example.que_frontend.model.QuePositionResponse
import retrofit2.Response

class UserRepository {
    suspend fun joinQue(queId: String,  userId: String,authHeader:String): Response<JoinQueResponse> {
        return QueApi.userApiService.joinQue(queId, userId,authHeader)
    }

    suspend fun leaveQue(queId: String,  userId: String,authHeader: String): Response<LeaveQueResponse> {
        return QueApi.userApiService.leaveQue(queId, userId,authHeader)
    }

    suspend fun quePosition(queId: String,  userId: String,authHeader: String): Response<QuePositionResponse> {
        return QueApi.userApiService.quePosition(queId, userId ,authHeader)
    }
}