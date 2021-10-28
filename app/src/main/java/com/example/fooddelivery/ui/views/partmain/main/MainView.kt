package com.example.fooddelivery.ui.views.partmain.main

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.pointer.consumeAllChanges
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.customviews.popup.PopupView
import com.example.fooddelivery.ui.customviews.topbar.TopBarModel
import com.example.fooddelivery.ui.customviews.topbar.TopBarType
import com.example.fooddelivery.ui.customviews.topbar.TopBarView
import com.example.fooddelivery.util.lists.Lists
import java.util.*

@Composable
fun MainView() {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
    ){
        val maxWidth = this.maxWidth
        val maxHeight = this.maxHeight
        val heightBlock = (maxHeight / 20)

        val getLanguage = Locale.getDefault().displayLanguage

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            TopBarView(
                setList = Lists.topBarListMainView,
                setHeight = (heightBlock * 1),
                setOnClick = { topBarModel ->
                    when(topBarModel.type) {
                        TopBarType.NOTIFICATION -> {

                        }
                        TopBarType.SETTING -> {

                        }
                        TopBarType.POST -> {

                        }
                        TopBarType.EDIT -> {

                        }
                        TopBarType.FOLLOW -> {

                        }
                        TopBarType.UNFOLLOW -> {

                        }
                    }
                }
            )

            Text(
                text = "PageView",
                modifier = Modifier
                    .height(height = (heightBlock * 17))
                    .background(Color.Blue)
            )
            Text(
                text = "PageView",
                modifier = Modifier
                    .height(height = (heightBlock * 2))
                    .background(Color.Yellow)
            )
        }

        val showNotificationPopup = remember { mutableStateOf(true) }
        PopupView(
            isOpen = showNotificationPopup,
            width = maxWidth,
            height = maxHeight,
            title = R.string.topbar_notification
        ) {

        }
    }
}
/*
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 10.dp)
    ){
        val maxWidth = this.maxWidth
        val maxHeight = this.maxHeight



    }

 var offsetX by remember { mutableStateOf(0f) }
        Box(
            modifier = Modifier
                .pointerInput(Unit) {
                    detectDragGestures { change, dragAmount ->
                        change.consumeAllChanges()
                        offsetX += dragAmount.x
                        Log.e("mException", "dragAmount.x : ${dragAmount.x}")
                    }
                },
//                .draggable(
//                    orientation = Orientation.Horizontal,
//                    // Scrollable state: describes how to consume
//                    // scrolling delta and update offset
//                    state = rememberDraggableState { delta ->
//                        offsetX += delta
//                        Log.e("mException", "delta : ${delta}")
//                    }
//                ),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .width(maxWidth)
                    .height((maxHeight / 5) * 4)
                    .clip(RectangleShape)
                    .background(Color.Red)
            )
//            Box(
//                modifier = Modifier
//                    .width(maxWidth)
//                    .height((maxHeight/5) * 4)
//                    .clip(RectangleShape)
//                    .background(Color.Yellow)
//            )
//
//            Box(
//                modifier = Modifier
//                    .width(maxWidth)
//                    .height((maxHeight/5) * 4)
//                    .clip(RectangleShape)
//                    .background(Color.Green)
//            )
        }
 */
/*
TopBarView(
            setList = Lists.topBarListMainView,
            setHeight = maxHeight
        )

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            TopBarView(
                setList = Lists.topBarListMainView,
                setHeight = maxHeight
            )

            TitleView(setTitle = "배지토리 냉장고", setFont = R.font.kotra_bold, setSize = 25.sp)
            RefrigeratorView(
                setWidth = maxWidth,
                setHeight = maxHeight
            )

            Spacer(modifier = Modifier.height(30.dp))
            MenuView()

            DockView(
                setList = Lists.dockList,
                setHeight = maxHeight
            )
        }
 */
/*
1, 있는 채소로 요리
2. 있는 채소와 조금 더 추가해서 요리
3. 밀키트
4. 완성품
5. 상품 정보 QR코드
 */