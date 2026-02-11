// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamMemberCreateParamsTest {

    @Test
    fun create() {
        TeamMemberCreateParams.builder()
            .member(
                TeamMemberCreateParams.Member.Player.builder()
                    .characterId("jamie-tartt")
                    .jerseyNumber(9L)
                    .position(Position.FORWARD)
                    .teamId("afc-richmond")
                    .yearsWithTeam(3L)
                    .assists(23L)
                    .goalsScored(47L)
                    .isCaptain(false)
                    .memberType(TeamMemberCreateParams.Member.Player.MemberType.PLAYER)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TeamMemberCreateParams.builder()
                .member(
                    TeamMemberCreateParams.Member.Player.builder()
                        .characterId("jamie-tartt")
                        .jerseyNumber(9L)
                        .position(Position.FORWARD)
                        .teamId("afc-richmond")
                        .yearsWithTeam(3L)
                        .assists(23L)
                        .goalsScored(47L)
                        .isCaptain(false)
                        .memberType(TeamMemberCreateParams.Member.Player.MemberType.PLAYER)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TeamMemberCreateParams.Member.ofPlayer(
                    TeamMemberCreateParams.Member.Player.builder()
                        .characterId("jamie-tartt")
                        .jerseyNumber(9L)
                        .position(Position.FORWARD)
                        .teamId("afc-richmond")
                        .yearsWithTeam(3L)
                        .assists(23L)
                        .goalsScored(47L)
                        .isCaptain(false)
                        .memberType(TeamMemberCreateParams.Member.Player.MemberType.PLAYER)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TeamMemberCreateParams.builder()
                .member(
                    TeamMemberCreateParams.Member.Player.builder()
                        .characterId("jamie-tartt")
                        .jerseyNumber(9L)
                        .position(Position.FORWARD)
                        .teamId("afc-richmond")
                        .yearsWithTeam(3L)
                        .memberType(TeamMemberCreateParams.Member.Player.MemberType.PLAYER)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TeamMemberCreateParams.Member.ofPlayer(
                    TeamMemberCreateParams.Member.Player.builder()
                        .characterId("jamie-tartt")
                        .jerseyNumber(9L)
                        .position(Position.FORWARD)
                        .teamId("afc-richmond")
                        .yearsWithTeam(3L)
                        .memberType(TeamMemberCreateParams.Member.Player.MemberType.PLAYER)
                        .build()
                )
            )
    }
}
