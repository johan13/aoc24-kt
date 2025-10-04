plugins {
    kotlin("jvm") version "2.2.20"
}

group = "aoc24"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    // Testing dependencies
    testImplementation(kotlin("test"))
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}
