package com.example.que_frontend.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/que_frontend/api/authservice;", "", "getLoginResponse", "Lretrofit2/Response;", "Lcom/example/que_frontend/model/LoginResponse;", "loginRequest", "Lcom/example/que_frontend/model/LoginRequest;", "(Lcom/example/que_frontend/model/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRegisterResponse", "Lcom/example/que_frontend/model/RegisterResponse;", "registerRequest", "Lcom/example/que_frontend/model/RegisterRequest;", "(Lcom/example/que_frontend/model/RegisterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface authservice {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/register")
    public abstract java.lang.Object getRegisterResponse(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.que_frontend.model.RegisterRequest registerRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.que_frontend.model.RegisterResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/login")
    public abstract java.lang.Object getLoginResponse(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.que_frontend.model.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.que_frontend.model.LoginResponse>> p1);
}