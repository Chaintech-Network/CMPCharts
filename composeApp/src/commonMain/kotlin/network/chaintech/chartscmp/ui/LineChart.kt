package network.chaintech.chartscmp.ui

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
import network.chaintech.chartscmp.theme.gray_dark
import network.chaintech.chartscmp.theme.gray_light
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.chartscmp.theme.purple_dark
import network.chaintech.chartscmp.theme.transparent_color
import network.chaintech.chartscmp.theme.white_color
import network.chaintech.chartscmp.theme.yellow_dark
import network.chaintech.chartscmp.theme.yellow_light
import network.chaintech.cmpcharts.axis.AxisData
import network.chaintech.cmpcharts.common.components.Legends
import network.chaintech.cmpcharts.common.extensions.formatNumber
import network.chaintech.cmpcharts.common.extensions.formatToSinglePrecision
import network.chaintech.cmpcharts.common.model.LegendLabel
import network.chaintech.cmpcharts.common.model.LegendsConfig
import network.chaintech.cmpcharts.common.model.Point
import network.chaintech.cmpcharts.common.ui.GridLinesUtil
import network.chaintech.cmpcharts.common.ui.SelectionHighlightPoint
import network.chaintech.cmpcharts.common.ui.SelectionHighlightPopUp
import network.chaintech.cmpcharts.common.ui.ShadowUnderLine
import network.chaintech.cmpcharts.ui.linechart.LineChart
import network.chaintech.cmpcharts.ui.linechart.model.Line
import network.chaintech.cmpcharts.ui.linechart.model.LineChartData
import network.chaintech.cmpcharts.ui.linechart.model.LinePlotData
import network.chaintech.cmpcharts.ui.linechart.model.LineStyle
import network.chaintech.cmpcharts.ui.linechart.model.LineType
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Composable
fun SingleLineChartWithGridLines(pointsData: List<Point>) {
    val textMeasurer = rememberTextMeasurer()
    val steps = 5
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(30.dp)
        .topPadding(105.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .steps(pointsData.size - 1)
        .labelData { i -> pointsData[i].x.toInt().toString() }
        .labelAndAxisLinePadding(15.dp)
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(steps)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelAndAxisLinePadding(20.dp)
        .labelData { i ->
            val yMin = pointsData.minOf { it.y }
            val yMax = pointsData.maxOf { it.y }
            val yScale = (yMax - yMin) / steps
            ((i * yScale) + yMin).formatToSinglePrecision()
        }.build()
    val data = LineChartData(
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
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        gridLines = GridLinesUtil(color = gray_light)
    )
    LineChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        lineChartData = data
    )
}

