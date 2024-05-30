// Top-level build file where you can add configuration options common to all sub-projects/modules.
val GITHUB_USER = "GITHUB_USER"
val GITHUB_PASSWORD = "GITHUB_PASSWORD"

/**
 * Values
 */
val GROUP_ID = "com.github.danilodequeiroz.mm"
val ARTIFACT_ID = "featuremodule2"
val ARTIFACT_VERSION = "0.0.1-SNAPSHOT"
val MAVEN_REPOSITORY_NAME = "GithubPackages"
val MAVEN_REPOSITORY_URL =
    "https://maven.pkg.github.com/danilodequeiroz/android-multi-module-feature-2"
val FEATURE_MODULE_2 = "feature-module-2"

plugins {
    Plugins.AndroidApplication.apply {
        id(id) version (version) apply false
    }
    Plugins.JetbrainsKotlin.apply {
        id(id) version (version) apply false
    }
    Plugins.AndroidLibrary.apply {
        id(id) version (version) apply false
    }
    Plugins.MavenPublish.apply {
        id(id)
    }
}

publishing {
    publications {
        create<MavenPublication>("debug") {
            groupId = GROUP_ID
            artifactId = ARTIFACT_ID
            version = ARTIFACT_VERSION
            artifact(
                "${layout.projectDirectory.dir("/$FEATURE_MODULE_2/build/outputs/aar")}/$FEATURE_MODULE_2-debug.aar"
            )
        }
        tasks.withType<PublishToMavenLocal>().configureEach {
            enabled = true
        }
        tasks.named("publishDebugPublicationToMavenLocal") {
            dependsOn(":$FEATURE_MODULE_2:bundleDebugAar")
        }
    }

    repositories {
        maven {
            name = "GithubPackages"
            url = uri("https://maven.pkg.github.com/danilodequeiroz/android-multi-module-feature-2")
            credentials {
                username = System.getenv(GITHUB_USER)
                password = System.getenv(GITHUB_PASSWORD)
            }
        }
    }
}
