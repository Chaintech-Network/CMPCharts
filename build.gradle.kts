plugins {
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.jetbrainsCompose).apply(false)
    alias(libs.plugins.mavenPublish).apply(false)
    alias(libs.plugins.kotlinCocoapods).apply(false)
}

allprojects {
    group = "network.chaintech"
    version = "1.0.0"
}