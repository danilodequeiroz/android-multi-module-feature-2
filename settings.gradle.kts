val FEATURE_MODULE_2 = "feature-module-2"
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
pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()

    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenPackagesGithub(repositoryHandler = this)
    }
}
rootProject.name = "android-multi-module-feature-2"
include(":app")
include(":$FEATURE_MODULE_2")
project(":$FEATURE_MODULE_2").name = FEATURE_MODULE_2



fun mavenPackagesGithub(
    repositoryHandler: RepositoryHandler,
) = repositoryHandler.maven {
    name = MAVEN_REPOSITORY_NAME
    url = uri(MAVEN_REPOSITORY_URL)
    credentials {
        username = System.getenv(GITHUB_USER)
        password = System.getenv(GITHUB_PASSWORD)
    }
}
