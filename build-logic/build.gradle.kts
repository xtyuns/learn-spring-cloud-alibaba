plugins {
    `kotlin-dsl`
}

repositories {
    maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public")
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    val kotlinVersion = "1.8.22"
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-allopen:${kotlinVersion}")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:2.7.13")
    implementation("io.spring.gradle:dependency-management-plugin:1.0.15.RELEASE")
}
