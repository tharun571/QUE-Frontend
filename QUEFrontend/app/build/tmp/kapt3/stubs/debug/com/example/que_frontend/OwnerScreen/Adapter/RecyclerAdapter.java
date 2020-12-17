package com.example.que_frontend.OwnerScreen.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/example/que_frontend/OwnerScreen/Adapter/RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/que_frontend/OwnerScreen/Adapter/RecyclerAdapter$QueViewHolder;", "que", "", "", "queCount", "", "(Ljava/util/List;Ljava/util/List;)V", "getQue", "()Ljava/util/List;", "getQueCount", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "QueViewHolder", "app_debug"})
public final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.que_frontend.OwnerScreen.Adapter.RecyclerAdapter.QueViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> que = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> queCount = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.que_frontend.OwnerScreen.Adapter.RecyclerAdapter.QueViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.que_frontend.OwnerScreen.Adapter.RecyclerAdapter.QueViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getQue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getQueCount() {
        return null;
    }
    
    public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> que, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> queCount) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/que_frontend/OwnerScreen/Adapter/RecyclerAdapter$QueViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/widget/RelativeLayout;", "(Landroid/widget/RelativeLayout;)V", "container", "getContainer", "()Landroid/widget/RelativeLayout;", "queName", "Landroid/widget/TextView;", "getQueName", "()Landroid/widget/TextView;", "quecode", "getQuecode", "quecount", "getQuecount", "getView", "app_debug"})
    public static final class QueViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RelativeLayout container = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView queName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView quecode = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView quecount = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RelativeLayout view = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getContainer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getQueName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getQuecode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getQuecount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getView() {
            return null;
        }
        
        public QueViewHolder(@org.jetbrains.annotations.NotNull()
        android.widget.RelativeLayout view) {
            super(null);
        }
    }
}