@Composable
fun StraightLineChart(pointsData: List<Point>) {
    val textMeasurer = rememberTextMeasurer()
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(40.dp)
        .steps(pointsData.size - 1)
        .labelData { i -> (1900 + i).toString() }
        .axisLabelAngle(20f)
        .labelAndAxisLinePadding(15.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .typeFace(FontWeight.Bold)
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(10)
        .labelData { i -> "${(i * 20)}k" }
        .labelAndAxisLinePadding(30.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .typeFace(FontWeight.Bold)
        .build()
    val data = LineChartData(
        linePlotData = LinePlotData(
            lines = listOf(
                Line(
                    dataPoints = pointsData,
                    lineStyle = LineStyle(lineType = LineType.Straight(), color = magenta_dark),
                    intersectionPoint = IntersectionPoint(color = yellow_dark),
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
                )
            )
        ),
        xAxisData = xAxisData,
        yAxisData = yAxisData
    )
    LineChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        lineChartData = data
    )
}

@Composable
fun MultipleToneLineChart(pointsData: List<Point>) {
    val textMeasurer = rememberTextMeasurer()
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(40.dp)
        .steps(pointsData.size - 1)
        .labelData { i -> (1900 + i).toString() }
        .axisLabelAngle(20f)
        .labelAndAxisLinePadding(15.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .typeFace(FontWeight.Bold)
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(10)
        .labelData { i -> "${(i * 20)}k" }
        .labelAndAxisLinePadding(30.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .typeFace(FontWeight.Bold)
        .build()
    val data = LineChartData(
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
        xAxisData = xAxisData,
        yAxisData = yAxisData
    )
    LineChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        lineChartData = data
    )
}

@Composable
fun DashedLineChart(pointsData: List<Point>) {
    val textMeasurer = rememberTextMeasurer()
    val steps = 10
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(40.dp)
        .steps(pointsData.size - 1)
        .labelData { i -> i.toString() }
        .labelAndAxisLinePadding(15.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(steps)
        .labelData { i ->
            val yMin = pointsData.minOf { it.y }
            val yMax = pointsData.maxOf { it.y }
            val yScale = (yMax - yMin) / steps
            ((i * yScale) + yMin).formatToSinglePrecision()
        }
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelAndAxisLinePadding(20.dp)
        .build()
    val data = LineChartData(
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
        xAxisData = xAxisData,
        yAxisData = yAxisData
    )
    LineChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        lineChartData = data
    )
}

@Composable
fun CombinedLineChart(pointsData: List<Point>) {
    val textMeasurer = rememberTextMeasurer()
    val steps = 5
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(30.dp)
        .steps(pointsData.size - 1)
        .labelData { i -> i.toString() }
        .labelAndAxisLinePadding(15.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(steps)
        .labelAndAxisLinePadding(20.dp)
        .labelData { i ->
            val yMin = pointsData.minOf { it.y }
            val yMax = pointsData.maxOf { it.y }
            val yScale = (yMax - yMin) / steps
            ((i * yScale) + yMin).formatToSinglePrecision()
        }.build()
    val colorPaletteList = listOf<Color>(magenta_dark, green_dark, purple_dark, blue_dark)
    val legendsConfig = LegendsConfig(
        legendLabelList = getLegendsLabelData(colorPaletteList),
        gridColumnCount = 4
    )
    val data = LineChartData(
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
                                green_dark,
                                transparent_color
                            )
                        ), alpha = 0.5f
                    ),
                    SelectionHighlightPopUp(
                        textMeasurer = textMeasurer,
                        backgroundColor = pink_dark,
                        labelColor = white_color,
                        labelTypeface = FontWeight.Bold
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
                        labelTypeface = FontWeight.Bold
                    )
                )
            )
        ),
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        gridLines = GridLinesUtil()
    )

    Column(modifier = Modifier.height(400.dp)) {
        LineChart(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            lineChartData = data
        )
        Legends(
            legendsConfig = legendsConfig
        )
    }
}

@Composable
fun CombinedLineChartWithBackground(pointsData: List<Point>) {
    val textMeasurer = rememberTextMeasurer()
    val steps = 5
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(30.dp)
        .steps(pointsData.size - 1)
        .backgroundColor(yellow_light)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { i -> i.toString() }
        .labelAndAxisLinePadding(15.dp)
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(steps)
        .backgroundColor(yellow_light)
        .labelAndAxisLinePadding(20.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { i ->
            val yMin = pointsData.minOf { it.y }
            val yMax = pointsData.maxOf { it.y }
            val yScale = (yMax - yMin) / steps
            ((i * yScale) + yMin).formatToSinglePrecision()
        }.build()
    val colorPaletteList = listOf<Color>(magenta_dark, green_dark, purple_dark, blue_dark)
    val legendsConfig = LegendsConfig(
        legendLabelList = getLegendsLabelData(colorPaletteList),
        gridColumnCount = 4
    )
    val data = LineChartData(
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
        xAxisData = xAxisData,
        yAxisData = yAxisData,
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
            lineChartData = data
        )
        Legends(
            legendsConfig = legendsConfig
        )
    }
}

fun getLegendsLabelData(colorPaletteList: List<Color>): List<LegendLabel> {
    val legendLabelList = mutableListOf<LegendLabel>()
    for (index in colorPaletteList.indices) {
        legendLabelList.add(
            LegendLabel(
                colorPaletteList[index],
                "B$index"
            )
        )
    }
    return legendLabelList
}

fun getLineChartData(listSize: Int, start: Int = 0, maxRange: Int): List<Point> {
    val list = arrayListOf<Point>()
    for (index in 0 until listSize) {
        list.add(
            Point(
                index.toFloat(),
                (start until maxRange).random().toFloat()
            )
        )
    }
    return list
}