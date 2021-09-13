package com.example.fooddelivery.ui.views.profile

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.fooddelivery.ui.views.product.post.PostView
import com.example.fooddelivery.util.dummy.Dummy

@Composable
fun ProfileView() {
    Column(
//        modifier = Modifier
//            .verticalScroll(rememberScrollState())
//        modifier = Modifier
            //            .scrollable(
            //                orientation = Orientation.Vertical,
            //                reverseDirection = false,
            //                state = ScrollableState.
            //            )
//            .fillMaxSize()
    ) {
        // 유저 정보카드
        UserInformationCard()



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
            items(Dummy.postList){ posts ->
                PostView(posts)
            }
        }
    }
}