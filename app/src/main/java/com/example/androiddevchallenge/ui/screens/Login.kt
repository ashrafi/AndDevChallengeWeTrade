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
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Password
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.gray900
import com.example.androiddevchallenge.ui.theme.white

@Composable
fun Login(navController: NavHostController) {
    val themeBackground = if (isSystemInDarkTheme()) {
        gray900
    } else {
        white
    }

    Column(
        modifier = Modifier.background(themeBackground)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.ic_login_bg),
                contentDescription = null,
                // contentScale = ContentScale.FillBounds
            )
            Text(
                modifier = Modifier
                    .paddingFromBaseline(top = 152.dp)
                    .fillMaxWidth(),
                text = "Welcome\nback",
                style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Center,
                color = white
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 16.dp),
                value = "", onValueChange = { /*TODO*/ },
                leadingIcon = {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        imageVector = Icons.Default.Email,
                        contentDescription = null
                    )
                },
                placeholder = {
                    Text(
                        text = "Email address",
                        style = MaterialTheme.typography.body1
                    )
                }
            )

            Spacer(Modifier.height(8.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),

                value = "", onValueChange = { /*TODO*/ },
                leadingIcon = {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        imageVector = Icons.Default.Password,
                        contentDescription = null
                    )
                },
                placeholder = {
                    Text(
                        text = "Password",
                        style = MaterialTheme.typography.body1
                    )
                }
            )

            Spacer(Modifier.height(16.dp))

            Button(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 16.dp),
                shape = MaterialTheme.shapes.large,
                onClick = { navController.navigate("home") }
            ) {
                Text("LOG IN")
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginPreview() {
    val navController = rememberNavController()
    MyTheme {
        Login(navController)
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginDarkPreview() {
    val navController = rememberNavController()
    MyTheme(darkTheme = true) {
        Login(navController)
    }
}
