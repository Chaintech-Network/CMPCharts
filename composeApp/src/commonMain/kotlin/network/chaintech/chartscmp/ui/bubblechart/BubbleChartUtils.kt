package network.chaintech.chartscmp.ui.bubblechart

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.text.TextMeasurer
import kotlin.random.Random
import network.chaintech.chartscmp.theme.blue_dark
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.magenta_dark
import network.chaintech.chartscmp.theme.pink_dark
import network.chaintech.cmpcharts.common.model.Point
import network.chaintech.cmpcharts.common.ui.SelectionHighlightPoint
import network.chaintech.cmpcharts.common.ui.SelectionHighlightPopUp
import network.chaintech.cmpcharts.ui.bubblechart.model.Bubble
import network.chaintech.cmpcharts.ui.bubblechart.model.BubbleGradientType
import network.chaintech.cmpcharts.ui.bubblechart.model.BubbleStyle

fun getBubbleChartDataWithGradientStyle(
    points: List<Point>,
    minDensity: Float = 10F,
    maxDensity: Float = 100F,
    textMeasurer: TextMeasurer
): List<Bubble> {
    val list = arrayListOf<Bubble>()
    points.forEach { point ->
        val bubbleGradientList1 =
            listOf(Color(0xFFFFE595), Color(0xFFD2B147), Color(0xFFFFF6DB), Color(0xFFE8CA6E))
        val bubbleGradientList2 =
            listOf(Color(0xFFEDC2FF), Color(0xFFB37ACB), Color(0xFFF8E6FF), Color(0xFFCF99E5))
        val bubbleGradientList3 =
            listOf(Color(0xFFFFAAB0), Color(0xFFCE6870), Color(0xFFFFECEE), Color(0xFFCE6870))
        val bubbleGradientList4 =
            listOf(Color(0xFF83F4B9), Color(0xFF37AA6E), Color(0xFFD0FEE6), Color(0xFF6EDAA2))

        when (Random.nextInt(1, 4)) {
            1 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(
                            gradientColors = bubbleGradientList1,
                            useGradient = true,
                            tileMode = TileMode.Repeated,
                            gradientType = BubbleGradientType.LinearGradient
                        ),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }

            2 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(
                            gradientColors = bubbleGradientList2,
                            useGradient = true,
                            tileMode = TileMode.Repeated,
                            gradientType = BubbleGradientType.LinearGradient
                        ),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }

            3 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(
                            gradientColors = bubbleGradientList3,
                            useGradient = true,
                            tileMode = TileMode.Repeated,
                            gradientType = BubbleGradientType.LinearGradient
                        ),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }

            4 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(
                            gradientColors = bubbleGradientList4,
                            useGradient = true,
                            tileMode = TileMode.Repeated,
                            gradientType = BubbleGradientType.LinearGradient
                        ),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }
        }
    }
    return list
}

fun getBubbleChartDataWithSolidStyle(
    points: List<Point>,
    minDensity: Float = 10F,
    maxDensity: Float = 100F,
    textMeasurer: TextMeasurer
): List<Bubble> {
    val list = arrayListOf<Bubble>()
    points.forEachIndexed { index, point ->
        val bubbleColor1 = blue_dark
        val bubbleColor2 = magenta_dark
        val bubbleColor3 = green_dark
        val bubbleColor4 = pink_dark
        when (Random.nextInt(1, 4)) {
            1 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(solidColor = bubbleColor1, useGradient = false),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }

            2 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(solidColor = bubbleColor2, useGradient = false),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }

            3 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(solidColor = bubbleColor3, useGradient = false),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }

            4 -> {
                list.add(
                    Bubble(
                        center = point,
                        density = (minDensity.toInt() until maxDensity.toInt()).random().toFloat(),
                        bubbleStyle = BubbleStyle(solidColor = bubbleColor4, useGradient = false),
                        selectionHighlightPoint = SelectionHighlightPoint(Color.Black),
                        selectionHighlightPopUp = SelectionHighlightPopUp(
                            Color.White,
                            textMeasurer = textMeasurer
                        )
                    )
                )
            }
        }
    }
    return list
}