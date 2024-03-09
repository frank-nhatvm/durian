import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import com.nhatvm.durian.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class DurianApplicationComposeConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("com.android.application")
                apply("com.google.devtools.ksp")
            }
            extensions.configure<BaseAppModuleExtension> {
                configureAndroidCompose(this)
            }
        }
    }
}