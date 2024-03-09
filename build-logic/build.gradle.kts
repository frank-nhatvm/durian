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
            id = "durian-application"
            implementationClass = "DurianApplicationConventionPlugin"
        }
        register("durianLibraryConventionPlugin") {
            id = "durian-library"
            implementationClass = "DurianLibraryConventionPlugin"
        }
        register("durianHiltConventionPlugin") {
            id = "durian-hilt"
            implementationClass = "DurianHiltConventionPlugin"
        }
        register("durianApplicationComposeConventionPlugin") {
            id = "durian-compose-application"
            implementationClass = "DurianApplicationComposeConventionPlugin"
        }
        register("durianLibraryComposeConventionPlugin") {
            id = "durian-compose-library"
            implementationClass = "DurianLibraryComposeConventionPlugin"
        }
        register("DurianFeatureConventionPlugin") {
            id = "durian-feature"
            implementationClass = "DurianFeatureConventionPlugin"
        }
    }
}