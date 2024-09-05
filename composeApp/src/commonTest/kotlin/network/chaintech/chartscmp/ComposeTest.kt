package network.chaintech.chartscmp

//@OptIn(ExperimentalTestApi::class)
//class ComposeTest {
//
//    @Test
//    fun simpleCheck() = runComposeUiTest {
//        setContent {
//            var txt by remember { mutableStateOf("Go") }
//            Column {
//                Text(
//                    text = txt,
//                    modifier = Modifier.testTag("t_text")
//                )
//                Button(
//                    onClick = { txt += "." },
//                    modifier = Modifier.testTag("t_button")
//                ) {
//                    Text("click me")
//                }
//            }
//        }
//
//        onNodeWithTag("t_button").apply {
//            repeat(3) { performClick() }
//        }
//        onNodeWithTag("t_text").assertTextEquals("Go...")
//    }
//}