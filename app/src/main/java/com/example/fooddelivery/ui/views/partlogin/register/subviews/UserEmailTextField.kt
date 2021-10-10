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

@Composable
fun UserEmailTextField(registerVM : RegisterVM) {
    // User Email
    val text : String by registerVM.email.observeAsState(initial = "")
    TextField(
        value = text,
        onValueChange = { it ->
            registerVM.setEmail(it)
        },
        maxLines = 1,
        textStyle = TextStyle(color = Color.Black, fontFamily = NotoSansBold),
        label = { Text(text = "Email") },
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
}