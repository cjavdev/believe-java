plugins {
    id("believe.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":believe-java-core"))
    implementation(project(":believe-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :believe-java-example:run` to run `Main`
    // Use `./gradlew :believe-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.believe.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
