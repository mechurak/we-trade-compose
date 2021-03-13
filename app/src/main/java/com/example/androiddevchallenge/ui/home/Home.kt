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
package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
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
import androidx.navigation.NavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.UserData
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun HomeScreen(
    darkTheme: Boolean = isSystemInDarkTheme(),
    navController: NavController? = null
) {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = MaterialTheme.colors.background
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "ACCOUNT",
                        style = MaterialTheme.typography.button,
                        color = MaterialTheme.colors.onBackground,
                        modifier = Modifier
                            .clickable { }
                            .paddingFromBaseline(top = 64.dp, bottom = 8.dp)
                    )
                    Text(
                        text = "WATCHLIST",
                        style = MaterialTheme.typography.button,
                        color = MaterialTheme.colors.onBackground.copy(alpha = 0.7f),
                        modifier = Modifier
                            .clickable { }
                            .paddingFromBaseline(top = 64.dp, bottom = 8.dp)
                    )
                    Text(
                        text = "PROFILE",
                        style = MaterialTheme.typography.button,
                        color = MaterialTheme.colors.onBackground.copy(alpha = 0.7f),
                        modifier = Modifier
                            .clickable { }
                            .paddingFromBaseline(top = 64.dp, bottom = 8.dp)
                    )
                }

                Text(
                    text = "Balance",
                    style = MaterialTheme.typography.subtitle1,
                    color = MaterialTheme.colors.onBackground,
                    modifier = Modifier.paddingFromBaseline(top = 32.dp, bottom = 8.dp)
                )
                Text(
                    text = "$72,589.01",
                    style = MaterialTheme.typography.h1,
                    color = MaterialTheme.colors.onBackground,
                    modifier = Modifier.paddingFromBaseline(top = 48.dp, bottom = 24.dp)
                )
                Text(
                    text = "+412.35 today",
                    style = MaterialTheme.typography.subtitle1,
                    color = MaterialTheme.colors.primaryVariant,
                    modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 32.dp)
                )

                Button(
                    onClick = { },
                    shape = MaterialTheme.shapes.large,
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
                    elevation = ButtonDefaults.elevation(0.dp),
                    modifier = Modifier
                        .padding(bottom = 16.dp, start = 16.dp, end = 16.dp)
                        .fillMaxWidth()
                        .height(48.dp)
                ) {
                    Text(
                        text = "TRANSACT",
                        color = MaterialTheme.colors.onPrimary,
                        style = MaterialTheme.typography.button,
                    )
                }

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    item {
                        OutlinedButton(
                            onClick = { },
                            shape = RoundedCornerShape(50),
                            border = BorderStroke(1.dp, MaterialTheme.colors.onBackground),
                            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
                            elevation = ButtonDefaults.elevation(0.dp),
                            modifier = Modifier.height(40.dp)
                        ) {
                            Text(
                                text = "Week",
                                color = MaterialTheme.colors.onBackground,
                                style = MaterialTheme.typography.body1,
                            )
                            IconButton(onClick = { }) {
                                Icon(
                                    Icons.Filled.ExpandMore,
                                    contentDescription = "search",
                                    modifier = Modifier.size(16.dp), // TODO: Reduce padding around this icon
                                    tint = MaterialTheme.colors.onBackground
                                )
                            }
                        }
                    }
                    items(UserData.categories) { category ->
                        OutlinedButton(
                            onClick = { },
                            shape = RoundedCornerShape(50),
                            border = BorderStroke(1.dp, MaterialTheme.colors.onBackground),
                            colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
                            elevation = ButtonDefaults.elevation(0.dp),
                            modifier = Modifier.height(40.dp)
                        ) {
                            Text(
                                text = category,
                                color = MaterialTheme.colors.onBackground,
                                style = MaterialTheme.typography.body1,
                            )
                        }
                    }
                }
                Image(
                    painterResource(id = R.drawable.home_illos),
                    contentDescription = "illos",
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 32.dp, start = 16.dp, end = 16.dp)
                        .fillMaxWidth()
                )
            }
        }
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.surface
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Positions",
                    style = MaterialTheme.typography.subtitle1,
                    color = MaterialTheme.colors.onSurface,
                    modifier = Modifier.paddingFromBaseline(top = 40.dp, bottom = 24.dp)
                )
                UserData.positions.forEach { stock ->
                    Divider(
                        Modifier
                            .padding(horizontal = 16.dp)
                            .height(1.dp)
                    )
                    StockItem(stock)
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomeScreenPreview() {
    MyTheme {
        HomeScreen()
    }
}
