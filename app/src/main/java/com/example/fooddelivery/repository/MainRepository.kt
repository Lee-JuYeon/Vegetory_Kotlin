package com.example.fooddelivery.repository

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class MainRepository {
    sealed class Result {

    }

    suspend fun changeFragmentType(type : String){

    }

    var textRead : String = ""
    var isTextRead : Boolean = false
    fun fetchReadText() = flow {
        while(true){
            if (isTextRead){
                emit(textRead)
                isTextRead = false
            }
        }
    }.flowOn(Dispatchers.Default)



    suspend fun fetchFragmentType(){
        try{

        }catch (e:Exception){
            Log.e("mException", "에러발생 -> MainRepository, fetchFragmentType // Error : ${e.message}")
        }
    }
}