package com.example.fooddelivery.ui.views.menu

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.customviews.gridview.AXIS
import com.example.fooddelivery.ui.customviews.gridview.CustomGridView
import com.example.fooddelivery.ui.customviews.gridview.CustomGridViews
import com.example.fooddelivery.util.lists.Lists

@Composable
fun MenuView() {
//    LazyVerticalGrid(
//        cells = GridCells.Fixed(2),
//        cells = GridCells.Adaptive(150.dp),
//        content = {
//            items(Lists.menuList.size) { index ->
//                MenuItem(
//                    model = Lists.menuList[index],
//                    onClick = { menuModel ->
//
//                    })
//
//            }
//        }
//    )
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
