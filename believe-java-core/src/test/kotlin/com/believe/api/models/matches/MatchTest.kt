// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatchTest {

    @Test
    fun create() {
        val match =
            Match.builder()
                .id("match-001")
                .awayTeamId("manchester-city")
                .date(OffsetDateTime.parse("2024-01-15T15:00:00Z"))
                .homeTeamId("afc-richmond")
                .matchType(MatchType.LEAGUE)
                .attendance(24500L)
                .awayScore(2L)
                .episodeId("s01e10")
                .homeScore(2L)
                .lessonLearned("Sometimes a tie feels like a win when you've grown as people.")
                .possessionPercentage(52.3)
                .result(MatchResult.DRAW)
                .tedHalftimeSpeech(
                    "Guys, I want you to know, I don't care if we win or lose today. I just want you to go out there and play the best football of your lives."
                )
                .ticketRevenueGbp("735000.00")
                .addTurningPoint(
                    TurningPoint.builder()
                        .description("Jamie Tartt passes to Sam instead of shooting")
                        .emotionalImpact("Showed Jamie's growth from selfish to team player")
                        .minute(89L)
                        .characterInvolved("jamie-tartt")
                        .build()
                )
                .weatherTempCelsius(14.5)
                .build()

        assertThat(match.id()).isEqualTo("match-001")
        assertThat(match.awayTeamId()).isEqualTo("manchester-city")
        assertThat(match.date()).isEqualTo(OffsetDateTime.parse("2024-01-15T15:00:00Z"))
        assertThat(match.homeTeamId()).isEqualTo("afc-richmond")
        assertThat(match.matchType()).isEqualTo(MatchType.LEAGUE)
        assertThat(match.attendance()).contains(24500L)
        assertThat(match.awayScore()).contains(2L)
        assertThat(match.episodeId()).contains("s01e10")
        assertThat(match.homeScore()).contains(2L)
        assertThat(match.lessonLearned())
            .contains("Sometimes a tie feels like a win when you've grown as people.")
        assertThat(match.possessionPercentage()).contains(52.3)
        assertThat(match.result()).contains(MatchResult.DRAW)
        assertThat(match.tedHalftimeSpeech())
            .contains(
                "Guys, I want you to know, I don't care if we win or lose today. I just want you to go out there and play the best football of your lives."
            )
        assertThat(match.ticketRevenueGbp()).contains("735000.00")
        assertThat(match.turningPoints().getOrNull())
            .containsExactly(
                TurningPoint.builder()
                    .description("Jamie Tartt passes to Sam instead of shooting")
                    .emotionalImpact("Showed Jamie's growth from selfish to team player")
                    .minute(89L)
                    .characterInvolved("jamie-tartt")
                    .build()
            )
        assertThat(match.weatherTempCelsius()).contains(14.5)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val match =
            Match.builder()
                .id("match-001")
                .awayTeamId("manchester-city")
                .date(OffsetDateTime.parse("2024-01-15T15:00:00Z"))
                .homeTeamId("afc-richmond")
                .matchType(MatchType.LEAGUE)
                .attendance(24500L)
                .awayScore(2L)
                .episodeId("s01e10")
                .homeScore(2L)
                .lessonLearned("Sometimes a tie feels like a win when you've grown as people.")
                .possessionPercentage(52.3)
                .result(MatchResult.DRAW)
                .tedHalftimeSpeech(
                    "Guys, I want you to know, I don't care if we win or lose today. I just want you to go out there and play the best football of your lives."
                )
                .ticketRevenueGbp("735000.00")
                .addTurningPoint(
                    TurningPoint.builder()
                        .description("Jamie Tartt passes to Sam instead of shooting")
                        .emotionalImpact("Showed Jamie's growth from selfish to team player")
                        .minute(89L)
                        .characterInvolved("jamie-tartt")
                        .build()
                )
                .weatherTempCelsius(14.5)
                .build()

        val roundtrippedMatch =
            jsonMapper.readValue(jsonMapper.writeValueAsString(match), jacksonTypeRef<Match>())

        assertThat(roundtrippedMatch).isEqualTo(match)
    }
}
