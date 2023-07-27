plugins {
    id("project-springboot")
}

group = "org.example"
version = "unspecified"

dependencies {
    implementation(project(":common-library"))
    implementation(project(":order-service:order-api"))
    implementation(project(":stock-service:stock-api"))
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-sentinel")
    implementation("org.springframework.cloud:spring-cloud-starter-loadbalancer")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-discovery")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
    useJUnitPlatform()
}