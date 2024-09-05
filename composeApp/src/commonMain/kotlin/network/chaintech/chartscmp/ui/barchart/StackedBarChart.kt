package network.chaintech.chartscmp.ui.barchart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.cmpcharts.axis.AxisProperties
import network.chaintech.cmpcharts.common.components.Legends
import network.chaintech.cmpcharts.common.extensions.formatNumber
import network.chaintech.cmpcharts.common.extensions.getMaxElementInYAxis
import network.chaintech.cmpcharts.common.model.LegendsConfig
import network.chaintech.cmpcharts.ui.barchart.StackedBarChart
import network.chaintech.cmpcharts.ui.barchart.config.BarChartStyle
import network.chaintech.cmpcharts.ui.barchart.config.BarPlotData
import network.chaintech.cmpcharts.ui.barchart.config.GroupBarChartData
import network.chaintech.cmpcharts.ui.barchart.config.SelectionHighlightData
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Composable
fun VerticalStackedBarChart() {
    val barSize = 3
    val listSize = 10
    val groupBarData = getGroupBarChartData(listSize, 100, barSize)
    val yStepSize = 10
    val xAxisProperty = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepSize = 30.dp,
        stepCount = listSize - 1,
        initialDrawPadding = 48.dp,
        labelColor = font_color,
        lineColor = font_color,
        labelFormatter = { index -> "C $index" }
    )

    val yAxisProperty = AxisProperties(
        font = FontFamily(
            Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
        ),
        stepCount = yStepSize,
        labelPadding = 20.dp,
        offset = 20.dp,
        labelColor = font_color,
        lineColor = font_color,
        labelFormatter = { index ->
            val valueList = mutableListOf<Float>()
            groupBarData.map { groupBar ->
                var yMax = 0f
                groupBar.barList.forEach {
                    yMax += it.point.y
                }
                valueList.add(yMax)
            }
            val maxElementInYAxis = getMaxElementInYAxis(valueList.maxOrNull() ?: 0f, yStepSize)

            (index * (maxElementInYAxis / yStepSize)).toString()
        },
        topPadding = 36.dp
    )


    val colorPaletteList = getColorPaletteList2()
    val legendsConfig = LegendsConfig(
        legendLabelList = getLegendsLabelDataBarChart(colorPaletteList),
        gridColumnCount = 3
    )
    val groupBarPlotData = BarPlotData(
        groupBarList = groupBarData,
        barStyle = BarChartStyle(
            barWidth = 35.dp,
            selectionHighlightData = SelectionHighlightData(
                isHighlightFullBar = true,
                groupBarPopUpLabel = { name, value ->
                    "Name : C$name Value : ${value.formatNumber()}"
                }
            )
        ),
        barColorPaletteList = colorPaletteList
    )
    val groupBarChartData = GroupBarChartData(
        barPlotData = groupBarPlotData,
        xAxisProperty = xAxisProperty,
        yAxisProperty = yAxisProperty,
        paddingBetweenStackedBars = 4.dp,
        drawBar = { drawScope, barChartData, barStyle, drawOffset, height, barIndex ->
            with(drawScope) {
                drawRect(
                    color = colorPaletteList[barIndex],
                    topLeft = drawOffset,
                    size = Size(barStyle.barWidth.toPx(), height),
                    style = barStyle.barDrawStyle,
                    blendMode = barStyle.barBlendMode
                )
            }
        }
    )
    Column(
        Modifier
            .height(500.dp)
    ) {
        StackedBarChart(
            modifier = Modifier
                .height(400.dp),
            groupBarChartData = groupBarChartData
        )
        Legends(
            legendsConfig = legendsConfig
        )
    }
}