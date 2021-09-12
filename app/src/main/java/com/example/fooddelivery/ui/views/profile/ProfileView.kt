package com.example.fooddelivery.ui.views.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
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
import com.example.fooddelivery.ui.customviews.post.PostView
import com.example.fooddelivery.ui.customviews.scrollview.ScrollableColumn
import com.example.fooddelivery.util.dummy.Dummy

@Composable
fun ProfileView() {
    Column(
        modifier = Modifier
//            .scrollable(
//                orientation = Orientation.Vertical,
//                reverseDirection = false,
//                state = ScrollableState.
//            )
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        // 유저 정보카드
        UserInformationCard()

        // 작물 cctv
        LazyRow(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            contentPadding = PaddingValues(all = 5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
        ){
            items(Dummy.user.userCAM){ model ->
                ProductCAM(
                    setCamWork = model.videoIsWorking,
                    setVideoPath = model.videoPath
                )
            }
        }

        // post list
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Blue),
            state = rememberLazyListState(),
            reverseLayout = false,
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            items(Dummy.user.userPosts){ postUID ->
               PostView(postUID)
            }
        }
    }
}