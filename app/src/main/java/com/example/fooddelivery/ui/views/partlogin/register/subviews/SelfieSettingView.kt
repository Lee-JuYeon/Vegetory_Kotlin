package com.example.fooddelivery.ui.views.partlogin.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.R

@Composable
fun SelfieSettingView() {
    // Profile Image
    Image(
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "avatar",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(150.dp)
            .clip(CircleShape)
            .border(1.dp, Color.White, CircleShape)
            .clickable {
                /* TODO : 사진 찍어서 해당 사진 갤러리에 저장하지 않고 바로 업로드. + 사진권한*/
            }
    )// Profile Image
}