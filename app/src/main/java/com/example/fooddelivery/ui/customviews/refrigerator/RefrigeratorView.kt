package com.example.fooddelivery.ui.customviews.refrigerator

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.customviews.title.TitleView

@Composable
fun RefrigeratorView(
    setWidth: Dp,
    setHeight : Dp
) {
    var isOpen by remember { mutableStateOf(false) }

    val alpha = animateFloatAsState(
        targetValue = if (isOpen) 1f else 0f,
        animationSpec = tween(
            durationMillis = 300
        )
    )

    val customRotateYLeftDoor = animateFloatAsState(
        targetValue = if (isOpen) 180f else 360f,
        animationSpec = tween(
            durationMillis = 300
        )
    )
    val customRotateYRightDoor = animateFloatAsState(
        targetValue = if (isOpen) 180f else 0f,
        animationSpec = tween(
            durationMillis = 300
        )
    )

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .size(
                width = setWidth,
                height =(setHeight / 10) * 4
            )
    ) {
        Tool(
            setModifier = Modifier
                .fillMaxHeight()
                .width(setWidth / 4)
                .padding(3.dp),
            setChild = {
                TitleView(
                    setTitle = "가능한 요리",
                    setFont = R.font.sujin,
                    setSize = 20.sp
                )
            }
        )

        RefrigeratorContainer(
            setWidth = setWidth,
            setHeight = setHeight,
        ) {
            DoorLeft(
                setWidth = setWidth,
                setHeight = setHeight,
                setOnClick = {
                    isOpen = !isOpen
                },
                setGraphicLayerScope = {
                    transformOrigin = TransformOrigin(0.0f, 0.5f)
                    rotationY = customRotateYLeftDoor.value
                }
            )
            DoorRight(
                setWidth = setWidth,
                setHeight = setHeight,
                setOnClick = {
                    isOpen = !isOpen
                },
                setGraphicLayerScope = {
                    transformOrigin = TransformOrigin(1.0f, 0.5f)
                    rotationY = customRotateYRightDoor.value
                }
            )
        }
    }
}
@Composable
fun Tool(
    setModifier: Modifier,
    setChild : @Composable ColumnScope.() -> Unit
){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = setModifier,
        content = setChild
    )
}

@Composable
fun RefrigeratorContainer(
    setWidth : Dp,
    setHeight : Dp,
    setContent :  @Composable RowScope.() -> Unit
){
    BoxWithConstraints(
        modifier = Modifier
            .size(width = setWidth / 2, height = setHeight)
            .border(2.5.dp, Color.Black, RectangleShape)
    ) {
        val width = this.maxWidth
        val height = this.maxHeight

        val TOP_INNER_WIDTH = width
        val TOP_INNER_HEIGHT = (height / 7) * 4
        val TOP_LEFT_INNER_WIDTH = width / 2
        val TOP_LEFT_INNER_HEIGHT = (height / 7) * 4
        val TOP_RIGHT_INNER_WIDTH = width / 2
        val TOP_RIGHT_INNER_HEIGHT = (height / 7) * 4

        val bottomInnerWidth = width
        val bottomInnerHeight = (height / 7) * 3
        val bottomLeftInnerWidth = width / 2
        val bottomLeftInnerHeight = (height / 7) * 3
        val bottomRightInnerWidth = width / 2
        val bottomRightInnerHeight = (height / 7) * 3

        Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .size(width = TOP_INNER_WIDTH, height = TOP_INNER_HEIGHT)
            ) {
                RefrigeratorInnerView(
                    setWidth = TOP_LEFT_INNER_WIDTH,
                    setHeight = TOP_LEFT_INNER_HEIGHT,
                    setInnerType = InnderAxis.BOTTOM_LEFT
                )
                RefrigeratorInnerView(
                    setWidth = TOP_RIGHT_INNER_WIDTH,
                    setHeight = TOP_RIGHT_INNER_HEIGHT,
                    setInnerType = InnderAxis.BOTTOM_RIGHT
                )
            }
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .size(width = bottomInnerWidth, height = bottomInnerHeight)
            ) {
                RefrigeratorInnerView(
                    setWidth = bottomLeftInnerWidth,
                    setHeight = bottomLeftInnerHeight,
                    setInnerType = InnderAxis.BOTTOM_LEFT
                )
                RefrigeratorInnerView(
                    setWidth = bottomRightInnerWidth,
                    setHeight = bottomRightInnerHeight,
                    setInnerType = InnderAxis.BOTTOM_RIGHT
                )
            }
        }


        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(1.dp),
            content = setContent
        )
    }
}



/*

@Composable
fun TransformableSample() {
    var scale by remember { mutableStateOf(1f) }
    var rotation by remember { mutableStateOf(0f) }
    var offset by remember { mutableStateOf(Offset.Zero) }
    val state = rememberTransformableState { zoomChange, offsetChange, rotationChange ->
        scale *= zoomChange
        rotation += rotationChange
        offset += offsetChange
    }
    Box(
        Modifier
            .graphicsLayer(
                scaleX = scale,
                scaleY = scale,
                rotationZ = rotation,
                translationX = offset.x,
                translationY = offset.y
            )
            .transformable(state = state)
            .background(Color.Blue)
            .fillMaxHeight()
    )
}


CustomGridView(
            dataModelList =  Lists.refrigeratorFoods,
            axis = AXIS.VERTICAL,
            divide = 2,
            hasFixed = true,
            modifier = Modifier
                .background(Color.White)
                .border(2.dp, Color.Black, RectangleShape)
                .fillMaxSize(),
            contentPadding = PaddingValues(5.dp)
        ){ model ->
            RefrigeratorFoodItem(
                model = model,
                setWidth = setWidth / 4,
                setHeight = setHeight,
                setOnClick = {

                }
            )
        }
 */