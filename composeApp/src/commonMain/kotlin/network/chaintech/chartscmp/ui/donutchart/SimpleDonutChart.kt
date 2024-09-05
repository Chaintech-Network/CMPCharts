package network.chaintech.chartscmp.ui.donutchart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.cmpcharts.common.components.Legends
import network.chaintech.cmpcharts.ui.piechart.charts.DonutPieChart
import network.chaintech.cmpcharts.ui.piechart.models.PieChartConfig
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Medium
import org.jetbrains.compose.resources.Font

@Composable
fun SimpleDonutChart() {
    val data = getDonutChartData()
    val pieChartConfig =
        PieChartConfig(
            labelVisible = true,
            strokeWidth = 120f,
            labelColor = font_color,
            activeSliceAlpha = .9f,
            isEllipsizeEnabled = true,
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
            ),
            labelFontWeight = FontWeight.Bold,
            isAnimationEnable = true,
            chartPadding = 25,
            labelFontSize = 42.sp,
        )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
    ) {
        Legends(
            legendsConfig = getLegendsConfigFromPieChartDataForDonutChart(
                pieChartData = data,
                3
            )
        )
        DonutPieChart(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            data,
            pieChartConfig
        ) { slice ->

        }
    }
}