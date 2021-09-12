package com.example.fooddelivery.ui.views.profile

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.util.dummy.Dummy

@Composable
fun ActivityCard() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ActivityCardItem(
            title = "Follower",
            description = Dummy.user.userFollowers.count().toString()
        )
        ActivityCardItem(
            title = "Follows",
            description = Dummy.user.userFollows.count().toString()
        )
        ActivityCardItem(
            title = "작성한 포스트",
            description = Dummy.user.userPosts.count().toString()
        )
        ActivityCardItem(
            title = "작성한 댓글",
            description = Dummy.user.userReplys.count().toString()
        )
    }
}