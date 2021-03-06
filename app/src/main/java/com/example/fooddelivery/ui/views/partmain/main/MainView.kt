package com.example.fooddelivery.ui.views.partmain.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.customviews.popup.PopupType
import com.example.fooddelivery.ui.customviews.popup.PopupView
import com.example.fooddelivery.ui.customviews.topbar.TopBarType
import com.example.fooddelivery.ui.customviews.topbar.TopBarView
import com.example.fooddelivery.ui.customviews.topbar.popup.notification.NotificationPopup
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

        val showPopup = remember { mutableStateOf(false) }
        val popupTitle = remember { mutableStateOf(0) }
        val popupType = remember { mutableStateOf( "" ) }

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
                            popupTitle.value = R.string.popup_notification
                            popupType.value = PopupType.NOTIFICATION.rawValue
                            showPopup.value = true
                        }
                        TopBarType.SETTINGS -> {
                            popupTitle.value = R.string.popup_settings
                            popupType.value = PopupType.SETTINGS.rawValue
                            showPopup.value = true
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
                text = getLanguage,
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

        PopupView(
            isOpen = showPopup,
            width = maxWidth,
            height = maxHeight,
            title = popupTitle.value
        ) {
            when(popupType.value){
                PopupType.NOTIFICATION.rawValue -> {
                    NotificationPopup()
                }
                PopupType.SETTINGS.rawValue -> {

                }
            }
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

            TitleView(setTitle = "???????????? ?????????", setFont = R.font.kotra_bold, setSize = 25.sp)
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
1, ?????? ????????? ??????
2. ?????? ????????? ?????? ??? ???????????? ??????
3. ?????????
4. ?????????
5. ?????? ?????? QR??????
 */