package com.example.fooddelivery.ui.customviews.dock

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.util.strings.Strings

@Composable
fun DockView(
    setList : List<DockModel>,
    setHeight : Dp
){
// 메모리 관리가 들어간 lazyColumn
    LazyRow(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        contentPadding = PaddingValues(horizontal = 0.dp),
        modifier = Modifier
            .background(Color.Yellow)
            .height(setHeight)
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RectangleShape
            )
    ){
        items(setList){ model ->
            DockItemView(
                setModel = model,
                setHeight = setHeight,
                setOnClick = { dockModel ->
                    when(dockModel.itemEnglishTitle){
                        Strings.DOCK_MENU -> {
                            Log.e("mException", "click : DOCK_MENU")
                        }
                        Strings.DOCK_RECIPE -> {
                            Log.e("mException", "click : DOCK_RECIPE")
                        }
                        Strings.DOCK_STORY -> {
                            Log.e("mException", "click : DOCK_STORY")
                        }
                        Strings.DOCK_PROFILE -> {
                            Log.e("mException", "click : DOCK_PROFILE")
                        }
                    }
                }
            )
        }
    }
}