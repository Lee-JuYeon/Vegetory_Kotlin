package com.example.fooddelivery.ui.customviews.dock

import com.example.fooddelivery.R

sealed class DockModel (
    val itemImage : Int,
    val itemTitle : Int,
){
    object Home : DockModel(itemImage = R.drawable.image_home, itemTitle = R.string.dock_home)
    object Recipe : DockModel(itemImage = 1, itemTitle = R.string.dock_recipe)
    object Story : DockModel(itemImage = R.drawable.image_list, itemTitle = R.string.dock_story)
    object Profile : DockModel(itemImage = R.drawable.image_profile, itemTitle = R.string.dock_profile)

    object DOCK_LIST {
        val dockList = listOf(
            Home, Story, Profile
        )
    }
}
