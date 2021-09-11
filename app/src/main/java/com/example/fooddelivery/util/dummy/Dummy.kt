package com.example.fooddelivery.util.dummy

import com.example.fooddelivery.R
import com.example.fooddelivery.models.MainProductModel

object Dummy {

    val mainProducts : List<MainProductModel> = listOf<MainProductModel>(
        MainProductModel("당근", R.drawable.image_email),
        MainProductModel("오이", R.drawable.image_email),
        MainProductModel("딸기", R.drawable.image_email)
    )
}