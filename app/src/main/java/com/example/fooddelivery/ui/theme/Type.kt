package com.example.fooddelivery.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

// Set of Material typography styles to start with
val Typography = Typography(
        h6 = TextStyle(
                fontFamily = Font
        ),
        body1 = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
        )
        /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

val kotraBold = Font(R.font.kotra_bold, weight = FontWeight.Bold)
val notoBold = Font(R.font.noto_bold, weight = FontWeight.Bold)
val notoMedium = Font(R.font.noto_medium, weight = FontWeight.Medium)
val notoRegular = Font(R.font.noto_regular, weight = FontWeight.Normal)

val topbarFont = FontFamily(
        Font(
                resource = ""
        )
)
val fonts = FontFamily(
        kotraBold,
        notoBold,
        notoMedium,
        notoRegular
)