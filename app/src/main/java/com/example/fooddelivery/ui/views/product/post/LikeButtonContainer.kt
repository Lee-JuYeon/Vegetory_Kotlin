package com.example.fooddelivery.ui.views.product.post

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
import com.example.fooddelivery.models.PostModel

@Composable
fun LikeButtoncontainer(
    setModel : PostModel,
    setLikeClick : () -> Unit,
    setReplyClick : () -> Unit
) {
    Row(
        modifier = Modifier
            .background(
                color = Color.Yellow
            ),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Top
    ){
        LikeButton(
            setCount = setModel.postLikeUID.count().toString(),
            setButtonImage = R.drawable.ic_launcher_background,
            setOnClick = {
                setLikeClick()
            }
        )
        LikeButton(
            setCount = setModel.postReplyUID.count().toString(),
            setButtonImage = R.drawable.ic_launcher_background,
            setOnClick = {
                setReplyClick()
            }
        )
    }
}