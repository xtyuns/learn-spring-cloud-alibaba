plugins {
    id("project-kotlin")
}

group = "org.example"
version = "unspecified"

dependencies {
    implementation(project(":common-library"))
    api("org.springframework.cloud:spring-cloud-starter-openfeign")
    implementation("org.springframework.cloud:spring-cloud-starter-loadbalancer")
    implementation("org.springframework.cloud:spring-cloud-starter-circuitbreaker-resilience4j")
}