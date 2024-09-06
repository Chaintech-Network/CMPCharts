package network.chaintech.chartscmp.ui.barchart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.cmpcharts.axis.AxisProperties
import network.chaintech.cmpcharts.common.components.Legends
import network.chaintech.cmpcharts.common.model.LegendsConfig
import network.chaintech.cmpcharts.ui.barchart.GroupBarChart
import network.chaintech.cmpcharts.ui.barchart.config.BarChartStyle
import network.chaintech.cmpcharts.ui.barchart.config.BarPlotData
import network.chaintech.cmpcharts.ui.barchart.config.GroupBarChartData
import network.chaintech.cmpcharts.ui.barchart.config.GroupSeparatorProperties
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Composable
fun VerticalGroupBarChart() {
    val maxRange = 100
    val barSize = 3
    val groupBarData = getGroupBarChartData(50, maxRange, barSize)
    val yStepSize = 10
    val xAxisProperty = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepSize = 30.dp,
        bottomPadding = 5.dp,
        initialDrawPadding = 48.dp,
        labelColor = font_color,
        lineColor = font_color,
        labelFormatter = { index -> index.toString() }
    )

    val yAxisProperty = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepCount = yStepSize,
        bottomPadding = 20.dp,
        initialDrawPadding = 20.dp,
        labelColor = font_color,
        lineColor = font_color,
        labelFormatter = { index -> (index * (maxRange / yStepSize)).toString() }
    )

    val colorPaletteList = getColorPaletteList1()
    val legendsConfig = LegendsConfig(
        legendLabelList = getLegendsLabelDataBarChart(colorPaletteList),
        gridColumnCount = 3
    )
    val groupBarPlotData = BarPlotData(
        groupBarList = groupBarData,
        barStyle = BarChartStyle(barWidth = 35.dp),
        barColorPaletteList = colorPaletteList
    )
    val groupBarChartData = GroupBarChartData(
        barPlotData = groupBarPlotData,
        xAxisProperty = xAxisProperty,
        yAxisProperty = yAxisProperty,
        groupSeparatorConfig = GroupSeparatorProperties(0.dp)
    )
    Column(
        Modifier
            .height(450.dp)
    ) {
        GroupBarChart(
            modifier = Modifier
                .height(400.dp),
            groupBarChartData = groupBarChartData
        )
        Legends(
            legendsConfig = legendsConfig
        )
    }
}
