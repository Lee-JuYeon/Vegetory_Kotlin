package com.example.fooddelivery.ui.customviews.post

import android.util.Log
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R
import com.example.fooddelivery.ui.views.profile.ProductView
import com.example.fooddelivery.ui.views.profile.ProfileSelfie
import com.example.fooddelivery.util.dummy.Dummy

@Composable
fun PostView(
    postUID : String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(3.dp)
                .background(
                    color = Color.White
                )
                .clickable {

                },
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 유저 셀카
            ProfileSelfie(
                setModifier = Modifier
                    .padding(5.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .border(1.dp, MaterialTheme.colors.primaryVariant, RoundedCornerShape(10.dp))
            )
            // 유저이름
            Text(
                text = "Name/123/박지원영화관사이다",
                color = Color.Black,
                maxLines = 1,
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.kotra_bold))
            )
        }

        LazyRow(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            contentPadding = PaddingValues(horizontal = 0.dp),
            modifier = Modifier
                .fillMaxHeight()
        ){
            itemsIndexed(Dummy.postList){ index, item ->
                Image(
                    painter = painterResource(R.drawable.image_email),
                    contentDescription = null,
                    modifier = Modifier
                        .fillParentMaxWidth()
                        .fillMaxHeight()
                        .size(100.dp)
                )
            }
        }
    }
}

