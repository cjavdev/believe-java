// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatchCompletedWebhookEventTest {

    @Test
    fun create() {
        val matchCompletedWebhookEvent =
            MatchCompletedWebhookEvent.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .data(
                    MatchCompletedWebhookEvent.Data.builder()
                        .awayScore(0L)
                        .awayTeamId("away_team_id")
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .homeScore(0L)
                        .homeTeamId("home_team_id")
                        .matchId("match_id")
                        .matchType(MatchCompletedWebhookEvent.Data.MatchType.LEAGUE)
                        .result(MatchCompletedWebhookEvent.Data.Result.HOME_WIN)
                        .tedPostMatchQuote("ted_post_match_quote")
                        .lessonLearned("lesson_learned")
                        .manOfTheMatch("man_of_the_match")
                        .build()
                )
                .eventId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .eventType(MatchCompletedWebhookEvent.EventType.MATCH_COMPLETED)
                .build()

        assertThat(matchCompletedWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(matchCompletedWebhookEvent.data())
            .isEqualTo(
                MatchCompletedWebhookEvent.Data.builder()
                    .awayScore(0L)
                    .awayTeamId("away_team_id")
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .homeScore(0L)
                    .homeTeamId("home_team_id")
                    .matchId("match_id")
                    .matchType(MatchCompletedWebhookEvent.Data.MatchType.LEAGUE)
                    .result(MatchCompletedWebhookEvent.Data.Result.HOME_WIN)
                    .tedPostMatchQuote("ted_post_match_quote")
                    .lessonLearned("lesson_learned")
                    .manOfTheMatch("man_of_the_match")
                    .build()
            )
        assertThat(matchCompletedWebhookEvent.eventId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(matchCompletedWebhookEvent.eventType())
            .isEqualTo(MatchCompletedWebhookEvent.EventType.MATCH_COMPLETED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val matchCompletedWebhookEvent =
            MatchCompletedWebhookEvent.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .data(
                    MatchCompletedWebhookEvent.Data.builder()
                        .awayScore(0L)
                        .awayTeamId("away_team_id")
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .homeScore(0L)
                        .homeTeamId("home_team_id")
                        .matchId("match_id")
                        .matchType(MatchCompletedWebhookEvent.Data.MatchType.LEAGUE)
                        .result(MatchCompletedWebhookEvent.Data.Result.HOME_WIN)
                        .tedPostMatchQuote("ted_post_match_quote")
                        .lessonLearned("lesson_learned")
                        .manOfTheMatch("man_of_the_match")
                        .build()
                )
                .eventId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .eventType(MatchCompletedWebhookEvent.EventType.MATCH_COMPLETED)
                .build()

        val roundtrippedMatchCompletedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(matchCompletedWebhookEvent),
                jacksonTypeRef<MatchCompletedWebhookEvent>(),
            )

        assertThat(roundtrippedMatchCompletedWebhookEvent).isEqualTo(matchCompletedWebhookEvent)
    }
}
