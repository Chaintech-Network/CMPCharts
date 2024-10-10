package network.chaintech.chartscmp.ui.treemapchart

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import multiplatform.network.cmptoast.showToast
import network.chaintech.cmpcharts.ui.treemapchart.TreeMapChart
import network.chaintech.cmpcharts.ui.treemapchart.TreeMapItem
import network.chaintech.cmpcharts.ui.treemapchart.config.LabelHorizontalAlignment
import network.chaintech.cmpcharts.ui.treemapchart.config.LabelVerticalAlignment
import network.chaintech.cmpcharts.ui.treemapchart.config.TreeMapChartConfig
import network.chaintech.cmpcharts.ui.treemapchart.config.TreeMapChartStyle
import network.chaintech.cmpcharts.ui.treemapchart.config.TreeNodeColor
import network.chaintech.cmpcharts.ui.treemapchart.model.TreeModel
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Medium
import org.jetbrains.compose.resources.Font

@Composable
fun TreeMapChartPreview() {
    TreeMapChart(
        TreeMapChartConfig(
            chartWidth = 400.dp,
            chartHeight = 300.dp,
            treeMapChartStyle = TreeMapChartStyle(
                labelVerticalAlignment = LabelVerticalAlignment.CENTER,
                labelHorizontalAlignment = LabelHorizontalAlignment.CENTER,
                labelTextStyle = TextStyle(
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(
                        Font(
                            Res.font.Roboto_Medium,
                            weight = FontWeight.Medium
                        )
                    )
                ),
                borderStyle = Paint().apply {
                    color = Color.Black
                    style = PaintingStyle.Stroke
                    strokeWidth = 5f
                },
                labelScaleDownRatio = 0.3f,
                listNodeColor = getSampleTreeMapNodeColors()
            ),
            treeModel = getSampleData(),
            onNodeClick = { treeMapItem ->
                showToast(
                    backgroundColor = Color(0xFF448EE2),
                    message = treeMapItem.getLabel()
                )
            },
            labelAlignment = Alignment.Center
        )
    )
}

private fun getSampleData(): TreeModel {
    val rootItem = TreeMapItem(100000.0, "Europe Population")
    val treeModel = TreeModel(rootItem)
    treeModel.addChild(TreeModel(TreeMapItem(11443830.0, "Belgium")))
    treeModel.addChild(TreeModel(TreeMapItem(64938716.0, "France")))
    treeModel.addChild(TreeModel(TreeMapItem(80636124.0, "Germany")))
    treeModel.addChild(TreeModel(TreeMapItem(10892931.0, "Greece")))
    treeModel.addChild(TreeModel(TreeMapItem(59797978.0, "Italy")))
    treeModel.addChild(TreeModel(TreeMapItem(17032845.0, "Netherlands")))
    treeModel.addChild(TreeModel(TreeMapItem(38563573.0, "Poland")))
    treeModel.addChild(TreeModel(TreeMapItem(19237513.0, "Romania")))
    treeModel.addChild(TreeModel(TreeMapItem(46070146.0, "Spain")))
    treeModel.addChild(TreeModel(TreeMapItem(65511098.0, "United Kingdom")))
    return treeModel
}

private fun getSampleTreeMapNodeColors(): List<TreeNodeColor> {
    return listOf(
        TreeNodeColor(
            0.0..10079515.5,
            Color(0xFFE8F1FB)
        ),
        TreeNodeColor(
            10079515.5..20159031.0,
            Color(0xFFD2E4F8)
        ),
        TreeNodeColor(
            20159031.0..30238546.5,
            Color(0xFFBCD7F5)
        ),
        TreeNodeColor(
            30238546.5..40318062.0,
            Color(0xFFA7CAF2)
        ),
        TreeNodeColor(
            40318062.0..50397577.5,
            Color(0xFF92BDEF)
        ),
        TreeNodeColor(
            50397577.5..60477093.0,
            Color(0xFF7EB1EC)
        ),
        TreeNodeColor(
            60477093.0..70556608.5,
            Color(0xFF6AA5E9)
        ),
        TreeNodeColor(
            70556608.5..80636124.0,
            Color(0xFF5699E6)
        ),
        TreeNodeColor(
            80636124.5..100000000.0,
            Color(0xFF448EE2)
        )
    )
}