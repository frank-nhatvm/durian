package com.nhatvm.durian

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType

internal fun Project.configureKotlinAndroid(commonExtension: CommonExtension<*, *, *, *>) {
    commonExtension.apply {
        compileSdk = DurianAppConfig.compileSdk
        defaultConfig {
            minSdk = DurianAppConfig.minSdk
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
        tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_1_8.toString()
            }
        }
    }
}