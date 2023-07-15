plugins {
    id("project-kotlin")
}

group = "org.example"
version = "unspecified"

dependencies {
    implementation("org.slf4j:slf4j-api")
}

tasks.test {
    useJUnitPlatform()
}