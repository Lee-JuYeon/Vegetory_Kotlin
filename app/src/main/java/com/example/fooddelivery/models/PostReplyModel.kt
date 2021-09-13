package com.example.fooddelivery.models

data class PostReplyModel (
    val userUID : String,
    val userName : String,
    var userSelfie : Int,
    val replyDate : String,
    val replyDescription : String,
    val replyUID : String
    )