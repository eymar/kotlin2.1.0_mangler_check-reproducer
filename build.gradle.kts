plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
}

allprojects {
    tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask::class)
        .configureEach {
            compilerOptions.languageVersion =
                org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_1_9

            compilerOptions.apiVersion =
                org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_1_9
        }
}