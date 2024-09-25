package network.chaintech.chartscmp.ui.barchart

import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.chartscmp.theme.gray_light
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.white_color
import network.chaintech.cmpcharts.axis.AxisProperties
import network.chaintech.cmpcharts.ui.barchart.BarChart
import network.chaintech.cmpcharts.ui.barchart.config.BarChartConfig
import network.chaintech.cmpcharts.ui.barchart.config.BarChartStyle
import network.chaintech.cmpcharts.ui.barchart.config.SelectionHighlightData
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Composable
fun BarChartWithGradientBars() {
    val maxRange = 100
    val barData = getGradientBarChartData(50, 100)
    val yStepSize = 10
    val xAxisData = AxisProperties(font =
    FontFamily(
        Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
    ),
        stepSize = 30.dp,
        stepCount = barData.size-1,
        bottomPadding = 40.dp,
        labelRotationAngle = 20f,
        initialDrawPadding = 48.dp,
        labelColor = font_color,
        lineColor = font_color,
        labelFormatter = { index -> barData[index].label }
        )

    val yAxisData = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepCount = yStepSize,
        labelPadding = 20.dp,
        offset = 20.dp,
        labelColor = font_color,
        lineColor = font_color,
        labelFormatter = { index -> (index * (maxRange / yStepSize)).toString() }
    )

    val barChartData = BarChartConfig(
        chartData = barData,
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        barStyle = BarChartStyle(paddingBetweenBars = 20.dp,
            barWidth = 35.dp,
            isGradientEnabled = true,
            selectionHighlightData = SelectionHighlightData(
                highlightBarColor = gray_light,
                highlightTextColor = white_color,
                highlightTextTypeface = FontWeight.Bold,
                highlightTextBackgroundColor = magenta_dark,
                popUpLabel = { _, y -> " Value : $y " }
            )),
        horizontalExtraSpace = 20.dp
    )
    BarChart(modifier = Modifier.height(350.dp), barChartData = barChartData)
}