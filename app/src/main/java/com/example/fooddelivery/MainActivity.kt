package com.example.fooddelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.customviews.dock.DockView
import com.example.fooddelivery.ui.customviews.framelayout.FrameLayout
import com.example.fooddelivery.ui.customviews.idcard.IdCardModel
import com.example.fooddelivery.ui.customviews.topbar.TopBarView
import com.example.fooddelivery.ui.theme.FoodDeliveryTheme
import com.example.fooddelivery.ui.views.main.MainView
import com.example.fooddelivery.ui.views.profile.ProfileView
import com.example.fooddelivery.ui.views.recipe.RecipeView
import com.example.fooddelivery.util.lists.Lists

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodDeliveryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray
                ) {
                    MainView()
                }
            }
        }
    }
}

@Composable
fun MainView2(){
    BoxWithConstraints {
        this.constraints.maxHeight
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ){
            TopBarView(
                setList = Lists.topBarListMainView,
                setHeight =  this@BoxWithConstraints.maxHeight
            )

            FrameLayout(
                setHeight = this@BoxWithConstraints.maxHeight
            ) {
                RecipeView()
//                ProfileView()


            }

            DockView(
                setList = Lists.dockList,
                setHeight = this@BoxWithConstraints.maxHeight
            )
        }
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
                .background(MaterialTheme.colors.error)
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
        MainView()
    }
}

/*
클린 아키텍쳐 참고 블로그
https://ddangeun.tistory.com/138?category=948675

mvvm repository 참고 블로그

 */