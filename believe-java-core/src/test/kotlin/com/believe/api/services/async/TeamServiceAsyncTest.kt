// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import com.believe.api.models.teams.GeoLocation
import com.believe.api.models.teams.League
import com.believe.api.models.teams.TeamCreateParams
import com.believe.api.models.teams.TeamUpdateParams
import com.believe.api.models.teams.TeamValues
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val teamServiceAsync = client.teams()

        val teamFuture =
            teamServiceAsync.create(
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

        val team = teamFuture.get()
        team.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val teamServiceAsync = client.teams()

        val teamFuture = teamServiceAsync.retrieve("team_id")

        val team = teamFuture.get()
        team.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val teamServiceAsync = client.teams()

        val teamFuture =
            teamServiceAsync.update(
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

        val team = teamFuture.get()
        team.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val teamServiceAsync = client.teams()

        val pageFuture = teamServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val teamServiceAsync = client.teams()

        val future = teamServiceAsync.delete("team_id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getCulture() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val teamServiceAsync = client.teams()

        val responseFuture = teamServiceAsync.getCulture("team_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRivals() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val teamServiceAsync = client.teams()

        val teamsFuture = teamServiceAsync.getRivals("team_id")

        val teams = teamsFuture.get()
        teams.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLogos() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val teamServiceAsync = client.teams()

        val fileUploadsFuture = teamServiceAsync.listLogos("team_id")

        val fileUploads = fileUploadsFuture.get()
        fileUploads.forEach { it.validate() }
    }
}
