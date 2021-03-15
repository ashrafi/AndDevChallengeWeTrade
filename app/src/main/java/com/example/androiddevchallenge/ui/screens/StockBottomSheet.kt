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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.db.CoStock
import com.example.androiddevchallenge.db.CoStocks
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.green
import com.example.androiddevchallenge.ui.theme.red

@Composable
fun StockBottomSheet() {
    Surface() {
        Column {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .paddingFromBaseline(top = 40.dp, bottom = 24.dp),
                text = "Positions",
                style = MaterialTheme.typography.subtitle1,
                textAlign = TextAlign.Center
            )

            LazyColumn(modifier = Modifier.fillMaxHeight()) {
                itemsIndexed(CoStocks) { index, stock ->
                    Divider()
                    StockRow(stock)
                }
            }
        }
    }
}

@Composable
fun StockRow(stock: CoStock) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            // .padding(horizontal = 16.dp)
            // .paddingFromBaseline(,top = 24.dp, bottom = 16.dp)
            // .height(40.dp),
            .padding(horizontal = 16.dp)
            .height(56.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column() {
            Text(
                stock.price,
                modifier = Modifier.paddingFromBaseline(top = 24.dp),
                style = MaterialTheme.typography.body1
            )
            Text(
                "${stock.change}%",
                modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 16.dp),
                color = if (stock.change > 0) green else red,
                style = MaterialTheme.typography.body1
            )
        }

        Spacer(Modifier.width(16.dp)) // small break 

        Column(modifier = Modifier.weight(1f)) {
            Text(
                stock.symbol,
                modifier = Modifier.paddingFromBaseline(top = 24.dp),
                style = MaterialTheme.typography.h3
            )
            Text(
                stock.name,
                modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 16.dp),
                style = MaterialTheme.typography.body1
            )
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
