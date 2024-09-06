package network.chaintech.chartscmp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlin.random.Random
import network.chaintech.chartscmp.theme.blue_dark
import network.chaintech.chartscmp.theme.blue_light
import network.chaintech.chartscmp.theme.blue_medium
import network.chaintech.chartscmp.theme.font_color
import network.chaintech.chartscmp.theme.gray_dark
import network.chaintech.chartscmp.theme.gray_light
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
import network.chaintech.chartscmp.theme.white_color
import network.chaintech.chartscmp.theme.yellow_dark
import network.chaintech.chartscmp.theme.yellow_light
import network.chaintech.chartscmp.theme.yellow_medium
import network.chaintech.cmpcharts.axis.AxisData
import network.chaintech.cmpcharts.axis.DataCategoryOptions
import network.chaintech.cmpcharts.common.components.Legends
import network.chaintech.cmpcharts.common.extensions.formatNumber
import network.chaintech.cmpcharts.common.extensions.getMaxElementInYAxis
import network.chaintech.cmpcharts.common.model.LegendLabel
import network.chaintech.cmpcharts.common.model.LegendsConfig
import network.chaintech.cmpcharts.common.model.Point
import network.chaintech.cmpcharts.ui.barchart.BarChart
import network.chaintech.cmpcharts.ui.barchart.GroupBarChart
import network.chaintech.cmpcharts.ui.barchart.StackedBarChart
import network.chaintech.cmpcharts.ui.barchart.models.BarChartData
import network.chaintech.cmpcharts.ui.barchart.models.BarChartType
import network.chaintech.cmpcharts.ui.barchart.models.BarData
import network.chaintech.cmpcharts.ui.barchart.models.BarPlotData
import network.chaintech.cmpcharts.ui.barchart.models.BarStyle
import network.chaintech.cmpcharts.ui.barchart.models.GroupBar
import network.chaintech.cmpcharts.ui.barchart.models.GroupBarChartData
import network.chaintech.cmpcharts.ui.barchart.models.GroupSeparatorConfig
import network.chaintech.cmpcharts.ui.barchart.models.SelectionHighlightData
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Composable
fun BarChartWithSolidBars() {
    val maxRange = 50
    val barData = getBarChartData(50, maxRange, BarChartType.VERTICAL, DataCategoryOptions())
    val yStepSize = 10

    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(30.dp)
        .steps(barData.size - 1)
        .bottomPadding(40.dp)
        .axisLabelAngle(20f)
        .startDrawPadding(48.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { index -> barData[index].label }
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(yStepSize)
        .labelAndAxisLinePadding(20.dp)
        .axisOffset(20.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { index -> (index * (maxRange / yStepSize)).toString() }
        .build()
    val barChartData = BarChartData(
        chartData = barData,
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        barStyle = BarStyle(
            cornerRadius = 5.dp,
            paddingBetweenBars = 20.dp,
            barWidth = 25.dp,
            selectionHighlightData = SelectionHighlightData(
                highlightBarColor = gray_light,
                highlightTextColor = white_color,
                highlightTextTypeface = FontWeight.Bold,
                highlightTextBackgroundColor = magenta_dark,
                popUpLabel = { _, y -> " Value : $y " }
            )
        ),
        horizontalExtraSpace = 10.dp,
    )
    BarChart(modifier = Modifier.height(350.dp), barChartData = barChartData)
}

@Composable
fun BarChartWithGradientBars() {
    val maxRange = 100
    val barData = getGradientBarChartData(50, 100)
    val yStepSize = 10
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(30.dp)
        .steps(barData.size - 1)
        .bottomPadding(40.dp)
        .axisLabelAngle(20f)
        .startDrawPadding(48.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { index -> barData[index].label }
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(yStepSize)
        .labelAndAxisLinePadding(20.dp)
        .axisOffset(20.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { index -> (index * (maxRange / yStepSize)).toString() }
        .build()
    val barChartData = BarChartData(
        chartData = barData,
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        barStyle = BarStyle(paddingBetweenBars = 20.dp,
            barWidth = 35.dp,
            isGradientEnabled = true,
            selectionHighlightData = SelectionHighlightData(
                highlightBarColor = gray_light,
                highlightTextColor = white_color,
                highlightTextTypeface = FontWeight.Bold,
                highlightTextBackgroundColor = magenta_dark,
                popUpLabel = { _, y -> " Value : $y " }
            )),
        horizontalExtraSpace = 20.dp
    )
    BarChart(modifier = Modifier.height(350.dp), barChartData = barChartData)
}

@Composable
fun BarChartWithBackgroundColor() {
    val maxRange = 100
    val backgroundColor = gray_light
    val barData = getBarChartData(50, 100, BarChartType.VERTICAL, DataCategoryOptions())
    val yStepSize = 10
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(30.dp)
        .steps(barData.size - 1)
        .bottomPadding(40.dp)
        .startDrawPadding(48.dp)
        .axisLabelAngle(20f)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { index -> barData[index].label }
        .backgroundColor(backgroundColor)
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(yStepSize)
        .labelAndAxisLinePadding(20.dp)
        .axisOffset(20.dp)
        .backgroundColor(backgroundColor)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { index -> (index * (maxRange / yStepSize)).toString() }
        .build()
    val barChartData = BarChartData(
        chartData = barData,
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        barStyle = BarStyle(paddingBetweenBars = 20.dp,
            barWidth = 35.dp,
            selectionHighlightData = SelectionHighlightData(
                highlightBarColor = gray_light,
                highlightTextColor = white_color,
                highlightTextTypeface = FontWeight.Bold,
                highlightTextBackgroundColor = magenta_dark,
                popUpLabel = { _, y -> " Value : $y " }
            )),
        horizontalExtraSpace = 20.dp,
        backgroundColor = backgroundColor
    )
    BarChart(modifier = Modifier.height(350.dp), barChartData = barChartData)
}

@Composable
fun VerticalBarChart() {
    val maxRange = 50
    val barData =
        getBarChartData(50, maxRange, BarChartType.VERTICAL, DataCategoryOptions())
    val yStepSize = 10

    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(30.dp)
        .steps(barData.size - 1)
        .bottomPadding(12.dp)
        .axisLabelAngle(20f)
        .startDrawPadding(48.dp)
        .shouldDrawAxisLineTillEnd(false)
        .labelData { index -> barData[index].label }
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(yStepSize)
        .labelAndAxisLinePadding(20.dp)
        .axisOffset(20.dp)
        .labelData { index -> (index * (maxRange / yStepSize)).toString() }
        .build()
    val barChartData = BarChartData(
        chartData = barData,
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        barStyle = BarStyle(
            paddingBetweenBars = 20.dp,
            barWidth = 25.dp
        ),
        horizontalExtraSpace = 10.dp,
        drawBar = { drawScope, barData, drawOffset, height, barChartType, barStyle ->
            with(drawScope) {
                with(barStyle) {
                    drawRect(
                        color = barData.color,
                        topLeft = drawOffset,
                        size = if (barChartType == BarChartType.VERTICAL) Size(
                            barWidth.toPx(),
                            height
                        ) else Size(height, barWidth.toPx()),
                        style = barDrawStyle,
                        blendMode = barBlendMode
                    )
                }
            }
        }
    )
    BarChart(modifier = Modifier.height(350.dp), barChartData = barChartData)
}

@Composable
fun HorizontalBarChart() {
    val maxRange = 30
    val barData =
        getBarChartData(
            10,
            maxRange,
            BarChartType.HORIZONTAL,
            DataCategoryOptions(isDataCategoryInYAxis = true)
        )
    val xStepSize = 10

    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(xStepSize)
        .bottomPadding(12.dp)
        .endPadding(40.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { index -> (index * (maxRange / xStepSize)).toString() }
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(30.dp)
        .steps(barData.size - 1)
        .labelAndAxisLinePadding(20.dp)
        .axisOffset(20.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .setDataCategoryOptions(
            DataCategoryOptions(
                isDataCategoryInYAxis = true,
                isDataCategoryStartFromBottom = false
            )
        )
        .startDrawPadding(48.dp)
        .labelData { index -> barData[index].label }
        .build()
    val barChartData = BarChartData(
        chartData = barData,
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        barStyle = BarStyle(
            isGradientEnabled = false,
            paddingBetweenBars = 20.dp,
            barWidth = 35.dp,
            selectionHighlightData = SelectionHighlightData(
                highlightBarColor = gray_light,
                highlightTextColor = white_color,
                highlightTextTypeface = FontWeight.Bold,
                highlightTextBackgroundColor = magenta_dark,
                popUpLabel = { _, y -> " Value : $y " }
            ),
        ),
        horizontalExtraSpace = 20.dp,
        barChartType = BarChartType.HORIZONTAL
    )
    BarChart(
        modifier = Modifier.height(350.dp),
        barChartData = barChartData
    )
}

@Composable
fun VerticalGroupBarChart() {
    val maxRange = 100
    val barSize = 3
    val groupBarData = getGroupBarChartData(50, maxRange, barSize)
    val yStepSize = 10
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(30.dp)
        .bottomPadding(5.dp)
        .startDrawPadding(48.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { index -> index.toString() }
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(yStepSize)
        .labelAndAxisLinePadding(20.dp)
        .axisOffset(20.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { index -> (index * (maxRange / yStepSize)).toString() }
        .build()
    val colorPaletteList = getColorPaletteList1()
    val legendsConfig = LegendsConfig(
        legendLabelList = getLegendsLabelDataBarChart(colorPaletteList),
        gridColumnCount = 3
    )
    val groupBarPlotData = BarPlotData(
        groupBarList = groupBarData,
        barStyle = BarStyle(barWidth = 35.dp),
        barColorPaletteList = colorPaletteList
    )
    val groupBarChartData = GroupBarChartData(
        barPlotData = groupBarPlotData,
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        groupSeparatorConfig = GroupSeparatorConfig(0.dp)
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

@Composable
fun VerticalStackedBarChart() {
    val barSize = 3
    val listSize = 10
    val groupBarData = getGroupBarChartData(listSize, 100, barSize)
    val yStepSize = 10
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(30.dp)
        .steps(listSize - 1)
        .startDrawPadding(48.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { index -> "C $index" }
        .build()
    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(yStepSize)
        .labelAndAxisLinePadding(20.dp)
        .axisOffset(20.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelData { index ->
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
        }
        .topPadding(36.dp)
        .build()
    val colorPaletteList = getColorPaletteList2()
    val legendsConfig = LegendsConfig(
        legendLabelList = getLegendsLabelDataBarChart(colorPaletteList),
        gridColumnCount = 3
    )
    val groupBarPlotData = BarPlotData(
        groupBarList = groupBarData,
        barStyle = BarStyle(
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
        xAxisData = xAxisData,
        yAxisData = yAxisData,
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
    dataCategoryOptions: DataCategoryOptions
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
                dataCategoryOptions = dataCategoryOptions,
                label = "Bar$index",
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
//                val barValue = "%.2f".format(Random.nextDouble(1.0, maxRange.toDouble())).toFloat()
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
//                            String.format(
//                                "%.2f", barValue
//                            )
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