package com.example.fooddelivery.ui.views.partlogin.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.theme.NotoSansBold

@Composable
fun AddressSettingView() {
    // 배달 받을 지역
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .clip(RoundedCornerShape(5.dp))
            .background(Color.Green)
            .padding(5.dp)
            .clickable {

            }
    ) {
        // 배달받을지역 이미지
        Image(
            painter = painterResource(id = R.drawable.image_delivery),
            contentDescription = "배달 받을 지역"
        )
        // 배달받을지역 텍스트
        Text(
            text = "배달 받을 지역 설정",
            fontFamily = NotoSansBold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(horizontal = 5.dp)
        )
    }// 배달받을지역 이미지 + 배달받을 지역 텍스트
}