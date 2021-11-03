package com.example.fooddelivery.ui.customviews.bottomnavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomBottomNavigation(
    currentScreenID : String,
    onItemSelected : (Screen) -> Unit
) {
    val items = Screen.Items.itemList

    Row(
        modifier= Modifier
            .background(MaterialTheme.colors.background)
            .padding(8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ){
        items.forEach { item->
            CustomBottomNavigationItem(
                item = item,
                isSelected = item.id == currentScreenID
            ) {
                onItemSelected(item)
            }
        }
    }

}
