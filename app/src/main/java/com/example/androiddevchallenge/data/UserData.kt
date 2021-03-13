package com.example.androiddevchallenge.data

import androidx.compose.runtime.Immutable
import com.example.androiddevchallenge.R


@Immutable
data class Stock(
    val ticker: String,
    val company: String,
    val price: String,
    val changePercent: String,
    val chart: Int
)

object UserData {
    val categories: List<String> = listOf(
        "ETFs",
        "Stocks",
        "Funds",
        "Coins",
        "Futures",
        "Options",
    )

    val positions: List<Stock> = listOf(
        Stock("ALK", "Alaska Air Group, Inc.", "$7,918", "-0.54%", R.drawable.home_alk),
        Stock("BA", "Boeing Co.", "$1,293", "+4.18%", R.drawable.home_ba),
        Stock("DAL", "Delta Airlines Inc.", "$893.50", "-0.54%", R.drawable.home_dal),
        Stock("EXPE", "Expedia Group Inc.", "$12,301", "+2.51%", R.drawable.home_exp),
        Stock("EADSY", "Airbus SE", "$12,301", "+1.38%", R.drawable.home_eadsy),
        Stock("JBLU", "Jetblue Airways Corp.", "$8,521", "+1.56%", R.drawable.home_jblu),
        Stock("MAR", "Marriott International Inc.", "%521", "+2.75%", R.drawable.home_mar),
        Stock("CCL", "Carnival Corp", "$5,481", "+0.14%", R.drawable.home_ccl),
        Stock("RCL", "Royal Caribbean Cruises", "$9,184", "+1.69%", R.drawable.home_rcl),
        Stock("TRVL", "Travelocity Inc.", "$654", "+3.23%", R.drawable.home_trvl),
    )
}