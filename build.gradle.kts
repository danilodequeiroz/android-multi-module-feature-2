// Top-level build file where you can add configuration options common to all sub-projects/modules.

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
}
