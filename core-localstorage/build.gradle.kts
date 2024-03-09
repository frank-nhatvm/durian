plugins {
    id("durian-library")
}

android {
    namespace = "com.nhatvm.core.localstorage"
}

dependencies {
    implementation(libs.android.core.ktx)
    implementation(libs.coroutines.android)
}