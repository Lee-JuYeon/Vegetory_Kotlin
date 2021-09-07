package com.example.fooddelivery.ui.customviews.idcard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.semantics.Role.Companion.Image

@Composable
fun idCard(model : IdCardModel){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End
    ) {
        Column {
            Text(model.name)
            Text(model.mainFood.toString())
        }

    }
}