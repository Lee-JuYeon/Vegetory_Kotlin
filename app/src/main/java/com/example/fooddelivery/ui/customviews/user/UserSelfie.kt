package com.example.fooddelivery.ui.views.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.R

@Composable
fun ProfileSelfie(
    setModifier : Modifier
) {
    Image(
        painter = painterResource(R.drawable.image_email),
        contentDescription = null,
        modifier = setModifier
//        modifier = Modifier
//            .size(setSize)
//            .clip(CircleShape)
//            .border(1.5.dp, MaterialTheme.colors.primaryVariant, CircleShape)
    )
}