plugins {
    id("durian-android-library")
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


    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}