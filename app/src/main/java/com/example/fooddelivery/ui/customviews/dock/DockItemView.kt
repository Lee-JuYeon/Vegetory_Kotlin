package com.example.fooddelivery.ui.customviews.dock

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun DockItemView(
    setModel : DockModel,
    setHeight : Dp,
    setOnClick: (model : DockModel) -> Unit
){
    Card(
        modifier = Modifier
            .size(setHeight)
            .padding(5.dp),
        shape = CircleShape,
        elevation = 5.dp
    ){
        Image(
            painter = painterResource(id = setModel.itemImage),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.Red)
                .clickable {
                    setOnClick(setModel)
                }
        )
    }
}
