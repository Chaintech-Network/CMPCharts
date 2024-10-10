# Compose Multiplatform Charts(CMPCharts)

✨ A very Minimal, Sleek and Lightweight Graph library for <b>Compose Multiplatform</b>

<img width="960" alt="Hero-image - CMP-Chart 3" src="/assets/banner.png">


## Key Features

**Cross-Platform Compatibility:**
Integrates seamlessly with Compose Multiplatform projects, ensuring consistent functionality and aesthetics across iOS and Android.

**Comprehensive Chart Types:**
Offers a variety of chart types including Line Charts for trends and Bar Charts for comparisons.

**Flexible Customization:**
Customize colors, styles, and animations to match app design. Toggle interactive features like tooltips and zoom.

**Intuitive Controls:**
Empowers users with intuitive features like data point selection and axis toggling.


## Installation

Add the following dependency to your `build.gradle.kts` file:

```kotlin
commonMain.dependencies {
    implementation("network.chaintech:cmpcharts:2.0.2")
}
```

## Graphs Available

<table>
    <tr>
        <td width="33%" align="center">
            <h4>Straight Line Chart</h4>
            <hr>
            <img src="/assets/line1.png" alt="Straight Line Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/linechart/StraightLineChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td width="33%" align="center">
            <h4>Grid Line Chart</h4>
            <hr>
            <img src="/assets/line2.png" alt="Grid Line Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/linechart/GridLineChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td width="33%" align="center">
            <h4>Dashed Line Chart</h4>
            <hr>
            <img src="/assets/line3.png" alt="Dashed Line Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/linechart/DashedLineChart.kt">Code Snippet</a></sup>
            </div>
        </td>
    </tr>
    <tr>
        <td width="33%" align="center">
            <h4>Multi Color Line Chart</h4>
            <hr>
            <img src="/assets/line4.png" alt="Multi Color Line Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/linechart/MultiColorLineChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td width="33%" align="center">
            <h4>Multiple Lines Line Chart</h4>
            <hr>
            <img src="/assets/line5.png" alt="Multiple Lines Line Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/linechart/MultiLineLineChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td width="33%" align="center">
            <h4>Multiple Lines Line Chart with different styles</h4>
            <hr>
            <img src="/assets/line6.png" alt="Multiple Lines Line Chart with different styles" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/linechart/MultiStyleLineChart.kt">Code Snippet</a></sup>
            </div>
        </td>
    </tr>
    <tr>
        <td width="33%" align="center">
            <h4>Simple Bar Chart</h4>
            <hr>
            <img src="/assets/bar1.png" alt="Simple Bar Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/barchart/SimpleBarChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td width="33%" align="center">
            <h4>Gradient Bar Chart</h4>
            <hr>
            <img src="/assets/bar2.png" alt="Gradient Bar Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/barchart/GradientBarChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td width="33%" align="center">
            <h4>Bar Chart With Background Color</h4>
            <hr>
            <img src="/assets/bar3.png" alt="Bar Chart With Background Color" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/barchart/BackgroundBarChart.kt">Code Snippet</a></sup>
            </div>
        </td>
    </tr>
    <tr>
        <td width="33%" align="center">
            <h4>Horizontal Bar Chart</h4>
            <hr>
            <img src="/assets/bar4.png" alt="Horizontal Bar Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/barchart/HorizontalBarChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td width="33%" align="center">
            <h4>Grouped Bar Chart</h4>
            <hr>
            <img src="/assets/bar5.png" alt="Grouped Bar Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/barchart/GroupedBarChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td width="33%" align="center">
            <h4>Stacked Bar Chart</h4>
            <hr>
            <img src="/assets/bar6.png" alt="Stacked Bar Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/barchart/StackedBarChart.kt">Code Snippet</a></sup>
            </div>
        </td>
    </tr>
    <tr>
        <td colspan="1" align="center">
            <h4>Solid Bubble Chart</h4>
            <hr>
            <img src="/assets/bubble1.png" alt="Solid Bubble Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/bubblechart/SimpleBubbleChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td colspan="2" align="center">
            <h4>Gradient Bubble Chart</h4>
            <hr>
            <img src="/assets/bubble2.png" alt="Grouped Bar Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/bubblechart/GradientBubbleChart.kt">Code Snippet</a></sup>
            </div>
        </td>
    </tr>
    <tr>
        <td colspan="1" align="center">
            <h4>Simple Donut Chart</h4>
            <hr>
            <img src="/assets/donut1.png" alt="Simple Donut Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/donutchart/SimpleDonutChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td colspan="2" align="center">
            <h4>Multiple Small Donut Chart</h4>
            <hr>
            <img src="/assets/donut2.png" alt="Multiple Small Donut Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/donutchart/MultipleDonutChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        </tr>
    <tr>
        <td colspan="1" align="center">
            <h4>Simple Pie Chart</h4>
            <hr>
            <img src="/assets/pie1.png" alt="Simple Pie Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/piechart/SimplePieChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td colspan="2" align="center">
            <h4>PieChart With Slice Labels</h4>
            <hr>
            <img src="/assets/pie2.png" alt="PieChart With Slice Labels" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/piechart/SliceLabelsPieChart.kt">Code Snippet</a></sup>
            </div>
        </td>
    </tr>
    <tr>
        <td colspan="1" align="center">
            <h4>Guage Chart</h4>
            <hr>
            <img src="/assets/guage1.png" alt="Guage Chart" style="height: 250px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/guagechart/GaugeChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td colspan="2" align="center">
            <h4>Circular Chart</h4>
            <hr>
            <img src="/assets/circular1.png" alt="Circular Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/circularchart/CircularChart.kt">Code Snippet</a></sup>
            </div>
        </td>
    </tr>
    <tr>
        <td width="33%" align="center">
            <h4>Point Chart</h4>
            <hr>
            <img src="/assets/point1.png" alt="Point Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/pointchart/PointChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td width="33%" align="center">
            <h4>Bottle Chart</h4>
            <hr>
            <img src="/assets/bottle1.png" alt="Bottle Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/bottlechart/BottleChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td width="33%" align="center">
            <h4>Segment Progress Bar Chart</h4>
            <hr>
            <img src="/assets/segment1.png" alt="Segment Progress Bar Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/segmentprogressbarchart/SegmentedProgressBarChart.kt">Code Snippet</a></sup>
            </div>
        </td>
    </tr>
    <tr>
        <td width="33%" align="center">
            <h4>Radar Chart</h4>
            <hr>
            <img src="/assets/radar1.png" alt="Radar Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/radarchart/RadarChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td colspan="2" align="center">
            <h4>Heat Map Chart</h4>
            <hr>
            <img src="/assets/heatmap1.png" alt="Heat Map Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/heatmapchart/HeatMapChart.kt">Code Snippet</a></sup>
            </div>         
        </td>
    </tr>
    <tr>
        <td colspan="1" align="center">
            <h4>Area Chart</h4>
            <hr>
            <img src="/assets/area1.png" alt="Area Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/areachart/AreaChart.kt">Code Snippet</a></sup>
            </div>
        </td>
        <td colspan="2" align="center">
            <h4>Cloud Bubble Chart</h4>
            <hr>
            <img src="/assets/cloudbubble1.png" alt="Cloud Bubble Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/cloudbubblechart/CloudBubbleChart.kt">Code Snippet</a></sup>
            </div>         
        </td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <h4>TreeMap Chart</h4>
            <hr>
            <img src="/assets/treemap1.png" alt="TreeMap Chart" style="height: 260px;">
            <div style="text-align: center;">
                <sup><a href="https://github.com/Chaintech-Network/CMPCharts/blob/main/composeApp/src/commonMain/kotlin/network/chaintech/chartscmp/ui/treemapchart/TreeMapChart.kt">Code Snippet</a></sup>
            </div>
        </td>
    </tr>
</table>


## Detailed Explanation
For a detailed explanation and a comprehensive guide, please read the [Medium blog post.](https://medium.com/mobile-innovation-network/introducing-compose-multiplatform-charts-solution-for-seamless-charts-integration-to-app-488355a6e098)

Connect with us on [LinkedIn](https://www.linkedin.com/showcase/mobile-innovation-network)
