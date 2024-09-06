package network.chaintech.chartscmp.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.dp
import kotlin.random.Random
import network.chaintech.chartscmp.theme.blue_dark
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.cmpcharts.axis.AxisData
import network.chaintech.cmpcharts.common.extensions.formatToSinglePrecision
import network.chaintech.cmpcharts.common.model.Point
import network.chaintech.cmpcharts.common.ui.GridLinesUtil
import network.chaintech.cmpcharts.common.ui.SelectionHighlightPoint
import network.chaintech.cmpcharts.common.ui.SelectionHighlightPopUp
import network.chaintech.cmpcharts.ui.bubblechart.BubbleChart
import network.chaintech.cmpcharts.ui.bubblechart.model.Bubble
import network.chaintech.cmpcharts.ui.bubblechart.model.BubbleChartData
import network.chaintech.cmpcharts.ui.bubblechart.model.BubbleGradientType
import network.chaintech.cmpcharts.ui.bubblechart.model.BubbleStyle
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Composable
fun GradientBubbleChart(pointsData: List<Point>) {
    val steps = 5
    val textMeasurer = rememberTextMeasurer()
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisLineColor(lineColor = font_color)
        .axisStepSize(30.dp)
        .steps(pointsData.size - 1)
        .labelData { i -> pointsData[i].x.toInt().toString() }
        .labelAndAxisLinePadding(15.dp)
        .build()

    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            ),
        )
        .axisLineColor(lineColor = font_color)
        .steps(steps)
        .labelAndAxisLinePadding(15.dp)
        .labelData { i ->
            // Add yMin to get the negative axis values to the scale
            val yMin = pointsData.minOf { it.y }
            val yMax = pointsData.maxOf { it.y }
            val yScale = (yMax - yMin) / steps
            ((i * yScale) + yMin).formatToSinglePrecision()
        }.build()

    val data = BubbleChartData(
        getBubbleChartDataWithGradientStyle(points = pointsData, textMeasurer = textMeasurer),
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        gridLines = GridLinesUtil()
    )

    BubbleChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp),
        bubbleChartData = data
    )

}

@Composable
fun SolidBubbleChart(pointsData: List<Point>) {
    val steps = 5
    val textMeasurer = rememberTextMeasurer()
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisLineColor(lineColor = font_color)
        .axisStepSize(30.dp)
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
        .axisLineColor(lineColor = font_color)
        .steps(steps)
        .labelAndAxisLinePadding(15.dp)
        .labelData { i ->
            val yMin = pointsData.minOf { it.y }
            val yMax = pointsData.maxOf { it.y }
            val yScale = (yMax - yMin) / steps
            ((i * yScale) + yMin).formatToSinglePrecision()
        }.build()

    val data = BubbleChartData(
        getBubbleChartDataWithSolidStyle(points = pointsData, textMeasurer = textMeasurer),
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        gridLines = GridLinesUtil()
    )

    BubbleChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp),
        bubbleChartData = data
    )
}

fun getBubbleChartDataWithGradientStyle(
    points: List<Point>,
    minDensity: Float = 10F,
    maxDensity: Float = 100F,
    textMeasurer: TextMeasurer
): List<Bubble> {
    val list = arrayListOf<Bubble>()
    points.forEach { point ->
        val bubbleGradientList1 =
            listOf(Color(0xFFFFE595), Color(0xFFD2B147), Color(0xFFFFF6DB), Color(0xFFE8CA6E))
        val bubbleGradientList2 =
            listOf(Color(0xFFEDC2FF), Color(0xFFB37ACB), Color(0xFFF8E6FF), Color(0xFFCF99E5))
        val bubbleGradientList3 =
            listOf(Color(0xFFFFAAB0), Color(0xFFCE6870), Color(0xFFFFECEE), Color(0xFFCE6870))
        val bubbleGradientList4 =
            listOf(Color(0xFF83F4B9), Color(0xFF37AA6E), Color(0xFFD0FEE6), Color(0xFF6EDAA2))

        when (Random.nextInt(1, 4)) {
            1 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(
                            gradientColors = bubbleGradientList1,
                            useGradient = true,
                            tileMode = TileMode.Repeated,
                            gradientType = BubbleGradientType.LinearGradient
                        ),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }

            2 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(
                            gradientColors = bubbleGradientList2,
                            useGradient = true,
                            tileMode = TileMode.Repeated,
                            gradientType = BubbleGradientType.LinearGradient
                        ),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }

            3 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(
                            gradientColors = bubbleGradientList3,
                            useGradient = true,
                            tileMode = TileMode.Repeated,
                            gradientType = BubbleGradientType.LinearGradient
                        ),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }

            4 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(
                            gradientColors = bubbleGradientList4,
                            useGradient = true,
                            tileMode = TileMode.Repeated,
                            gradientType = BubbleGradientType.LinearGradient
                        ),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }
        }
    }
    return list
}

fun getBubbleChartDataWithSolidStyle(
    points: List<Point>,
    minDensity: Float = 10F,
    maxDensity: Float = 100F,
    textMeasurer: TextMeasurer
): List<Bubble> {
    val list = arrayListOf<Bubble>()
    points.forEachIndexed { index, point ->
        val bubbleColor1 = blue_dark
        val bubbleColor2 = magenta_dark
        val bubbleColor3 = green_dark
        val bubbleColor4 = pink_dark
        when (Random.nextInt(1, 4)) {
            1 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(solidColor = bubbleColor1, useGradient = false),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }

            2 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(solidColor = bubbleColor2, useGradient = false),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }

            3 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(solidColor = bubbleColor3, useGradient = false),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }

            4 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(solidColor = bubbleColor4, useGradient = false),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }
        }
    }
    return list
}