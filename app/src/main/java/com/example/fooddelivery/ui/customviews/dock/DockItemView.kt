package com.example.fooddelivery.ui.customviews.dock

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun DockItemView(model : DockModel, onClick: (model : DockModel) -> Unit){
    Card(
        modifier = Modifier
            .size(60.dp)
            .padding(5.dp),
        shape = CircleShape,
        elevation = 5.dp
    ){
        Image(
            painter = painterResource(id = model.itemImage),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red)
                .clickable {
                    onClick(model)
                }
        )
    }
}
