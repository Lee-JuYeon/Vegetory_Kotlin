package com.example.fooddelivery.ui.customviews.gridview

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

enum class AXIS{
    VERTICAL, HORIZONTAL
}

@Composable
fun <T> CustomGridView(
    dataModelList : List<T>,
    axis : AXIS = AXIS.VERTICAL,
    divide : Int,
    hasFixed : Boolean = true,
    modifier : Modifier,
    contentPadding : PaddingValues = PaddingValues(0.dp),
    viewHolder: @Composable (dataModal: T) -> Unit
){

    when(axis){
        AXIS.VERTICAL -> {
            val rows = (dataModelList.size / divide) + ( if (dataModelList.size % divide > 0) 1 else 0)

            for (r in 0 until rows) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    for (cell in 0 until divide) {
                        val i = (r * divide) + cell
                        if (i < dataModelList.size) {
                            viewHolder(dataModelList[i])
                        } else {
                            break
                        }
                    }
                }
            }
        }
        AXIS.HORIZONTAL -> {
//            LazyRow(
//                modifier = modifier,
//                state = rememberLazyListState(),
//                contentPadding = contentPadding
//            ) {
//                items(list) { rowIndex ->
//                    Column {
//                        for (columnIndex in 0 until divideLine) {
//                            val itemIndex = rowIndex * divideLine + columnIndex
//                            if (itemIndex < scope.totalSize) {
//                                Box(
//                                    modifier = Modifier.weight(1f, fill = true),
//                                    propagateMinConstraints = true
//                                ) {
//                                    scope.contentFor(itemIndex, this@items).invoke()
//                                }
//                            } else {
//                                Spacer(Modifier.weight(1f, fill = true))
//                            }
//                        }
//                    }
//                }
//            }
        }
    }
}

@Composable
fun <T> CustomGridViews(
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