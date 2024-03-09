plugins {
    id("durian-application")
    id("durian-hilt")
    id("durian-compose-application")

}

android {
    namespace = "com.nhatvm.durian"

    defaultConfig {
        applicationId = "com.nhatvm.durian"

        versionCode = 1
        versionName = "1.0"

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


    implementation(libs.android.activity.compose)

    implementation(libs.bundles.androidComposeLibs)

    implementation(libs.bundles.googleAccompanistLibs)


    implementation(libs.hilt.navigation.compose)

}