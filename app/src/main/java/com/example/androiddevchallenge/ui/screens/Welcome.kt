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
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.shapes

@Composable
fun Welcome() {
    // add background image

    val constraints = decoupledConstraints(32.dp)
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        BackGroundImage()
        ConstraintLayout(constraints, modifier = Modifier.fillMaxSize()) {

            Logo(modifier = Modifier.layoutId("logo"))
            LoginButtons(modifier = Modifier.layoutId("login"))
        }
    }
}

@Composable
fun BackGroundImage() {
    Image(
        painterResource(R.drawable.ic_welcome_bg),
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize(),
        contentDescription = "WeTrade background",
    )
}

@Composable
fun Logo(modifier: Modifier) {
    Image(
        painterResource(R.drawable.ic_logo),
        contentDescription = "We Trade Logo",
        modifier = modifier,
        alignment = Alignment.Center
    )
}

@Composable
fun LoginButtons(modifier: Modifier) {
    Row(
        modifier = modifier
            .padding(
                start = 16.dp,
                end = 16.dp
            )
            .fillMaxWidth()
            .height(48.dp)
    ) {

        Button(
            modifier = Modifier.fillMaxSize().weight(1f),
            onClick = { /*TODO*/ },
            shape = MaterialTheme.shapes.large
        ) {
            Text("Hit Me")
        }
        Spacer(Modifier.width(8.dp))
        Button(
            modifier = Modifier.fillMaxSize().weight(1f),

            onClick = { /*TODO*/ },
            shape = MaterialTheme.shapes.large
        ) {
            Text("Hit Me")
        }
    }
}

fun decoupledConstraints(botMarg: Dp): ConstraintSet {
    return ConstraintSet {
        val logo = createRefFor("logo")
        val login = createRefFor("login")

        constrain(logo) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }

        constrain(login) {
            bottom.linkTo(parent.bottom, margin = botMarg)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun WelcomePreview() {
    MyTheme {
        Welcome()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        Welcome()
    }
}
