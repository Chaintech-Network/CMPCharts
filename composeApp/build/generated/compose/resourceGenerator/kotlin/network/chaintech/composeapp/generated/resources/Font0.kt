@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package network.chaintech.composeapp.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.FontResource

@ExperimentalResourceApi
private object Font0 {
  public val IndieFlower_Regular: FontResource by 
      lazy { init_IndieFlower_Regular() }

  public val Roboto_Bold: FontResource by 
      lazy { init_Roboto_Bold() }

  public val Roboto_Medium: FontResource by 
      lazy { init_Roboto_Medium() }

  public val Roboto_Regular: FontResource by 
      lazy { init_Roboto_Regular() }
}

@ExperimentalResourceApi
internal val Res.font.IndieFlower_Regular: FontResource
  get() = Font0.IndieFlower_Regular

@ExperimentalResourceApi
private fun init_IndieFlower_Regular(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:IndieFlower_Regular",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "font/IndieFlower-Regular.ttf"),
    )
)

@ExperimentalResourceApi
internal val Res.font.Roboto_Bold: FontResource
  get() = Font0.Roboto_Bold

@ExperimentalResourceApi
private fun init_Roboto_Bold(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:Roboto_Bold",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "font/Roboto-Bold.ttf"),
    )
)

@ExperimentalResourceApi
internal val Res.font.Roboto_Medium: FontResource
  get() = Font0.Roboto_Medium

@ExperimentalResourceApi
private fun init_Roboto_Medium(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:Roboto_Medium",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "font/Roboto-Medium.ttf"),
    )
)

@ExperimentalResourceApi
internal val Res.font.Roboto_Regular: FontResource
  get() = Font0.Roboto_Regular

@ExperimentalResourceApi
private fun init_Roboto_Regular(): FontResource = org.jetbrains.compose.resources.FontResource(
  "font:Roboto_Regular",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "font/Roboto-Regular.ttf"),
    )
)
