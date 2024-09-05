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
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.chartscmp.theme.gray_light
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.purple_dark
import network.chaintech.chartscmp.theme.white_color
import network.chaintech.cmpcharts.axis.AxisProperties
import network.chaintech.cmpcharts.common.extensions.formatToSinglePrecision
import network.chaintech.cmpcharts.common.model.Point
import network.chaintech.cmpcharts.common.ui.GridLinesUtil
import network.chaintech.cmpcharts.common.ui.SelectionHighlightPoint
import network.chaintech.cmpcharts.common.ui.SelectionHighlightPopUp
import network.chaintech.cmpcharts.common.ui.ShadowUnderLine
import network.chaintech.cmpcharts.ui.linechart.LineChart
import network.chaintech.cmpcharts.ui.linechart.model.Line
import network.chaintech.cmpcharts.ui.linechart.model.LineChartProperties
import network.chaintech.cmpcharts.ui.linechart.model.LinePlotData
import network.chaintech.cmpcharts.ui.linechart.model.LineStyle
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Composable
fun SingleLineChartWithGridLines(pointsData: List<Point>) {
    val textMeasurer = rememberTextMeasurer()
    val steps = 5
    val xAxisProperties = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepSize = 30.dp,
        topPadding = 105.dp,
        labelColor = font_color,
        lineColor = font_color,
        stepCount = pointsData.size - 1,
        labelFormatter = { i -> pointsData[i].x.toInt().toString() },
        labelPadding = 15.dp
    )

    val yAxisProperties = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepCount = steps,
        labelColor = font_color,
        lineColor = font_color,
        labelPadding = 20.dp,
        labelFormatter = { i ->
            val yMin = pointsData.minOf { it.y }
            val yMax = pointsData.maxOf { it.y }
            val yScale = (yMax - yMin) / steps
            ((i * yScale) + yMin).formatToSinglePrecision()
        }
    )

    val lineChartProperties = LineChartProperties(
        linePlotData = LinePlotData(
            lines = listOf(
                Line(
                    dataPoints = pointsData,
                    LineStyle(
                        color = purple_dark
                    ),
                    IntersectionPoint(
                        color = green_dark
                    ),
                    SelectionHighlightPoint(
                        color = magenta_dark
                    ),
                    ShadowUnderLine(),
                    SelectionHighlightPopUp(
                        textMeasurer = textMeasurer,
                        backgroundColor = magenta_dark,
                        labelColor = white_color,
                        labelTypeface = FontWeight.Bold
                    )
                )
            )
        ),
        xAxisProperties = xAxisProperties,
        yAxisProperties = yAxisProperties,
        gridLines = GridLinesUtil(color = gray_light)
    )
    LineChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        lineChartProperties = lineChartProperties
    )
}