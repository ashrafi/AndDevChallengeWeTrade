/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.green
import com.example.androiddevchallenge.ui.theme.white

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Home() {
    // Use standard BottomSheet
    BottomSheetScaffold(
        sheetContent = { StockBottomSheet() },
        content = { HomeMainContent() },
        sheetShape = RoundedCornerShape(0.dp),
        sheetPeekHeight = 60.dp
    )
}

@Composable
fun HomeMainContent() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        HomeTopBar()

        HomeBalance()

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(horizontal = 16.dp)
                .fillMaxWidth()
                .height(48.dp),
            shape = MaterialTheme.shapes.large
        ) {
            Text("TRANSACT")
        }
        Spacer(Modifier.height(16.dp))

        HomeCatRow()

        HomeChart()

        // Spacer(Modifier.height(32.dp))
    }
}

@Composable
fun HomeTopBar() {

    Row(
        modifier = Modifier.fillMaxWidth()
            .paddingFromBaseline(top = 64.dp, bottom = 8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            "ACCOUNT",
            style = MaterialTheme.typography.button,
            color = white
        )
        Text(
            "WATCH LIST",
            style = MaterialTheme.typography.button,
            color = white.copy(alpha = .70f)
        )
        Text(
            "PROFILE",
            style = MaterialTheme.typography.button,
            color = white.copy(alpha = .70f)
        )
    }
}

@Composable
fun HomeBalance() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Balance",
            modifier = Modifier.paddingFromBaseline(top = 32.dp, bottom = 8.dp),
            style = MaterialTheme.typography.subtitle1
        )
        Text(
            "$73,589.01",
            modifier = Modifier.paddingFromBaseline(top = 48.dp, bottom = 24.dp),
            style = MaterialTheme.typography.h1
        )
        Text(
            "+412.35 today",
            modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 32.dp),
            style = MaterialTheme.typography.subtitle1,
            color = green
        )
    }
}

@Composable
fun HomeCatRow() {
    // mock buttons
    // scrollable row
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(start = 16.dp)
            .height(40.dp)
            .fillMaxWidth()
    ) {
        OutlinedButton(
            modifier = Modifier.fillMaxHeight(),
            onClick = {
                // Toast()
            },
            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
            shape = MaterialTheme.shapes.large,
            border = BorderStroke(ButtonDefaults.OutlinedBorderSize, white)
        ) {
            Text(
                "Week",
                color = white,
                style = MaterialTheme.typography.body1
            )
            Icon(
                imageVector = Icons.Default.ExpandMore,
                contentDescription = null,
                tint = white
            )
        }
        Spacer(Modifier.width(8.dp))
        CatButton("ETFs")
        Spacer(Modifier.width(8.dp))
        CatButton("Stocks")
        Spacer(Modifier.width(8.dp))
        CatButton("Funds")
        Spacer(Modifier.width(8.dp))
        CatButton("Trades")
    }
}

@Composable
fun CatButton(tlab: String) {
    OutlinedButton(
        modifier = Modifier.fillMaxHeight(),
        onClick = {
            // Toast()
        },
        colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
        shape = MaterialTheme.shapes.large,
        border = BorderStroke(ButtonDefaults.OutlinedBorderSize, white)
    ) {
        Text(
            tlab,
            color = white,
            style = MaterialTheme.typography.body1
        )
    }
}

@Composable
fun HomeChart() {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp),
        painter = painterResource(id = R.drawable.ic_home_illos),
        contentDescription = "chart",
        // contentScale = ContentScale.FillBounds
    )
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
