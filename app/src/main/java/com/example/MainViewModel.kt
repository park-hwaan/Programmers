package com.example

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.parkhwaan.userprefsdk.api.TokenSdk
import com.parkhwaan.userprefsdk.api.TokenType
import kotlinx.coroutines.launch

class MainViewModel(
   context: Context
) : ViewModel() {

    private val tokenSdk = TokenSdk(context)

    val accessTokenFlow = tokenSdk.observe(TokenType.SERVER_ACCESS)

    fun saveAccessToken(token: String) {
        viewModelScope.launch {
            tokenSdk.save(TokenType.SERVER_ACCESS, token)
        }
    }

    fun clearAccessToken() {
        viewModelScope.launch {
            tokenSdk.remove(TokenType.SERVER_ACCESS)
        }
    }
}

