package com.example.fooddelivery.ui.customviews.cube

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CubeView(
    width : Dp,
    height : Dp
) {
    Box(
        modifier = Modifier
            .size(width, height)
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .size(width, height)
                .background(Color.Blue)
                .border(1.dp, Color.Black, RectangleShape)
        ) {

        }

        val customRotateYRightDoor = animateFloatAsState(
            targetValue =  10f
//            ,
//            animationSpec = tween(
//                durationMillis = 300
//            )
        )
        Box(
            modifier = Modifier
                .size(width, height)
                .background(Color.Red)
                .border(1.dp, Color.Black, RectangleShape)
                .graphicsLayer {
                    transformOrigin = TransformOrigin(1.0f, 0.5f)
                    rotationY = customRotateYRightDoor.value
                }
        ) {

        }

    }

}