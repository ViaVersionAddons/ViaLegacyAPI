plugins {
    `java-library`
}

group = "dev.diona"
version = "1.0.0"

repositories {
    maven("https://hub.spigotmc.org/nexus/content/groups/public/")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://repo.viaversion.com")
    mavenCentral()
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
    compileOnly("com.viaversion:viaversion-api:5.0.1")
    compileOnly("it.unimi.dsi:fastutil-core:8.5.12")
    compileOnly("io.netty:netty-all:4.0.20.Final")
    compileOnly("org.checkerframework:checker-qual:3.43.0")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    targetCompatibility = JavaVersion.VERSION_17.toString()
}