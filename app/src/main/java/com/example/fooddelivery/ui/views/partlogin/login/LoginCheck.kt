package com.example.fooddelivery.ui.views.partlogin.login

import android.util.Log


class LoginCheck {
    private var getEmail : String? = null
    private var getPassword : String? = null
    fun setEmailPassword(email : String?, password : String?){
        this.getEmail = email
        this.getPassword = password
    }

    private fun nullChecker() : Boolean{
        return if (getEmail?.length != 0 && getPassword?.length != 0) false else true
    }

    private fun compareLoginDataFromServer() : Boolean{
        /* TODO : 서버로부터 로그인 작업결과를 true, false로 받아서 로그인 성공여부체크*/
        return false
    }

    private var getLoginFailedCount : Int = 0
    fun setLoginFailedCount(count : Int){ this.getLoginFailedCount = count}

    fun checkLogin(
        whenSuccess : () -> Unit,
        whenFailed : (String) -> Unit
    ){
        if (!nullChecker()){
            when(compareLoginDataFromServer()){
                true -> {
                    // 로그인 성공
                    whenSuccess()
                }
                false -> {
                    // 로그인 실패
                    Log.e("mException", " count : ${getLoginFailedCount}")

                    if (getLoginFailedCount == 4){
                        Log.e("mException", "faield count : ${getLoginFailedCount}")
                        whenFailed("overFailed")
                    }else {
                        whenFailed("failed")
                    }
                }
            }
        }else{
            whenFailed("blank")
        }
    }

}