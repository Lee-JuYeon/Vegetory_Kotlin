package com.example.fooddelivery.ui.views.partlogin.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.theme.Sujin

@Composable
fun RegisterView(
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(5.dp)

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .border(1.dp, color = Color.Red, shape = RoundedCornerShape(5.dp))
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(1.dp, Color.Black, CircleShape)
                    .clickable {
                        /* TODO : 사진 찍어서 해당 사진 갤러리에 저장하지 않고 바로 업로드. + 사진권한*/
                    }
            )

            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                var nameText by remember { mutableStateOf("") }
                TextField(
                    value = nameText,
                    onValueChange = { it ->
                        nameText = it
                    },
                    maxLines = 1,
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    textStyle = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
                    label = { Text(text = "실명") },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.White,
                        cursorColor = Color.LightGray,
                        focusedIndicatorColor = Color.DarkGray, // focus underline
                        focusedLabelColor = Color.LightGray, // focus hint colour
                        unfocusedIndicatorColor = Color.Transparent, // unfocus underline
                        unfocusedLabelColor = Color.LightGray // unfocus hint colour
                    ),
                    leadingIcon = {
                        Icon(Icons.Filled.Person, "", tint = Color.LightGray)
                    },
                    shape = RoundedCornerShape(5.dp),
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    Text(
                        text = "농부인증",
                        textAlign = TextAlign.Center,
                        fontFamily = Sujin,
                        fontSize = 30.sp,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .clip(shape = RoundedCornerShape(5.dp))
                            .background(Color.Yellow)
                            .size(width = 100.dp, height = 30.dp)
                    )
                    Text(
                        text = "실명인증",
                        textAlign = TextAlign.Center,
                        fontFamily = Sujin,
                        fontSize = 30.sp,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .clip(shape = RoundedCornerShape(5.dp))
                            .background(Color.Green)
                            .size(width = 100.dp, height = 30.dp)
                    )
                }
            }
        }

    }
}