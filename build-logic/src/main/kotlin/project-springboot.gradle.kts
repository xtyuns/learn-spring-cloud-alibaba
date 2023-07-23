plugins {
    id("project-kotlin")
    id("org.springframework.boot")
    id("org.jetbrains.kotlin.plugin.spring")
}

dependencies {
    developmentOnly(platform(project(":dependencies-bom")))
}