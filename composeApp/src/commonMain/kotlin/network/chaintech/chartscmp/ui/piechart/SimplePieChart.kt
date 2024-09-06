package network.chaintech.chartscmp.ui.piechart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import network.chaintech.chartscmp.theme.white_color
import network.chaintech.cmpcharts.common.components.Legends
import network.chaintech.cmpcharts.ui.piechart.charts.PieChart
import network.chaintech.cmpcharts.ui.piechart.models.PieChartConfig
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Medium
import org.jetbrains.compose.resources.Font

@Composable
fun SimplePieChart() {
    val pieChartData = getPieChartData()
    val pieChartConfig =
        PieChartConfig(
            labelVisible = true,
            activeSliceAlpha = .9f,
            isEllipsizeEnabled = true,
            sliceLabelTypeface = FontWeight.Bold,
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
            ),
            isAnimationEnable = true,
            chartPadding = 30,
            backgroundColor = white_color,
            showSliceLabels = false,
            animationDuration = 1500
        )
    Column(modifier = Modifier.height(500.dp)) {
        Spacer(modifier = Modifier.height(20.dp))
        Legends(legendsConfig = getLegendsConfigFromPieChartData(pieChartData, 3))
        PieChart(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            pieChartData,
            pieChartConfig
        ) { slice ->

        }
    }
}