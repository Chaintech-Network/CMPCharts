package network.chaintech.chartscmp.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import network.chaintech.chartsLib.common.ComposeList
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.chartscmp.theme.gray_light
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.chartscmp.theme.yellow_dark
import network.chaintech.cmpcharts.common.model.ChartDefaults
import network.chaintech.cmpcharts.ui.areachart.AreaChart
import network.chaintech.cmpcharts.ui.areachart.model.AreaData
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Bold
import org.jetbrains.compose.resources.Font

@Composable
fun AreaChartDemo() {
    Box(
        modifier = Modifier
            .wrapContentSize()
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        AreaChart(
            modifier = Modifier
                .size(400.dp),
            areaData = ComposeList(
                getAreaData()
            ),
            axisConfig = ChartDefaults.axisConfigDefaults().copy(
                axisColor = font_color,
                showGridLabel = true,
                gridColor = gray_light,
                axisLabelFontFamily = FontFamily(
                    Font(Res.font.Roboto_Bold, weight = FontWeight.Bold)
                ),
            )
        )
    }
}

fun getAreaData() = listOf(
    AreaData(
        points = listOf(0.5f, 0.8f, 0.6f, 0.9f, 0.7f, 0.4f),
        xValue = "Item 1",
        color = yellow_dark
    ),
    AreaData(
        xValue = "Item 2",
        points = listOf(0.33f, 0.6f, 0.93f, 0.7f, 0.9f, 1.5f),
        color = pink_dark
    ),
    AreaData(
        xValue = "Item 3",
        points = listOf(0.3f, 0.6f, 0.4f, 0.7f, 0.9f, 0.3f),
        color = green_dark
    ),
)