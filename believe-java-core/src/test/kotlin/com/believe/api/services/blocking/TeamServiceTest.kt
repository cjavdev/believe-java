// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.client.okhttp.BelieveOkHttpClient
import com.believe.api.models.teams.GeoLocation
import com.believe.api.models.teams.League
import com.believe.api.models.teams.TeamCreateParams
import com.believe.api.models.teams.TeamUpdateParams
import com.believe.api.models.teams.TeamValues
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamService = client.teams()

        val team =
            teamService.create(
                TeamCreateParams.builder()
                    .cultureScore(70L)
                    .foundedYear(1895L)
                    .league(League.PREMIER_LEAGUE)
                    .name("West Ham United")
                    .stadium("London Stadium")
                    .values(
                        TeamValues.builder()
                            .primaryValue("Pride")
                            .secondaryValues(listOf("History", "Community", "Passion"))
                            .teamMotto("Forever Blowing Bubbles")
                            .build()
                    )
                    .annualBudgetGbp("150000000.00")
                    .averageAttendance(59988.0)
                    .contactEmail("info@westhamunited.co.uk")
                    .isActive(true)
                    .nickname("The Hammers")
                    .primaryColor("#7A263A")
                    .addRivalTeam("afc-richmond")
                    .addRivalTeam("tottenham")
                    .secondaryColor("#1BB1E7")
                    .stadiumLocation(
                        GeoLocation.builder().latitude(51.5387).longitude(-0.0166).build()
                    )
                    .website("https://www.whufc.com")
                    .winPercentage(52.3)
                    .build()
            )

        team.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamService = client.teams()

        val team = teamService.retrieve("team_id")

        team.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamService = client.teams()

        val team =
            teamService.update(
                TeamUpdateParams.builder()
                    .teamId("team_id")
                    .annualBudgetGbp(0.0)
                    .averageAttendance(0.0)
                    .contactEmail("dev@stainless.com")
                    .cultureScore(0L)
                    .foundedYear(1800L)
                    .isActive(true)
                    .league(League.PREMIER_LEAGUE)
                    .name("x")
                    .nickname("nickname")
                    .primaryColor("primary_color")
                    .addRivalTeam("string")
                    .secondaryColor("secondary_color")
                    .stadium("stadium")
                    .stadiumLocation(
                        GeoLocation.builder().latitude(51.4816).longitude(-0.191).build()
                    )
                    .values(
                        TeamValues.builder()
                            .primaryValue("Believe")
                            .secondaryValues(listOf("Family", "Resilience", "Joy"))
                            .teamMotto("Football is life!")
                            .build()
                    )
                    .website("https://example.com")
                    .winPercentage(0.0)
                    .build()
            )

        team.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamService = client.teams()

        val page = teamService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamService = client.teams()

        teamService.delete("team_id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getCulture() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamService = client.teams()

        val response = teamService.getCulture("team_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getRivals() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamService = client.teams()

        val teams = teamService.getRivals("team_id")

        teams.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listLogos() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val teamService = client.teams()

        val fileUploads = teamService.listLogos("team_id")

        fileUploads.forEach { it.validate() }
    }
}
