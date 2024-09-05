package network.chaintech.chartscmp.ui.piechart

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import network.chaintech.chartscmp.theme.blue_dark
import network.chaintech.chartscmp.theme.gray_dark
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.chartscmp.theme.purple_dark
import network.chaintech.chartscmp.theme.yellow_dark
import network.chaintech.chartscmp.theme.yellow_medium
import network.chaintech.cmpcharts.common.model.LegendLabel
import network.chaintech.cmpcharts.common.model.LegendsConfig
import network.chaintech.cmpcharts.common.model.PlotType
import network.chaintech.cmpcharts.ui.piechart.models.PieChartData
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Medium
import org.jetbrains.compose.resources.Font

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