package network.chaintech.chartscmp.ui.barchart

import androidx.compose.ui.graphics.Color
import kotlin.random.Random
import network.chaintech.chartscmp.theme.blue_dark
import network.chaintech.chartscmp.theme.blue_light
import network.chaintech.chartscmp.theme.blue_medium
import network.chaintech.chartscmp.theme.gray_dark
import network.chaintech.chartscmp.theme.gray_medium
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.green_light
import network.chaintech.chartscmp.theme.green_medium
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.magenta_light
import network.chaintech.chartscmp.theme.magenta_medium
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.chartscmp.theme.pink_light
import network.chaintech.chartscmp.theme.pink_medium
import network.chaintech.chartscmp.theme.purple_dark
import network.chaintech.chartscmp.theme.purple_light
import network.chaintech.chartscmp.theme.purple_medium
import network.chaintech.chartscmp.theme.yellow_dark
import network.chaintech.chartscmp.theme.yellow_light
import network.chaintech.chartscmp.theme.yellow_medium
import network.chaintech.cmpcharts.axis.DataCategorySettings
import network.chaintech.cmpcharts.common.extensions.formatNumber
import network.chaintech.cmpcharts.common.model.LegendLabel
import network.chaintech.cmpcharts.common.model.Point
import network.chaintech.cmpcharts.ui.barchart.config.BarChartType
import network.chaintech.cmpcharts.ui.barchart.config.BarData
import network.chaintech.cmpcharts.ui.barchart.config.GroupBar

fun getLegendsLabelDataBarChart(colorPaletteList: List<Color>): List<LegendLabel> {
    val legendLabelList = mutableListOf<LegendLabel>()
    for (index in colorPaletteList.indices) {
        legendLabelList.add(
            LegendLabel(
                colorPaletteList[index],
                "B$index"
            )
        )
    }
    return legendLabelList
}

fun getBarChartData(
    listSize: Int,
    maxRange: Int,
    barChartType: BarChartType,
    dataCategorySettings: DataCategorySettings
): List<BarData> {
    val list = arrayListOf<BarData>()
    for (index in 0 until listSize) {
        val point = when (barChartType) {
            BarChartType.VERTICAL -> {
                Point(
                    index.toFloat(),
                    Random.nextDouble(1.0, maxRange.toDouble()).formatNumber().toFloat()
                )
            }

            BarChartType.HORIZONTAL -> {
                Point(
                    Random.nextDouble(1.0, maxRange.toDouble()).formatNumber().toFloat(),
                    index.toFloat()
                )
            }
        }

        list.add(
            BarData(
                point = point,
                color = getBarColor(Random.nextInt(0, 20)),
                dataCategorySettings = dataCategorySettings,
                label = "${index + 1}",
            )
        )
    }
    return list
}

private fun getBarColor(randomIndex: Int = 5): Color {
    return listColors[randomIndex]
}

val listColors = listOf(
    gray_dark,
    gray_medium,
    yellow_dark,
    yellow_medium,
    yellow_light,
    green_dark,
    green_medium,
    green_light,
    blue_dark,
    blue_medium,
    blue_light,
    pink_dark,
    pink_medium,
    pink_light,
    magenta_dark,
    magenta_medium,
    magenta_light,
    purple_dark,
    purple_medium,
    purple_light
)

fun getGradientBarChartData(listSize: Int, maxRange: Int): List<BarData> {
    val list = arrayListOf<BarData>()
    for (index in 0 until listSize) {
        list.add(
            BarData(
                point = Point(
                    index.toFloat(),
                    Random.nextDouble(1.0, maxRange.toDouble()).formatNumber().toFloat()
                ),
                gradientColorList = getRandomGradient(Random.nextInt(0, 5)),
                label = "Bar$index"
            )
        )
    }
    return list
}

fun getGroupBarChartData(listSize: Int, maxRange: Int, barSize: Int): List<GroupBar> {
    val list = mutableListOf<GroupBar>()
    for (index in 0 until listSize) {
        val barList = mutableListOf<BarData>()
        for (i in 0 until barSize) {
            val barValue = Random.nextDouble(1.0, maxRange.toDouble()).formatNumber().toFloat()
            barList.add(
                BarData(
                    Point(
                        index.toFloat(),
                        barValue
                    ),
                    label = "B$i",
                    description = "Bar at $index with label B$i has value ${
                        barValue.formatNumber()
                    }"
                )
            )
        }
        list.add(GroupBar(index.toString(), barList))
    }
    return list
}

private fun getRandomGradient(randomNumber: Int = 2): List<Color> {
    val gradient1 =
        listOf(Color(0xFFFFE595), Color(0xFFD2B147), Color(0xFFFFF6DB), Color(0xFFE8CA6E))
    val gradient2 =
        listOf(Color(0xFFEDC2FF), Color(0xFFB37ACB), Color(0xFFF8E6FF), Color(0xFFCF99E5))
    val gradient3 =
        listOf(Color(0xFFFFAAB0), Color(0xFFCE6870), Color(0xFFFFECEE), Color(0xFFCE6870))
    val gradient4 =
        listOf(Color(0xFF83F4B9), Color(0xFF37AA6E), Color(0xFFD0FEE6), Color(0xFF6EDAA2))
    val gradient5 =
        listOf(Color(0xFFBEC8FF), Color(0xFF788BEE), Color(0xFFEAEDFF), Color(0xFF788BEE))
    val gradient6 =
        listOf(Color(0xFFBEBEBE), Color(0xFFF0EEF1), Color(0xFFD4D3D3), Color(0xFFFFFFFF))
    val listGradient = listOf(gradient1, gradient2, gradient3, gradient4, gradient5, gradient6)
    return listGradient[randomNumber]
}

fun getColorPaletteList1(): List<Color> {
    val colorList = listOf(pink_light, pink_medium, pink_dark)
    return colorList
}

fun getColorPaletteList2(): List<Color> {
    val colorList = listOf(purple_dark, purple_medium, purple_light)
    return colorList
}