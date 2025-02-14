package network.chaintech.chartscmp.ui.piechart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import network.chaintech.cmpcharts.common.components.Legends
import network.chaintech.cmpcharts.ui.piechart.charts.PieChart
import network.chaintech.cmpcharts.ui.piechart.models.PieChartConfig
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Medium
import org.jetbrains.compose.resources.Font

@Composable
fun PieChartWithSliceLabels() {
    val pieChartData = getPieChartData2()

    val pieChartConfig =
        PieChartConfig(
            activeSliceAlpha = .9f,
            isEllipsizeEnabled = true,
            sliceLabelTypeface = FontWeight.Bold,
            isAnimationEnable = true,
            chartPadding = 20,
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
            ),
            showSliceLabels = true,
            showSlicePercentageLabels = true,
            labelVisible = true
        )
    Column(modifier = Modifier.height(500.dp)) {
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