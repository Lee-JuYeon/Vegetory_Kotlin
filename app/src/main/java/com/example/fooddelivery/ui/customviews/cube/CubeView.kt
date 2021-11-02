package com.example.fooddelivery.ui.customviews.cube

import android.util.Log
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.consumeAllChanges
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CubeView(
    width : Dp,
    height : Dp
) {

    var offset by remember { mutableStateOf(0f) }

    Box(
        modifier = Modifier
            .size(width, height)
            .background(Color.White)
            .scrollable(
                orientation = Orientation.Horizontal,
                // Scrollable state: describes how to consume
                // scrolling delta and update offset
                state = rememberScrollableState { delta ->
                    offset += delta
                    delta
                }
            )
    ) {
        Box(
            modifier = Modifier
                .size(width - 100.dp, height - 100.dp)
                .border(1.dp, Color.Black, RectangleShape)
                .align(Alignment.Center)
                .graphicsLayer(
                    transformOrigin = TransformOrigin(0.0f, 0.5f),
//                    scaleX = scale,
//                    scaleY = 1f,
                    rotationY = offset,
                    translationX = 100f,
//                    translationY = 1f
                )
        ) {
            Text(
                text = "left",
                modifier = Modifier
                    .size(width - 105.dp, height - 105.dp)
                    .border(1.dp, Color.Black, RectangleShape),
                fontSize = 50.sp
            )
        }
    }
}

//var offsetX by remember { mutableStateOf(0f) }
//Box(
//modifier = Modifier
//.pointerInput(Unit) {
//    detectDragGestures { change, dragAmount ->
//        change.consumeAllChanges()
//        offsetX += dragAmount.x
//        Log.e("mException", "dragAmount.x : ${dragAmount.x}")
//    }
//},
//                .draggable(
//                    orientation = Orientation.Horizontal,
//                    // Scrollable state: describes how to consume
//                    // scrolling delta and update offset
//                    state = rememberDraggableState { delta ->
//                        offsetX += delta
//                        Log.e("mException", "delta : ${delta}")
//                    }
//                ),
//contentAlignment = Alignment.Center
//) {
//    Box(
//        modifier = Modifier
//            .width(maxWidth)
//            .height((maxHeight / 5) * 4)
//            .clip(RectangleShape)
//            .background(Color.Red)
//    )
//            Box(
//                modifier = Modifier
//                    .width(maxWidth)
//                    .height((maxHeight/5) * 4)
//                    .clip(RectangleShape)
//                    .background(Color.Yellow)
//            )
//
//            Box(
//                modifier = Modifier
//                    .width(maxWidth)
//                    .height((maxHeight/5) * 4)
//                    .clip(RectangleShape)
//                    .background(Color.Green)
//            )
//}