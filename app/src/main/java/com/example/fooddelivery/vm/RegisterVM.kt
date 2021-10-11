package com.example.fooddelivery.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegisterVM : ViewModel() {
//    private val _info = MutableLiveData(
//        mutableMapOf(
//            "userName" to "",
//            "userID" to "",
//            "userIDCheck" to false,
//            "password" to "",
//            "passwordCheck" to "",
//            "email" to "",
//            "address" to "",
//            "verifyFarmer" to false,
//            "verifyUser" to false
//        )
//    )
//    val info : LiveData<MutableMap<String, Any>> = _info
//    fun editInfo(editKEY : String, editVALUE : Any){
//        this._info.value?.get(editKEY)
//    }



    private val _name = MutableLiveData("")
    val name: LiveData<String> = _name
    fun setName(set : String){
        _name.value = set
    }

    private val _id = MutableLiveData("")
    val id : LiveData<String> = _id
    fun setID(set : String){
        _id.value = set
    }

    private val _idCheck = MutableLiveData(false)
    val idCheck : LiveData<Boolean> = _idCheck
    fun setIdCheck(set : Boolean){
        _idCheck.value = set
    }

    private val _password = MutableLiveData("")
    val password : LiveData<String> = _password
    fun setPassword(set : String){
        _password.value = set
    }

    private val _passwordCheck = MutableLiveData("")
    val passwordCheck : LiveData<String> = _passwordCheck
    fun setPasswordCheck(set : String){
        _passwordCheck.value = set
    }

    private val _email = MutableLiveData("")
    val email : LiveData<String> = _email
    fun setEmail(set : String){
        _email.value = set
    }

    private var _address = MutableLiveData("")
    val address : LiveData<String> = _address
    fun setAddress(set : String){
        _address.value = set
    }

    private var _verifyFarmer = MutableLiveData(false)
    val verifyFarmer : LiveData<Boolean> = _verifyFarmer
    fun setVerifyFarmer(set : Boolean){
        _verifyFarmer.value = set
    }

    private var _verifyUser = MutableLiveData(false)
    val verifyUser : LiveData<Boolean> = _verifyUser
    fun setVerifyUser(set : Boolean){
        _verifyUser.value = set
    }

}