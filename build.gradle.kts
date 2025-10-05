plugins {
    kotlin("jvm") version "2.2.20"
    id("org.jlleitschuh.gradle.ktlint") version "12.1.2"
}

group = "aoc24"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("passed", "failed")
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    }
}

kotlin {
    jvmToolchain(21)
}

ktlint {
    version.set("1.5.0")
    android.set(false)
}
