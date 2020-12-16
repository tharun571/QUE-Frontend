package com.example.que_frontend.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.que_frontend.helpers.Resource
import com.example.que_frontend.model.*
import com.example.que_frontend.repository.OwnerRepository
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Response

class OwnerViewModel : ViewModel(){
    private val ownerRepository = OwnerRepository()
    val createQueResponse = MutableLiveData<Resource<createQueResponse>>()
    val deleteQueResponse = MutableLiveData<Resource<DeleteQueResponse>>()
    val totalCountResponse = MutableLiveData<Resource<TotalCountResponse>>()
    val totalNamesResponse = MutableLiveData<Resource<TotalNamesResponse>>()

    fun createQue(id:String) {
        viewModelScope.launch {
            createQueResponse.postValue(Resource.Loading())
            val response = ownerRepository.getCreateResponse(id)
            createQueResponse.postValue(handleCreateQue(response))
        }
    }

    private fun handleCreateQue(response: Response<createQueResponse>): Resource<createQueResponse> {
        if (response.isSuccessful) {
            response.body()?.let { createQueResponse ->
                return Resource.Success(createQueResponse)
            }
        }
        val jsonObject = JSONObject(response.errorBody()!!.string())
        var message = jsonObject.getString("message")
        return Resource.Error(message)
    }

    fun deleteQue(queId:String, userId:String) {
        viewModelScope.launch {
            deleteQueResponse.postValue(Resource.Loading())
            val response = ownerRepository.deleteQue(queId,userId)
            deleteQueResponse.postValue(handleDeletedQue(response))
        }
    }

    private fun handleDeletedQue(response: Response<DeleteQueResponse>): Resource<DeleteQueResponse> {
        if (response.isSuccessful) {
            response.body()?.let { deleteQueResponse ->
                return Resource.Success(deleteQueResponse)
            }
        }
        val jsonObject = JSONObject(response.errorBody()!!.string())
        var message = jsonObject.getString("message")
        return Resource.Error(message)
    }

    fun getCount(queId:String) {
        viewModelScope.launch {
            totalCountResponse.postValue(Resource.Loading())
            val response = ownerRepository.getCount(queId)
            totalCountResponse.postValue(handleCount(response))
        }
    }

    private fun handleCount(response: Response<TotalCountResponse>): Resource<TotalCountResponse> {
        if (response.isSuccessful) {
            response.body()?.let { totalCountResponse ->
                return Resource.Success(totalCountResponse)
            }
        }
        val jsonObject = JSONObject(response.errorBody()!!.string())
        var message = jsonObject.getString("message")
        return Resource.Error(message)
    }

    fun getNames(queId:String) {
        viewModelScope.launch {
            totalNamesResponse.postValue(Resource.Loading())
            val response = ownerRepository.getNames(queId)
            totalNamesResponse.postValue(handleNames(response))
        }
    }

    private fun handleNames(response: Response<TotalNamesResponse>): Resource<TotalNamesResponse> {
        if (response.isSuccessful) {
            response.body()?.let { totalNamesResponse ->
                return Resource.Success(totalNamesResponse)
            }
        }
        val jsonObject = JSONObject(response.errorBody()!!.string())
        var message = jsonObject.getString("message")
        return Resource.Error(message)
    }


}