plugins {
    `java-platform`
    `maven-publish`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(enforcedPlatform("org.springframework.boot:spring-boot-dependencies:2.6.13"))
    api(enforcedPlatform("org.springframework.cloud:spring-cloud-dependencies:2021.0.5"))
    api(enforcedPlatform("com.alibaba.cloud:spring-cloud-alibaba-dependencies:2021.0.5.0"))
}

publishing{
    publications{
        create<MavenPublication>("maven") {
            from(components["javaPlatform"])
        }
    }
}