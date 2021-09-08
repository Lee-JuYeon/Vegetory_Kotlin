package com.example.fooddelivery.ui.customviews.framelayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun FrameLayout(content : @Composable BoxScope.() -> Unit){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        content = content
    )
}