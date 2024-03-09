plugins {
    id("durian-library")
    id("durian-compose-library")
}

android {
    namespace = "com.nhatvm.core.designsystem"

}

dependencies {
    api(libs.bundles.androidComposeLibs)
}