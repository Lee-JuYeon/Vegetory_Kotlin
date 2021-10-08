package com.example.fooddelivery.ui.views.login

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.theme.LightBackground

@Composable
fun LoginView() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.Yellow)
            .padding(10.dp)
    ) {
        var emailText by remember { mutableStateOf("") }

        TextField(
            value = emailText,
            onValueChange = { it ->
                emailText = it
                Log.e("mException", "text : ${emailText}")
            },
            textStyle = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
            label = { Text(text = "Email") },
            maxLines = 1,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                cursorColor = Color.LightGray,
                focusedIndicatorColor = Color.Blue, // focus underline
                focusedLabelColor = Color.LightGray, // focus hint colour
                unfocusedIndicatorColor = Color.Transparent, // unfocus underline
                unfocusedLabelColor = Color.LightGray // unfocus hint colour
            ),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
                .padding(5.dp)
        )

        var passwordText by remember { mutableStateOf("") }
        TextField(
            value = passwordText,
            onValueChange = { it ->
                passwordText = it
                Log.e("mException", "passwordText : ${passwordText}")
            },
            maxLines = 1,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            textStyle = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
            label = { Text(text = "Password") },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                cursorColor = Color.LightGray,
                focusedIndicatorColor = Color.Blue, // focus underline
                focusedLabelColor = Color.LightGray, // focus hint colour
                unfocusedIndicatorColor = Color.Transparent, // unfocus underline
                unfocusedLabelColor = Color.LightGray // unfocus hint colour
            ),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
                .padding(5.dp)
        )

        Text(
            text = "",
            modifier = Modifier
                .clickable {

                }
        )
    }
}