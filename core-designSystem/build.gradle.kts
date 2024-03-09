plugins {
    id("durian-android-library")
}

android {
    namespace = "com.nhatvm.core.designsystem"

}

dependencies {
    val androidComposeBom = platform(libs.android.compose.bom)
    implementation(androidComposeBom)
    implementation(libs.bundles.androidComposeLibs)
}