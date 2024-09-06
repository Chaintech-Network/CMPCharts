package network.chaintech.chartscmp.ui.heatmapchart

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import network.chaintech.chartscmp.theme.gray_dark
import network.chaintech.chartscmp.theme.green_dark
import network.chaintech.chartscmp.theme.green_light
import network.chaintech.chartscmp.theme.green_medium
import network.chaintech.chartscmp.theme.red_dark
import network.chaintech.chartscmp.theme.red_light
import network.chaintech.chartscmp.theme.red_medium
import network.chaintech.cmpcharts.ui.heatmapchart.HeatMapChart
import network.chaintech.cmpcharts.ui.heatmapchart.config.HeatMapConfig
import network.chaintech.cmpcharts.ui.heatmapchart.config.HeatMapData
import network.chaintech.cmpcharts.ui.heatmapchart.config.HeatMapIntensityStyle
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Regular
import org.jetbrains.compose.resources.Font

@Composable
fun HeatMapChartDemo() {
    val heatMapData = getHeatMapData()
    HeatMapChart(
        heatMapConfig =
        HeatMapConfig(
            heatMapData = heatMapData,
            listIntensityStyle = listOf(
                HeatMapIntensityStyle(
                    intensityColor = red_dark,
                    intensityRange = 0.0..0.0
                ),
                HeatMapIntensityStyle(
                    intensityColor = red_light,
                    intensityRange = 0.71..1.00
                ),
                HeatMapIntensityStyle(
                    intensityColor = red_medium,
                    intensityRange = 0.41..0.70
                ),
                HeatMapIntensityStyle(
                    intensityColor = red_dark,
                    intensityRange = 0.10..0.40
                ),
                HeatMapIntensityStyle(
                    intensityColor = green_light,
                    intensityRange = 1.01..1.40
                ),
                HeatMapIntensityStyle(
                    intensityColor = green_medium,
                    intensityRange = 1.41..1.70
                ),
                HeatMapIntensityStyle(
                    intensityColor = green_dark,
                    intensityRange = 1.71..2.00
                )
            ),
            heatMapTitleTextStyle = TextStyle(
                color = gray_dark,
                fontSize = 12.sp,
                fontFamily = FontFamily(
                    Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
                )
            ),
            heatMapEntriesTextStyle = TextStyle(
                color = Color.Black,
                fontSize = 13.sp,
                fontFamily = FontFamily(
                    Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
                )
            ),
            verticalTitlePadding = 0.dp,
        )
    )
}

fun getHeatMapData(): List<HeatMapData> {
    return listOf(
        HeatMapData(
            cellValue = "-6.1",
            cellGroupId = "1",
            cellRow = "Canada",
            cellColumn = "Transport",
            scaleIntensity = 0.6
        ),
        HeatMapData(
            cellValue = "1.5",
            cellGroupId = "1",
            cellRow = "Canada",
            cellColumn = "Textile",
            scaleIntensity = 1.30
        ),
        HeatMapData(
            cellValue = "-8.9",
            cellGroupId = "1",
            cellRow = "Canada",
            cellColumn = "Metals",
            scaleIntensity = 0.6
        ),
        HeatMapData(
            cellValue = "2.6",
            cellGroupId = "1",
            cellRow = "Canada",
            cellColumn = "Plastics",
            scaleIntensity = 1.45
        ),
        HeatMapData(
            cellValue = "-0.1",
            cellGroupId = "1",
            cellRow = "Canada",
            cellColumn = "Petroleum",
            scaleIntensity = 0.75
        ),

        HeatMapData(
            cellValue = "10.9",
            cellGroupId = "2",
            cellRow = "China",
            cellColumn = "Transport",
            scaleIntensity = 1.75
        ),
        HeatMapData(
            cellValue = "-12.3",
            cellGroupId = "2",
            cellRow = "China",
            cellColumn = "Textile",
            scaleIntensity = 0.20
        ),
        HeatMapData(
            cellValue = "-3.1",
            cellGroupId = "2",
            cellRow = "China",
            cellColumn = "Metals",
            scaleIntensity = 0.45
        ),
        HeatMapData(
            cellValue = "-15.7",
            cellGroupId = "2",
            cellRow = "China",
            cellColumn = "Plastics",
            scaleIntensity = 0.15
        ),
        HeatMapData(
            cellValue = "0.6",
            cellGroupId = "2",
            cellRow = "China",
            cellColumn = "Petroleum",
            scaleIntensity = 1.10
        ),

        HeatMapData(
            cellValue = "-30.9",
            cellGroupId = "3",
            cellRow = "Mexico",
            cellColumn = "Transport",
            scaleIntensity = 0.20
        ),
        HeatMapData(
            cellValue = "-1.1",
            cellGroupId = "3",
            cellRow = "Mexico",
            cellColumn = "Textile",
            scaleIntensity = 0.45
        ),
        HeatMapData(
            cellValue = "3.1",
            cellGroupId = "3",
            cellRow = "Mexico",
            cellColumn = "Metals",
            scaleIntensity = 1.45
        ),
        HeatMapData(
            cellValue = "-1.9",
            cellGroupId = "3",
            cellRow = "Mexico",
            cellColumn = "Plastics",
            scaleIntensity = 0.45
        ),
        HeatMapData(
            cellValue = "-1.2",
            cellGroupId = "3",
            cellRow = "Mexico",
            cellColumn = "Petroleum",
            scaleIntensity = 0.45
        ),

        HeatMapData(
            cellValue = "-45.2",
            cellGroupId = "4",
            cellRow = "Europe",
            cellColumn = "Transport",
            scaleIntensity = 0.20
        ),
        HeatMapData(
            cellValue = "-0.3",
            cellGroupId = "4",
            cellRow = "Europe",
            cellColumn = "Textile",
            scaleIntensity = 0.75
        ),
        HeatMapData(
            cellValue = "-1.8",
            cellGroupId = "4",
            cellRow = "Europe",
            cellColumn = "Metals",
            scaleIntensity = 0.45
        ),
        HeatMapData(
            cellValue = "-2",
            cellGroupId = "4",
            cellRow = "Europe",
            cellColumn = "Plastics",
            scaleIntensity = 0.45
        ),
        HeatMapData(
            cellValue = "0.1",
            cellGroupId = "4",
            cellRow = "Europe",
            cellColumn = "Petroleum",
            scaleIntensity = 1.10
        ),

        HeatMapData(
            cellValue = "8.8",
            cellGroupId = "5",
            cellRow = "Japan",
            cellColumn = "Transport",
            scaleIntensity = 1.75
        ),
        HeatMapData(
            cellValue = "0.2",
            cellGroupId = "5",
            cellRow = "Japan",
            cellColumn = "Textile",
            scaleIntensity = 1.10
        ),
        HeatMapData(
            cellValue = "-10.4",
            cellGroupId = "5",
            cellRow = "Japan",
            cellColumn = "Metals",
            scaleIntensity = 0.20
        ),
        HeatMapData(
            cellValue = "0.5",
            cellGroupId = "5",
            cellRow = "Japan",
            cellColumn = "Plastics",
            scaleIntensity = 1.10
        ),
        HeatMapData(
            cellValue = "18.3",
            cellGroupId = "5",
            cellRow = "Japan",
            cellColumn = "Petroleum",
            scaleIntensity = 1.80
        )
    )
}