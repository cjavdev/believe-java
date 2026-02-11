// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamMemberListPageResponseTest {

    @Test
    fun create() {
        val teamMemberListPageResponse =
            TeamMemberListPageResponse.builder()
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

        assertThat(teamMemberListPageResponse.data())
            .containsExactly(
                TeamMemberListResponse.ofPlayer(
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
            )
        assertThat(teamMemberListPageResponse.hasMore()).isEqualTo(true)
        assertThat(teamMemberListPageResponse.limit()).isEqualTo(0L)
        assertThat(teamMemberListPageResponse.page()).isEqualTo(0L)
        assertThat(teamMemberListPageResponse.pages()).isEqualTo(0L)
        assertThat(teamMemberListPageResponse.skip()).isEqualTo(0L)
        assertThat(teamMemberListPageResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberListPageResponse =
            TeamMemberListPageResponse.builder()
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

        val roundtrippedTeamMemberListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberListPageResponse),
                jacksonTypeRef<TeamMemberListPageResponse>(),
            )

        assertThat(roundtrippedTeamMemberListPageResponse).isEqualTo(teamMemberListPageResponse)
    }
}
