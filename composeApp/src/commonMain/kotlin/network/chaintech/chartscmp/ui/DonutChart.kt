package network.chaintech.chartscmp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import network.chaintech.chartscmp.theme.blue_dark
import network.chaintech.chartscmp.theme.blue_light
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.chartscmp.theme.gray_light
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.green_light
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.chartscmp.theme.purple_dark
import network.chaintech.chartscmp.theme.yellow_dark
import network.chaintech.cmpcharts.common.components.Legends
import network.chaintech.cmpcharts.common.model.LegendLabel
import network.chaintech.cmpcharts.common.model.LegendsConfig
import network.chaintech.cmpcharts.common.model.PlotType
import network.chaintech.cmpcharts.ui.piechart.charts.DonutPieChart
import network.chaintech.cmpcharts.ui.piechart.models.PieChartConfig
import network.chaintech.cmpcharts.ui.piechart.models.PieChartData
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Medium
import org.jetbrains.compose.resources.Font


@Composable
fun SimpleDonutChart() {
    val data = getDonutChartData()
    val pieChartConfig =
        PieChartConfig(
            labelVisible = true,
            strokeWidth = 120f,
            labelColor = font_color,
            activeSliceAlpha = .9f,
            isEllipsizeEnabled = true,
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
            ),
            labelFontWeight = FontWeight.Bold,
            isAnimationEnable = true,
            chartPadding = 25,
            labelFontSize = 42.sp,
        )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
    ) {
        Legends(
            legendsConfig = getLegendsConfigFromPieChartDataForDonutChart(
                pieChartData = data,
                3
            )
        )
        DonutPieChart(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            data,
            pieChartConfig
        ) { slice ->
            //Custom event on slice tap
        }
    }
}

@Composable
fun MultipleSmallDonutCharts() {
    val data = getDonutChartData()
    val firstPieChartConfig =
        PieChartConfig(
            labelVisible = true,
            strokeWidth = 50f,
            labelColor = font_color,
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
            ),
            backgroundColor = blue_light,
            activeSliceAlpha = .9f,
            isEllipsizeEnabled = true,
            labelFontWeight = FontWeight.Bold,
            isAnimationEnable = true,
            chartPadding = 25,
            labelFontSize = 13.sp
        )
    val secondPieChartConfig =
        PieChartConfig(
            labelVisible = true,
            strokeWidth = 50f,
            labelColor = font_color,
            activeSliceAlpha = .9f,
            isEllipsizeEnabled = true,
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
            ),
            backgroundColor = green_light,
            labelFontWeight = FontWeight.Bold,
            isAnimationEnable = true,
            chartPadding = 25,
            labelFontSize = 12.sp,
            isSumVisible = true,
            sumUnit = "unit",
            labelColorType = PieChartConfig.LabelColorType.SLICE_COLOR,
            labelType = PieChartConfig.LabelType.VALUE
        )
    val thirdPieChartConfig =
        PieChartConfig(
            labelVisible = true,
            strokeWidth = 50f,
            labelColor = font_color,
            activeSliceAlpha = .9f,
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
            ),
            backgroundColor = gray_light,
            isEllipsizeEnabled = true,
            labelFontWeight = FontWeight.Bold,
            isAnimationEnable = true,
            chartPadding = 25,
            labelFontSize = 13.sp
        )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
    ) {
        Legends(
            legendsConfig = getLegendsConfigFromPieChartDataForDonutChart(
                pieChartData = data,
                3
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            item {
                DonutPieChart(
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp),
                    data,
                    firstPieChartConfig
                ) { slice ->

                }
                Spacer(modifier = Modifier.width(30.dp))
            }
            item {
                DonutPieChart(
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp),
                    data,
                    secondPieChartConfig
                ) { slice ->

                }
                Spacer(modifier = Modifier.width(30.dp))
            }
            item {
                DonutPieChart(
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp),
                    data,
                    thirdPieChartConfig
                ) { slice ->

                }
                Spacer(modifier = Modifier.width(30.dp))
            }
        }
    }
}

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