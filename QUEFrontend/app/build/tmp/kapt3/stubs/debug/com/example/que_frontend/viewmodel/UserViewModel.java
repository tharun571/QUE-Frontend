package com.example.que_frontend.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0002J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0002J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0002J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019J\u001e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019J\u001e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/que_frontend/viewmodel/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "joinQueResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/que_frontend/helpers/Resource;", "Lcom/example/que_frontend/model/JoinQueResponse;", "getJoinQueResponse", "()Landroidx/lifecycle/MutableLiveData;", "leaveQueResponse", "Lcom/example/que_frontend/model/LeaveQueResponse;", "getLeaveQueResponse", "quePositionResponse", "Lcom/example/que_frontend/model/QuePositionResponse;", "getQuePositionResponse", "userRepository", "Lcom/example/que_frontend/repository/UserRepository;", "handleJoinQue", "response", "Lretrofit2/Response;", "handleLeaveQue", "handleQuePosition", "joinQue", "", "queId", "", "userId", "authHeader", "leaveQue", "quePosition", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.que_frontend.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.JoinQueResponse>> joinQueResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.LeaveQueResponse>> leaveQueResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.QuePositionResponse>> quePositionResponse = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.JoinQueResponse>> getJoinQueResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.LeaveQueResponse>> getLeaveQueResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.QuePositionResponse>> getQuePositionResponse() {
        return null;
    }
    
    public final void joinQue(@org.jetbrains.annotations.NotNull()
    java.lang.String queId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String authHeader) {
    }
    
    private final com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.JoinQueResponse> handleJoinQue(retrofit2.Response<com.example.que_frontend.model.JoinQueResponse> response) {
        return null;
    }
    
    public final void leaveQue(@org.jetbrains.annotations.NotNull()
    java.lang.String queId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String authHeader) {
    }
    
    private final com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.LeaveQueResponse> handleLeaveQue(retrofit2.Response<com.example.que_frontend.model.LeaveQueResponse> response) {
        return null;
    }
    
    public final void quePosition(@org.jetbrains.annotations.NotNull()
    java.lang.String queId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String authHeader) {
    }
    
    private final com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.QuePositionResponse> handleQuePosition(retrofit2.Response<com.example.que_frontend.model.QuePositionResponse> response) {
        return null;
    }
    
    public UserViewModel() {
        super();
    }
}