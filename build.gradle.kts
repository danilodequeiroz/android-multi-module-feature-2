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
