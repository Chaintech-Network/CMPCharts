rootProject.name = "ComposeChartsCmp"
include(":composeApp")
include(":cmpcharts")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
//        mavenLocal()
    }
}
