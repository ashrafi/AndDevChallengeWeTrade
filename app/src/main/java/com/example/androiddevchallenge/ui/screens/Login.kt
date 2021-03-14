package com.example.androiddevchallenge.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun Login() {
    Column() {
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
                color = Color.White
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
                }
            )

            Spacer(Modifier.height(8.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),

                value = "", onValueChange = { /*TODO*/ }
            )

            Spacer(Modifier.height(16.dp))

            Button(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 16.dp),
                onClick = { /*TODO*/ }
            ) {
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginPreview() {
    MyTheme {
        Login()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginDarkPreview() {
    MyTheme(darkTheme = true) {
        Login()
    }
}
