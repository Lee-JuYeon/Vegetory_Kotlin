package com.example.fooddelivery.models


data class PostModel(
    val postUserSelfie : Int,
    val postUserName : String,
    val postUserUID : String,
    val postUID : String,
    val postDescription : String?,
    val postMedia : List<String>,
    val postLike : List<String>,
    val postReplyUID : List<String>
)