package com.example.fooddelivery.ui.views.partlogin.register.subviews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.ui.theme.Sujin

@Composable
fun VerifyFarmerView() {
    // Verify Farmer Button
    Text(
        text = "농부인증",
        fontFamily = Sujin,
        fontSize = 20.sp,
        modifier = Modifier
            .clip(shape = RoundedCornerShape(5.dp))
            .background(Color.Yellow)
            .size(width = 100.dp, height = 30.dp)
    )
}