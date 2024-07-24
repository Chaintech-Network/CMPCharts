@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package network.chaintech.composeapp.generated.resources

import kotlin.OptIn
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.StringResource

@ExperimentalResourceApi
private object String0 {
  public val cyclone: StringResource by 
      lazy { init_cyclone() }

  public val open_github: StringResource by 
      lazy { init_open_github() }

  public val run: StringResource by 
      lazy { init_run() }

  public val stop: StringResource by 
      lazy { init_stop() }

  public val theme: StringResource by 
      lazy { init_theme() }
}

@ExperimentalResourceApi
internal val Res.string.cyclone: StringResource
  get() = String0.cyclone

@ExperimentalResourceApi
private fun init_cyclone(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:cyclone", "cyclone",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "values/strings.xml"),
    )
)

@ExperimentalResourceApi
internal val Res.string.open_github: StringResource
  get() = String0.open_github

@ExperimentalResourceApi
private fun init_open_github(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:open_github", "open_github",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "values/strings.xml"),
    )
)

@ExperimentalResourceApi
internal val Res.string.run: StringResource
  get() = String0.run

@ExperimentalResourceApi
private fun init_run(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:run", "run",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "values/strings.xml"),
    )
)

@ExperimentalResourceApi
internal val Res.string.stop: StringResource
  get() = String0.stop

@ExperimentalResourceApi
private fun init_stop(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:stop", "stop",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "values/strings.xml"),
    )
)

@ExperimentalResourceApi
internal val Res.string.theme: StringResource
  get() = String0.theme

@ExperimentalResourceApi
private fun init_theme(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:theme", "theme",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(), "values/strings.xml"),
    )
)
