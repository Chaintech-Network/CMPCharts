package network.chaintech.chartscmp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import network.chaintech.chartscmp.theme.blue_dark
import network.chaintech.chartscmp.theme.gray_dark
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.chartscmp.theme.purple_dark
import network.chaintech.chartscmp.theme.white_color
import network.chaintech.chartscmp.theme.yellow_dark
import network.chaintech.chartscmp.theme.yellow_medium
import network.chaintech.cmpcharts.common.components.Legends
import network.chaintech.cmpcharts.common.model.LegendLabel
import network.chaintech.cmpcharts.common.model.LegendsConfig
import network.chaintech.cmpcharts.common.model.PlotType
import network.chaintech.cmpcharts.ui.piechart.charts.PieChart
import network.chaintech.cmpcharts.ui.piechart.models.PieChartConfig
import network.chaintech.cmpcharts.ui.piechart.models.PieChartData
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Medium
import org.jetbrains.compose.resources.Font

@Composable
fun SimplePieChart() {
    val pieChartData = getPieChartData()
    val pieChartConfig =
        PieChartConfig(
            labelVisible = true,
            activeSliceAlpha = .9f,
            isEllipsizeEnabled = true,
            sliceLabelTypeface = FontWeight.Bold,
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
            ),
            isAnimationEnable = true,
            chartPadding = 30,
            backgroundColor = white_color,
            showSliceLabels = false,
            animationDuration = 1500
        )
    Column(modifier = Modifier.height(500.dp)) {
        Spacer(modifier = Modifier.height(20.dp))
        Legends(legendsConfig = getLegendsConfigFromPieChartData(pieChartData, 3))
        PieChart(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            pieChartData,
            pieChartConfig
        ) { slice ->
            //Custom event on slice tap
        }
    }
}

@Composable
fun PieChartWithSliceLabels() {
    val pieChartData = getPieChartData2()

    val pieChartConfig =
        PieChartConfig(
            activeSliceAlpha = .9f,
            isEllipsizeEnabled = true,
            sliceLabelTypeface = FontWeight.Bold,
            isAnimationEnable = true,
            chartPadding = 20,
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
            ),
            showSliceLabels = true,
            labelVisible = true
        )
    Column(modifier = Modifier.height(500.dp)) {
        Legends(legendsConfig = getLegendsConfigFromPieChartData(pieChartData, 3))
        PieChart(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            pieChartData,
            pieChartConfig
        ) { slice ->
            //Custom event on slice tap
        }
    }
}

@Composable
fun getLegendsConfigFromPieChartData(pieChartData: PieChartData, gridSize: Int): LegendsConfig {
    val legendsList = mutableListOf<LegendLabel>()
    pieChartData.slices.forEach { slice ->
        legendsList.add(LegendLabel(slice.color, slice.label))
    }
    return LegendsConfig(
        legendLabelList = legendsList,
        gridColumnCount = gridSize,
        legendsArrangement = Arrangement.Start,
        textStyle = TextStyle(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
            )
        )
    )
}

fun getPieChartData(): PieChartData {
    return PieChartData(
        slices = listOf(
            PieChartData.Slice("Comedy", 15f, green_dark),
            PieChartData.Slice("Drama", 10f, yellow_dark),
            PieChartData.Slice("Romance", 10f, magenta_dark),
            PieChartData.Slice("SciFi", 15f, gray_dark),
            PieChartData.Slice("Action", 20f, pink_dark),
            PieChartData.Slice("Thriller", 70f, blue_dark),
            PieChartData.Slice("Western", 10f, purple_dark),
            PieChartData.Slice("Fantasy", 10f, yellow_medium),
        ),
        plotType = PlotType.Pie
    )
}

fun getPieChartData2(): PieChartData {
    return PieChartData(
        slices = listOf(
            PieChartData.Slice("Android", 30f, green_dark),
            PieChartData.Slice("iOS", 30f, blue_dark),
            PieChartData.Slice("Windows", 15f, purple_dark),
            PieChartData.Slice("Other", 25f, yellow_dark),
        ),
        plotType = PlotType.Pie
    )
}