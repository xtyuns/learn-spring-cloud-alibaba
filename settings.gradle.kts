rootProject.name = "spring-cloud-alibaba-learn"

pluginManagement {
    includeBuild("build-logic")
}

include(":common-library")
include(":dependencies-bom")
include(":gateway-service")
include(":order-service:order-api")
include(":order-service:order-application")
include(":stock-service:stock-api")
include(":stock-service:stock-application")
