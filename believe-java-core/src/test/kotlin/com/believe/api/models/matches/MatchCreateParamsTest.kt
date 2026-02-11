// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatchCreateParamsTest {

    @Test
    fun create() {
        MatchCreateParams.builder()
            .awayTeamId("tottenham")
            .date(OffsetDateTime.parse("2024-02-20T19:45:00Z"))
            .homeTeamId("afc-richmond")
            .matchType(MatchType.CUP)
            .attendance(24500L)
            .awayScore(0L)
            .episodeId("s02e05")
            .homeScore(0L)
            .lessonLearned(
                "It's not about the wins and losses, it's about helping these young fellas be the best versions of themselves."
            )
            .possessionPercentage(50.0)
            .result(MatchResult.PENDING)
            .tedHalftimeSpeech(
                "You know what the happiest animal on Earth is? It's a goldfish. You know why? It's got a 10-second memory."
            )
            .ticketRevenueGbp("735000.00")
            .addTurningPoint(
                TurningPoint.builder()
                    .description("description")
                    .emotionalImpact("Galvanized the team's fighting spirit")
                    .minute(0L)
                    .characterInvolved("jamie-tartt")
                    .build()
            )
            .weatherTempCelsius(8.5)
            .build()
    }

    @Test
    fun body() {
        val params =
            MatchCreateParams.builder()
                .awayTeamId("tottenham")
                .date(OffsetDateTime.parse("2024-02-20T19:45:00Z"))
                .homeTeamId("afc-richmond")
                .matchType(MatchType.CUP)
                .attendance(24500L)
                .awayScore(0L)
                .episodeId("s02e05")
                .homeScore(0L)
                .lessonLearned(
                    "It's not about the wins and losses, it's about helping these young fellas be the best versions of themselves."
                )
                .possessionPercentage(50.0)
                .result(MatchResult.PENDING)
                .tedHalftimeSpeech(
                    "You know what the happiest animal on Earth is? It's a goldfish. You know why? It's got a 10-second memory."
                )
                .ticketRevenueGbp("735000.00")
                .addTurningPoint(
                    TurningPoint.builder()
                        .description("description")
                        .emotionalImpact("Galvanized the team's fighting spirit")
                        .minute(0L)
                        .characterInvolved("jamie-tartt")
                        .build()
                )
                .weatherTempCelsius(8.5)
                .build()

        val body = params._body()

        assertThat(body.awayTeamId()).isEqualTo("tottenham")
        assertThat(body.date()).isEqualTo(OffsetDateTime.parse("2024-02-20T19:45:00Z"))
        assertThat(body.homeTeamId()).isEqualTo("afc-richmond")
        assertThat(body.matchType()).isEqualTo(MatchType.CUP)
        assertThat(body.attendance()).contains(24500L)
        assertThat(body.awayScore()).contains(0L)
        assertThat(body.episodeId()).contains("s02e05")
        assertThat(body.homeScore()).contains(0L)
        assertThat(body.lessonLearned())
            .contains(
                "It's not about the wins and losses, it's about helping these young fellas be the best versions of themselves."
            )
        assertThat(body.possessionPercentage()).contains(50.0)
        assertThat(body.result()).contains(MatchResult.PENDING)
        assertThat(body.tedHalftimeSpeech())
            .contains(
                "You know what the happiest animal on Earth is? It's a goldfish. You know why? It's got a 10-second memory."
            )
        assertThat(body.ticketRevenueGbp())
            .contains(MatchCreateParams.TicketRevenueGbp.ofString("735000.00"))
        assertThat(body.turningPoints().getOrNull())
            .containsExactly(
                TurningPoint.builder()
                    .description("description")
                    .emotionalImpact("Galvanized the team's fighting spirit")
                    .minute(0L)
                    .characterInvolved("jamie-tartt")
                    .build()
            )
        assertThat(body.weatherTempCelsius()).contains(8.5)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MatchCreateParams.builder()
                .awayTeamId("tottenham")
                .date(OffsetDateTime.parse("2024-02-20T19:45:00Z"))
                .homeTeamId("afc-richmond")
                .matchType(MatchType.CUP)
                .build()

        val body = params._body()

        assertThat(body.awayTeamId()).isEqualTo("tottenham")
        assertThat(body.date()).isEqualTo(OffsetDateTime.parse("2024-02-20T19:45:00Z"))
        assertThat(body.homeTeamId()).isEqualTo("afc-richmond")
        assertThat(body.matchType()).isEqualTo(MatchType.CUP)
    }
}
