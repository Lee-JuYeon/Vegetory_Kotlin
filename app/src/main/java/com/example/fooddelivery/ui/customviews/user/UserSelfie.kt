package com.example.fooddelivery.ui.customviews.user

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.R

@Composable
fun UserSelfie(
    setLength : Dp,
    setImage : Int
) {
    val radius = setLength / 3
    Image(
        painter = painterResource(setImage),
        contentDescription = null,
        modifier = Modifier
            .padding(3.dp)
            .size(setLength, setLength)
            .clip(
                RoundedCornerShape(
                    corner = CornerSize(radius)
                )
            )
            .background(Color.Red)
            .border(
                1.dp,
                MaterialTheme.colors.primaryVariant,
                RoundedCornerShape(
                    corner = CornerSize(radius)
                )
            )
    )
}