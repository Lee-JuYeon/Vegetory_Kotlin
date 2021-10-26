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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.theme.NotoSansBold
import com.example.fooddelivery.vm.RegisterVM
import java.util.regex.Pattern

@Composable
fun UserNameTextField(registerVM : RegisterVM) {
    // User Name
    val text : String by registerVM.name.observeAsState(initial = "")
    val textVaild = Pattern.compile(
        "^[a-zA-Z가-힣ㄱ-ㅎㅏ-ㅣ\\u318D\\u119E\\u11A2\\u2022\\u2025a\\u0087\\uFE55]+$"
    )
    TextField(
        value = text,
        onValueChange = { it ->
            if (textVaild.matcher(it).matches()){
                registerVM.setName(it)
            }
        },
        maxLines = 1,
        textStyle = TextStyle(color = Color.Black, fontFamily = NotoSansBold),
        label = { Text(text = stringResource(id = R.string.register_hint_name)) },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White,
            cursorColor = Color.LightGray,
            focusedIndicatorColor = Color.DarkGray, // focus underline
            focusedLabelColor = Color.Red, // focus hint colour
            unfocusedIndicatorColor = Color.Transparent, // unfocus underline
            unfocusedLabelColor = Color.LightGray // unfocus hint colour
        ),
        modifier = Modifier
            .padding(0.dp)
            .fillMaxWidth()
    )
}