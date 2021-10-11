package com.example.fooddelivery.ui.views.partlogin.register.functions

import android.util.Log
import java.util.regex.Pattern

enum class PasswordCheckResult {
    BLANK, MISMATCH, UNVALID, SUCCESS, UNKNOWNFAILED
}
class PasswordCheck {
    private var getPassword : String? = null
    fun setPassword(set : String){
        this.getPassword = set
    }

    private var getPasswordCheck : String? = null
    fun setPasswordCheck(set : String){
        this.getPasswordCheck = set
    }

    // 미입력 한 게 있는 경우
    private fun checkNull() : Boolean = !(getPassword?.length != 0 && getPasswordCheck?.length != 0)

    // 비밀번호가 서로 일치하지 않을 경우
    private fun passwordMatches() : Boolean = getPassword == getPasswordCheck

    // 비밀번호 양식이 틀린 경우
    private fun checkValid() : PasswordCheckResult {
        val passwordValid = Pattern.compile(
            "^(?=.*[a-zA-Z])((?=.*\\d)(?=.*\\W)).{8,15}.\$"
        )
        return if (!checkNull()){
            if(passwordValid.matcher(getPassword ?: "").matches() && passwordValid.matcher(getPasswordCheck ?: "").matches()){
                PasswordCheckResult.SUCCESS
            }else{
                PasswordCheckResult.UNVALID
            }
        }else{
            PasswordCheckResult.BLANK
        }
    }


    fun checkPassword() : PasswordCheckResult {
        if (checkNull()){ // 미입력함
            return  PasswordCheckResult.BLANK
        }else if (!passwordMatches()){ // 비밀번호가 서로 일치하지 않을 경우
            return  PasswordCheckResult.MISMATCH
        }
        return when(checkValid()){
            PasswordCheckResult.SUCCESS -> {
                PasswordCheckResult.SUCCESS
            }
            PasswordCheckResult.UNVALID -> {
                PasswordCheckResult.UNVALID
            }
            PasswordCheckResult.BLANK -> {
                PasswordCheckResult.BLANK
            }
            else -> {
                PasswordCheckResult.UNKNOWNFAILED
            }
        }
    }
}