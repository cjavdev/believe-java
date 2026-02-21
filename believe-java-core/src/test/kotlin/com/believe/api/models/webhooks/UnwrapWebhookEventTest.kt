// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

import com.believe.api.core.JsonValue
import com.believe.api.core.jsonMapper
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class UnwrapWebhookEventTest {

    @Test
    fun ofMatchCompleted() {
        val matchCompleted =
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

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofMatchCompleted(matchCompleted)

        assertThat(unwrapWebhookEvent.matchCompleted()).contains(matchCompleted)
        assertThat(unwrapWebhookEvent.teamMemberTransferred()).isEmpty
    }

    @Test
    fun ofMatchCompletedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofMatchCompleted(
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
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofTeamMemberTransferred() {
        val teamMemberTransferred =
            TeamMemberTransferredWebhookEvent.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .data(
                    TeamMemberTransferredWebhookEvent.Data.builder()
                        .characterId("character_id")
                        .characterName("character_name")
                        .memberType(TeamMemberTransferredWebhookEvent.Data.MemberType.PLAYER)
                        .teamId("team_id")
                        .teamMemberId("team_member_id")
                        .teamName("team_name")
                        .tedReaction("ted_reaction")
                        .transferType(TeamMemberTransferredWebhookEvent.Data.TransferType.JOINED)
                        .previousTeamId("previous_team_id")
                        .previousTeamName("previous_team_name")
                        .transferFeeGbp("transfer_fee_gbp")
                        .yearsWithPreviousTeam(0L)
                        .build()
                )
                .eventId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .eventType(TeamMemberTransferredWebhookEvent.EventType.TEAM_MEMBER_TRANSFERRED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofTeamMemberTransferred(teamMemberTransferred)

        assertThat(unwrapWebhookEvent.matchCompleted()).isEmpty
        assertThat(unwrapWebhookEvent.teamMemberTransferred()).contains(teamMemberTransferred)
    }

    @Test
    fun ofTeamMemberTransferredRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofTeamMemberTransferred(
                TeamMemberTransferredWebhookEvent.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .data(
                        TeamMemberTransferredWebhookEvent.Data.builder()
                            .characterId("character_id")
                            .characterName("character_name")
                            .memberType(TeamMemberTransferredWebhookEvent.Data.MemberType.PLAYER)
                            .teamId("team_id")
                            .teamMemberId("team_member_id")
                            .teamName("team_name")
                            .tedReaction("ted_reaction")
                            .transferType(
                                TeamMemberTransferredWebhookEvent.Data.TransferType.JOINED
                            )
                            .previousTeamId("previous_team_id")
                            .previousTeamName("previous_team_name")
                            .transferFeeGbp("transfer_fee_gbp")
                            .yearsWithPreviousTeam(0L)
                            .build()
                    )
                    .eventId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .eventType(TeamMemberTransferredWebhookEvent.EventType.TEAM_MEMBER_TRANSFERRED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val unwrapWebhookEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<UnwrapWebhookEvent>())

        val e = assertThrows<BelieveInvalidDataException> { unwrapWebhookEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
