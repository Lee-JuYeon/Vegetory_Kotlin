package com.example.fooddelivery.util.lists

import com.example.fooddelivery.R
import com.example.fooddelivery.ui.customviews.dock.DockModel
import com.example.fooddelivery.ui.customviews.topbar.TopBarModel
import com.example.fooddelivery.util.strings.Strings

object Lists {
    val topBarListMainView = listOf<TopBarModel>(
        TopBarModel("공지사항",Strings.TOPBAR_NOTICE),
        TopBarModel("설정",Strings.TOPBAR_SETTING),
        TopBarModel("",""),
        TopBarModel("","")
    )
    val topBarListProfileView = listOf<TopBarModel>(
        TopBarModel("구독",Strings.TOPBAR_SUBSCRIBE),
        TopBarModel("구독취소",Strings.TOPBAR_UNSUBSCRIBE)
    )

    val dockList = listOf<DockModel>(
        DockModel(R.drawable.image_email,"메뉴",Strings.DOCK_MENU),
        DockModel(R.drawable.image_email,"레시피",Strings.DOCK_RECIPE),
        DockModel(R.drawable.image_email,"스토리",Strings.DOCK_STORY),
        DockModel(R.drawable.image_email,"프로필",Strings.DOCK_PROFILE)
    )
}