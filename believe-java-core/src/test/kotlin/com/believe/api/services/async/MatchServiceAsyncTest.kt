// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import com.believe.api.models.matches.MatchCreateParams
import com.believe.api.models.matches.MatchResult
import com.believe.api.models.matches.MatchStreamLiveParams
import com.believe.api.models.matches.MatchType
import com.believe.api.models.matches.MatchUpdateParams
import com.believe.api.models.matches.TurningPoint
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val matchServiceAsync = client.matches()

        val matchFuture =
            matchServiceAsync.create(
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

        val match = matchFuture.get()
        match.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val matchServiceAsync = client.matches()

        val matchFuture = matchServiceAsync.retrieve("match_id")

        val match = matchFuture.get()
        match.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val matchServiceAsync = client.matches()

        val matchFuture =
            matchServiceAsync.update(
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

        val match = matchFuture.get()
        match.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val matchServiceAsync = client.matches()

        val pageFuture = matchServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val matchServiceAsync = client.matches()

        val future = matchServiceAsync.delete("match_id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLesson() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val matchServiceAsync = client.matches()

        val responseFuture = matchServiceAsync.getLesson("match_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getTurningPoints() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val matchServiceAsync = client.matches()

        val responseFuture = matchServiceAsync.getTurningPoints("match_id")

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun streamLive() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val matchServiceAsync = client.matches()

        val future =
            matchServiceAsync.streamLive(
                MatchStreamLiveParams.builder()
                    .awayTeam("away_team")
                    .excitementLevel(1L)
                    .homeTeam("home_team")
                    .speed(0.1)
                    .build()
            )

        val response = future.get()
    }
}
