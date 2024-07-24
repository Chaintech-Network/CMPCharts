package network.chaintech.chartscmp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.unit.dp
import network.chaintech.chartscmp.theme.AppTheme
import network.chaintech.chartscmp.theme.white_color
import network.chaintech.chartscmp.ui.AreaChartDemo
import network.chaintech.chartscmp.ui.BarChartWithBackgroundColor
import network.chaintech.chartscmp.ui.BarChartWithGradientBars
import network.chaintech.chartscmp.ui.BarChartWithSolidBars
import network.chaintech.chartscmp.ui.CircularChartDemo
import network.chaintech.chartscmp.ui.CombinedLineChart
import network.chaintech.chartscmp.ui.CombinedLineChartWithBackground
import network.chaintech.chartscmp.ui.DashedLineChart
import network.chaintech.chartscmp.ui.GaugeChartDemo
import network.chaintech.chartscmp.ui.GradientBubbleChart
import network.chaintech.chartscmp.ui.HorizontalBarChart
import network.chaintech.chartscmp.ui.MultipleSmallDonutCharts
import network.chaintech.chartscmp.ui.MultipleToneLineChart
import network.chaintech.chartscmp.ui.PieChartWithSliceLabels
import network.chaintech.chartscmp.ui.PointChartDemo
import network.chaintech.chartscmp.ui.SimpleDonutChart
import network.chaintech.chartscmp.ui.SimplePieChart
import network.chaintech.chartscmp.ui.SingleLineChartWithGridLines
import network.chaintech.chartscmp.ui.SolidBubbleChart
import network.chaintech.chartscmp.ui.StraightLineChart
import network.chaintech.chartscmp.ui.VerticalGroupBarChart
import network.chaintech.chartscmp.ui.VerticalStackedBarChart
import network.chaintech.chartscmp.ui.getLineChartData
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
        DashedLineChart(getLineChartData(
            200,
            start = -50,
            maxRange = 50
        ))
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Multi Color Line chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        MultipleToneLineChart(getLineChartData(
            200,
            start = -50,
            maxRange = 50
        ))
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Multiple Lines Line chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        CombinedLineChart(getLineChartData(
            200,
            start = -50,
            maxRange = 50
        ))
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Multiple Lines Line chart with different styles",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        CombinedLineChartWithBackground(getLineChartData(
            200,
            start = -50,
            maxRange = 50
        ))
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Simple Bar Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        BarChartWithSolidBars()
        Text(
            modifier = Modifier.padding(12.dp),
            text = "Gradient Bar Chart",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        BarChartWithGradientBars()
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