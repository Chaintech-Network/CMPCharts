package network.chaintech.chartscmp.ui.bubblechart

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.dp
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.cmpcharts.axis.AxisProperties
import network.chaintech.cmpcharts.common.extensions.formatToSinglePrecision
import network.chaintech.cmpcharts.common.model.Point
import network.chaintech.cmpcharts.common.ui.GridLinesUtil
import network.chaintech.cmpcharts.ui.bubblechart.BubbleChart
import network.chaintech.cmpcharts.ui.bubblechart.model.BubbleChartData
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Composable
fun GradientBubbleChart(pointsData: List<Point>) {
    val steps = 5
    val textMeasurer = rememberTextMeasurer()
    val xAxisProperties = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        lineColor = font_color,
        stepSize = 30.dp,
        stepCount = pointsData.size - 1,
        labelFormatter = { i -> pointsData[i].x.toInt().toString() },
        labelPadding = 15.dp
    )

    val yAxisProperties = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        lineColor = font_color,
        stepCount = steps,
        labelPadding = 15.dp,
        labelFormatter = { i ->
            val yMin = pointsData.minOf { it.y }
            val yMax = pointsData.maxOf { it.y }
            val yScale = (yMax - yMin) / steps
            ((i * yScale) + yMin).formatToSinglePrecision()
        }
    )

    val data = BubbleChartData(
        getBubbleChartDataWithGradientStyle(points = pointsData, textMeasurer = textMeasurer),
        xAxisProperties = xAxisProperties,
        yAxisProperties = yAxisProperties,
        gridLines = GridLinesUtil()
    )

    BubbleChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp),
        bubbleChartData = data
    )

}