package com.example.fooddelivery.ui.views.product.post

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.models.PostModel
import com.example.fooddelivery.ui.views.profile.UserSelfie
import com.example.fooddelivery.util.dummy.Dummy

@Composable
fun PostView(
    model : PostModel
) {
    var expandedState by remember { mutableStateOf(false) }
    val rotationState by animateFloatAsState(
        targetValue = if (expandedState) 180f else 0f
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
                    color = Color.White
                )
                .clickable {

                },
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 유저 셀카
            UserSelfie(
                setLength = 50.dp,
                setImage = R.drawable.image_email
            )
            // 유저이름
            Text(
                text = "Name/123/박지원영화관사이다",
                color = Color.Black,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.kotra_bold))
            )
        }

        Box(
            contentAlignment = Alignment.TopEnd,
            propagateMinConstraints = false,
//            modifier = Modifier
//                .size(100.dp, 150.dp)
//                .padding(5.dp)
//                .background(Color.White)
//                .clickable {
//
//                }
        ) {
            PostMediaContainer()
            LikeButtoncontainer(
                setModel = model,
                setLikeClick = {

                },
                setReplyClick = {
                    expandedState = !expandedState
                }
            )
        }

        if (expandedState){
            PostReplyView(Dummy.replyList.first())
        }
    }
}

