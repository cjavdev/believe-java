// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatchUpdateParamsTest {

    @Test
    fun create() {
        MatchUpdateParams.builder()
            .matchId("match_id")
            .attendance(0L)
            .awayScore(0L)
            .awayTeamId("away_team_id")
            .date(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .episodeId("episode_id")
            .homeScore(0L)
            .homeTeamId("home_team_id")
            .lessonLearned("lesson_learned")
            .matchType(MatchType.LEAGUE)
            .possessionPercentage(0.0)
            .result(MatchResult.WIN)
            .tedHalftimeSpeech("ted_halftime_speech")
            .ticketRevenueGbp(0.0)
            .addTurningPoint(
                TurningPoint.builder()
                    .description("description")
                    .emotionalImpact("Galvanized the team's fighting spirit")
                    .minute(0L)
                    .characterInvolved("jamie-tartt")
                    .build()
            )
            .weatherTempCelsius(-30.0)
            .build()
    }

    @Test
    fun pathParams() {
        val params = MatchUpdateParams.builder().matchId("match_id").build()

        assertThat(params._pathParam(0)).isEqualTo("match_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MatchUpdateParams.builder()
                .matchId("match_id")
                .attendance(0L)
                .awayScore(0L)
                .awayTeamId("away_team_id")
                .date(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .episodeId("episode_id")
                .homeScore(0L)
                .homeTeamId("home_team_id")
                .lessonLearned("lesson_learned")
                .matchType(MatchType.LEAGUE)
                .possessionPercentage(0.0)
                .result(MatchResult.WIN)
                .tedHalftimeSpeech("ted_halftime_speech")
                .ticketRevenueGbp(0.0)
                .addTurningPoint(
                    TurningPoint.builder()
                        .description("description")
                        .emotionalImpact("Galvanized the team's fighting spirit")
                        .minute(0L)
                        .characterInvolved("jamie-tartt")
                        .build()
                )
                .weatherTempCelsius(-30.0)
                .build()

        val body = params._body()

        assertThat(body.attendance()).contains(0L)
        assertThat(body.awayScore()).contains(0L)
        assertThat(body.awayTeamId()).contains("away_team_id")
        assertThat(body.date()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.episodeId()).contains("episode_id")
        assertThat(body.homeScore()).contains(0L)
        assertThat(body.homeTeamId()).contains("home_team_id")
        assertThat(body.lessonLearned()).contains("lesson_learned")
        assertThat(body.matchType()).contains(MatchType.LEAGUE)
        assertThat(body.possessionPercentage()).contains(0.0)
        assertThat(body.result()).contains(MatchResult.WIN)
        assertThat(body.tedHalftimeSpeech()).contains("ted_halftime_speech")
        assertThat(body.ticketRevenueGbp())
            .contains(MatchUpdateParams.TicketRevenueGbp.ofNumber(0.0))
        assertThat(body.turningPoints().getOrNull())
            .containsExactly(
                TurningPoint.builder()
                    .description("description")
                    .emotionalImpact("Galvanized the team's fighting spirit")
                    .minute(0L)
                    .characterInvolved("jamie-tartt")
                    .build()
            )
        assertThat(body.weatherTempCelsius()).contains(-30.0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MatchUpdateParams.builder().matchId("match_id").build()

        val body = params._body()
    }
}
