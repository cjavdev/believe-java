// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.client.okhttp.BelieveOkHttpClient
import com.believe.api.models.teammembers.Position
import com.believe.api.models.teammembers.TeamMemberCreateParams
import com.believe.api.models.teammembers.TeamMemberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamMemberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamMemberService = client.teamMembers()

        val teamMember =
            teamMemberService.create(
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

        teamMember.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamMemberService = client.teamMembers()

        val teamMember = teamMemberService.retrieve("member_id")

        teamMember.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamMemberService = client.teamMembers()

        val teamMember =
            teamMemberService.update(
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
            )

        teamMember.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamMemberService = client.teamMembers()

        val page = teamMemberService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamMemberService = client.teamMembers()

        teamMemberService.delete("member_id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listCoaches() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamMemberService = client.teamMembers()

        val page = teamMemberService.listCoaches()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listPlayers() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamMemberService = client.teamMembers()

        val page = teamMemberService.listPlayers()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listStaff() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamMemberService = client.teamMembers()

        val page = teamMemberService.listStaff()

        page.response().validate()
    }
}
