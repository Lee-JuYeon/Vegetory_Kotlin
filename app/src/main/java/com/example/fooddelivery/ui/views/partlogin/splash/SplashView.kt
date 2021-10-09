package com.example.fooddelivery.ui.views.partlogin.splash

import android.Manifest
import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.fooddelivery.ui.views.NavigatorDestination
import com.example.fooddelivery.util.permission.SoloRequestPermission

@Composable
fun SplashView(
    setContext : Context,
    navController: NavController
) {
    Column(
        modifier = Modifier.background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SoloRequestPermission(
            setPermission = Manifest.permission.INTERNET,
            whenAccept = {
                // 자동 로그인 체크, 메인화면 or 로그인화면
                val autoLogin = AutoLogin(setContext)
                val loginResult = autoLogin.checkAutoLoginResult()
                when(loginResult){
                    true -> {
                        // 자동 로그인 성공. 메인화면으로 이동
                        navController.navigate(NavigatorDestination.ToMain.route)
                    }
                    false -> {
                        // 자동 로그인에 실패해서 다시 로그인 해야 할 굥우
                        navController.navigate(NavigatorDestination.ToLogin.route)
                    }
                }
            },
            whenDenied = {
                // 인터넷 사용 권한 요청, 자동 로그인 요청, 메인화면 or 로그인화면
                navController.navigate(NavigatorDestination.ToLogin.route)
            }
        )
    }
}