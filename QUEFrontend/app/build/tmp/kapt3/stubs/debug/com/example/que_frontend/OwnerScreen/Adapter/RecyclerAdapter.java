package com.example.que_frontend.OwnerScreen.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002/0BI\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\"\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004J\b\u0010&\u001a\u00020\u0007H\u0017J\u0014\u0010\'\u001a\u00020#2\n\u0010(\u001a\u00060\u0002R\u00020\u0000H\u0002J\u001c\u0010)\u001a\u00020#2\n\u0010(\u001a\u00060\u0002R\u00020\u00002\u0006\u0010*\u001a\u00020\u0007H\u0016J\u001c\u0010+\u001a\u00060\u0002R\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0007H\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u00061"}, d2 = {"Lcom/example/que_frontend/OwnerScreen/Adapter/RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/que_frontend/OwnerScreen/Adapter/RecyclerAdapter$QueViewHolder;", "que", "", "", "queCount", "", "viewModel", "Lcom/example/que_frontend/viewmodel/OwnerViewModel;", "con", "Landroidx/lifecycle/LifecycleOwner;", "context", "Landroid/content/Context;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "listener", "Lcom/example/que_frontend/OwnerScreen/Adapter/RecyclerAdapter$OnItemClickListener;", "(Ljava/util/List;Ljava/util/List;Lcom/example/que_frontend/viewmodel/OwnerViewModel;Landroidx/lifecycle/LifecycleOwner;Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView;Lcom/example/que_frontend/OwnerScreen/Adapter/RecyclerAdapter$OnItemClickListener;)V", "getCon", "()Landroidx/lifecycle/LifecycleOwner;", "getContext", "()Landroid/content/Context;", "listen", "getListen", "()Lcom/example/que_frontend/OwnerScreen/Adapter/RecyclerAdapter$OnItemClickListener;", "getListener", "getQue", "()Ljava/util/List;", "getQueCount", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "getViewModel", "()Lcom/example/que_frontend/viewmodel/OwnerViewModel;", "display", "", "que1", "queCount1", "getItemCount", "observelivedata", "holder", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClickListener", "QueViewHolder", "app_debug"})
public final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.que_frontend.OwnerScreen.Adapter.RecyclerAdapter.QueViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.que_frontend.OwnerScreen.Adapter.RecyclerAdapter.OnItemClickListener listen = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> que = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> queCount = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.que_frontend.viewmodel.OwnerViewModel viewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LifecycleOwner con = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.RecyclerView recyclerView = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.que_frontend.OwnerScreen.Adapter.RecyclerAdapter.OnItemClickListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.que_frontend.OwnerScreen.Adapter.RecyclerAdapter.OnItemClickListener getListen() {
        return null;
    }
    
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
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void display(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> que1, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> queCount1) {
    }
    
    private final void observelivedata(com.example.que_frontend.OwnerScreen.Adapter.RecyclerAdapter.QueViewHolder holder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getQue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getQueCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.que_frontend.viewmodel.OwnerViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LifecycleOwner getCon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.que_frontend.OwnerScreen.Adapter.RecyclerAdapter.OnItemClickListener getListener() {
        return null;
    }
    
    public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> que, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> queCount, @org.jetbrains.annotations.NotNull()
    com.example.que_frontend.viewmodel.OwnerViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner con, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    com.example.que_frontend.OwnerScreen.Adapter.RecyclerAdapter.OnItemClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/que_frontend/OwnerScreen/Adapter/RecyclerAdapter$QueViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/widget/RelativeLayout;", "(Lcom/example/que_frontend/OwnerScreen/Adapter/RecyclerAdapter;Landroid/widget/RelativeLayout;)V", "container", "getContainer", "()Landroid/widget/RelativeLayout;", "deleteque", "Landroid/widget/TextView;", "getDeleteque", "()Landroid/widget/TextView;", "quecode", "getQuecode", "quecount", "getQuecount", "getView", "onClick", "", "v", "Landroid/view/View;", "app_debug"})
    public final class QueViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RelativeLayout container = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView deleteque = null;
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
        public final android.widget.TextView getDeleteque() {
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
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
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
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/que_frontend/OwnerScreen/Adapter/RecyclerAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(int position);
    }
}