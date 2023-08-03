pluginManagement {
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

rootProject.name = "Durian"
include(":app")
include(":core-network")
include(":core-localstorage")
include(":core-data")
include(":core-model")
include(":core-common")
include(":core-theme")
include(":core-designSystem")
include(":core-navigation")
