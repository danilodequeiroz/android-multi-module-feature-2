plugins {
    Plugins.AndroidLibrary.apply {
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
        minSdk = 24

        aarMetadata {
            minCompileSdk = 24
        }

        group = "com.my-company"
        version = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Libraries.androidxCoreKtx)
    implementation(Libraries.androidxAppcompat)
    implementation(Libraries.material)
    implementation(Libraries.AndroidXCompose.androidxLifecycleRuntimeKtx)
    implementation(Libraries.AndroidXCompose.androidxActivityCompose)
    implementation(platform(Libraries.AndroidXCompose.androidxComposeBom))
    implementation(Libraries.AndroidXCompose.androidxUi)
    implementation(Libraries.AndroidXCompose.androidxUiGraphics)
    implementation(Libraries.AndroidXCompose.androidxUiToolingPreview)
    implementation(Libraries.AndroidXCompose.androidxMaterial3)
    testImplementation(Libraries.junit)
    androidTestImplementation(Libraries.androidxJunit)
    androidTestImplementation(Libraries.androidxEspressoCore)
    androidTestImplementation(platform(Libraries.AndroidXCompose.androidxComposeBom))
    androidTestImplementation(Libraries.AndroidXCompose.androidxUiTestJunit4)
    debugImplementation(Libraries.AndroidXCompose.androidxUiTooling)
    debugImplementation(Libraries.AndroidXCompose.androidxUiTestManifest)
}