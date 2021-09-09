package com.example.fooddelivery.ui.customviews.framelayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun FrameLayout(
    setHeight : Dp,
    content : @Composable BoxScope.() -> Unit
){

    Box(
        modifier = Modifier
            .height(setHeight)
            .background(Color.Yellow),
        content = content
    )
}