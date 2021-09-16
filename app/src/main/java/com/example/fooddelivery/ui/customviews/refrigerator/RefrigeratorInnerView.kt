package com.example.fooddelivery.ui.customviews.refrigerator

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.models.RefrigeratorFoodModel
import com.example.fooddelivery.util.lists.Lists

enum class InnderAxis{
    BOTTOM_LEFT, BOTTOM_RIGHT, TOP_RIGHT, TOP_LEFT
}
@Composable
fun RefrigeratorInnerView(
    setWidth : Dp,
    setHeight : Dp,
    setInnerType : InnderAxis
) {
    BoxWithConstraints(
        modifier = Modifier
            .size(setWidth, setHeight)
            .padding(setInnerTypeValue(setInnerType = setInnerType))
    ) {
        val width = this.maxWidth - 11.dp
        val height = this.maxHeight - 11.dp
        LazyColumn(
            modifier = Modifier
                .size(width, height),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ){
            items(setInnerList(setInnerType)){ model ->
                RefrigeratorFoodItem(
                    model = model,
                    setWidth = width,
                    setHeight = height / 3,
                    setOnClick = {

                    }
                )
            }
        }
    }
}

private fun setInnerList(setInnerType: InnderAxis) : List<RefrigeratorFoodModel> {
    return when(setInnerType){
        InnderAxis.BOTTOM_LEFT -> {
            Lists.refrigeratorBottomLeft
        }
        InnderAxis.BOTTOM_RIGHT -> {
            Lists.refrigeratorBottomRight

        }
        else -> {
            Lists.refrigeratorBottomLeft
        }
    }
}

private fun setInnerTypeValue(setInnerType: InnderAxis) : PaddingValues{
    return when(setInnerType){
        InnderAxis.BOTTOM_LEFT -> {
            PaddingValues(
                top = 8.dp,
                bottom = 8.dp,
                start = 3.dp,
                end = 8.dp
            )
        }
        InnderAxis.BOTTOM_RIGHT -> {
            PaddingValues(
                top = 8.dp,
                bottom = 8.dp,
                start = 8.dp,
                end = 3.dp
            )
        }
        else -> {
            PaddingValues(
                top = 8.dp,
                bottom = 8.dp,
                start = 8.dp,
                end = 8.dp
            )
        }
    }
}