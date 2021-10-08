package com.example.fooddelivery.ui.views.splash

import android.content.Context
import android.util.Log
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.saveable.autoSaver
import androidx.lifecycle.LifecycleOwner
import com.example.fooddelivery.server.internet.InternetManager

class AutoLogin(var setContext : Context) {
    private var internetManager : InternetManager? = null


    private fun checkInternet() : Boolean{
        var internetState = false
        try{
            internetManager = InternetManager(context = setContext)
            internetManager?.observe(setContext as LifecycleOwner) { state ->
                internetState = state
            }
        }catch (e:Exception){
            Log.e("mException", "AutoLogin, checkInternet // Exception : ${e.message}")
        }
        return internetState
    }

    private fun doAutoLogin() : Boolean {
        var loginAccess = false
        if (loginAccess == true){
            loginAccess =  true
        }else if (loginAccess == false){
            loginAccess = false
        }
        return loginAccess
    }

    fun checkAutoLoginResult() : Boolean{
        var loginResult : Boolean = false
        if (checkInternet()) {
            try {
                when(doAutoLogin()){
                    true -> {
                        loginResult = true
                    }
                    false -> {
                        loginResult = false
                    }
                }
            }catch (e : Exception){
                Log.e("mException", "AutoLogin, checkAutoLogin // Exception : ${e.message}")
            }
        }
        return loginResult
    }



    fun setDismiss(){
        try{
            internetManager = null
        }catch (e:Exception){
            Log.e("mException", "AutoLogin, setDismiss // Exception : ${e.message}")
        }
    }
}