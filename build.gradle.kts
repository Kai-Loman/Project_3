// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("com.android.library") version "7.4.2" apply false
}

tasks.register<Delete>("clean"){
    delete(rootProject.buildDir)
}