package com.example.fooddelivery.ui.views.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.util.dummy.Dummy

@Composable
fun ActivityCardItem(
    title : String,
    description : String
) {
    Column(
        modifier = Modifier
            .padding(horizontal = 5.dp)
    ) {
        // follows count title
        Text(
            text = title,
            color = Color.Black,
            maxLines = 1,
            fontSize = 18.sp,
            fontFamily = FontFamily(Font(R.font.noto_bold)),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        // follows count
        Text(
            text = description,
            color = Color.Black,
            maxLines = 1,
            fontSize = 15.sp,
            fontFamily = FontFamily(Font(R.font.noto_medium)),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
    }
}