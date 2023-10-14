buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.1")
    }
}
plugins {
    alias(libs.plugins.android).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.ksp).apply(false)
}
