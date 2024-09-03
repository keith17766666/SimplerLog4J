plugins {
    id("java")

    id("maven-publish")
}

group = "dev.keith.logger"
version = "1.0-BETA"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.1.0-alpha1")
}

tasks.test {
    useJUnitPlatform()
}