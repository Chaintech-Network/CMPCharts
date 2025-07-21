package network.chaintech.chartscmp.ui.polarareachart

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import network.chaintech.chartscmp.theme.blue_dark
import network.chaintech.chartscmp.theme.blue_light
import network.chaintech.chartscmp.theme.gray_dark
import network.chaintech.chartscmp.theme.gray_light
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.green_medium
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.magenta_light
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.chartscmp.theme.pink_light
import network.chaintech.chartscmp.theme.purple_dark
import network.chaintech.cmpcharts.ui.polarareachart.PolarAreaChart
import network.chaintech.cmpcharts.ui.polarareachart.PolarAreaChartConfig
import network.chaintech.cmpcharts.ui.polarareachart.PolarChartEntry
import network.chaintech.cmpcharts.ui.polarareachart.PolarChartEntryStyle
import network.chaintech.cmpcharts.ui.polarareachart.PolarChartScaleConfig
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Bold
import network.chaintech.composeapp.generated.resources.Roboto_Medium
import org.jetbrains.compose.resources.Font

@Composable
fun PolarAreaChartDemo(modifier: Modifier) {
    val entries = listOf(
        PolarChartEntry("Jan", 10f, style = PolarChartEntryStyle(magenta_dark, alpha = 0.7f)),
        PolarChartEntry("Feb", 9.4f, style = PolarChartEntryStyle(blue_dark)),
        PolarChartEntry("Mar", 9.3f, style = PolarChartEntryStyle(gray_light)),
        PolarChartEntry("Apr", 13.5f, style = PolarChartEntryStyle(blue_light)),
        PolarChartEntry("May", 14.2f, style = PolarChartEntryStyle(gray_dark)),
        PolarChartEntry("Jun", 18.5f, style = PolarChartEntryStyle(magenta_light)),
        PolarChartEntry("Jul", 18.9f, style = PolarChartEntryStyle(green_medium)),
        PolarChartEntry(
            "Aug",
            21.9f,
            style = PolarChartEntryStyle(brushColors = listOf(pink_light, pink_dark))
        ),
        PolarChartEntry("Sep", 30.0f, style = PolarChartEntryStyle(green_dark)),
        PolarChartEntry(
            "Oct",
            26.1f,
            style = PolarChartEntryStyle(brushColors = listOf(gray_light, gray_dark))
        ),
        PolarChartEntry("Nov", 23.9f, style = PolarChartEntryStyle(purple_dark)),
        PolarChartEntry(
            "Dec",
            21.1f,
            style = PolarChartEntryStyle(brushColors = listOf(gray_light, green_dark))
        )
    )

    val chartConfig = PolarAreaChartConfig(
        entries = entries,
        maxValue = 30f,
        polarChartScaleConfig = PolarChartScaleConfig(
            scaleSteps = 3,
            scaleColor = Color.LightGray,
            scaleStrokeWidth = 1.dp,
        ),
        scaleTextStyle = TextStyle(
            fontSize = 10.sp, color = Color.DarkGray, fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Medium)
            )
        ),
        sliceValueTextStyle = TextStyle(
            fontSize = 9.sp, color = Color(0xFFFFFFF2), fontFamily = FontFamily(
                Font(Res.font.Roboto_Bold, weight = FontWeight.Bold)
            )
        ),
        sliceLabelTextStyle = TextStyle(
            fontSize = 11.sp, color = Color.DarkGray, fontFamily = FontFamily(
                Font(Res.font.Roboto_Bold, weight = FontWeight.Bold)
            )
        ),
        labelPadding = 12.dp,
        showCategoryLabels = true,
        showValueLabels = true,
        showScaleLabels = true,
        scaleLabelSuffix = ""
    )

    PolarAreaChart(
        modifier = modifier,
        config = chartConfig
    )
}