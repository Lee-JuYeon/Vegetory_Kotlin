package com.example.fooddelivery.ui.views.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.models.MainProductModel
import com.example.fooddelivery.util.dummy.Dummy

@Composable
fun ProfileView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        // 유저 정보카드
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(5.dp)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(5.dp)
                ),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ProfileSelfie(
                setModifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .border(3.dp, MaterialTheme.colors.primaryVariant, RoundedCornerShape(15.dp))
            )
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = 15.dp)
                    .background(Color.Yellow),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                // 유저이름
                Text(
                    text = "Name/123/박지원영화관사이다",
                    color = Color.Black,
                    maxLines = 1,
                    fontSize = 24.sp,
                    fontFamily = FontFamily(Font(R.font.kotra_bold)),
                    modifier = Modifier
                        .clickable {

                        }
                )

                // 자주 파는 상품
                LazyRow(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    contentPadding = PaddingValues(horizontal = 0.dp),
                    modifier = Modifier
                        .fillMaxHeight()
                ){
                    items(Dummy.user.userMainProduct){ model ->
                        ProductView(
                            productImage = model.productImage,
                            productTitle = model.productTitle
                        )
                    }
                }
            }
        }

        // 자주 파는 상품
        LazyRow(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            contentPadding = PaddingValues(horizontal = 0.dp),
            modifier = Modifier
                .fillMaxHeight()
        ){
            items(Dummy.user.userMainProduct){ model ->

            }
        }




    }
}