// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamUpdateParamsTest {

    @Test
    fun create() {
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
            .stadiumLocation(GeoLocation.builder().latitude(51.4816).longitude(-0.191).build())
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
    }

    @Test
    fun pathParams() {
        val params = TeamUpdateParams.builder().teamId("team_id").build()

        assertThat(params._pathParam(0)).isEqualTo("team_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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
                .stadiumLocation(GeoLocation.builder().latitude(51.4816).longitude(-0.191).build())
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

        val body = params._body()

        assertThat(body.annualBudgetGbp()).contains(TeamUpdateParams.AnnualBudgetGbp.ofNumber(0.0))
        assertThat(body.averageAttendance()).contains(0.0)
        assertThat(body.contactEmail()).contains("dev@stainless.com")
        assertThat(body.cultureScore()).contains(0L)
        assertThat(body.foundedYear()).contains(1800L)
        assertThat(body.isActive()).contains(true)
        assertThat(body.league()).contains(League.PREMIER_LEAGUE)
        assertThat(body.name()).contains("x")
        assertThat(body.nickname()).contains("nickname")
        assertThat(body.primaryColor()).contains("primary_color")
        assertThat(body.rivalTeams().getOrNull()).containsExactly("string")
        assertThat(body.secondaryColor()).contains("secondary_color")
        assertThat(body.stadium()).contains("stadium")
        assertThat(body.stadiumLocation())
            .contains(GeoLocation.builder().latitude(51.4816).longitude(-0.191).build())
        assertThat(body.values())
            .contains(
                TeamValues.builder()
                    .primaryValue("Believe")
                    .secondaryValues(listOf("Family", "Resilience", "Joy"))
                    .teamMotto("Football is life!")
                    .build()
            )
        assertThat(body.website()).contains("https://example.com")
        assertThat(body.winPercentage()).contains(0.0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TeamUpdateParams.builder().teamId("team_id").build()

        val body = params._body()
    }
}
