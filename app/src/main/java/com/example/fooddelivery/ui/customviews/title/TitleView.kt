package com.example.fooddelivery.ui.customviews.title

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
fun TitleView(
    setTitle : String,
    setFont : Int,
    setSize : TextUnit
) {
    Text(
        text = setTitle,
        color = Color.Black,
        maxLines = 1,
        fontSize = setSize,
        fontFamily = FontFamily(Font(setFont))
    )
}