# Compose Multiplatform Charts(CMPCharts)

✨ A very Minimal, Sleek and Lightweight Graph library for <b>Compose Multiplatform</b>

<img width="960" alt="Hero-image - CMP-Chart 3" src="https://github.com/user-attachments/assets/8c8954bd-71f8-4678-8888-7a6e8dd0de7d">

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
    implementation("network.chaintech:cmpcharts:1.0.0")
}
```

## Graphs Available
1. Line Chart
2. Bar Chart
3. Bubble Chart
4. Donut Chart
5. Pie Chart
6. Gauge Chart
7. Circular Chart
8. Area Chart
9. Point Chart

## Preview

#### 1. Line Chart
<img width="306" alt="image" src="https://github.com/user-attachments/assets/68cd28d8-a726-411a-a598-a9f04a299c41">
<img width="307" alt="image" src="https://github.com/user-attachments/assets/89d98993-863d-4414-9c8b-36bd5a0573cc">
<img width="306" alt="image" src="https://github.com/user-attachments/assets/4af024bf-fe23-4efa-8b5c-b9922741eec0">
<img width="308" alt="image" src="https://github.com/user-attachments/assets/c18f7448-3383-4327-9af4-102593348f9a">
<img width="305" alt="image" src="https://github.com/user-attachments/assets/8d6f2cdf-6ee0-46c2-a7d4-fcd6290ab6dd">
<img width="309" alt="image" src="https://github.com/user-attachments/assets/a85a3509-0571-4f28-b395-4ee863d07330">


#### 2. Bar Chart
<img width="306" alt="image" src="https://github.com/user-attachments/assets/7ba3ba6e-78d6-4a3b-b712-99beb1b72e74">
<img width="303" alt="image" src="https://github.com/user-attachments/assets/dc52fc7a-2eaa-42e2-9a84-bd7f30388622">
<img width="306" alt="image" src="https://github.com/user-attachments/assets/373b0bcf-8ac4-461c-b3c6-dc8cf60f35e1">
<img width="306" alt="image" src="https://github.com/user-attachments/assets/be50c661-b5e2-4194-8c28-18aea6c32fe8">
<img width="305" alt="image" src="https://github.com/user-attachments/assets/adbe9b3f-f6d0-4d79-945b-939cea43bb27">
<img width="306" alt="image" src="https://github.com/user-attachments/assets/33b47754-543d-4ae6-b3d3-95dd93751445">


#### 3. Bubble Chart
<img width="307" alt="image" src="https://github.com/user-attachments/assets/a236b144-8540-4fff-b0eb-45bcb1819e1c">
<img width="307" alt="image" src="https://github.com/user-attachments/assets/043edbd6-7610-4b7a-a2da-3d0c3850721e">


#### 4. Donut Chart
<img width="307" alt="image" src="https://github.com/user-attachments/assets/820d864d-50eb-499a-9a4b-09feea6eb989">
<img width="308" alt="image" src="https://github.com/user-attachments/assets/32805719-f5a3-48fe-934c-89021f4d996a">


#### 5. Pie Chart
<img width="308" alt="image" src="https://github.com/user-attachments/assets/48f844a0-b6f9-46b1-a14c-726ebf1ac258">
<img width="307" alt="image" src="https://github.com/user-attachments/assets/c2296418-2f92-4f65-9a21-a9376f347aeb">


#### 6. Gauge Chart
<img width="302" alt="image" src="https://github.com/user-attachments/assets/4f30a76c-ded1-495e-9af6-c0c8c528292c">


#### 7. Circular Chart
<img width="308" alt="image" src="https://github.com/user-attachments/assets/de715540-5371-4975-97ce-67f6b2662c2e">


#### 8. Area Chart
<img width="307" alt="image" src="https://github.com/user-attachments/assets/519c3d2a-4f06-4e36-9680-8ce4bf2d5cd6">


#### 9. Point Chart
<img width="306" alt="image" src="https://github.com/user-attachments/assets/25814411-e195-4e74-b278-e6e7001ffd3f">


# Usage

## Axis Data

| Property                      | Type                     | Description                                                           |
|-------------------------------|--------------------------|-----------------------------------------------------------------------|
| `steps`                       | `Int`                    | Number of steps or intervals on the axis.                              |
| `labelData`                   | `(Int) -> String`        | Lambda function to generate label strings based on index.             |
| `axisPos`                     | `Gravity`                | Position of the axis (gravity value).                                  |
| `labelAndAxisLinePadding`     | `Dp`                     | Padding between labels and axis line.                                  |
| `axisOffset`                  | `Dp`                     | Offset of the axis from the edge of the chart.                         |
| `axisTopPadding`              | `Dp`                     | Padding at the top of the axis.                                        |
| `axisBottomPadding`           | `Dp`                     | Padding at the bottom of the axis.                                     |
| `axisStartPadding`            | `Dp`                     | Padding at the start (left for horizontal, top for vertical) of the axis. |
| `axisEndPadding`              | `Dp`                     | Padding at the end (right for horizontal, bottom for vertical) of the axis. |
| `axisStepSize`                | `Dp`                     | Size of each step interval on the axis.                                |
| `axisLabelAngle`              | `Float`                  | Angle of rotation for axis labels.                                     |
| `axisLineColor`               | `Color`                  | Color of the axis line.                                                |
| `axisLabelColor`              | `Color`                  | Color of the axis labels.                                              |
| `axisLabelFontSize`           | `TextUnit`               | Font size of the axis labels.                                          |
| `axisLineThickness`           | `Dp`                     | Thickness of the axis line.                                            |
| `indicatorLineWidth`          | `Dp`                     | Width of indicators or markers on the axis.                            |
| `backgroundColor`             | `Color`                  | Background color of the axis area.                                     |
| `fontFamily`                  | `FontFamily?`            | Font family used for axis labels (nullable).                           |
| `fontWeight`                  | `FontWeight`             | Font weight used for axis labels.                                      |
| `axisConfig`                  | `AxisConfig`             | Configuration object for additional axis settings.                     |
| `startDrawPadding`            | `Dp`                     | Padding for starting to draw the axis.                                 |
| `showAxis`                    | `Boolean`                | Flag indicating whether to show the axis.                              |
| `shouldDrawAxisLineTillEnd`   | `Boolean`                | Flag indicating whether to draw the axis line till the end.            |
| `axisLabelDescription`        | `(String) -> String`     | Lambda function to generate description for axis labels.               |
| `dataCategoryOptions`         | `DataCategoryOptions`    | Options related to data categories on the axis.                        |


## X-Axis

| Parameter       | Type                | Description                                                  |
|-----------------|---------------------|--------------------------------------------------------------|
| `xAxisData`     | `AxisData`          | Configuration data for the X-axis.                           |
| `modifier`      | `Modifier`          | Modifier for configuring the layout and behavior of the component. |
| `xStart`        | `Float`             | Starting position on the X-axis.                              |
| `scrollOffset`  | `Float`             | Offset due to scrolling on the X-axis.                        |
| `zoomScale`     | `Float`             | Scale factor due to zooming on the X-axis.                    |
| `chartData`     | `List<Point>`       | Data points to be plotted on the chart.                       |
| `axisStart`     | `Float`             | Starting position of the axis.                                |

## Y-Axis

| Parameter            | Type                 | Description                                                  |
|----------------------|----------------------|--------------------------------------------------------------|
| `modifier`           | `Modifier`           | Modifier for configuring the layout and behavior of the component. |
| `yAxisData`          | `AxisData`           | Configuration data for the Y-axis.                           |
| `scrollOffset`       | `Float`              | Offset due to scrolling on the Y-axis.                       |
| `zoomScale`          | `Float`              | Scale factor due to zooming on the Y-axis.                   |
| `chartData`          | `List<Point>`        | Data points to be plotted on the chart.                      |
| `dataCategoryWidth`  | `Float`              | Width of data categories for categorical charts.             |
| `yStart`             | `Float`              | Starting position on the Y-axis.                             |
| `barWidth`           | `Float`              | Width of bars in a bar chart.                                |


### 1. <ins>Line Chart</ins>

#### a. Line Chart Data

| Property               | Type                   | Description                                                          |
|------------------------|------------------------|----------------------------------------------------------------------|
| `linePlotData`         | `LinePlotData`         | Data object containing the line plot data.                            |
| `xAxisData`            | `AxisData`             | Configuration data for the X-axis.                                    |
| `yAxisData`            | `AxisData`             | Configuration data for the Y-axis.                                    |
| `isZoomAllowed`        | `Boolean`              | Flag indicating whether zooming is allowed for the chart.             |
| `paddingTop`           | `Dp`                   | Padding at the top of the chart container.                            |
| `bottomPadding`        | `Dp`                   | Padding at the bottom of the chart container.                         |
| `paddingRight`         | `Dp`                   | Padding at the right side of the chart container.                     |
| `containerPaddingEnd`  | `Dp`                   | Padding at the end (right for horizontal, bottom for vertical) of the chart container. |
| `backgroundColor`      | `Color`                | Background color of the chart.                                        |
| `gridLines`            | `GridLinesUtil?`       | Utility class for managing grid lines on the chart.        |

##### b. Displaying Line Chart

```
@Composable
fun LineChartExample(pointsData: List<Point>) {
    val textMeasurer = rememberTextMeasurer()
    val steps = 5

    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisStepSize(30.dp)
        .topPadding(105.dp)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .steps(pointsData.size - 1)
        .labelData { i -> pointsData[i].x.toInt().toString() }
        .labelAndAxisLinePadding(15.dp)
        .build()

    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .steps(steps)
        .axisLabelColor(font_color)
        .axisLineColor(font_color)
        .labelAndAxisLinePadding(20.dp)
        .labelData { i ->
            // Add yMin to get the negative axis values to the scale
            val yMin = pointsData.minOf { it.y }
            val yMax = pointsData.maxOf { it.y }
            val yScale = (yMax - yMin) / steps
            ((i * yScale) + yMin).formatToSinglePrecision()
        }
        .build()

    val data = LineChartData(
        linePlotData = LinePlotData(
            lines = listOf(
                Line(
                    dataPoints = pointsData,
                    lineStyle = LineStyle(color = purple_dark),
                    intersectionPoint = IntersectionPoint(color = green_dark),
                    selectionHighlightPoint = SelectionHighlightPoint(color = magenta_dark),
                    shadowUnderLine = ShadowUnderLine(),
                    selectionHighlightPopUp = SelectionHighlightPopUp(
                        textMeasurer = textMeasurer,
                        backgroundColor = magenta_dark,
                        labelColor = white_color,
                        labelTypeface = FontWeight.Bold
                    )
                )
            )
        ),
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        gridLines = GridLinesUtil(color = gray_light)
    )

    LineChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        lineChartData = data
    )
}
```


### 2. <ins>Bar Chart</ins>

#### a. Bar Chart Data

| Property               | Type                                                                 | Description                                                                 |
|------------------------|----------------------------------------------------------------------|-----------------------------------------------------------------------------|
| `chartData`            | `List<BarData>`                                                      | List of data objects representing each bar in the chart.                    |
| `xAxisData`            | `AxisData`                                                           | Configuration data for the X-axis. Default values provided by `AxisData.Builder().build()`. |
| `yAxisData`            | `AxisData`                                                           | Configuration data for the Y-axis. Default values provided by `AxisData.Builder().build()`. |
| `backgroundColor`      | `Color`                                                              | Background color of the chart.                                              |
| `horizontalExtraSpace` | `Dp`                                                                 | Additional horizontal space allocated beyond the chart's content.            |
| `barStyle`             | `BarStyle`                                                           | Style settings for the bars in the chart, including colors and appearance.   |
| `paddingEnd`           | `Dp`                                                                 | Padding at the end (right for vertical, bottom for horizontal) of the chart. |
| `paddingTop`           | `Dp`                                                                 | Padding at the top of the chart.                                            |
| `tapPadding`           | `Dp`                                                                 | Padding for tap interactions on the chart, enhancing usability.              |
| `barChartType`         | `BarChartType`                                                       | Type of bar chart (`VERTICAL` or `HORIZONTAL`), defining its orientation.    |
| `drawBar`              | `(DrawScope, BarData, Offset, Float, BarChartType, BarStyle) -> Unit` | Function for custom drawing of bars, allowing advanced customization.       |

#### b. Displaying Bar Chart

```
@Composable
fun BarChartExample() {
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
```

### 3. <ins>Bubble Chart</ins>

#### a. Bubble Chart Data

| Property                | Type                      | Description                                                                 |
|-------------------------|---------------------------|-----------------------------------------------------------------------------|
| `bubbles`               | `List<Bubble>`            | List of bubble data points to be displayed on the chart.                     |
| `maximumBubbleRadius`   | `Float`                   | Maximum radius of bubbles in the chart. Default value is 100f.               |
| `xAxisData`             | `AxisData`                | Configuration data for the X-axis. Default values provided by `AxisData.Builder().build()`. |
| `yAxisData`             | `AxisData`                | Configuration data for the Y-axis. Default values provided by `AxisData.Builder().build()`. |
| `isZoomAllowed`         | `Boolean`                 | Flag indicating whether zooming functionality is allowed in the chart.       |
| `paddingTop`            | `Dp`                      | Padding at the top of the chart.                                             |
| `bottomPadding`         | `Dp`                      | Padding at the bottom of the chart.                                          |
| `paddingRight`          | `Dp`                      | Padding at the right side of the chart.                                      |
| `containerPaddingEnd`   | `Dp`                      | Padding at the end of the chart container.                                   |
| `backgroundColor`       | `Color`                   | Background color of the chart.                                               |
| `gridLines`             | `GridLinesUtil?`          | Utility class for rendering grid lines on the chart, if provided.            |

#### b. Displaying Bubble Chart

```
@Composable
fun BubbleChartExample(pointsData: List<Point>) {
    val steps = 5
    val textMeasurer = rememberTextMeasurer()
    val xAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisLineColor(lineColor = font_color)
        .axisStepSize(30.dp)
        .steps(pointsData.size - 1)
        .labelData { i -> pointsData[i].x.toInt().toString() }
        .labelAndAxisLinePadding(15.dp)
        .build()

    val yAxisData = AxisData.Builder()
        .fontFamily(
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Regular, weight = FontWeight.Normal)
            )
        )
        .axisLineColor(lineColor = font_color)
        .steps(steps)
        .labelAndAxisLinePadding(15.dp)
        .labelData { i ->
            // Add yMin to get the negative axis values to the scale
            val yMin = pointsData.minOf { it.y }
            val yMax = pointsData.maxOf { it.y }
            val yScale = (yMax - yMin) / steps
            ((i * yScale) + yMin).formatToSinglePrecision()
        }.build()

    val data = BubbleChartData(
        getBubbleChartDataWithSolidStyle(points = pointsData, textMeasurer = textMeasurer),
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        gridLines = GridLinesUtil()
    )

    BubbleChart(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp),
        bubbleChartData = data
    )
}
```

### 4. <ins>Donut Chart</ins>

#### a. Pie Chart Config

| Property                       | Type                           | Description                                                                                   |
|--------------------------------|--------------------------------|-----------------------------------------------------------------------------------------------|
| `startAngle`                   | `Float`                        | Starting angle for the first slice of the pie chart, in degrees. Default is `DEFAULT_START_ANGLE`. |
| `showSliceLabels`              | `Boolean`                      | Flag indicating whether slice labels should be displayed. Default is `true`.                   |
| `sliceLabelTextSize`           | `TextUnit`                     | Text size of the slice labels. Default size is `DEFAULT_SLICE_LABEL_TEXT_SIZE.sp`.             |
| `sliceLabelTextColor`          | `Color`                        | Text color of the slice labels. Default color is `Color.White`.                                |
| `sliceLabelTypeface`           | `FontWeight`                   | Typeface (font weight) of the slice labels. Default is `FontWeight.Normal`.                     |
| `isAnimationEnable`            | `Boolean`                      | Flag indicating whether animation is enabled for the pie chart. Default is `false`.            |
| `animationDuration`            | `Int`                          | Duration of the animation in milliseconds. Minimum value is 1. Default is 500.                 |
| `strokeWidth`                  | `Float`                        | Width of the stroke around each slice in the pie chart. Default is `DEFAULT_STROKE_WIDTH`.      |
| `labelFontSize`                | `TextUnit`                     | Font size of additional labels (e.g., percentage labels). Default is `24.sp`.                  |
| `labelFontWeight`              | `FontWeight`                   | Font weight of additional labels. Default is `FontWeight.Normal`.                               |
| `labelVisible`                 | `Boolean`                      | Flag indicating whether additional labels are visible. Default is `false`.                      |
| `fontFamily`                   | `FontFamily?`                  | Font family for the text in the chart. Default is `null`.                                       |
| `labelType`                    | `LabelType`                    | Type of label to display (e.g., percentage or custom). Default is `LabelType.PERCENTAGE`.       |
| `labelColor`                   | `Color`                        | Color of additional labels. Default color is `Color.White`.                                      |
| `labelColorType`               | `LabelColorType`               | Type of color to use for labels (e.g., specified or automatic). Default is `LabelColorType.SPECIFIED_COLOR`. |
| `backgroundColor`              | `Color`                        | Background color of the pie chart. Default is `Color.White`.                                     |
| `activeSliceAlpha`             | `Float`                        | Alpha value (transparency) of active (selected) slices. Default is `0.8f`.                       |
| `inActiveSliceAlpha`           | `Float`                        | Alpha value (transparency) of inactive (unselected) slices. Default is `1f`.                    |
| `isEllipsizeEnabled`           | `Boolean`                      | Flag indicating whether text ellipsization is enabled for slice labels. Default is `false`.      |
| `sliceMinTextWidthToEllipsize` | `Dp`                           | Minimum width for slice label text before ellipsization is applied. Default is `80.dp`.          |
| `chartPadding`                 | `Int`                          | Padding around the pie chart. Default is `DEFAULT_PADDING`.                                      |
| `isSumVisible`                 | `Boolean`                      | Flag indicating whether a sum value is visible in the chart. Default is `false`.                 |
| `sumUnit`                      | `String`                       | Unit of measurement for the sum value, if visible. Default is an empty string (`""`).            |
| `isClickOnSliceEnabled`        | `Boolean`                      | Flag indicating whether clicking on slices is enabled for interaction. Default is `true`.        |

#### b. Displaying Donut Chart

```
@Composable
fun DonutChartExample() {
    val data = PieChartData(
        slices = listOf(
            PieChartData.Slice("HP", 15f, green_dark),
            PieChartData.Slice("Dell", 30f, yellow_dark),
        ),
        plotType = PlotType.Donut
    )
    val pieChartConfig =
        PieChartConfig(
            labelVisible = true,
            strokeWidth = 120f,
            labelColor = font_color,
            activeSliceAlpha = .9f,
            isEllipsizeEnabled = true,
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
            ),
            labelFontWeight = FontWeight.Bold,
            isAnimationEnable = true,
            chartPadding = 25,
            labelFontSize = 42.sp,
        )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
    ) {
        Legends(
            legendsConfig = getLegendsConfigFromPieChartDataForDonutChart(
                pieChartData = data,
                3
            )
        )
        DonutPieChart(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            data,
            pieChartConfig
        ) { slice ->
            //Custom event on slice tap
        }
    }
}
```

### 5. <ins>Pie Chart</ins>

#### a. Pie Chart Config

| Property                       | Type                           | Description                                                                                   |
|--------------------------------|--------------------------------|-----------------------------------------------------------------------------------------------|
| `startAngle`                   | `Float`                        | Starting angle for the first slice of the pie chart, in degrees. Default is `DEFAULT_START_ANGLE`. |
| `showSliceLabels`              | `Boolean`                      | Flag indicating whether slice labels should be displayed. Default is `true`.                   |
| `sliceLabelTextSize`           | `TextUnit`                     | Text size of the slice labels. Default size is `DEFAULT_SLICE_LABEL_TEXT_SIZE.sp`.             |
| `sliceLabelTextColor`          | `Color`                        | Text color of the slice labels. Default color is `Color.White`.                                |
| `sliceLabelTypeface`           | `FontWeight`                   | Typeface (font weight) of the slice labels. Default is `FontWeight.Normal`.                     |
| `isAnimationEnable`            | `Boolean`                      | Flag indicating whether animation is enabled for the pie chart. Default is `false`.            |
| `animationDuration`            | `Int`                          | Duration of the animation in milliseconds. Minimum value is 1. Default is 500.                 |
| `strokeWidth`                  | `Float`                        | Width of the stroke around each slice in the pie chart. Default is `DEFAULT_STROKE_WIDTH`.      |
| `labelFontSize`                | `TextUnit`                     | Font size of additional labels (e.g., percentage labels). Default is `24.sp`.                  |
| `labelFontWeight`              | `FontWeight`                   | Font weight of additional labels. Default is `FontWeight.Normal`.                               |
| `labelVisible`                 | `Boolean`                      | Flag indicating whether additional labels are visible. Default is `false`.                      |
| `fontFamily`                   | `FontFamily?`                  | Font family for the text in the chart. Default is `null`.                                       |
| `labelType`                    | `LabelType`                    | Type of label to display (e.g., percentage or custom). Default is `LabelType.PERCENTAGE`.       |
| `labelColor`                   | `Color`                        | Color of additional labels. Default color is `Color.White`.                                      |
| `labelColorType`               | `LabelColorType`               | Type of color to use for labels (e.g., specified or automatic). Default is `LabelColorType.SPECIFIED_COLOR`. |
| `backgroundColor`              | `Color`                        | Background color of the pie chart. Default is `Color.White`.                                     |
| `activeSliceAlpha`             | `Float`                        | Alpha value (transparency) of active (selected) slices. Default is `0.8f`.                       |
| `inActiveSliceAlpha`           | `Float`                        | Alpha value (transparency) of inactive (unselected) slices. Default is `1f`.                    |
| `isEllipsizeEnabled`           | `Boolean`                      | Flag indicating whether text ellipsization is enabled for slice labels. Default is `false`.      |
| `sliceMinTextWidthToEllipsize` | `Dp`                           | Minimum width for slice label text before ellipsization is applied. Default is `80.dp`.          |
| `chartPadding`                 | `Int`                          | Padding around the pie chart. Default is `DEFAULT_PADDING`.                                      |
| `isSumVisible`                 | `Boolean`                      | Flag indicating whether a sum value is visible in the chart. Default is `false`.                 |
| `sumUnit`                      | `String`                       | Unit of measurement for the sum value, if visible. Default is an empty string (`""`).            |
| `isClickOnSliceEnabled`        | `Boolean`                      | Flag indicating whether clicking on slices is enabled for interaction. Default is `true`.        |

#### b. Displaying Pie Chart

```
@Composable
fun PieChartExample() {
    val pieChartData = PieChartData(
        slices = listOf(
            PieChartData.Slice("Android", 30f, green_dark),
            PieChartData.Slice("iOS", 30f, blue_dark),
        ),
        plotType = PlotType.Pie
    )
    val pieChartConfig =
        PieChartConfig(
            labelVisible = true,
            activeSliceAlpha = .9f,
            isEllipsizeEnabled = true,
            sliceLabelTypeface = FontWeight.Bold,
            fontFamily = FontFamily(
                Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
            ),
            isAnimationEnable = true,
            chartPadding = 30,
            backgroundColor = white_color,
            showSliceLabels = false,
            animationDuration = 1500
        )
    Column(modifier = Modifier.height(500.dp)) {
        Spacer(modifier = Modifier.height(20.dp))
        Legends(legendsConfig = getLegendsConfigFromPieChartData(pieChartData, 3))
        PieChart(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            pieChartData,
            pieChartConfig
        ) { slice ->
            //Custom event on slice tap
        }
    }
}
```

### 6. <ins>Gauge Chart</ins>

#### a. Guage Chart Config

| Property          | Type      | Description                                         |
|-------------------|-----------|-----------------------------------------------------|
| `placeHolderColor`| `Color`   | Color for the gauge chart placeholder.               |
| `primaryColor`    | `Color`   | Primary color used for the gauge chart.             |
| `strokeWidth`     | `Float`   | Width of the gauge chart's stroke.                  |
| `showNeedle`      | `Boolean` | Flag indicating whether to show the gauge needle.   |
| `showIndicator`   | `Boolean` | Flag indicating whether to show the gauge indicator.|
| `indicatorColor`  | `Color`   | Color of the gauge indicator.                       |
| `indicatorWidth`  | `Float`   | Width of the gauge indicator.                       |

#### b. Displaying Gauge Chart

```
@Composable
fun GaugeChartExample() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        GaugeChart(percentValue = getPercentValue(), gaugeChartConfig = GaugeChartDefaults.gaugeConfigDefaults().copy(
            primaryColor = pink_dark, placeHolderColor = pink_light, indicatorColor = yellow_dark
        ), needleConfig = GaugeChartDefaults.needleConfigDefaults().copy(
            color = green_dark
        ))
    }
}
```

```
fun getPercentValue() = 60
```

### 7. <ins>Circular Chart</ins>

#### a. Circular Chart Style

| Property      | Type         | Description                                                             |
|---------------|--------------|-------------------------------------------------------------------------|
| `chartSize`   | `Dp`         | Size of the circular chart. Default is `200.dp`.                         |
| `startAngle`  | `Float`      | Starting angle for drawing the chart, in degrees. Default is `270F`.      |
| `strokeWidth` | `Dp`         | Width of the stroke used to draw the chart. Default is `30.dp`.           |
| `strokeCap`   | `StrokeCap`  | Stroke cap style for the chart's path. Default is `StrokeCap.Round`.      |
| `textSize`    | `TextUnit`   | Font size of text within the chart. Default is `16.sp`.                   |
| `textColor`   | `Color`      | Color of the text within the chart. Default is `Color.White`.             |
| `fontFamily`  | `FontFamily?`| Font family for the text within the chart. Default is `null`.             |

#### b. Displaying Circular Chart

```
@Composable
fun CircularChartDemo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
        contentAlignment = Alignment.TopStart
    ) {
        CircularChart(
            chartListData = getMockSpiralChartList(),
            chartStyle = CircularChartStyle(
                chartSize = 200.dp, strokeWidth = 20.dp,
                fontFamily = FontFamily(
                    Font(Res.font.Roboto_Medium, weight = FontWeight.Normal)
                )
            ),
        )
    }
}
```

```
fun getMockSpiralChartList() = listOf(
    CircularBarChartEntry(value = 100F, "Activity A", green_dark, 200),
    CircularBarChartEntry(value = 80F, "Activity B", blue_dark, 200),
    CircularBarChartEntry(value = 150F, "Activity C", yellow_dark, 200),
)
```

### 8. <ins>Area Chart</ins>

#### a. Axis Configuration

| Property               | Type         | Description                                                       |
|------------------------|--------------|-------------------------------------------------------------------|
| `showAxes`             | `Boolean`    | Flag indicating whether to show axes.                             |
| `showGridLines`        | `Boolean`    | Flag indicating whether to show grid lines.                       |
| `showGridLabel`        | `Boolean`    | Flag indicating whether to show grid labels.                      |
| `axisStroke`           | `Float`      | Stroke width of the axes.                                         |
| `minLabelCount`        | `Int`        | Minimum count of labels to display on the axis.                    |
| `axisColor`            | `Color`      | Color of the axes.                                                |
| `axisLabelFontFamily`  | `FontFamily?`| Font family for the axis labels. Default is `null`.                |
| `gridColor`            | `Color`      | Color of the grid lines, derived from `axisColor` with adjusted alpha. Default is `axisColor.copy(alpha = 0.5F)`. |

#### b. Displaying Area Chart

```
@Composable
fun AreaChartDemo() {
    Box(
        modifier = Modifier
            .wrapContentSize()
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        AreaChart(
            modifier = Modifier
                .size(400.dp),
            areaData = ComposeList(
                getAreaData()
            ),
            axisConfig = ChartDefaults.axisConfigDefaults().copy(
                axisColor = font_color,
                showGridLabel = true,
                gridColor = gray_light,
                axisLabelFontFamily = FontFamily(
                    Font(Res.font.Roboto_Bold, weight = FontWeight.Bold)
                ),
            )
        )
    }
}
```

```
fun getAreaData() = listOf(
    AreaData(
        points = listOf(0.5f, 0.8f, 0.6f, 0.9f, 0.7f, 0.4f),
        xValue = "Item 1",
        color = yellow_dark
    ),
    AreaData(
        xValue = "Item 2",
        points = listOf(0.33f, 0.6f, 0.93f, 0.7f, 0.9f, 1.5f),
        color = pink_dark
    ),
    AreaData(
        xValue = "Item 3",
        points = listOf(0.3f, 0.6f, 0.4f, 0.7f, 0.9f, 0.3f),
        color = green_dark
    ),
)
```


### 9. <ins>Point Chart</ins>

#### a. Axis Configuration

| Property               | Type         | Description                                                       |
|------------------------|--------------|-------------------------------------------------------------------|
| `showAxes`             | `Boolean`    | Flag indicating whether to show axes.                             |
| `showGridLines`        | `Boolean`    | Flag indicating whether to show grid lines.                       |
| `showGridLabel`        | `Boolean`    | Flag indicating whether to show grid labels.                      |
| `axisStroke`           | `Float`      | Stroke width of the axes.                                         |
| `minLabelCount`        | `Int`        | Minimum count of labels to display on the axis.                    |
| `axisColor`            | `Color`      | Color of the axes.                                                |
| `axisLabelFontFamily`  | `FontFamily?`| Font family for the axis labels. Default is `null`.                |
| `gridColor`            | `Color`      | Color of the grid lines, derived from `axisColor` with adjusted alpha. Default is `axisColor.copy(alpha = 0.5F)`. |

#### b. Displaying Point Chart

```
@Composable
fun PointChartDemo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        contentAlignment = Alignment.Center
    ) {
        PointChart(
            dataCollection = ChartDataCollection(getPointChartList()),
            pointType = PointType.Fill,
            modifier = Modifier
                .size(400.dp),
            chartColors = ChartDefaults.colorDefaults().copy(
                backgroundColors = white_color,
                contentColor = green_dark
            ),
            axisConfig = ChartDefaults.axisConfigDefaults().copy(
                axisColor = font_color,
                gridColor = green_light,
                axisLabelFontFamily = FontFamily(
                    Font(Res.font.Roboto_Bold, weight = FontWeight.Bold)
                ),
                minLabelCount = 3
            )
        )
    }
}
```

```
fun getPointChartList() = listOf(
    PointData(0F, "Jan"),
    PointData(10F, "Feb"),
    PointData(05F, "Mar"),
    PointData(50F, "Apr"),
    PointData(55F, "May"),
    PointData(03F, "June"),
    PointData(9F, "July"),
    PointData(40F, "Aug"),
    PointData(60F, "Sept"),
    PointData(33F, "Oct"),
    PointData(11F, "Nov"),
)
```


## Detailed Explanation
For a detailed explanation and a comprehensive guide, please read the [Medium blog post.](https://medium.com/mobile-innovation-network/introducing-compose-multiplatform-charts-solution-for-seamless-charts-integration-to-app-488355a6e098)

Connect with us on [LinkedIn](https://www.linkedin.com/showcase/mobile-innovation-network)
