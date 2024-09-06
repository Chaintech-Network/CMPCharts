package network.chaintech.chartscmp.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.chartscmp.theme.pink_light
import network.chaintech.chartscmp.theme.yellow_dark
import network.chaintech.cmpcharts.ui.gaugechart.GaugeChart
import network.chaintech.cmpcharts.ui.gaugechart.config.GaugeChartDefaults

@Composable
fun GaugeChartDemo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        GaugeChart(percentValue = getPercentValue(), gaugeChartConfig = GaugeChartDefaults.gaugeConfigDefaults().copy(
            primaryColor = pink_dark, placeHolderColor = pink_light, indicatorColor = yellow_dark
        ), needleConfig = GaugeChartDefaults.needleConfigDefaults().copy(
            color = green_dark
        ))
    }
}

fun getPercentValue() = 60