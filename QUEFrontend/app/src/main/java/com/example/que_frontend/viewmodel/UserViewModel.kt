package com.example.que_frontend.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.que_frontend.helpers.Resource
import com.example.que_frontend.model.DeleteQueResponse
import com.example.que_frontend.model.JoinQueResponse
import com.example.que_frontend.model.LeaveQueResponse
import com.example.que_frontend.model.QuePositionResponse
import com.example.que_frontend.repository.UserRepository
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Response

class UserViewModel : ViewModel(){
    private val userRepository = UserRepository()
    val joinQueResponse = MutableLiveData<Resource<JoinQueResponse>>()
    val leaveQueResponse = MutableLiveData<Resource<LeaveQueResponse>>()
    val quePositionResponse = MutableLiveData<Resource<QuePositionResponse>>()

    fun joinQue(queId:String, userId:String) {
        viewModelScope.launch {
            joinQueResponse.postValue(Resource.Loading())
            val response = userRepository.joinQue(queId,userId)
            joinQueResponse.postValue(handleJoinQue(response))
        }
    }

    private fun handleJoinQue(response: Response<JoinQueResponse>): Resource<JoinQueResponse> {
        if (response.isSuccessful) {
            response.body()?.let { joinQueResponse ->
                return Resource.Success(joinQueResponse)
            }
        }
        val jsonObject = JSONObject(response.errorBody()!!.string())
        var message = jsonObject.getString("message")
        return Resource.Error(message)
    }

    fun leaveQue(queId:String, userId:String) {
        viewModelScope.launch {
            leaveQueResponse.postValue(Resource.Loading())
            val response = userRepository.leaveQue(queId,userId)
            leaveQueResponse.postValue(handleLeaveQue(response))
        }
    }

    private fun handleLeaveQue(response: Response<LeaveQueResponse>): Resource<LeaveQueResponse> {
        if (response.isSuccessful) {
            response.body()?.let { leaveQueResponse ->
                return Resource.Success(leaveQueResponse)
            }
        }
        val jsonObject = JSONObject(response.errorBody()!!.string())
        var message = jsonObject.getString("message")
        return Resource.Error(message)
    }

    fun quePosition(queId:String, userId:String) {
        viewModelScope.launch {
            quePositionResponse.postValue(Resource.Loading())
            val response = userRepository.quePosition(queId,userId)
            quePositionResponse.postValue(handleQuePosition(response))
        }
    }

    private fun handleQuePosition(response: Response<QuePositionResponse>): Resource<QuePositionResponse> {
        if (response.isSuccessful) {
            response.body()?.let { quePositionResponse ->
                return Resource.Success(quePositionResponse)
            }
        }
        val jsonObject = JSONObject(response.errorBody()!!.string())
        var message = jsonObject.getString("message")
        return Resource.Error(message)
    }

}