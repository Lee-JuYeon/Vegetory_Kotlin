package com.example.fooddelivery.ui.customviews.popup

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.theme.UbuntuRed

@Composable
fun PopupDismissButton(
    buttonSize : Dp,
    isOpen : MutableState<Boolean>
){
    Canvas(
        modifier = Modifier
            .size(
                width = buttonSize,
                height = buttonSize
            )
            .clickable {
                isOpen.value = false
            },
        onDraw = {
            drawRoundRect(
                color = UbuntuRed,
                size = Size(
                    width = buttonSize.toPx(),
                    height = buttonSize.toPx()
                ),
                topLeft = Offset(
                    x = 0.dp.toPx(),
                    y = 0.dp.toPx()
                ),
//                                style = Stroke(width = 1.dp.toPx()),
                cornerRadius = CornerRadius(
                    x = 5.dp.toPx(),
                    y = 5.dp.toPx()
                )
            )
            drawLine(
                Color.White,
                Offset(15f, 15f),
                Offset(size.width - 15, size.height - 15)
            )
            drawLine(
                Color.White,
                Offset(15f, size.height - 15),
                Offset(size.width - 15, 15f)
            )
        }
    )
}