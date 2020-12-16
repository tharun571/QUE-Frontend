package com.example.que_frontend.repository

import com.example.que_frontend.api.QueApi
import com.example.que_frontend.model.DeleteQueResponse
import com.example.que_frontend.model.JoinQueResponse
import com.example.que_frontend.model.LeaveQueResponse
import com.example.que_frontend.model.QuePositionResponse
import retrofit2.Response

class UserRepository {
    suspend fun joinQue(queId: String,  userId: String): Response<JoinQueResponse> {
        return QueApi.userApiService.joinQue(queId, userId)
    }

    suspend fun leaveQue(queId: String,  userId: String): Response<LeaveQueResponse> {
        return QueApi.userApiService.leaveQue(queId, userId)
    }

    suspend fun quePosition(queId: String,  userId: String): Response<QuePositionResponse> {
        return QueApi.userApiService.quePosition(queId, userId)
    }
}