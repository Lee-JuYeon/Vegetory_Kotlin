package com.example.fooddelivery

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.ui.customviews.dock.DockModel
import com.example.fooddelivery.ui.customviews.idcard.IdCardModel
import com.example.fooddelivery.ui.customviews.topbar.TopBarLists
import com.example.fooddelivery.ui.customviews.topbar.TopBarModel
import com.example.fooddelivery.ui.theme.FoodDeliveryTheme
import com.example.fooddelivery.util.lists.Lists
import com.example.fooddelivery.util.strings.Strings

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodDeliveryTheme {
//                window.setLayout(
//                    WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN,
//                    WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
//                )
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    mainView {
                        topBarView(list = Lists.topBarListMainView)
                        dockView(list = Lists.dockList)
                    }
                }
            }
        }
    }
}

@Composable
fun mainView(content : @Composable() ColumnScope.() -> Unit){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.primaryVariant),
        content =  content
    )
}

@Composable
fun topBarView(list : List<TopBarModel>){
    // 메모리 관리가 들어간 lazyColumn
    LazyRow(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        contentPadding = PaddingValues(horizontal = 0.dp),
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(vertical = 10.dp)
    ){
        items(list){ model ->
            topBarItemView(model = model)
        }
    }
}

@Composable
fun topBarItemView(model : TopBarModel){
    Box(
        contentAlignment = Alignment.TopStart
    ){
        Text(
            text = model.itemNative,
            color = Color.White,
            maxLines = 1,
            fontSize = 25.sp,
            fontFamily = FontFamily(Font(R.font.kotra_bold)),
            modifier = Modifier
                .padding(horizontal = 15.dp)
        )
        Text(
            text = model.itemNative,
            color = Color.Black,
            maxLines = 1,
            fontSize = 24.sp,
            fontFamily = FontFamily(Font(R.font.kotra_bold)),
            modifier = Modifier
                .padding(horizontal = 15.dp)
        )
    }
}

@Composable
fun dockView(list : List<DockModel>){
// 메모리 관리가 들어간 lazyColumn
    LazyRow(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        contentPadding = PaddingValues(horizontal = 0.dp),
        modifier = Modifier
            .background(Color.White)
            .padding(vertical = 10.dp)
    ){
        items(list){ model ->
            dockItemView(
                model = model,
                onClick = { dockModel ->
                    when(dockModel.itemEnglishTitle){
                        Strings.DOCK_MENU -> {
                            Log.e("mException", "click : DOCK_MENU")
                        }
                        Strings.DOCK_RECIPE -> {
                            Log.e("mException", "click : DOCK_RECIPE")
                        }
                        Strings.DOCK_STORY -> {
                            Log.e("mException", "click : DOCK_STORY")
                        }
                        Strings.DOCK_PROFILE -> {
                            Log.e("mException", "click : DOCK_PROFILE")
                        }
                    }
                }
            )
        }
    }
}
@Composable
fun dockItemView(model : DockModel, onClick: (model : DockModel) -> Unit){
    Card(
        modifier = Modifier
            .size(60.dp)
            .padding(5.dp),
        shape = CircleShape,
        elevation = 5.dp
    ){
        Image(
            painter = painterResource(id = model.itemImage),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red)
                .clickable {
                    onClick(model)
                }
        )
    }
}

@Composable
fun idCard(model : IdCardModel, onClick : () -> Unit){
    val padding = 16.dp
    Column(
        Modifier
            .padding(padding) // padding을 먼저 선언한 후, clickable을 선언하면 padding이 먼저 적용된 이후에 click이 적용되기 떄문에, padding된 부분에만 click이 된다.
            .clickable(onClick = onClick) // 컴포저블이 사용자 입력에 반응하도록 설정하고 물결 효과를 표시합니다.
            .fillMaxWidth() // 컴포저블이 상위 요소로부터 부여받은 최대 너비를 채우도록 합니다.
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .size(width = 400.dp, height = 100.dp)
                .background(MaterialTheme.colors.primaryVariant)
        ) {
//            Image(
//                modifier = Modifier.requiredSize(150.dp) // parent의 사이즈에 잘린다면 requireSize로 뚫어버릴 수 잇음.
//            )
            Column {
                Text(
                    text = model.name,
                    modifier = Modifier
                        .background(MaterialTheme.colors.error)
                )
                Text(
                    text = model.mainFood.toString(),
                    modifier = Modifier
                        .paddingFromBaseline(top = 50.dp)
                        .background(MaterialTheme.colors.error)
                )
            }
        }
        Spacer(modifier = Modifier
            .size(padding)
            .background(MaterialTheme.colors.primary))
        Card(elevation = 4.dp) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FoodDeliveryTheme {
        mainView{
            topBarView(list = Lists.topBarListMainView)
        }
    }
}