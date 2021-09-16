package com.example.fooddelivery.ui.customviews.refrigerator

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.GraphicsLayerScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun DoorLeft(
    setWidth : Dp,
    setHeight : Dp,
    setOnClick : () -> Unit,
    setGraphicLayerScope : GraphicsLayerScope.() -> Unit
){
    Box(
        modifier = Modifier
            .size(width = setWidth / 4, height = setHeight)
            .graphicsLayer(setGraphicLayerScope)
            .clickable { setOnClick() }
    ) {
        Canvas(
            modifier = Modifier
                .fillMaxSize(),
            onDraw = {
                val canvasSize = size
                val canvasWidth = size.width
                val canvasHeight = size.height
                drawRect(
                    color = Color.Green,
                    size = Size(
                        width = canvasWidth,
                        height = ( canvasHeight / 7 ) * 4
                    )
                )
                drawRect(
                    color = Color.Black,
                    size = Size(
                        width = canvasWidth,
                        height = ( canvasHeight / 7 ) * 4
                    ),
                    style = Stroke(
                        width = 2.dp.toPx(),
                        miter = 1.dp.toPx()
                    )
                )

                drawRect(
                    color = Color.White,
                    topLeft = Offset(
                        x = 0.dp.toPx(),
                        y =  ( canvasHeight / 7 ) * 4
                    ),
                    size = Size(
                        width = canvasWidth,
                        height = ( canvasHeight / 7 ) * 3
                    )
                )
                drawRect(
                    color = Color.Black,
                    topLeft = Offset(
                        x = 0.dp.toPx(),
                        y =  ( canvasHeight / 7 ) * 4
                    ),
                    size = Size(
                        width = canvasWidth,
                        height = ( canvasHeight / 7 ) * 3
                    ),
                    style = Stroke(
                        width = 2.dp.toPx(),
                        miter = 1.dp.toPx()
                    )
                )
                drawRect(
                    color = Color.Black,
                    size = Size(
                        width = canvasWidth,
                        height = 40f
                    ),
                    topLeft = Offset(
                        x = 0.dp.toPx(),
                        y =  ( canvasHeight / 7 ) * 4 - 20f
                    )
                )
                drawRect(
                    color = Color.LightGray,
                    size = Size(
                        width = 20f,
                        height = 20f
                    ),
                    topLeft = Offset(
                        x = canvasWidth - 30f,
                        y =  ( canvasHeight / 7 ) * 4 - 10f
                    )
                )
            }
        )
    }

}