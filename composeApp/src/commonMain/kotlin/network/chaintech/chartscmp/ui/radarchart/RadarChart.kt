package network.chaintech.chartscmp.ui.radarchart

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import network.chaintech.chartscmp.theme.blue_medium
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.chartscmp.theme.gray_medium
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.green_medium
import network.chaintech.cmpcharts.ui.radarchart.RadarChart
import network.chaintech.cmpcharts.ui.radarchart.config.RadarChartConfig
import network.chaintech.cmpcharts.ui.radarchart.config.RadarChartDataSet
import network.chaintech.cmpcharts.ui.radarchart.config.RadarChartDataSetStyle
import network.chaintech.cmpcharts.ui.radarchart.config.RadarChartLineStyle
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Medium
import network.chaintech.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Composable
fun RadarChartDemo(modifier: Modifier) {
    RadarChart(
        modifier = modifier,
        radarChartConfig = RadarChartConfig(
            sideLength = 5,
            maxLabelWidth = 25.dp,
            scaleStepsCount = 5,
            radarChartDataSet = listOf(
                RadarChartDataSet(
                    style = RadarChartDataSetStyle(
                        color = blue_medium,
                        strokeCap = StrokeCap.Butt,
                        strokeWidth = 1.0f,
                        colorAlpha = 0.3f,
                        borderColor = font_color
                    ),
                    data = listOf(117.0, 180.0, 120.0, 145.0, 85.0)
                ),
                RadarChartDataSet(
                    style = RadarChartDataSetStyle(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                green_dark,
                                green_medium
                            )
                        ),
                        colorAlpha = 0.1f,
                        strokeCap = StrokeCap.Butt,
                        strokeWidth = 1.0f,
                        borderColor = font_color
                    ), data = listOf(110.0, 150.0, 120.0, 190.0, 35.0)
                ),
            ),
            radarChartLineStyle = RadarChartLineStyle(
                color = gray_medium,
                strokeCap = StrokeCap.Butt,
                strokeWidth = 1f
            ),
            scaleTextStyle = TextStyle(
                color = Color.Black,
                fontSize = 11.sp,
                fontFamily = FontFamily(
                    Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
                )
            ),
            labelTextStyle = TextStyle(
                color = Color.Black,
                fontSize = 12.sp,
                fontFamily = FontFamily(
                    Font(Res.font.Roboto_Medium, weight = FontWeight.Medium)
                )
            ),
            maxScaleValue = 200.0,
            scaleUnit = "cm",
            radarSegmentsLabels = listOf("A", "B", "C", "D", "E")
        )
    )
}