package network.chaintech.chartscmp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import network.chaintech.cmpcharts.ui.bottlecharts.BottleChart
import network.chaintech.cmpcharts.ui.bottlecharts.model.BottleChartConfig
import network.chaintech.cmpcharts.ui.bottlecharts.model.BottleColorStyle

@Composable
fun BottleChartDemo() {
    BottleChart(
        bottleChartConfig = BottleChartConfig(
            bottleHeight= 300.dp,
            bottleWidth = 200.dp,
            bottleCorkWidth = 220.dp,
            bottleCorkHeight = 93.0.dp,
            bottleColorStyle = BottleColorStyle(
                 bottleColor = Color(0x66E3E3E3),
                 bottleFluidColor = Color(0xFF59A7D9),
                 bottleCorkColor = Color(0xFF40291D)
            ),
            bottleFilledProgressPercent = 0.6f,
            shouldAnimateProgress = true,
            animationDurationMillis = 1500
        )
    )
}