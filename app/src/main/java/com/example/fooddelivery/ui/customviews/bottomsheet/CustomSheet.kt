package com.example.fooddelivery.ui.customviews.bottomsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.rememberTransformableState
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp

class BottomSheet {
}

@Composable
fun CustomSheet(
    INNER_VIEW : @Composable (Constraints) -> Unit
) {
    // set up all transformation states
    var scale by remember { mutableStateOf(0f) }
    var rotation by remember { mutableStateOf(0f) }
    var offset by remember { mutableStateOf(Offset.Zero) }
    val state = rememberTransformableState { zoomChange, offsetChange, rotationChange ->
        scale *= zoomChange
        rotation += rotationChange
        offset += offsetChange
    }

    var backgroundClick by remember { mutableStateOf(300)}
    BoxWithConstraints(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .height(height = if (backgroundClick == 0) 0.dp else 400.dp)
            .clickable {
                backgroundClick = 0
            }
    ) {

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(PaddingValues(start = 5.dp, end = 5.dp, top = 5.dp, bottom = 0.dp))
                .fillMaxWidth()
                .border(width = 1.dp, color = Color.Black, shape = RectangleShape)
        ){
            val boxScope = this@BoxWithConstraints
            INNER_VIEW(boxScope.constraints)
        }
    }
}

/*
Modifier
            // apply other transformations like rotation and zoom
            // on the pizza slice emoji
            .graphicsLayer(
                scaleX = scale,
                scaleY = scale,
                rotationZ = rotation,
                translationX = offset.x,
                translationY = offset.y
            )
            // add transformable to listen to multitouch transformation events
            // after offset
            .transformable(state = state)
            .background(Color.Blue)
            .fillMaxHeight()

https://ichi.pro/ko/jetpack-composeleul-sayonghayeo-bottomsheet-kontencheue-aenimeisyeon-eul-jeog-yonghaneun-bangbeob-68906696522716
 */