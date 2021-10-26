package com.example.fooddelivery.ui.views.partlogin.register.subviews

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.theme.NotoSansBold
import com.example.fooddelivery.vm.RegisterVM
import java.util.regex.Pattern

@Composable
fun UserPasswordTextField(registerVM: RegisterVM) {
    // User Email
    val text : String by registerVM.password.observeAsState(initial = "")
    TextField(
        value = text,
        onValueChange = { it ->
            registerVM.setPassword(it)
        },
        maxLines = 1,
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        textStyle = TextStyle(color = Color.Black, fontFamily = NotoSansBold),
        label = { Text(text = stringResource(id = R.string.register_hint_password_detail_explain)) },
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