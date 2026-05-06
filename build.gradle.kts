plugins {
<<<<<<< HEAD
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
=======
>>>>>>> 6389e9d38a8031c1bd31da4ed81beac8b108958f
    id("org.jetbrains.dokka") version "2.0.0"
}

repositories {
    mavenCentral()
}

allprojects {
<<<<<<< HEAD
    group = "com.believe.api"
    version = "0.8.0" // x-release-please-version
=======
    group = "dev.cjav.believe"
    version = "0.8.1" // x-release-please-version
<<<<<<< HEAD
=======
>>>>>>> 6389e9d38a8031c1bd31da4ed81beac8b108958f
>>>>>>> 0f27df6 (Apply custom code)
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
<<<<<<< HEAD
    apply(plugin = "org.jetbrains.dokka")
=======
>>>>>>> 6389e9d38a8031c1bd31da4ed81beac8b108958f
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
<<<<<<< HEAD

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))

            username.set(System.getenv("SONATYPE_USERNAME"))
            password.set(System.getenv("SONATYPE_PASSWORD"))
        }
    }
}
=======
>>>>>>> 6389e9d38a8031c1bd31da4ed81beac8b108958f
