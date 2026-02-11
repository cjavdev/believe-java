// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookTriggerEventParamsTest {

    @Test
    fun create() {
        WebhookTriggerEventParams.builder()
            .eventType(WebhookTriggerEventParams.EventType.MATCH_COMPLETED)
            .matchCompletedPayload(
                WebhookTriggerEventParams.Payload.MatchCompleted.Data.builder()
                    .awayScore(0L)
                    .awayTeamId("away_team_id")
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .homeScore(0L)
                    .homeTeamId("home_team_id")
                    .matchId("match_id")
                    .matchType(
                        WebhookTriggerEventParams.Payload.MatchCompleted.Data.MatchType.LEAGUE
                    )
                    .result(WebhookTriggerEventParams.Payload.MatchCompleted.Data.Result.HOME_WIN)
                    .tedPostMatchQuote("ted_post_match_quote")
                    .lessonLearned("lesson_learned")
                    .manOfTheMatch("man_of_the_match")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            WebhookTriggerEventParams.builder()
                .eventType(WebhookTriggerEventParams.EventType.MATCH_COMPLETED)
                .matchCompletedPayload(
                    WebhookTriggerEventParams.Payload.MatchCompleted.Data.builder()
                        .awayScore(0L)
                        .awayTeamId("away_team_id")
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .homeScore(0L)
                        .homeTeamId("home_team_id")
                        .matchId("match_id")
                        .matchType(
                            WebhookTriggerEventParams.Payload.MatchCompleted.Data.MatchType.LEAGUE
                        )
                        .result(
                            WebhookTriggerEventParams.Payload.MatchCompleted.Data.Result.HOME_WIN
                        )
                        .tedPostMatchQuote("ted_post_match_quote")
                        .lessonLearned("lesson_learned")
                        .manOfTheMatch("man_of_the_match")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.eventType()).isEqualTo(WebhookTriggerEventParams.EventType.MATCH_COMPLETED)
        assertThat(body.payload())
            .contains(
                WebhookTriggerEventParams.Payload.ofMatchCompleted(
                    WebhookTriggerEventParams.Payload.MatchCompleted.builder()
                        .data(
                            WebhookTriggerEventParams.Payload.MatchCompleted.Data.builder()
                                .awayScore(0L)
                                .awayTeamId("away_team_id")
                                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .homeScore(0L)
                                .homeTeamId("home_team_id")
                                .matchId("match_id")
                                .matchType(
                                    WebhookTriggerEventParams.Payload.MatchCompleted.Data.MatchType
                                        .LEAGUE
                                )
                                .result(
                                    WebhookTriggerEventParams.Payload.MatchCompleted.Data.Result
                                        .HOME_WIN
                                )
                                .tedPostMatchQuote("ted_post_match_quote")
                                .lessonLearned("lesson_learned")
                                .manOfTheMatch("man_of_the_match")
                                .build()
                        )
                        .eventType(
                            WebhookTriggerEventParams.Payload.MatchCompleted.EventType
                                .MATCH_COMPLETED
                        )
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebhookTriggerEventParams.builder()
                .eventType(WebhookTriggerEventParams.EventType.MATCH_COMPLETED)
                .build()

        val body = params._body()

        assertThat(body.eventType()).isEqualTo(WebhookTriggerEventParams.EventType.MATCH_COMPLETED)
    }
}
