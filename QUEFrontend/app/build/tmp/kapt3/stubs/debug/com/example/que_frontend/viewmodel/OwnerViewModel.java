package com.example.que_frontend.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u001e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0 H\u0002J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060 H\u0002J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0 H\u0002J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120 H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\b\u00a8\u0006$"}, d2 = {"Lcom/example/que_frontend/viewmodel/OwnerViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "createQueResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/que_frontend/helpers/Resource;", "Lcom/example/que_frontend/model/createQueResponse;", "getCreateQueResponse", "()Landroidx/lifecycle/MutableLiveData;", "deleteQueResponse", "Lcom/example/que_frontend/model/DeleteQueResponse;", "getDeleteQueResponse", "ownerRepository", "Lcom/example/que_frontend/repository/OwnerRepository;", "totalCountResponse", "Lcom/example/que_frontend/model/TotalCountResponse;", "getTotalCountResponse", "totalNamesResponse", "Lcom/example/que_frontend/model/TotalNamesResponse;", "getTotalNamesResponse", "createQue", "", "id", "", "authHeader", "deleteQue", "queId", "userId", "getCount", "getNames", "handleCount", "response", "Lretrofit2/Response;", "handleCreateQue", "handleDeletedQue", "handleNames", "app_debug"})
public final class OwnerViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.que_frontend.repository.OwnerRepository ownerRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.createQueResponse>> createQueResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.DeleteQueResponse>> deleteQueResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.TotalCountResponse>> totalCountResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.TotalNamesResponse>> totalNamesResponse = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.createQueResponse>> getCreateQueResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.DeleteQueResponse>> getDeleteQueResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.TotalCountResponse>> getTotalCountResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.TotalNamesResponse>> getTotalNamesResponse() {
        return null;
    }
    
    public final void createQue(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String authHeader) {
    }
    
    private final com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.createQueResponse> handleCreateQue(retrofit2.Response<com.example.que_frontend.model.createQueResponse> response) {
        return null;
    }
    
    public final void deleteQue(@org.jetbrains.annotations.NotNull()
    java.lang.String queId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String authHeader) {
    }
    
    private final com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.DeleteQueResponse> handleDeletedQue(retrofit2.Response<com.example.que_frontend.model.DeleteQueResponse> response) {
        return null;
    }
    
    public final void getCount(@org.jetbrains.annotations.NotNull()
    java.lang.String queId, @org.jetbrains.annotations.NotNull()
    java.lang.String authHeader) {
    }
    
    private final com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.TotalCountResponse> handleCount(retrofit2.Response<com.example.que_frontend.model.TotalCountResponse> response) {
        return null;
    }
    
    public final void getNames(@org.jetbrains.annotations.NotNull()
    java.lang.String queId, @org.jetbrains.annotations.NotNull()
    java.lang.String authHeader) {
    }
    
    private final com.example.que_frontend.helpers.Resource<com.example.que_frontend.model.TotalNamesResponse> handleNames(retrofit2.Response<com.example.que_frontend.model.TotalNamesResponse> response) {
        return null;
    }
    
    public OwnerViewModel() {
        super();
    }
}