package com.example.que_frontend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00107\u001a\u000208H\u0002J\u0012\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\u0010\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020>H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010(\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR\u001a\u0010,\u001a\u00020-X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b4\u00105\u00a8\u0006?"}, d2 = {"Lcom/example/que_frontend/Login;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "checkBox", "Landroid/widget/CheckBox;", "getCheckBox", "()Landroid/widget/CheckBox;", "setCheckBox", "(Landroid/widget/CheckBox;)V", "emailEditText", "Landroid/widget/EditText;", "getEmailEditText", "()Landroid/widget/EditText;", "setEmailEditText", "(Landroid/widget/EditText;)V", "loginButton", "Landroid/widget/Button;", "getLoginButton", "()Landroid/widget/Button;", "setLoginButton", "(Landroid/widget/Button;)V", "loginPreferences", "Landroid/content/SharedPreferences;", "getLoginPreferences", "()Landroid/content/SharedPreferences;", "setLoginPreferences", "(Landroid/content/SharedPreferences;)V", "loginPreferencesEditor", "Landroid/content/SharedPreferences$Editor;", "getLoginPreferencesEditor", "()Landroid/content/SharedPreferences$Editor;", "setLoginPreferencesEditor", "(Landroid/content/SharedPreferences$Editor;)V", "loginRequest", "Lcom/example/que_frontend/model/LoginRequest;", "ownerViewModel", "Lcom/example/que_frontend/viewmodel/OwnerViewModel;", "getOwnerViewModel", "()Lcom/example/que_frontend/viewmodel/OwnerViewModel;", "ownerViewModel$delegate", "Lkotlin/Lazy;", "pwdEditText", "getPwdEditText", "setPwdEditText", "registerTextView", "Landroid/widget/TextView;", "getRegisterTextView", "()Landroid/widget/TextView;", "setRegisterTextView", "(Landroid/widget/TextView;)V", "viewModel", "Lcom/example/que_frontend/viewmodel/AuthViewModel;", "getViewModel", "()Lcom/example/que_frontend/viewmodel/AuthViewModel;", "viewModel$delegate", "observeLiveData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveToken", "token", "", "app_debug"})
public final class Login extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy ownerViewModel$delegate = null;
    public android.content.SharedPreferences loginPreferences;
    public android.content.SharedPreferences.Editor loginPreferencesEditor;
    public android.widget.CheckBox checkBox;
    private com.example.que_frontend.model.LoginRequest loginRequest;
    public android.widget.Button loginButton;
    public android.widget.EditText emailEditText;
    public android.widget.EditText pwdEditText;
    public android.widget.TextView registerTextView;
    
    private final com.example.que_frontend.viewmodel.AuthViewModel getViewModel() {
        return null;
    }
    
    private final com.example.que_frontend.viewmodel.OwnerViewModel getOwnerViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getLoginPreferences() {
        return null;
    }
    
    public final void setLoginPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor getLoginPreferencesEditor() {
        return null;
    }
    
    public final void setLoginPreferencesEditor(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getCheckBox() {
        return null;
    }
    
    public final void setCheckBox(@org.jetbrains.annotations.NotNull()
    android.widget.CheckBox p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getLoginButton() {
        return null;
    }
    
    public final void setLoginButton(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEmailEditText() {
        return null;
    }
    
    public final void setEmailEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getPwdEditText() {
        return null;
    }
    
    public final void setPwdEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getRegisterTextView() {
        return null;
    }
    
    public final void setRegisterTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeLiveData() {
    }
    
    private final void saveToken(java.lang.String token) {
    }
    
    public Login() {
        super();
    }
}