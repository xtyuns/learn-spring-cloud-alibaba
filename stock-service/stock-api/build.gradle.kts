plugins {
    id("project-kotlin")
}

group = "org.example"
version = "unspecified"

dependencies {
    implementation(project(":common-library"))
    api("org.springframework.cloud:spring-cloud-starter-openfeign")
}