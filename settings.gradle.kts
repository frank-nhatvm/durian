pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "durian"
include(":app")
include(":core-network")
include(":core-localstorage")
include(":core-data")
include(":core-model")
include(":core-common")
include(":core-designSystem")
include(":core-navigation")
include(":feature-splash")
