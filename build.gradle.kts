val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project


plugins {
    application
    kotlin("kapt") version "1.5.31"
    kotlin("jvm") version "1.5.31"
                id("org.jetbrains.kotlin.plugin.serialization") version "1.5.31"
}

group = "com.alonso"
version = "0.0.1"
application {
    mainClass.set("com.alonso.ApplicationKt")
}

repositories {
    mavenCentral()
}


dependencies {
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-websockets:$ktor_version")
    implementation("io.ktor:ktor-serialization:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.arrow-kt:arrow-core:1.0.0")
    implementation("io.arrow-kt:arrow-fx-coroutines:1.0.0")
    implementation("io.arrow-kt:arrow-fx-stm:1.0.0")
    implementation("io.arrow-kt:arrow-optics:1.0.0")
   // kapt("io.arrow-kt:arrow-meta:1.0.0")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$kotlin_version")
    implementation("io.arrow-kt:arrow-core:1.0.0")

}