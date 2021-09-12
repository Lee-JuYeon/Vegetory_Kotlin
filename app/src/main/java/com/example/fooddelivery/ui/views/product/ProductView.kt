package com.example.fooddelivery.ui.views.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.models.UserModel

@Composable
fun ProductView(
    productImage : Int,
    productTitle : String
) {
    Column(
        modifier = Modifier
            .padding(horizontal = 15.dp)
            .background(Color.LightGray)
            .clickable {

            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(productImage),
            contentDescription = null,
            modifier = Modifier
                .size(20.dp, 20.dp)
                .clip(CircleShape)
        )
        Text(
            text = productTitle,
            color = Color.Black,
            maxLines = 1,
            fontSize = 15.sp,
            fontFamily = FontFamily(Font(R.font.noto_bold))
        )
    }
}