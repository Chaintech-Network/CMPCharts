package network.chaintech.chartscmp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import network.chaintech.chartscmp.theme.AppTheme
import network.chaintech.chartscmp.theme.white_color
import network.chaintech.chartscmp.ui.areachart.AreaChartDemo
import network.chaintech.chartscmp.ui.barchart.BarChartWithBackgroundColor
import network.chaintech.chartscmp.ui.barchart.GradientBarChart
import network.chaintech.chartscmp.ui.barchart.GradientBarChartWithCustomPoint
import network.chaintech.chartscmp.ui.barchart.HorizontalBarChart
import network.chaintech.chartscmp.ui.barchart.HorizontalBarChartCustomPoint
import network.chaintech.chartscmp.ui.barchart.SimpleBarChart
import network.chaintech.chartscmp.ui.barchart.SimpleBarChartWithCustomPoint
import network.chaintech.chartscmp.ui.barchart.VerticalGroupBarChart
import network.chaintech.chartscmp.ui.barchart.VerticalStackedBarChart
import network.chaintech.chartscmp.ui.bottlechart.BottleChartDemo
import network.chaintech.chartscmp.ui.bubblechart.GradientBubbleChart
import network.chaintech.chartscmp.ui.bubblechart.SolidBubbleChart
import network.chaintech.chartscmp.ui.circularchart.CircularChartDemo
import network.chaintech.chartscmp.ui.cloudbubblechart.BubbleChartPreview
import network.chaintech.chartscmp.ui.donutchart.MultipleSmallDonutCharts
import network.chaintech.chartscmp.ui.donutchart.SimpleDonutChart
import network.chaintech.chartscmp.ui.guagechart.GaugeChartDemo
import network.chaintech.chartscmp.ui.heatmapchart.HeatMapChartDemo
import network.chaintech.chartscmp.ui.linechart.CombinedLineChart
import network.chaintech.chartscmp.ui.linechart.CombinedLineChartWithBackground
import network.chaintech.chartscmp.ui.linechart.DashedLineChart
import network.chaintech.chartscmp.ui.linechart.MultipleToneLineChart
import network.chaintech.chartscmp.ui.linechart.SingleLineChartWithGridLines
import network.chaintech.chartscmp.ui.linechart.StraightLineChart
import network.chaintech.chartscmp.ui.linechart.getLineChartData
import network.chaintech.chartscmp.ui.piechart.PieChartWithSliceLabels
import network.chaintech.chartscmp.ui.piechart.SimplePieChart
import network.chaintech.chartscmp.ui.pointchart.PointChartDemo
import network.chaintech.chartscmp.ui.radarchart.RadarChartDemo
import network.chaintech.chartscmp.ui.segmentprogressbarchart.SegmentProgressBarChartDemo
import network.chaintech.chartscmp.ui.treemapchart.TreeMapChartPreview
import network.chaintech.cmpcharts.common.utils.DataUtils

@Composable
internal fun App() = AppTheme {
    Column(
        modifier = Modifier
            .background(white_color)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .windowInsetsPadding(WindowInsets.safeDrawing)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier= Modifier.padding(12.dp),
            text = "TreeMap Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        TreeMapChartPreview()
        Text(
            modifier= Modifier.padding(12.dp),
            text = "Cloud Bubble Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        BubbleChartPreview()
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier= Modifier.padding(12.dp),
            text = "HeatMap Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        HeatMapChartDemo()
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier= Modifier.padding(12.dp),
            text = "Radar Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        RadarChartDemo(modifier = Modifier.fillMaxWidth().height(400.dp))
        Text(
            modifier= Modifier.padding(12.dp),
            text = "Segment Progress Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        SegmentProgressBarChartDemo()
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier= Modifier.padding(12.dp),
            text = "Bottle Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        BottleChartDemo()
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier= Modifier.padding(12.dp),
            text = "Area Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        AreaChartDemo()
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier= Modifier.padding(12.dp),
            text = "Simple Donut Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        SimpleDonutChart()
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier= Modifier.padding(12.dp),
            text = "Multiple Small Donut Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        MultipleSmallDonutCharts()
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier= Modifier.padding(12.dp),
            text = "Simple PieChart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        SimplePieChart()
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier = Modifier.padding(12.dp),
            text = "PieChart with Slice Labels",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        PieChartWithSliceLabels()
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Gauge Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        GaugeChartDemo()
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Circular Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        CircularChartDemo()
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Point Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        PointChartDemo()
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Solid Bubble Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        SolidBubbleChart(
            pointsData = DataUtils.getRandomPoints(
                200,
                start = 30,
                maxRange = 900
            )
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Gradient Bubble Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        GradientBubbleChart(
            pointsData = DataUtils.getRandomPoints(
                200,
                start = 30,
                maxRange = 900
            )
        )
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Straight Line chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        StraightLineChart(getLineChartData(50, maxRange = 200))
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Grid Line chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        SingleLineChartWithGridLines(
            getLineChartData(
                100,
                start = 50,
                maxRange = 100
            )
        )
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Dashed Line chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        DashedLineChart(
            getLineChartData(
                200,
                start = -50,
                maxRange = 50
            )
        )
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Multi Color Line chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        MultipleToneLineChart(
            getLineChartData(
                200,
                start = -50,
                maxRange = 50
            )
        )
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Multiple Lines Line chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        CombinedLineChart(
            getLineChartData(
                200,
                start = -50,
                maxRange = 50
            )
        )
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Multiple Lines Line chart with different styles",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        CombinedLineChartWithBackground(
            getLineChartData(
                200,
                start = -50,
                maxRange = 50
            )
        )
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Simple Bar Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        SimpleBarChart()
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Simple Bar Chart Custom Start Point",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        SimpleBarChartWithCustomPoint()
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Gradient Bar Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        GradientBarChart()
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Gradient Bar Chart Custom Start Point",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        GradientBarChartWithCustomPoint()
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Bar Chart with Background Color",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        BarChartWithBackgroundColor()
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Horizontal Bar Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        HorizontalBarChart()
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Horizontal Bar Chart Custom Start Point",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        HorizontalBarChartCustomPoint()
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Grouped Bar Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        VerticalGroupBarChart()
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Stacked Bar Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        VerticalStackedBarChart()
    }
}