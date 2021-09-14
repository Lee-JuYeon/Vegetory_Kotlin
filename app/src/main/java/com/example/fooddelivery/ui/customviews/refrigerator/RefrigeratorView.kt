package com.example.fooddelivery.ui.views.main

import android.widget.GridLayout
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.customviews.gridview.CustomGridView

@Composable
fun RefrigeratorView() {
    val refrigeratorHeight = 300.dp
    val refrigeratorWidth = 150.dp
    var isOpen by remember {
        mutableStateOf(false)
    }

    val alpha = animateFloatAsState(
        targetValue = if (isOpen) 1f else 0f,
        animationSpec = tween(
            durationMillis = 300
        )
    )

    val customRotateY = animateFloatAsState(
        targetValue = if (isOpen) 180f else 360f,
        animationSpec = tween(
            durationMillis = 300
        )
    )

    Row(
        modifier = Modifier
            .background(
                color = Color.White
            )
            .size(width = refrigeratorWidth * 2, height = refrigeratorHeight),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
//        Text(
//            text = "배지토리 냉장고 왼쪽으로 밀어서 냉장고 열기",
//            modifier = Modifier
//                .size(width = 150.dp, height = 200.dp)
//                .width(width = refrigeratorWidth)
//                .background(Color.Red)
//                .clickable {
//                    isOpen = !isOpen
//                }
//                .scale(
//                    scaleX = 1f,
//                    scaleY = if (isOpen) -1f else 1f
//                )
//        )
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .background(Color.White)
                .size(width = refrigeratorWidth, height = refrigeratorHeight)
                .clickable {
                    isOpen = !isOpen
                }
        ) {
            Text(
                text = "왼쪽으로 밀어서 냉장고 열기",
                modifier = Modifier
                    .width(width = refrigeratorWidth)
                    .background(Color.Yellow)
                    .align(Alignment.CenterHorizontally),
                color = Color.Black,
                maxLines = 1,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.noto_regular))
            )

        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(width = refrigeratorWidth, height = refrigeratorHeight)
                .background(Color.Blue)
                .graphicsLayer {
                    transformOrigin = TransformOrigin(pivotFractionX = 0f, pivotFractionY = 0.5f)
                    rotationY = customRotateY.value
                }
//                .alpha(alpha.value)
        ){
            RefrigeratorInnerView(refrigeratorWidth, refrigeratorHeight)

            RefrigeratorDoorView(refrigeratorWidth, refrigeratorHeight)
        }
    }
}

@Composable
fun RefrigeratorDoorView(
    setWidth : Dp,
    setHeight : Dp
){
    Image(
        painter = painterResource(R.drawable.sample_refrigerator_door),
        contentDescription = null,
        modifier = Modifier
            .size(setWidth, setHeight),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
fun RefrigeratorInnerView(
    setWidth : Dp,
    setHeight : Dp
){
    CustomGridView(
        cols = 2,
        list = listOf("1", "2", "3", "4",),
        colModifier = Modifier
            .size(setWidth, setHeight)
    ) {
        Text(text = it)
    }
}

/*
Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .background(Color.White)
                .size(width = refrigeratorWidth * 2, height = refrigeratorHeight)
                .clickable {
                    isOpen = !isOpen
                }
//                .scale(
//                    scaleX = 1f,
//                    scaleY = if (isOpen) -1f else 1f
//                )
        ) {
            Text(
                text = "배지토리 냉장고",
                modifier = Modifier
                    .width(width = refrigeratorWidth)
                    .background(Color.Red)
                    .align(Alignment.CenterHorizontally),
                color = Color.Black,
                maxLines = 1,
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.kotra_bold))
            )
            Text(
                text = "왼쪽으로 밀어서 냉장고 열기",
                modifier = Modifier
                    .width(width = refrigeratorWidth)
                    .background(Color.Yellow)
                    .align(Alignment.CenterHorizontally),
                color = Color.Black,
                maxLines = 1,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.noto_regular))
            )

        }
 */