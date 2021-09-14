package com.example.fooddelivery.ui.customviews.gridview

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.ui.customviews.scrollview.ScrollableColumn

@Composable
fun <T> CustomGridViews(
    list : List<T>
){
    for (item in list){
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

        }

    }
}

@Composable
fun <T> CustomGridView(
    cols: Int = 1,
                       list: List<T>,
                       rowModifier: Modifier = Modifier,
                       colModifier: Modifier = Modifier,
                       child: @Composable (dataModal: T) -> Unit
) {
    val rows = (list.size / cols) + (if (list.size % cols > 0) 1 else 0)

    for (r in 0 until rows) {
        Row(modifier = rowModifier, horizontalArrangement = Arrangement.SpaceAround) {
            for (cell in 0 until cols) {
                val i = (r * cols) + cell
                if (i < list.size) { child(list[i]) } else { break }
            }
        }
    }
}

//@Composable
//fun <T>CustomGridView1(
//    contentPadding: PaddingValues = PaddingValues(0.dp),
//    mainAxisSpacing: Dp = 0.dp,
//    crossAxisSpacing: Dp = 0.dp,
//    columns: Int = 2,
//    items: List<T>,
//    child: @Composable (item: T, paddingValue: PaddingValues, weight: Float) -> Unit
//) {
//    Box(
//        modifier = Modifier
//            .padding(contentPadding)
//    ) {
//        val mainAxisPadding = PaddingValues(
//            start = mainAxisSpacing,
//            end = mainAxisSpacing
//        )
//        val crossAxisPadding = PaddingValues(
//            start = crossAxisSpacing / columns,
//            end = crossAxisSpacing / columns
//        )
//
//        key(items, columns) {
//            items.chunked(columns).forEach { rowList ->
//                Row(
//                    modifier = Modifier
//                        .padding(mainAxisPadding)
//                ) {
//                    rowList.forEach {
//                        child(it, crossAxisPadding, 1f)
//                    }
//                    val emptyRows = (columns - rowList.size)
//                    repeat(emptyRows) {
//                        Spacer(
//                            modifier = Modifier
//                                .weight(1f)
//                        )
//                    }
//                }
//            }
//        }
//    }
//}