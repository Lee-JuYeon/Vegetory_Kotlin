package com.example.fooddelivery.ui.customviews.bottomnavigation

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun BottomNaviItemView(
    item : BottomNaviModel,
    isSelected : Boolean,
    onClick : (BottomNaviModel) -> Unit
){
    val background = if (isSelected) MaterialTheme.colors.primary.copy(alpha = 0.1f) else Color.Transparent
    val contentColor = if (isSelected) MaterialTheme.colors.primary else MaterialTheme.colors.onBackground

    Row(
        modifier= Modifier
            .clip(CircleShape)
            .background(background)
            .clickable {
                onClick(item)
            }
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 350,
                    easing = LinearOutSlowInEasing
                )
            )
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {

        Icon(
            imageVector = item.icon,
            contentDescription =null,
            tint = contentColor
        )

        if (isSelected){
            Text(
                text = item.title,
                color=contentColor
            )
        }
    }
}