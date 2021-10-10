package com.example.fooddelivery.ui.views.partlogin.register.subviews

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.theme.NotoSansBold
import com.example.fooddelivery.vm.RegisterVM
import java.util.regex.Pattern

@Composable
fun UserIDTextField(registerVM: RegisterVM) {
    // User Email
    val text : String by registerVM.id.observeAsState(initial = "")
    val textVaild = Pattern.compile(
        "^[a-zA-Z0-9가-힣ㄱ-ㅎㅏ-ㅣ\\u318D\\u119E\\u11A2\\u2022\\u2025a\\u0087\\uFE55]+$"
    )
    TextField(
        value = text,
        onValueChange = { it ->
            if (textVaild.matcher(it).matches()){ // 영문 한글 숫자만 사용가능
                registerVM.setID(it)
            }
        },
        maxLines = 1,
        textStyle = TextStyle(color = Color.Black, fontFamily = NotoSansBold),
        label = { Text(text = "ID") },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White,
            cursorColor = Color.LightGray,
            focusedIndicatorColor = Color.DarkGray, // focus underline
            focusedLabelColor = Color.LightGray, // focus hint colour
            unfocusedIndicatorColor = Color.Transparent, // unfocus underline
            unfocusedLabelColor = Color.LightGray // unfocus hint colour
        ),
        modifier = Modifier
            .padding(0.dp)
            .fillMaxWidth()
    )

    /*
    TODO :
     1. 특수문자 사용불가. 문자와 숫자만 사용가능
     2. 이후에 유니버셜 통합에 {ID}@website.com으로 사용하기 위함.
     */
}