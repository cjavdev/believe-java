// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamMemberListPlayersPageResponseTest {

    @Test
    fun create() {
        val teamMemberListPlayersPageResponse =
            TeamMemberListPlayersPageResponse.builder()
                .addData(
                    Player.builder()
                        .id("jamie-tartt-richmond")
                        .characterId("jamie-tartt")
                        .jerseyNumber(9L)
                        .position(Position.FORWARD)
                        .teamId("afc-richmond")
                        .yearsWithTeam(3L)
                        .assists(23L)
                        .goalsScored(47L)
                        .isCaptain(false)
                        .memberType(Player.MemberType.PLAYER)
                        .build()
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        assertThat(teamMemberListPlayersPageResponse.data())
            .containsExactly(
                Player.builder()
                    .id("jamie-tartt-richmond")
                    .characterId("jamie-tartt")
                    .jerseyNumber(9L)
                    .position(Position.FORWARD)
                    .teamId("afc-richmond")
                    .yearsWithTeam(3L)
                    .assists(23L)
                    .goalsScored(47L)
                    .isCaptain(false)
                    .memberType(Player.MemberType.PLAYER)
                    .build()
            )
        assertThat(teamMemberListPlayersPageResponse.hasMore()).isEqualTo(true)
        assertThat(teamMemberListPlayersPageResponse.limit()).isEqualTo(0L)
        assertThat(teamMemberListPlayersPageResponse.page()).isEqualTo(0L)
        assertThat(teamMemberListPlayersPageResponse.pages()).isEqualTo(0L)
        assertThat(teamMemberListPlayersPageResponse.skip()).isEqualTo(0L)
        assertThat(teamMemberListPlayersPageResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberListPlayersPageResponse =
            TeamMemberListPlayersPageResponse.builder()
                .addData(
                    Player.builder()
                        .id("jamie-tartt-richmond")
                        .characterId("jamie-tartt")
                        .jerseyNumber(9L)
                        .position(Position.FORWARD)
                        .teamId("afc-richmond")
                        .yearsWithTeam(3L)
                        .assists(23L)
                        .goalsScored(47L)
                        .isCaptain(false)
                        .memberType(Player.MemberType.PLAYER)
                        .build()
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        val roundtrippedTeamMemberListPlayersPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberListPlayersPageResponse),
                jacksonTypeRef<TeamMemberListPlayersPageResponse>(),
            )

        assertThat(roundtrippedTeamMemberListPlayersPageResponse)
            .isEqualTo(teamMemberListPlayersPageResponse)
    }
}
