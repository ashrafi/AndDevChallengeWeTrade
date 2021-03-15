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
package com.example.androiddevchallenge.db

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

// data class holding stock

data class CoStock(
    val symbol: String,
    val name: String,
    val price: String,
    val change: Double,
    @DrawableRes val chartImg: Int
)

val CoStocks: List<CoStock> = listOf(
    CoStock(
        symbol = "ALK",
        name = "Alaska Air Group, Inc",
        price = "$7,918",
        change = -0.54,
        chartImg = R.drawable.ic_home_alk
    ),
    CoStock(
        symbol = "BA",
        name = "Boeing Co.",
        price = "$1,293",
        change = 4.18,
        chartImg = R.drawable.ic_home_ba
    ),
    CoStock(
        symbol = "DAL",
        name = "Delta Airlines Inc.",
        price = "$893.50",
        change = -0.54,
        chartImg = R.drawable.ic_home_dal
    ),
    CoStock(
        symbol = "EXPE",
        name = "Expedia Group Inc.",
        price = "$12,301",
        change = 2.51,
        chartImg = R.drawable.ic_home_exp
    ),
    CoStock(
        symbol = "EADSY",
        name = "Airbus SE",
        price = "$12,301",
        change = 1.38,
        chartImg = R.drawable.ic_home_eadsy
    ),
    CoStock(
        symbol = "JBLU",
        name = "Jetblue Airways Corp.",
        price = "$8,521",
        change = 1.56,
        chartImg = R.drawable.ic_home_jblu
    ),
    CoStock(
        symbol = "MAR",
        name = "Marriott International Inc.",
        price = "$521",
        change = 2.75,
        chartImg = R.drawable.ic_home_mar
    ),
    CoStock(
        symbol = "CCL",
        name = "Carnival Corp",
        price = "$5,481",
        change = -0.14,
        chartImg = R.drawable.ic_home_ccl
    ),
    CoStock(
        symbol = "RCL",
        name = "Royal Caribbean Cruises",
        price = "$9,184",
        change = 1.69,
        chartImg = R.drawable.ic_home_rcl
    ),
    CoStock(
        symbol = "TRVL",
        name = "Travelocity Inc.",
        price = "$654",
        change = 3.23,
        chartImg = R.drawable.ic_home_trvl
    ),
)
