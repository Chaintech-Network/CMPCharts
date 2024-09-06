package network.chaintech.chartscmp.ui.pointchart

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import network.chaintech.chartsLib.common.ChartDataCollection
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.green_light
import network.chaintech.chartscmp.theme.white_color
import network.chaintech.cmpcharts.common.model.ChartDefaults
import network.chaintech.cmpcharts.ui.pointchart.PointChart
import network.chaintech.cmpcharts.ui.pointchart.config.PointType
import network.chaintech.cmpcharts.ui.pointchart.model.PointData
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Bold
import org.jetbrains.compose.resources.Font

@Composable
fun PointChartDemo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        contentAlignment = Alignment.Center
    ) {
        PointChart(
            dataCollection = ChartDataCollection(getPointChartList()),
            pointType = PointType.Fill,
            modifier = Modifier
                .size(400.dp),
            chartColors = ChartDefaults.colorDefaults().copy(
                backgroundColors = white_color,
                contentColor = green_dark
            ),
            axisConfig = ChartDefaults.axisConfigDefaults().copy(
                axisColor = font_color,
                gridColor = green_light,
                axisLabelFontFamily = FontFamily(
                    Font(Res.font.Roboto_Bold, weight = FontWeight.Bold)
                ),
                minLabelCount = 3
            )
        )
    }
}

fun getPointChartList() = listOf(
    PointData(0F, "Jan"),
    PointData(10F, "Feb"),
    PointData(05F, "Mar"),
    PointData(50F, "Apr"),
    PointData(55F, "May"),
    PointData(03F, "June"),
    PointData(9F, "July"),
    PointData(40F, "Aug"),
    PointData(60F, "Sept"),
    PointData(33F, "Oct"),
    PointData(11F, "Nov"),
)