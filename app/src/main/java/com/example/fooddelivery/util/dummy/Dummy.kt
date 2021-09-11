package com.example.fooddelivery.util.dummy

import com.example.fooddelivery.R
import com.example.fooddelivery.models.MainProductModel
import com.example.fooddelivery.models.ProductCAMModel
import com.example.fooddelivery.models.UserModel

object Dummy {


    val user = UserModel(
        userName = "김수한무",
        userAddress = "서울시 반포구 반포동포동",
        userEmail = "cavss1118@gmail.com",
        userSelfie = "아직 이미지 데이터 없음",
        userSafe = false,
        userUID = "uid 1111",
        userPosts = listOf("postUID1", "postUID2", "postUID3", "postUID4","postUID5"),
        userCAM = listOf(
            ProductCAMModel(
                videoPath = R.drawable.image_password,
                videoIsWorking = false
            ),
            ProductCAMModel(
                videoPath = R.drawable.image_email,
                videoIsWorking = true
            ),
            ProductCAMModel(
                videoPath = R.drawable.image_password,
                videoIsWorking = false
            ),  ProductCAMModel(
                videoPath = R.drawable.image_email,
                videoIsWorking = true
            )

        ),
        userMainProduct = listOf<MainProductModel>(
            MainProductModel("당근", R.drawable.image_email),
            MainProductModel("오이", R.drawable.image_email),
            MainProductModel("딸기", R.drawable.image_email)
        )
    )
}