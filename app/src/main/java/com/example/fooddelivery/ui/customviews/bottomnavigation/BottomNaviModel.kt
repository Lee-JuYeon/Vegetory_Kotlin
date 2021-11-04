package com.example.fooddelivery.ui.customviews.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNaviModel (
    val id : String,
    val title : String,
    val icon : ImageVector,
){
    object Menu : BottomNaviModel(id = "menu", title = "Menu", icon = Icons.Outlined.Menu)
    object Story : BottomNaviModel(id = "story", title = "Story", icon = Icons.Outlined.List)
    object Profile : BottomNaviModel(id = "profile", title = "Profile", icon = Icons.Outlined.Person)

    object Items {
        val itemList = listOf(
            Menu, Story, Profile
        )
    }
}