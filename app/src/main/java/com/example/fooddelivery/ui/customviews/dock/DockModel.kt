package com.example.fooddelivery.ui.customviews.dock

import com.example.fooddelivery.R

sealed class DockModel (
    var itemID : String,
    val itemImage : Int,
    val itemTitle : Int,
){
    object Home : DockModel(itemID = "home", itemImage = R.drawable.image_home, itemTitle = R.string.dock_home)
    object Recipe : DockModel(itemID = "recipe", itemImage = 1, itemTitle = R.string.dock_recipe)
    object Story : DockModel(itemID = "story", itemImage = R.drawable.image_list, itemTitle = R.string.dock_story)
    object Profile : DockModel(itemID = "profile", itemImage = R.drawable.image_profile, itemTitle = R.string.dock_profile)

    object DOCK_LIST {
        val dockList = listOf(
            Home, Story, Profile
        )
    }
}