package network.chaintech.chartscmp.ui.linechart

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.dp
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.chartscmp.theme.transparent_color
import network.chaintech.chartscmp.theme.white_color
import network.chaintech.cmpcharts.axis.AxisProperties
import network.chaintech.cmpcharts.common.extensions.formatToSinglePrecision
import network.chaintech.cmpcharts.common.model.Point
import network.chaintech.cmpcharts.common.ui.SelectionHighlightPoint
import network.chaintech.cmpcharts.common.ui.SelectionHighlightPopUp
import network.chaintech.cmpcharts.common.ui.ShadowUnderLine
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
fun DashedLineChart(pointsData: List<Point>) {
    val textMeasurer = rememberTextMeasurer()
    val steps = 10
    val xAxisProperties = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepSize = 40.dp,
        stepCount = pointsData.size - 1,
        labelFormatter = { i -> i.toString() },
        labelColor = font_color,
        lineColor = font_color
    )

    val yAxisProperties = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepCount = steps,
        labelFormatter = { i ->
            val yMin = pointsData.minOf { it.y }
            val yMax = pointsData.maxOf { it.y }
            val yScale = (yMax - yMin) / steps
            ((i * yScale) + yMin).formatToSinglePrecision()
        },
        labelColor = font_color,
        lineColor = font_color,
        labelPadding = 20.dp
    )

    val lineChartProperties = LineChartProperties(
        linePlotData = LinePlotData(
            lines = listOf(
                Line(
                    dataPoints = pointsData,
                    lineStyle = LineStyle(
                        lineType = LineType.SmoothCurve(isDotted = true),
                        color = pink_dark
                    ),
                    shadowUnderLine = ShadowUnderLine(
                        brush = Brush.verticalGradient(
                            listOf(
                                pink_dark,
                                transparent_color
                            )
                        ), alpha = 0.3f
                    ),
                    selectionHighlightPoint = SelectionHighlightPoint(
                        color = pink_dark
                    ),
                    selectionHighlightPopUp = SelectionHighlightPopUp(
                        backgroundColor = pink_dark,
                        labelColor = white_color,
                        labelTypeface = FontWeight.Bold,
                        textMeasurer = textMeasurer
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