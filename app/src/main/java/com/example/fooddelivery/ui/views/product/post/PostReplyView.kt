package com.example.fooddelivery.ui.views.product.post

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.models.PostReplyModel
import com.example.fooddelivery.ui.views.profile.UserSelfie

@Composable
fun PostReplyView(
    model : PostReplyModel
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(3.dp)
            .background(
                color = Color.White
            ),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.Top
    ) {
        UserSelfie(
            setLength = 30.dp,
            setImage = R.drawable.image_password
        )

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(3.dp)
                    .background(
                        color = Color.Red
                    ),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // 유저이름
                Text(
                    text = model.userName,
                    color = Color.Black,
                    maxLines = 1,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.noto_bold))
                )
                // 댓글 단 시간
                Text(
                    text = model.replyDate,
                    color = Color.Black,
                    maxLines = 1,
                    fontSize = 15.sp,
                    fontFamily = FontFamily(Font(R.font.noto_regular))
                )

            }
            // 댓글 내용
            Text(
                text = model.replyDescription,
                color = Color.Black,
                maxLines = 1,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.noto_medium))
            )

        }
    }
    
}