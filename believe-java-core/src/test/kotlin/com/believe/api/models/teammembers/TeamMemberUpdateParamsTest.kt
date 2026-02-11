// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamMemberUpdateParamsTest {

    @Test
    fun create() {
        TeamMemberUpdateParams.builder()
            .memberId("member_id")
            .updates(
                TeamMemberUpdateParams.Updates.PlayerUpdate.builder()
                    .assists(0L)
                    .goalsScored(0L)
                    .isCaptain(true)
                    .jerseyNumber(1L)
                    .position(Position.GOALKEEPER)
                    .teamId("team_id")
                    .yearsWithTeam(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TeamMemberUpdateParams.builder()
                .memberId("member_id")
                .updates(TeamMemberUpdateParams.Updates.PlayerUpdate.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("member_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TeamMemberUpdateParams.builder()
                .memberId("member_id")
                .updates(
                    TeamMemberUpdateParams.Updates.PlayerUpdate.builder()
                        .assists(0L)
                        .goalsScored(0L)
                        .isCaptain(true)
                        .jerseyNumber(1L)
                        .position(Position.GOALKEEPER)
                        .teamId("team_id")
                        .yearsWithTeam(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TeamMemberUpdateParams.Updates.ofPlayerUpdate(
                    TeamMemberUpdateParams.Updates.PlayerUpdate.builder()
                        .assists(0L)
                        .goalsScored(0L)
                        .isCaptain(true)
                        .jerseyNumber(1L)
                        .position(Position.GOALKEEPER)
                        .teamId("team_id")
                        .yearsWithTeam(0L)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TeamMemberUpdateParams.builder()
                .memberId("member_id")
                .updates(TeamMemberUpdateParams.Updates.PlayerUpdate.builder().build())
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TeamMemberUpdateParams.Updates.ofPlayerUpdate(
                    TeamMemberUpdateParams.Updates.PlayerUpdate.builder().build()
                )
            )
    }
}
