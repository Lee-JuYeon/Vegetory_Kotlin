package com.example.fooddelivery.ui.views.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


fun Boolean.isCamWorking(): String = if (!this) {
    "OFF"
}else {
    "ON"
}


@Composable
fun ProductCAM(
    setCamWork : Boolean,
    setVideoPath : Int
) {

    Box(
        modifier = Modifier
            .size(100.dp, 150.dp)
            .padding(5.dp)
            .background(Color.White)
            .clickable {

            },
        contentAlignment = Alignment.TopStart,
        propagateMinConstraints = false
    ) {
        Text(
            text = setCamWork.isCamWorking(),
            color = Color.White,
            modifier = Modifier
                .padding(3.dp)
                .background(Color.Red)
                .padding(
                    start = 2.dp,
                    bottom = 1.dp,
                    top = 1.dp,
                    end = 2.dp
                )
        )
        Image(
            painter = painterResource(
                id = setVideoPath
            ),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
        )
    }
}