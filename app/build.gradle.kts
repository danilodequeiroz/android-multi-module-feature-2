plugins {
    Plugins.AndroidApplication.apply {
        id(id) version (version)
    }
    Plugins.JetbrainsKotlin.apply {
        id(id) version (version)
    }
}

android {
    namespace = "com.github.danilodequeiroz.mm.feature_module_2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.github.danilodequeiroz.mm.feature_module_2"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.13"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
//    implementation(project(":feature-module-2"))
    //noinspection UseTomlInstead
    implementation("com.github.danilodequeiroz.mm:feature-module-2:0.0.1-SNAPSHOT")
    implementation(Libraries.androidxCoreKtx)
    implementation(Libraries.androidxAppcompat)
    implementation(Libraries.material)
    testImplementation(Libraries.junit)
    androidTestImplementation(Libraries.androidxJunit)
    androidTestImplementation(Libraries.androidxEspressoCore)


    implementation(Libraries.AndroidXCompose.androidxLifecycleRuntimeKtx)
    implementation(Libraries.AndroidXCompose.androidxActivityCompose)
    implementation(platform(Libraries.AndroidXCompose.androidxComposeBom))

    implementation(Libraries.AndroidXCompose.androidxUi)
//    implementation(Libraries.AndroidXCompose.androidxUiGraphics)
//    implementation(Libraries.AndroidXCompose.androidxUiToolingPreview)
    implementation(Libraries.AndroidXCompose.androidxMaterial3)
    androidTestImplementation(platform(Libraries.AndroidXCompose.androidxComposeBom))
//    androidTestImplementation(Libraries.AndroidXCompose.androidxUiTestJunit4)
//    debugImplementation(Libraries.AndroidXCompose.androidxUiTooling)
//    debugImplementation(Libraries.AndroidXCompose.androidxUiTestManifest)
}