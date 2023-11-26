// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val kotlin_version by extra("2.0.0-Beta1")
    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.48.1")

    }
    repositories {
        mavenCentral()
    }
}
plugins {
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id ("com.android.library") version "8.0.2" apply false
    id ("com.google.dagger.hilt.android") version "2.48.1" apply false
}