package com.example.fooddelivery.ui.customviews.topbar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
fun TopBarItemView(
    model : TopBarModel,
    setOnClick : (model : TopBarModel) -> Unit
){
    Box(
        contentAlignment = Alignment.TopStart
    ){
        Text(
            text = model.itemNative,
            color = Color.White,
            maxLines = 1,
            fontSize = 25.sp,
            fontFamily = FontFamily(Font(R.font.kotra_bold)),
            modifier = Modifier
                .padding(horizontal = 15.dp)
        )
        Text(
            text = model.itemNative,
            color = Color.Black,
            maxLines = 1,
            fontSize = 24.sp,
            fontFamily = FontFamily(Font(R.font.kotra_bold)),
            modifier = Modifier
                .padding(horizontal = 15.dp)
                .clickable {
                    setOnClick(model)
                }
        )
    }
}
