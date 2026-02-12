// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamMemberTransferredWebhookEventTest {

    @Test
    fun create() {
        val teamMemberTransferredWebhookEvent =
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

        assertThat(teamMemberTransferredWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(teamMemberTransferredWebhookEvent.data())
            .isEqualTo(
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
        assertThat(teamMemberTransferredWebhookEvent.eventId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(teamMemberTransferredWebhookEvent.eventType())
            .isEqualTo(TeamMemberTransferredWebhookEvent.EventType.TEAM_MEMBER_TRANSFERRED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberTransferredWebhookEvent =
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

        val roundtrippedTeamMemberTransferredWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberTransferredWebhookEvent),
                jacksonTypeRef<TeamMemberTransferredWebhookEvent>(),
            )

        assertThat(roundtrippedTeamMemberTransferredWebhookEvent)
            .isEqualTo(teamMemberTransferredWebhookEvent)
    }
}
