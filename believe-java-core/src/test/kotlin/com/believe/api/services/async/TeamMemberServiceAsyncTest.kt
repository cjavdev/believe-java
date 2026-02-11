// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.TestServerExtension
import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import com.believe.api.models.teammembers.Position
import com.believe.api.models.teammembers.TeamMemberCreateParams
import com.believe.api.models.teammembers.TeamMemberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TeamMemberServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamMemberServiceAsync = client.teamMembers()

        val teamMemberFuture =
            teamMemberServiceAsync.create(
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
            )

        val teamMember = teamMemberFuture.get()
        teamMember.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamMemberServiceAsync = client.teamMembers()

        val teamMemberFuture = teamMemberServiceAsync.retrieve("member_id")

        val teamMember = teamMemberFuture.get()
        teamMember.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamMemberServiceAsync = client.teamMembers()

        val teamMemberFuture =
            teamMemberServiceAsync.update(
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

        val teamMember = teamMemberFuture.get()
        teamMember.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamMemberServiceAsync = client.teamMembers()

        val pageFuture = teamMemberServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamMemberServiceAsync = client.teamMembers()

        val future = teamMemberServiceAsync.delete("member_id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listCoaches() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamMemberServiceAsync = client.teamMembers()

        val pageFuture = teamMemberServiceAsync.listCoaches()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listPlayers() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamMemberServiceAsync = client.teamMembers()

        val pageFuture = teamMemberServiceAsync.listPlayers()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listStaff() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val teamMemberServiceAsync = client.teamMembers()

        val pageFuture = teamMemberServiceAsync.listStaff()

        val page = pageFuture.get()
        page.response().validate()
    }
}
