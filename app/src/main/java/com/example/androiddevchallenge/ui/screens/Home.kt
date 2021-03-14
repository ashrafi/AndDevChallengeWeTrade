package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme

@ExperimentalMaterialApi
@Composable
fun Home() {
    // Use standard BottomSheet
    BottomSheetScaffold(
        sheetContent = { StockBottomSheet() },
        content = { HomeMainContent() },
        sheetShape = RoundedCornerShape(0.dp),
        sheetPeekHeight = 64.dp
    )
}

@Composable
fun HomeMainContent() {
    Column(modifier = Modifier.fillMaxSize()
        .background(color=Color.Cyan)) {
        HomeTopBarBar()
        HomeBalance()
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("TRANSACT")
        }
        HomeCatRow()
        HomeChart()
    }
}

@Composable
fun HomeChart() {
    Row() {
        Image(
            modifier = Modifier.fillMaxWidth()
                .background(color = Color.Black),
            painter = painterResource(id = R.drawable.ic_home_illos),
            contentDescription = "chart",
            // contentScale = ContentScale.FillBounds
        )
    }
}

@Composable
fun HomeCatRow() {
    // scrollable row
    Row() {
        CatButton("Week")
        CatButton("ETFs")
        CatButton("Stocks")
        CatButton("Funds")
        CatButton("Trades")
    }
}

@Composable
fun CatButton(tlab: String) {
    Button(onClick = { /*TODO*/ }) {
        Text(tlab)
    }
}

@Composable
fun HomeBalance() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Balance")
        Text("$73,589.01")
        Text("+412.35 today")
    }
}

@Composable
fun HomeTopBarBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text("One")
        Text("Two")
        Text("Three")
    }
}

@ExperimentalMaterialApi
@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomePreview() {
    MyTheme {
        Home()
    }
}

@ExperimentalMaterialApi
@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginHomePreview() {
    MyTheme(darkTheme = true) {
        Home()
    }
}
