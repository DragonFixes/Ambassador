plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "Ambassador"
includeBuild("Velocity") {
    dependencySubstitution {
        substitute(module("com.velocitypowered:velocity-api")).using(project(":velocity-api"))
        substitute(module("com.velocitypowered:velocity-proxy")).using(project(":velocity-proxy"))
    }
}