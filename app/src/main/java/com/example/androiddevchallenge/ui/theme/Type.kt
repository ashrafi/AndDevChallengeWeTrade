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
package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R

// private val craneFontFamily = FontFamily(fonts = listOf(light, regular, medium, semibold))
private val MontserratFontFamily = FontFamily(
    Font(
        R.font.montserrat_light,
        weight = FontWeight.W300
    ),
    Font(
        R.font.montserrat_medium,
        weight = FontWeight.W500
    ),
    Font(
        R.font.montserrat_semi_bold,
        weight = FontWeight.W600
    ),
    Font(
        R.font.montserrat_bold,
        weight = FontWeight.W700
    ),
    Font(
        R.font.montserrat_extra_bold,
        weight = FontWeight.W800
    ),
)

val captionTextStyle = TextStyle(
    fontFamily = MontserratFontFamily,
    fontWeight = FontWeight.W400,
    fontSize = 16.sp
)

val typographyOld = Typography(

    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
        /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

// Set of Material typography styles to start with
val typography = Typography(
    h1 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontWeight = FontWeight.W800,
        fontSize = 40.sp,
        letterSpacing = 0.25.em
    ),
    h2 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontWeight = FontWeight.W800,
        fontSize = 36.sp
    ),
    h3 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = 13.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontWeight = FontWeight.W500,
        fontSize = 15.sp
    ),
    body1 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontWeight = FontWeight.W300,
        fontSize = 13.sp
    ),
    button = TextStyle(
        fontFamily = MontserratFontFamily,
        fontWeight = FontWeight.W700,
        fontSize = 13.sp,
        letterSpacing = 0.25.em
    ),
)
