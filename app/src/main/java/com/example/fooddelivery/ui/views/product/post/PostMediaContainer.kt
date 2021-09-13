package com.example.fooddelivery.ui.views.product.post

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.R
import com.example.fooddelivery.util.dummy.Dummy

@Composable
fun  PostMediaContainer() {
    LazyRow(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        contentPadding = PaddingValues(horizontal = 0.dp),
        modifier = Modifier
            .fillMaxHeight()
    ){
        itemsIndexed(Dummy.postList){ index, item ->
            Image(
                painter = painterResource(R.drawable.image_email),
                contentDescription = null,
                modifier = Modifier
                    .fillParentMaxWidth()
                    .fillMaxHeight()
                    .size(100.dp)
            )
        }
    }
}