plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}



dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("durianApplicationConventionPlugin") {
            id = "durian-android-application"
            implementationClass = "DurianApplicationConventionPlugin"
        }
        register("durianLibraryConventionPlugin") {
            id = "durian-android-library"
            implementationClass = "DurianLibraryConventionPlugin"
        }
        register("durianHiltConventionPlugin") {
            id = "durian-hilt"
            implementationClass = "DurianHiltConventionPlugin"
        }
    }
}