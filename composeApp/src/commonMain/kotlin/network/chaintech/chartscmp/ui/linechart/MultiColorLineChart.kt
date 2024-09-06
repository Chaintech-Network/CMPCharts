package network.chaintech.chartscmp.ui.linechart

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.dp
import network.chaintech.chartsLib.ui.linechart.model.IntersectionPoint
import network.chaintech.chartscmp.theme.blue_dark
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.chartscmp.theme.gray_dark
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.chartscmp.theme.purple_dark
import network.chaintech.chartscmp.theme.white_color
import network.chaintech.cmpcharts.axis.AxisProperties
import network.chaintech.cmpcharts.common.extensions.formatNumber
import network.chaintech.cmpcharts.common.model.Point
import network.chaintech.cmpcharts.common.ui.SelectionHighlightPopUp
import network.chaintech.cmpcharts.ui.linechart.LineChart
import network.chaintech.cmpcharts.ui.linechart.model.Line
import network.chaintech.cmpcharts.ui.linechart.model.LineChartProperties
import network.chaintech.cmpcharts.ui.linechart.model.LinePlotData
import network.chaintech.cmpcharts.ui.linechart.model.LineStyle
import network.chaintech.cmpcharts.ui.linechart.model.LineType
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Composable
fun MultipleToneLineChart(pointsData: List<Point>) {
    val textMeasurer = rememberTextMeasurer()
    val xAxisProperties = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepSize = 40.dp,
        stepCount = pointsData.size - 1,
        labelFormatter = { i -> (1900 + i).toString() },
        labelRotationAngle = 20f,
        labelPadding = 15.dp,
        labelColor = font_color,
        lineColor = font_color,
        weight = FontWeight.Bold
    )

    val yAxisProperties = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepCount = 10,
        labelFormatter = { i -> "${(i * 20)}k" },
        labelPadding = 30.dp,
        labelColor = font_color,
        lineColor = font_color,
        weight = FontWeight.Bold
    )

    val lineChartProperties = LineChartProperties(
        linePlotData = LinePlotData(
            lines = listOf(
                Line(
                    dataPoints = pointsData,
                    lineStyle = LineStyle(lineType = LineType.Straight(), color = pink_dark),
                    intersectionPoint = IntersectionPoint(color = blue_dark),
                    selectionHighlightPopUp = SelectionHighlightPopUp(
                        popUpLabel = { x, y ->
                            val xLabel = "x : ${(1900 + x).toInt()} "
                            val yLabel = "y : ${y.formatNumber()}"
                            "$xLabel $yLabel"
                        },
                        textMeasurer = textMeasurer,
                        backgroundColor = magenta_dark,
                        labelColor = white_color,
                        labelTypeface = FontWeight.Bold
                    )
                ), Line(
                    dataPoints = pointsData.subList(0, 10),
                    lineStyle = LineStyle(lineType = LineType.Straight(), color = blue_dark),
                    intersectionPoint = IntersectionPoint(color = gray_dark),
                    selectionHighlightPopUp = SelectionHighlightPopUp(
                        popUpLabel = { x, y ->
                            val xLabel = "x : ${(1900 + x).toInt()} "
                            val yLabel = "y : ${y.formatNumber()}"
                            "$xLabel $yLabel"
                        },
                        textMeasurer = textMeasurer,
                        backgroundColor = pink_dark,
                        labelColor = white_color,
                        labelTypeface = FontWeight.Bold
                    )
                ), Line(
                    dataPoints = pointsData.subList(15, 30),
                    lineStyle = LineStyle(lineType = LineType.Straight(), color = purple_dark),
                    intersectionPoint = IntersectionPoint(color = green_dark),
                    selectionHighlightPopUp = SelectionHighlightPopUp(
                        popUpLabel = { x, y ->
                            val xLabel = "x : ${(1900 + x).toInt()} "
                            val yLabel = "y : ${y.formatNumber()}"
                            "$xLabel $yLabel"
                        },
                        textMeasurer = textMeasurer,
                        backgroundColor = pink_dark,
                        labelColor = white_color,
                        labelTypeface = FontWeight.Bold
                    )
                )
            )
        ),
        xAxisProperties = xAxisProperties,
        yAxisProperties = yAxisProperties
    )
    LineChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        lineChartProperties = lineChartProperties
    )
}