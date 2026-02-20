// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.client.okhttp.BelieveOkHttpClient
import com.believe.api.models.matches.MatchCreateParams
import com.believe.api.models.matches.MatchResult
import com.believe.api.models.matches.MatchStreamLiveParams
import com.believe.api.models.matches.MatchType
import com.believe.api.models.matches.MatchUpdateParams
import com.believe.api.models.matches.TurningPoint
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val matchService = client.matches()

        val match =
            matchService.create(
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
            )

        match.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val matchService = client.matches()

        val match = matchService.retrieve("match_id")

        match.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val matchService = client.matches()

        val match =
            matchService.update(
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
            )

        match.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val matchService = client.matches()

        val page = matchService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val matchService = client.matches()

        matchService.delete("match_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLesson() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val matchService = client.matches()

        val response = matchService.getLesson("match_id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getTurningPoints() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val matchService = client.matches()

        val response = matchService.getTurningPoints("match_id")

        response.forEach { it.validate() }
    }

    @Disabled("Mock server doesn't support callbacks yet")
    @Test
    fun streamLive() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val matchService = client.matches()

        matchService.streamLive(
            MatchStreamLiveParams.builder()
                .awayTeam("away_team")
                .excitementLevel(1L)
                .homeTeam("home_team")
                .speed(0.1)
                .build()
        )
    }
}
