package com.example.fooddelivery.ui.customviews.topbar

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.theme.UbuntuRed
import com.example.fooddelivery.util.strings.Strings

@Composable
fun TopBarView(
    setList : List<TopBarModel>,
    setHeight : Dp,
    setOnClick : (model : TopBarModel) -> Unit
){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        // 메모리 관리가 들어간 lazyColumn
        LazyRow(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            reverseLayout = false,
            contentPadding = PaddingValues(horizontal = 0.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(setHeight)
                .background(Color.White)
        ){
            items(setList){ model ->
                TopBarItemView(
                    model = model,
                    setOnClick = { topBarModel ->
                        setOnClick(topBarModel)
                    }
                )
            }
        }
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp),
            onDraw = {
                drawLine(
                    color = Color.Black,
                    start = Offset(0f, 0f),
                    end = Offset(size.width ,0f),
                    strokeWidth = 1f
                )
            }
        )
    }
}