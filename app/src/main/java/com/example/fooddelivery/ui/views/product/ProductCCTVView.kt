package com.example.fooddelivery.ui.views.product

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.views.profile.ProductCAM
import com.example.fooddelivery.util.dummy.Dummy

@Composable
fun ProductCCTVView() {
    LazyRow(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        contentPadding = PaddingValues(all = 5.dp),
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
    ){
        items(Dummy.user.userCAM){ model ->
            ProductCAM(
                setCamWork = model.videoIsWorking,
                setVideoPath = model.videoPath
            )
        }
    }
}