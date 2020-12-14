package com.example.que_frontend.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0002J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/que_frontend/viewmodel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "loginResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/que_frontend/helpers/Resource;", "Lcom/example/que_frontend/model/LoginResponse;", "getLoginResponse", "()Landroidx/lifecycle/MutableLiveData;", "registerResponse", "Lcom/example/que_frontend/model/RegisterResponse;", "getRegisterResponse", "repository", "Lcom/example/que_frontend/repository/AuthRepository;", "handleLoginResponse", "response", "Lretrofit2/Response;", "handleRegisterResponse", "sendLoginRequest", "", "loginRequest", "Lcom/example/que_frontend/model/LoginRequest;", "sendRegisterRequest", "registerRequest", "Lcom/example/que_frontend/model/RegisterRequest;", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.que_frontend.repository.AuthRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.RegisterResponse>> registerResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.LoginResponse>> loginResponse = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.RegisterResponse>> getRegisterResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.LoginResponse>> getLoginResponse() {
        return null;
    }
    
    public final void sendRegisterRequest(@org.jetbrains.annotations.NotNull()
    com.example.que_frontend.model.RegisterRequest registerRequest) {
    }
    
    private final com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.RegisterResponse> handleRegisterResponse(retrofit2.Response<com.example.que_frontend.model.RegisterResponse> response) {
        return null;
    }
    
    public final void sendLoginRequest(@org.jetbrains.annotations.NotNull()
    com.example.que_frontend.model.LoginRequest loginRequest) {
    }
    
    private final com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.LoginResponse> handleLoginResponse(retrofit2.Response<com.example.que_frontend.model.LoginResponse> response) {
        return null;
    }
    
    public AuthViewModel() {
        super();
    }
}