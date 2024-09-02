plugins {
    id("java")
}

group = "dev.keith"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.1.0-alpha1")
}

tasks.test {
    useJUnitPlatform()
}