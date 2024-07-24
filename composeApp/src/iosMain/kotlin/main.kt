import androidx.compose.ui.window.ComposeUIViewController
import network.chaintech.chartscmp.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
