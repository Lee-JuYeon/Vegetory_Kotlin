package com.example.fooddelivery.models

data class PostReplyModel (
    val user : UserModel,
    val replyDate : String,
    val replyDescription : String,
    val replyUID : String
    )