private object Versions {
    const val agp = "8.6.0-alpha04"
    const val kotlin = "1.9.0"

    const val appcompat = "1.6.1"
    const val coreKtx = "1.10.1"
    const val espressoCore = "3.5.1"
    const val junit = "4.13.2"
    const val junitVersion = "1.1.5"
    const val material = "1.10.0"

    const val lifecycleRuntimeKtx = "2.6.1"
    const val activityCompose = "1.8.0"
    const val composeBom = "2024.04.01"
}

object Libraries {
    const val androidxCoreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val junit = "junit:junit:${Versions.junit}"
    const val androidxJunit = "androidx.test.ext:junit:${Versions.junitVersion}"
    const val androidxEspressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val androidxAppcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val material = "com.google.android.material:material:${Versions.material}"

    object AndroidXCompose {
        const val androidxLifecycleRuntimeKtx =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"
        const val androidxActivityCompose =
            "androidx.activity:activity-compose:${Versions.activityCompose}"
        const val androidxComposeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
        const val androidxUi = "androidx.compose.ui:ui"
        const val androidxUiGraphics = "androidx.compose.ui:ui-graphics"
        const val androidxUiTooling = "androidx.compose.ui:ui-tooling"
        const val androidxUiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
        const val androidxUiTestManifest = "androidx.compose.ui:ui-test-manifest"
        const val androidxUiTestJunit4 = "androidx.compose.ui:ui-test-junit4"
        const val androidxMaterial3 = "androidx.compose.material3:material3"
    }
}

object Plugins {
    object AndroidLibrary {
        const val id = "com.android.library"
        const val version = Versions.agp
    }

    object AndroidApplication {
        const val id = "com.android.application"
        const val version = Versions.agp
    }

    object JetbrainsKotlin {
        const val id = "org.jetbrains.kotlin.android"
        const val version = Versions.kotlin
    }
    object MavenPublish {
        const val id = "maven-publish"
    }
}