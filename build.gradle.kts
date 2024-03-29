// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.gradle.build-scan") version "2.1"
}

buildscript {
    repositories {
        google()
        jcenter()
//        maven { url = uri("https://maven.fabric.io/public")}

    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Versions.gradle}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
//        classpath ("io.fabric.tools:gradle:${Versions.fabric}")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven(url = uri("https//jitpack.io"))
//        maven { url = uri("https://maven.fabric.io/public")}
    }
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
    publishAlways()
}


tasks.register("clean",Delete::class) {
    delete(rootProject.buildDir)
}
