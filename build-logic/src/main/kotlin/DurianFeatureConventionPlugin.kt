import com.nhatvm.durian.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class DurianFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("durian-library")
                apply("durian-hilt")
                apply("durian-compose-library")
            }

            dependencies {
                add("implementation", project(":core-designSystem"))
                add("implementation", project(":core-data"))
                add("implementation", project(":core-model"))
                add("implementation", project(":core-common"))

                add("implementation",libs.findLibrary("coroutines-android").get())
                add("implementation",libs.findLibrary("hilt-navigation-compose").get())
            }
        }
    }
}