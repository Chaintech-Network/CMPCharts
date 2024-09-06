package network.chaintech.chartscmp.ui.linechart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.dp
import network.chaintech.chartsLib.ui.linechart.model.IntersectionPoint
import network.chaintech.chartscmp.theme.blue_dark
import network.chaintech.chartscmp.theme.blue_light
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.chartscmp.theme.purple_dark
import network.chaintech.chartscmp.theme.transparent_color
import network.chaintech.chartscmp.theme.white_color
import network.chaintech.chartscmp.theme.yellow_light
import network.chaintech.cmpcharts.axis.AxisProperties
import network.chaintech.cmpcharts.common.components.Legends
import network.chaintech.cmpcharts.common.extensions.formatNumber
import network.chaintech.cmpcharts.common.extensions.formatToSinglePrecision
import network.chaintech.cmpcharts.common.model.LegendsConfig
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
import network.chaintech.cmpcharts.ui.linechart.model.LineType
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Composable
fun CombinedLineChartWithBackground(pointsData: List<Point>) {
    val textMeasurer = rememberTextMeasurer()
    val steps = 5
    val xAxisProperties = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepSize = 30.dp,
        stepCount = pointsData.size - 1,
        background = yellow_light,
        labelColor = font_color,
        lineColor = font_color,
        labelFormatter = { i -> i.toString() },
        labelPadding = 15.dp
    )

    val yAxisProperties = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepCount = steps,
        background = yellow_light,
        labelPadding = 20.dp,
        labelColor = font_color,
        lineColor = font_color,
        labelFormatter = { i ->
            val yMin = pointsData.minOf { it.y }
            val yMax = pointsData.maxOf { it.y }
            val yScale = (yMax - yMin) / steps
            ((i * yScale) + yMin).formatToSinglePrecision()
        }
    )

    val colorPaletteList = listOf<Color>(magenta_dark, green_dark, purple_dark, blue_dark)
    val legendsConfig = LegendsConfig(
        legendLabelList = getLegendsLabelData(colorPaletteList),
        gridColumnCount = 4
    )
    val lineChartProperties = LineChartProperties(
        linePlotData = LinePlotData(
            lines = listOf(
                Line(
                    dataPoints = pointsData,
                    lineStyle = LineStyle(
                        lineType = LineType.SmoothCurve(isDotted = true),
                        color = colorPaletteList.first()
                    ),
                    shadowUnderLine = ShadowUnderLine(
                        brush = Brush.verticalGradient(
                            listOf(
                                magenta_dark,
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
                ),
                Line(
                    dataPoints = pointsData.subList(10, 20),
                    lineStyle = LineStyle(
                        lineType = LineType.SmoothCurve(),
                        color = colorPaletteList[1]
                    ),
                    intersectionPoint = IntersectionPoint(color = Color.Red),
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
                ),
                Line(
                    dataPoints = getLineChartData(
                        20,
                        start = 0,
                        maxRange = 50
                    ),
                    LineStyle(color = colorPaletteList[2]),
                    IntersectionPoint(),
                    SelectionHighlightPoint(),
                    shadowUnderLine = ShadowUnderLine(
                        brush = Brush.verticalGradient(
                            listOf(
                                blue_dark,
                                transparent_color
                            )
                        ), alpha = 0.5f
                    ),
                    SelectionHighlightPopUp(
                        textMeasurer = textMeasurer,
                        backgroundColor = pink_dark,
                        labelColor = white_color,
                        labelTypeface = FontWeight.Bold,
                    )
                ),
                Line(
                    dataPoints = pointsData.subList(10, 20),
                    LineStyle(color = colorPaletteList[3]),
                    IntersectionPoint(),
                    SelectionHighlightPoint(),
                    ShadowUnderLine(),
                    SelectionHighlightPopUp(
                        textMeasurer = textMeasurer,
                        backgroundColor = pink_dark,
                        labelColor = white_color,
                        labelTypeface = FontWeight.Bold,
                    )
                )
            )
        ),
        xAxisProperties = xAxisProperties,
        yAxisProperties = yAxisProperties,
        gridLines = GridLinesUtil(
            color = blue_light,
            lineWidth = 0.5.dp
        ),
        backgroundColor = yellow_light
    )

    Column(
        modifier = Modifier
            .height(400.dp)
    ) {
        LineChart(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            lineChartProperties = lineChartProperties
        )
        Legends(
            legendsConfig = legendsConfig
        )
    }
}