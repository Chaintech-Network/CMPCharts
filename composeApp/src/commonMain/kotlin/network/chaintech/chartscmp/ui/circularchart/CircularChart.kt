package network.chaintech.chartscmp.ui.circularchart

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import network.chaintech.chartscmp.theme.blue_dark
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.yellow_dark
import network.chaintech.cmpcharts.ui.circularchart.CircularChart
import network.chaintech.cmpcharts.ui.circularchart.model.CircularBarChartEntry
import network.chaintech.cmpcharts.ui.circularchart.style.CircularChartStyle
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Medium
import org.jetbrains.compose.resources.Font

@Composable
fun CircularChartDemo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
        contentAlignment = Alignment.TopStart
    ) {
        CircularChart(
            chartListData = getMockSpiralChartList(),
            chartStyle = CircularChartStyle(
                chartSize = 200.dp, strokeWidth = 20.dp,
                fontFamily = FontFamily(
                    Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
                )
            ),
        )
    }
}

fun getMockSpiralChartList() = listOf(
    CircularBarChartEntry(value = 100F, "Activity A", green_dark, 200),
    CircularBarChartEntry(value = 80F, "Activity B", blue_dark, 200),
    CircularBarChartEntry(value = 150F, "Activity C", yellow_dark, 200),
)