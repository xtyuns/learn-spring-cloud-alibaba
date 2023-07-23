import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
        vendor.set(JvmVendorSpec.ADOPTIUM)
    }

    modularity.inferModulePath.set(false)
}

repositories {
    maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public")
    mavenCentral()
}

dependencies {
    implementation(platform(project(":dependencies-bom")))
    annotationProcessor(platform(project(":dependencies-bom")))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = JavaVersion.toVersion(java.toolchain.languageVersion.get().asInt()).toString()
    }
}