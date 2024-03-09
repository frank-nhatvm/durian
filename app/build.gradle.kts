plugins {
    id("durian-android-application")
    id("durian-hilt")
}

android {
    namespace = "com.nhatvm.durian"

    defaultConfig {
        applicationId = "com.nhatvm.durian"

        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(":core-designSystem"))

    implementation(libs.android.core.ktx)


    val androidComposeBom = platform(libs.android.compose.bom)
    implementation(androidComposeBom)

    implementation(libs.android.activity.compose)

    implementation(libs.bundles.androidComposeLibs)

    implementation(libs.bundles.googleAccompanistLibs)


    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}