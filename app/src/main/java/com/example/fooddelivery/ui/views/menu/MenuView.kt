package com.example.fooddelivery.ui.views.menu

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.customviews.gridview.AXIS
import com.example.fooddelivery.ui.customviews.gridview.CustomGridView
import com.example.fooddelivery.ui.customviews.gridview.CustomGridViews
import com.example.fooddelivery.util.lists.Lists

@Composable
fun MenuView() {
    CustomGridView(
        dataModelList =  Lists.menuList,
        axis = AXIS.VERTICAL,
        divide = 2,
        hasFixed = true,
        modifier = Modifier,
        contentPadding = PaddingValues(5.dp)
    ){ model ->
        MenuItem(
            model = model,
            onClick = { menuModel ->

            }
        )
    }
}
