package com.example.fooddelivery.ui.views.product.post

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
fun LikeButton(
    setCount : String,
    setButtonImage : Int,
    setOnClick : () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clickable {
                setOnClick()
            }
    ) {
        Image(
            painter = painterResource(setButtonImage),
            contentDescription = null,
            modifier = Modifier
                .size(30.dp, 30.dp)
        )
        // 유저이름
        Text(
            text = setCount,
            color = Color.Black,
            maxLines = 1,
            fontSize = 15.sp,
            fontFamily = FontFamily(Font(R.font.noto_regular))
        )
    }
}