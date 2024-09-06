package network.chaintech.chartscmp.ui.linechart

import androidx.compose.ui.graphics.Color
import network.chaintech.cmpcharts.common.model.LegendLabel
import network.chaintech.cmpcharts.common.model.Point

fun getLegendsLabelData(colorPaletteList: List<Color>): List<LegendLabel> {
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

fun getLineChartData(listSize: Int, start: Int = 0, maxRange: Int): List<Point> {
    val list = arrayListOf<Point>()
    for (index in 0 until listSize) {
        list.add(
            Point(
                index.toFloat(),
                (start until maxRange).random().toFloat()
            )
        )
    }
    return list
}