package com.example.fooddelivery.ui.customviews.bottomnavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun BottomNaviView(
    size : Map<String, Dp>,
    currentScreenID : String,
    onItemSelected : (BottomNaviModel) -> Unit
) {

    val items = BottomNaviModel.Items.itemList
    var clicked = remember { mutableStateOf(BottomNaviModel.Menu)}

    Row(
        modifier= Modifier
            .background(MaterialTheme.colors.background)
            .padding(8.dp)
            .size(
                width = size["width"] ?: 0.dp,
                height = size["height"] ?: 0.dp
            ),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ){
        items.forEach { item->
            BottomNaviItemView(
                item = item,
                isSelected = item.id == currentScreenID,
                onClick = {
                    onItemSelected(clicked.value)
                }
            )
        }
    }

}
