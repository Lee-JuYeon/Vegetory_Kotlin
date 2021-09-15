package com.example.fooddelivery.ui.views.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.customviews.title.TitleView

@Composable
fun MenuItem(
    model : MenuModel,
    onClick : (MenuModel) -> Unit
) {
    Box(
        modifier = Modifier
            .padding(5.dp)
            .clip(RoundedCornerShape(CornerSize(5.dp)))
            .background(Color.White)
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(CornerSize(5.dp))
            )
            .clickable {
                onClick(model)
            },
        contentAlignment = Alignment.TopStart
    ) {
        Column {
            Text(
                text = model.title,
                color = Color.Black,
                maxLines = 1,
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.sujin)),
                modifier = Modifier
                    .padding(
                        start = 5.dp,
                        end = 10.dp,
                        top = 5.dp,
                        bottom = 5.dp
                    )
            )
            Text(
                text = model.description,
                color = Color.Black,
                maxLines = 1,
                fontSize = 17.sp,
                fontFamily = FontFamily(Font(R.font.noto_medium)),
                modifier = Modifier
                    .padding(
                        start = 5.dp,
                        end = 10.dp,
                        top = 0.dp,
                        bottom = 5.dp
                    )
            )
            Image(
                painter = painterResource(model.image),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp, 50.dp)
                    .align(Alignment.End)
            )
        }
    }
}