package network.chaintech.chartscmp.ui.cloudbubblechart

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import network.chaintech.cmpcharts.ui.cloudbubblechart.BubbleCloudChart
import network.chaintech.cmpcharts.ui.cloudbubblechart.config.BubbleChartConfig
import network.chaintech.cmpcharts.ui.cloudbubblechart.models.BubbleData
import network.chaintech.composeapp.generated.resources.Res
import network.chaintech.composeapp.generated.resources.Roboto_Bold
import network.chaintech.composeapp.generated.resources.Roboto_Medium
import org.jetbrains.compose.resources.Font

@Composable
fun BubbleChartPreview() {
    val data = getCloudBubbleChartSampleData()
    Box(modifier = Modifier.fillMaxSize().border(width = 1.dp, color = Color.Gray), contentAlignment = Alignment.Center) {
        BubbleCloudChart(
            bubbleChartConfig = BubbleChartConfig(
                minBubbleRadius = 80.dp,
                bubbleData = data,
                distanceBetweenCircles = 10f,
                bubbleContent = { bubbleData ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {

                        Icon(
                            painter = rememberVectorPainter(bubbleData.image),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(20.dp),
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = bubbleData.title,
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily(
                                    Font(Res.font.Roboto_Bold, weight = FontWeight.Bold)
                                )
                            )
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "${bubbleData.value}",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 11.sp,
                                fontFamily = FontFamily(
                                    Font(Res.font.Roboto_Medium, weight = FontWeight.Bold)
                                )
                            )
                        )
                    }
                },
            ),
            modifier = Modifier
        )
    }
}

@Composable
fun getCloudBubbleChartSampleData(): List<BubbleData> {
    val bubblesList = mutableListOf<BubbleData>()
    val itemList = listOf("Peru", "Laos", "Chad", "Mali", "Oman")
    for (i in 0 until 5) {
        val value = 100f + i * i * 10
        bubblesList.add(
            BubbleData(
                bubbleColor = Color.Green,
                image = Icons.Outlined.Place,
                value = value,
                title = itemList[i]
            )
        )
    }
    bubblesList.sortByDescending { it.bubbleRadius }
    return bubblesList
}