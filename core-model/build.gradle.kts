plugins {
    id("durian-library")
    id("durian-hilt")
}

android {
    namespace = "com.nhatvm.core.model"


    defaultConfig {

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

}

dependencies {
    implementation(libs.android.core.ktx)

}