package network.chaintech.chartscmp.ui.donutchart

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import network.chaintech.chartscmp.theme.blue_dark
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.chartscmp.theme.purple_dark
import network.chaintech.chartscmp.theme.yellow_dark
import network.chaintech.cmpcharts.common.model.LegendLabel
import network.chaintech.cmpcharts.common.model.LegendsConfig
import network.chaintech.cmpcharts.common.model.PlotType
import network.chaintech.cmpcharts.ui.piechart.models.PieChartData
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Medium
import org.jetbrains.compose.resources.Font

fun getDonutChartData(): PieChartData {
    return PieChartData(
        slices = listOf(
            PieChartData.Slice("HP", 15f, green_dark),
            PieChartData.Slice("Dell", 30f, yellow_dark),
            PieChartData.Slice("Lenovo", 10f, magenta_dark),
            PieChartData.Slice("Asus", 15f, pink_dark),
            PieChartData.Slice("Acer", 10f, blue_dark),
            PieChartData.Slice("Apple", 30f, purple_dark),
        ),
        plotType = PlotType.Donut
    )
}

@Composable
fun getLegendsConfigFromPieChartDataForDonutChart(
    pieChartData: PieChartData,
    gridSize: Int
): LegendsConfig {
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