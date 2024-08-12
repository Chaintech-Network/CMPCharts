package network.chaintech.chartscmp.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import network.chaintech.cmpcharts.ui.segmentprogresschart.SegmentedProgressBarChart
import network.chaintech.cmpcharts.ui.segmentprogresschart.model.SegmentInfo
import network.chaintech.cmpcharts.ui.segmentprogresschart.model.SegmentProgressBarColors
import network.chaintech.cmpcharts.ui.segmentprogresschart.model.SegmentProgressBarConfig
import network.chaintech.composeapp.generated.resources.Poppins_Regular
import network.chaintech.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun SegmentProgressBarChartDemo() {
    Box(modifier = Modifier.padding(top = 16.dp).fillMaxSize()) {
        SegmentedProgressBarChart(
            segmentProgressBarConfig = SegmentProgressBarConfig(
                cornerRadius = 8.dp,
                segmentsHeight = 120.dp,
                segmentsWidth = 350.dp,
                scaleThickness = 1.1.dp,
                scaleFontFamily = FontFamily(
                    Font(Res.font.Poppins_Regular, weight = FontWeight.Normal)
                ),
                animationDurationMillis = 1200,
                scaleFontWeight = FontWeight.Normal,
                shouldAnimateProgress = true,
                segmentsList = listOf(
                    SegmentInfo(
                        segmentColor = Color(0xFFFF3849), segmentWeight = 1.0f
                    ), SegmentInfo(
                        segmentColor = Color(0xFFFFBB4E), segmentWeight = 1.8f
                    ), SegmentInfo(
                        segmentColor = Color(0xFFFFE34E), segmentWeight = 1.5f
                    ), SegmentInfo(
                        segmentColor = Color(0x8087C682), segmentWeight = 1.0f
                    ), SegmentInfo(
                        segmentColor = Color(0xFF6CB14C), segmentWeight = 1.0f
                    )
                ),
                scaleLabels = listOf("0%", "20%", "40%", "60%", "80%", "100%"),
                pointerWidth = 16.dp,
                pointerHeight = 78.dp,
                displayScale = true,
                scaleFontSize = 10.sp,
                segmentProgressBarColors = SegmentProgressBarColors(
                    pointerColor = Color(0xFF222222),
                    scaleTextColor = Color(0xFF7D7F7C),
                    scaleColor = Color(0xFF7D7F7C)
                )
            )
        )
    }
}