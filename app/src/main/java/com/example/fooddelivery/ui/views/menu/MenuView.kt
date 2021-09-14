package com.example.fooddelivery.ui.views.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.fooddelivery.ui.customviews.gridview.CustomGridView
import com.example.fooddelivery.util.lists.Lists

@Composable
fun MenuView() {
    CustomGridView(
        cols = 2,
        list = Lists.menuList,
        colModifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
    ) { model ->
        MenuItem(
            model = model,
            onClick = { menuModel ->

            }
        )
    }
}
