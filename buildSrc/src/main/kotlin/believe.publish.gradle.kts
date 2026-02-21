plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Ted Lasso API")
                description.set("## Believe in the Power of Positivity!\n\nA comprehensive API celebrating the wisdom, humor, and heart of Ted Lasso.\nPerfect for SDK demos showcasing various REST API features.\n\n### Features\n\n- **CRUD Operations**: Full Create, Read, Update, Delete for all resources\n- **Rich Data Models**: Characters, Teams, Matches, Episodes, and Quotes\n- **Union Types (oneOf)**: Team Members demonstrate discriminated unions\n- **Interactive Endpoints**: Believe Engine, Conflict Resolution, and more\n- **SSE Streaming**: Real-time pep talks and match commentary\n- **Custom Easter Eggs**: Special HTTP status codes for fun\n\n### Core Resources\n\n- **Characters**: Ted, Roy Kent, Rebecca, Jamie, and the whole gang\n- **Teams**: AFC Richmond, Manchester City, West Ham, and more\n- **Matches**: Historic matches with turning points and lessons learned\n- **Episodes**: Full episode guide with Ted's wisdom\n- **Quotes**: Searchable collection of memorable quotes\n\n### Interactive Endpoints\n\n- **POST /believe**: The Believe Engine - get motivational guidance\n- **POST /conflicts/resolve**: Diamond Dogs-style conflict resolution\n- **POST /reframe**: Transform negative thoughts positively\n- **POST /press**: Press conference simulator\n- **GET /coaching/principles**: Ted's coaching philosophy\n- **GET /biscuits**: Biscuits as a Service!\n\n### Streaming (Server-Sent Events)\n\n- **GET /pep-talk**: Pep talk from Ted (add `?stream=true` for SSE)\n- **POST /matches/{id}/commentary/stream**: Live match commentary\n\n### WebSocket (Real-time)\n\n- **WS /matches/live**: Live match simulation with real-time events (goals,\n  fouls, cards, etc.)\n- **WS /ws/test**: Simple WebSocket echo test endpoint\n\n### Data Types Coverage\n\nAll common API data types are integrated across our models:\n\n- **Characters**: date (birth), float (height), decimal (salary), email, URL\n  (profile image)\n- **Teams**: float (attendance, win %), decimal (budget), URL (website), email,\n  GeoLocation (lat/long)\n- **Episodes**: date (air date), float (viewer rating, viewers in millions)\n- **Matches**: datetime, float (possession, temperature), decimal (revenue)\n- **Quotes**: float (popularity score), int (shares)\n- **File uploads**: POST /teams/{id}/logo for image uploads\n\n### Easter Eggs\n\n- **429**: \"Too Much Negativity\" - when you need to be more positive\n- **403**: \"Judgment Without Curiosity\" - be curious, not judgmental\n- **418**: \"I'm a Believer!\" - when you believe too much (is that possible?)\n\n### API Versioning\n\nThis API supports header-based versioning using date format (YYYY-MM-DD).\nInclude one of these headers in your request:\n\n- `X-API-Version: 2026-01-20` (preferred)\n- `API-Version: 2026-01-20`\n\nResponse headers will include:\n\n- `X-API-Version`: The version used for the request\n- `X-API-Supported-Versions`: List of all supported versions\n\nIf no version header is provided, the API defaults to the latest stable version.\n\n_\"Be curious, not judgmental.\"_ - Ted Lasso")
                url.set("https://www.github.com/cjavdev/believe-java")

                licenses {
                    license {
                        name.set("MIT")
                    }
                }

                developers {
                    developer {
                        name.set("Believe")
                        email.set("wave@cjav.dev")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/cjavdev/believe-java.git")
                    developerConnection.set("scm:git:git://github.com/cjavdev/believe-java.git")
                    url.set("https://github.com/cjavdev/believe-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
    repositories {
        if (project.hasProperty("publishLocal")) {
            maven {
                name = "LocalFileSystem"
                url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
