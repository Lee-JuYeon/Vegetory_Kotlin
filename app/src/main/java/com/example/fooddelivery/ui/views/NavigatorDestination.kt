package com.example.fooddelivery.ui.views

sealed class NavigatorDestination(val route : String) {
    object ToSplash : NavigatorDestination("splash")
    object ToLogin : NavigatorDestination("login")
    object ToRegister : NavigatorDestination("register")
    object ToMain : NavigatorDestination("main")
}