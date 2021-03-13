package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Stock

@Composable
fun StockItem(stock: Stock) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
    ) {
        Column(Modifier.width(56.dp)) {
            Text(
                text = stock.price,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface,
                modifier = Modifier.paddingFromBaseline(top = 24.dp)
            )
            Text(
                text = stock.changePercent,
                style = MaterialTheme.typography.body1,
                color = if (stock.changePercent.startsWith("+")) MaterialTheme.colors.primaryVariant else MaterialTheme.colors.secondaryVariant,
                modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 16.dp)
            )
        }

        Spacer(Modifier.width(8.dp))

        Column {
            Text(
                text = stock.ticker,
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.onSurface,
                modifier = Modifier.paddingFromBaseline(top = 24.dp)
            )
            Text(
                text = stock.company,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onSurface,
                modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 16.dp)
            )
        }

        Spacer(Modifier.weight(1f))

        Image(
            painterResource(id = stock.chart),
            contentDescription = stock.company,
            contentScale = ContentScale.FillHeight
        )
    }
}