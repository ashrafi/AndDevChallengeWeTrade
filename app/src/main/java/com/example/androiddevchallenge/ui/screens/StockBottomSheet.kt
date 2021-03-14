package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.db.CoStock
import com.example.androiddevchallenge.db.CoStocks
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun StockBottomSheet() {
    LazyColumn(modifier = Modifier.fillMaxHeight()) {
        itemsIndexed(CoStocks) { index, stock ->
            Divider()
            StockRow(stock)
        }
    }
}

@Composable
fun StockRow(stock: CoStock) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column() {
            Text(stock.price)
            Text(stock.change.toString())
        }
        Column(modifier = Modifier.weight(1f)) {
            Text(stock.symbol)
            Text(stock.name)
        }
        Image(
            modifier = Modifier
                .background(color = Color.Black),
            painter = painterResource(id = stock.chartImg),
            contentDescription = "chart",
            // contentScale = ContentScale.FillBounds
        )
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun SBSPreview() {
    MyTheme {
        StockBottomSheet()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun SBSDarkPreview() {
    MyTheme(darkTheme = true) {
        StockBottomSheet()
    }
}
