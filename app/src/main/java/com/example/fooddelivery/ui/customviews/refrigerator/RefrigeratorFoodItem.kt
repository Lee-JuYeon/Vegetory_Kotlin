package com.example.fooddelivery.ui.customviews.refrigerator

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.models.RefrigeratorFoodModel

@Composable
fun RefrigeratorFoodItem(
    model : RefrigeratorFoodModel,
    setWidth : Dp,
    setHeight : Dp,
    setOnClick : (RefrigeratorFoodModel) -> Unit
) {
    val width = 80.dp
    val height = 80.dp
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RectangleShape)
            .border(2.dp, Color.Black, CircleShape)
            .background(Color.White)
            .padding(5.dp)
            .clickable {
                setOnClick(model)
            }
    ) {
        Image(
            painter = painterResource(id = model.image),
            contentDescription = null,
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .padding(3.dp)
                .height(height = 40.dp)
        )
        Text(
            text = model.foodName,
            color = Color.Black,
            maxLines = 2,
            fontSize = 14.sp
        )
        Text(
            text = model.foodAmount,
            color = Color.Black,
            maxLines = 2,
            fontSize = 12.sp
        )
    }
}