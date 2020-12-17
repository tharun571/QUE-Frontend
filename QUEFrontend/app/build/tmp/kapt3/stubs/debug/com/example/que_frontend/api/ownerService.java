package com.example.que_frontend.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/que_frontend/api/ownerService;", "", "deleteQue", "Lretrofit2/Response;", "Lcom/example/que_frontend/model/DeleteQueResponse;", "queId", "", "userId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCount", "Lcom/example/que_frontend/model/TotalCountResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCreateResponse", "Lcom/example/que_frontend/model/createQueResponse;", "id", "token", "getNames", "Lcom/example/que_frontend/model/TotalNamesResponse;", "app_debug"})
public abstract interface ownerService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "queue/create/{id}")
    public abstract java.lang.Object getCreateResponse(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.que_frontend.model.createQueResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "{queId}/delete/{userId}")
    public abstract java.lang.Object deleteQue(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "queId")
    java.lang.String queId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "userId")
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.que_frontend.model.DeleteQueResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "{queId}/count")
    public abstract java.lang.Object getCount(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "queId")
    java.lang.String queId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.que_frontend.model.TotalCountResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "{queId}/getNames")
    public abstract java.lang.Object getNames(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "queId")
    java.lang.String queId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.que_frontend.model.TotalNamesResponse>> p1);
}