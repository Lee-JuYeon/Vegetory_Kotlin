package com.example.fooddelivery.ui.customviews.popup

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.ui.theme.NotoSansBold
import com.example.fooddelivery.ui.theme.UbuntuRed

@Composable
fun PopupTopBar(
    title : String,
    topHeight : Dp,
    topWidth : Dp,
    isOpen : MutableState<Boolean>
) {
    val paddingValue = 5.dp
    Box(
        modifier = Modifier
            .sizeIn(
                minWidth = 0.dp,
                minHeight = topHeight + (paddingValue * 2),
                maxWidth = topWidth,
                maxHeight = topHeight + (paddingValue * 2)
            )
            .border(1.dp, Color.Black)
            .background(brush = Brush.horizontalGradient(colors = listOf(Color(0xFFD0D0D0), Color.White)))
            .padding(paddingValue)
    ) {
        Text(
            text = title,
            modifier = Modifier
                .fillMaxWidth()
                .height(height = topHeight),
            textAlign = TextAlign.Center,
            fontFamily = NotoSansBold,
            fontSize = 20.sp,
            maxLines = 1
        )


        Canvas(
            modifier = Modifier
                .size(
                    width = topHeight,
                    height = topHeight
                )
                .align(Alignment.CenterEnd)
                .clickable {
                    isOpen.value = false
                },
            onDraw = {
                drawRoundRect(
                    color = UbuntuRed,
                    size = Size(
                        width = topHeight.toPx(),
                        height = topHeight.toPx()
                    ),
                    topLeft = Offset(
                        x = 0.dp.toPx(),
                        y = 0.dp.toPx()
                    ),
//                                style = Stroke(width = 1.dp.toPx()),
                    cornerRadius = CornerRadius(
                        x = 10.dp.toPx(),
                        y = 10.dp.toPx()
                    )
                )

                val distanceValue = 20f
                drawLine(
                    color = Color.White,
                    start = Offset(distanceValue, distanceValue),
                    end = Offset(size.width - distanceValue, size.height - distanceValue),
                    strokeWidth = 5F
                )

                drawLine(
                    color = Color.White,
                    start = Offset(distanceValue, size.height - distanceValue),
                    end = Offset(size.width - distanceValue, distanceValue),
                    strokeWidth = 5F
                )
            }
        )
    }
}