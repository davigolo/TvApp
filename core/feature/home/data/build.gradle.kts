plugins {
    id("java-library")
    id("com.google.devtools.ksp")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(libs.google.dagger.hilt)
    ksp(libs.google.dagger.hilt.compiler)
}