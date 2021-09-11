package com.example.fooddelivery.models

data class UserModel (

    val userName : String, // 유저이름
    val userAddress : String, // 유저 거주지
    val userEmail : String, // 유저 이메일
    val userSelfie : String, // 유저 셀카
    val userSafe : Boolean, // 유저 인증
    val userUID : String, // 유저 uid
    val userPosts : List<String>, // 유저 포스트 uid
    val userCAM : List<ProductCAMModel>, // 유저 캠 json path
    val userMainProduct : List<MainProductModel> // 유저 주 생상품목

    )