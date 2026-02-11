// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatchListPageResponseTest {

    @Test
    fun create() {
        val matchListPageResponse =
            MatchListPageResponse.builder()
                .addData(
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
                        .lessonLearned(
                            "Sometimes a tie feels like a win when you've grown as people."
                        )
                        .possessionPercentage(52.3)
                        .result(MatchResult.DRAW)
                        .tedHalftimeSpeech(
                            "Guys, I want you to know, I don't care if we win or lose today. I just want you to go out there and play the best football of your lives."
                        )
                        .ticketRevenueGbp("735000.00")
                        .addTurningPoint(
                            TurningPoint.builder()
                                .description("Jamie Tartt passes to Sam instead of shooting")
                                .emotionalImpact(
                                    "Showed Jamie's growth from selfish to team player"
                                )
                                .minute(89L)
                                .characterInvolved("jamie-tartt")
                                .build()
                        )
                        .weatherTempCelsius(14.5)
                        .build()
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        assertThat(matchListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(matchListPageResponse.hasMore()).isEqualTo(true)
        assertThat(matchListPageResponse.limit()).isEqualTo(0L)
        assertThat(matchListPageResponse.page()).isEqualTo(0L)
        assertThat(matchListPageResponse.pages()).isEqualTo(0L)
        assertThat(matchListPageResponse.skip()).isEqualTo(0L)
        assertThat(matchListPageResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val matchListPageResponse =
            MatchListPageResponse.builder()
                .addData(
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
                        .lessonLearned(
                            "Sometimes a tie feels like a win when you've grown as people."
                        )
                        .possessionPercentage(52.3)
                        .result(MatchResult.DRAW)
                        .tedHalftimeSpeech(
                            "Guys, I want you to know, I don't care if we win or lose today. I just want you to go out there and play the best football of your lives."
                        )
                        .ticketRevenueGbp("735000.00")
                        .addTurningPoint(
                            TurningPoint.builder()
                                .description("Jamie Tartt passes to Sam instead of shooting")
                                .emotionalImpact(
                                    "Showed Jamie's growth from selfish to team player"
                                )
                                .minute(89L)
                                .characterInvolved("jamie-tartt")
                                .build()
                        )
                        .weatherTempCelsius(14.5)
                        .build()
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        val roundtrippedMatchListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(matchListPageResponse),
                jacksonTypeRef<MatchListPageResponse>(),
            )

        assertThat(roundtrippedMatchListPageResponse).isEqualTo(matchListPageResponse)
    }
}
