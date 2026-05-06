plugins {
    id("org.jetbrains.dokka") version "2.0.0"
}

repositories {
    mavenCentral()
}

allprojects {
    group = "dev.cjav.believe"
<<<<<<< HEAD
    version = "0.8.1" // x-release-please-version
=======
    version = "0.5.0" // x-release-please-version
>>>>>>> c76843b (Apply custom code)
}

subprojects {
    // These are populated with dependencies by `buildSrc` scripts.
    tasks.register("format") {
        group = "Verification"
        description = "Formats all source files."
    }
    tasks.register("lint") {
        group = "Verification"
        description = "Verifies all source files are formatted."
    }
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}

// Avoid race conditions between `dokkaJavadocCollector` and `dokkaJavadocJar` tasks
tasks.named("dokkaJavadocCollector").configure {
    subprojects.flatMap { it.tasks }
        .filter { it.project.name != "believe-java" && it.name == "dokkaJavadocJar" }
        .forEach { mustRunAfter(it) }
}
