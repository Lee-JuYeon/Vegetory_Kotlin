package com.example.fooddelivery.ui.customviews.dock

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.R
import androidx.compose.foundation.layout.PaddingValues as PaddingValues1

@Composable
fun DockView(
    setSize : Map<String, Dp>,
    setItemClick : (String) -> Unit
){
    val currentDockModelID = remember { mutableStateOf<DockModel>(DockModel.Home) }

    // 메모리 관리가 들어간 lazyColumn
    LazyRow(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        contentPadding = PaddingValues1(horizontal = 0.dp),
        modifier = Modifier
            .padding(vertical = 5.dp)
            .height(
                height = (setSize["height"] ?: 0.dp) - 10.dp
            )
            .border(
                width = 5.dp,
                color = Color.Black,
                shape = RoundedCornerShape(corner = CornerSize(50.dp))
            )
    ){
        items(DockModel.DOCK_LIST.dockList){ model ->
            DockItemView(
                setModel = model,
                setColour = Color.Cyan,
                isSelected = model.itemID == currentDockModelID.value.itemID,
                setOnClick = { modelID ->
                    currentDockModelID.value = model
                    setItemClick(modelID)
                }
            )
        }
    }
}