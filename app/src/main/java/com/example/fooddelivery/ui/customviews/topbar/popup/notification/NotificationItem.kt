package com.example.fooddelivery.ui.customviews.topbar.popup.notification

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.theme.NotoSansBold
import com.example.fooddelivery.ui.theme.NotoSansRegular

@Composable
fun NotificationItem(
    model : NotificationModel
) {
    var expandedState by remember { mutableStateOf(false) }
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(5.dp))
            .fillMaxWidth()
            .padding(all = 5.dp)
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 350,
                    easing = LinearOutSlowInEasing
                )
            )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(
                text = model.title,
                modifier = Modifier
                    .padding(all = 5.dp),
                textAlign = TextAlign.Center,
                fontFamily = NotoSansBold,
                fontSize = 25.sp,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = if (expandedState) model.date else stringResource(id = R.string.popup_notification_detail),
                modifier = Modifier
                    .padding(all = 5.dp)
                    .clickable {
                               expandedState = !expandedState
                    },
                textAlign = TextAlign.Center,
                fontFamily = NotoSansRegular,
                fontSize = 15.sp
            )
        }

        if (expandedState){
            Text(
                text = model.description,
                modifier = Modifier
                    .padding(all = 5.dp),
                textAlign = TextAlign.Start,
                fontFamily = NotoSansRegular,
                fontSize = 20.sp
            )
        }
    }
}