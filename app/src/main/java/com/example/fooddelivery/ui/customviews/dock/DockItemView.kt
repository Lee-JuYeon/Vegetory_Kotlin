package com.example.fooddelivery.ui.customviews.dock

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun DockItemView(
    setModel : DockModel,
    setColour : Color,
    isSelected : Boolean,
    setOnClick: (String) -> Unit
){

    Row(
        modifier= Modifier
            .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
            .background(
                if (isSelected) {
                    Color.Green.copy(alpha = 0.1f)
                } else {
                    Color.Transparent
                }
            )
            .clickable {
                setOnClick(setModel.itemID)
            }
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 200,
                    easing = LinearEasing
                )
            )
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = setModel.itemImage),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
        )

        if (isSelected){
            Text(
                text = stringResource(id = setModel.itemTitle),
                color = setColour,
                modifier = Modifier
                    .padding(horizontal = 5.dp)
            )
        }
    }
}
