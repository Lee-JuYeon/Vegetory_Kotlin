package com.example.fooddelivery.ui.customviews.topbar.popup.notification

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.util.dummy.Dummy

@Composable
fun NotificationPopup() {
    // 메모리 관리가 들어간 lazyColumn
    LazyColumn(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        reverseLayout = false,
        contentPadding = PaddingValues(horizontal = 10.dp),
        modifier = Modifier
            .heightIn(min = 0.dp, max = 300.dp)
            .padding(all = 10.dp )
    ){
        items(Dummy.notificationList){ model ->
            NotificationItem(model = model)
        }
    }
}