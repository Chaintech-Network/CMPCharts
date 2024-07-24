@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package network.chaintech.composeapp.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@ExperimentalResourceApi
private object Drawable0 {
  public val ic_cyclone: DrawableResource by 
      lazy { init_ic_cyclone() }

  public val ic_dark_mode: DrawableResource by 
      lazy { init_ic_dark_mode() }

  public val ic_light_mode: DrawableResource by 
      lazy { init_ic_light_mode() }

  public val ic_rotate_right: DrawableResource by 
      lazy { init_ic_rotate_right() }
}

@ExperimentalResourceApi
internal val Res.drawable.ic_cyclone: DrawableResource
  get() = Drawable0.ic_cyclone

@ExperimentalResourceApi
private fun init_ic_cyclone(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:ic_cyclone",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "drawable/ic_cyclone.xml"),
    )
)

@ExperimentalResourceApi
internal val Res.drawable.ic_dark_mode: DrawableResource
  get() = Drawable0.ic_dark_mode

@ExperimentalResourceApi
private fun init_ic_dark_mode(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:ic_dark_mode",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "drawable/ic_dark_mode.xml"),
    )
)

@ExperimentalResourceApi
internal val Res.drawable.ic_light_mode: DrawableResource
  get() = Drawable0.ic_light_mode

@ExperimentalResourceApi
private fun init_ic_light_mode(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:ic_light_mode",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "drawable/ic_light_mode.xml"),
    )
)

@ExperimentalResourceApi
internal val Res.drawable.ic_rotate_right: DrawableResource
  get() = Drawable0.ic_rotate_right

@ExperimentalResourceApi
private fun init_ic_rotate_right(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:ic_rotate_right",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "drawable/ic_rotate_right.xml"),
    )
)
