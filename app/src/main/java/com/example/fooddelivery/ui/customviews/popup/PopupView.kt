package com.example.fooddelivery.ui.customviews.popup

import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.PopupProperties

@Composable
fun PopupView(
    isOpen : Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    offset: DpOffset = DpOffset(0.dp, 0.dp),
    properties: PopupProperties = PopupProperties(focusable = true),
    content: @Composable ColumnScope.() -> Unit
){
    /*
    MutableTransitionState :
    currentState, targetState가 있다.
    currentState는 initialState에 의해 초기화 될 수 있으며 Transition으 변경가능하.
    targetState 또한 initialState에 의해 초기화 될 수 있다.
    둘다 State객체의 지원을 받는다.

    isIdle = transition 실행이 완료되었는지 여부를 반환, targetState가 currentState와 다른 값으로 설정되면 false를 반환.
     */
    val popupStates = remember { MutableTransitionState(false) }
    popupStates.targetState = isOpen

    if (popupStates.currentState || popupStates.targetState){
        val transformOrigin = remember{ mutableStateOf(TransformOrigin.Center) }
        val density = LocalDensity.current
//        val popupPositionProvider = PopupPositionProvider(
//        ){
//
//        }
//
//        Popup(
//            onDismissRequest = onDismissRequest,
//            popupPositionProvider = popupPositionProvider,
//            properties = properties
//        ) {
//
//
//        }
    }
    Dialog(onDismissRequest = { /*TODO*/ }) {
        
    }
}