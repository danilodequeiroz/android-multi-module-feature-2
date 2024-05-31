val githubUser = "GITHUB_USER"
val githubToken = "GITHUB_TOKEN"

/**
 * Values
 */
val groupId = "com.github.danilodequeiroz.mm"
val artifactId = "featuremodule2"
val artifactVersion = "0.0.1-SNAPSHOT"
val mavenRepositoryName = "GithubPackages"
val mavenRepositoryUrl =
    "https://maven.pkg.github.com/danilodequeiroz/android-multi-module-feature-2"
val featureModule2 = "feature-module-2"

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
include(":$featureModule2")
project(":$featureModule2").name = featureModule2

fun mavenPackagesGithub(
    repositoryHandler: RepositoryHandler,
) = repositoryHandler.maven {
    name = mavenRepositoryName
    url = uri(mavenRepositoryUrl)
    credentials {
        username = System.getenv(githubUser)
        password = System.getenv(githubToken)
    }
}
