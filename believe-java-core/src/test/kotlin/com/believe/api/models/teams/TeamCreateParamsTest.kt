// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamCreateParamsTest {

    @Test
    fun create() {
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
            .stadiumLocation(GeoLocation.builder().latitude(51.5387).longitude(-0.0166).build())
            .website("https://www.whufc.com")
            .winPercentage(52.3)
            .build()
    }

    @Test
    fun body() {
        val params =
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
                .stadiumLocation(GeoLocation.builder().latitude(51.5387).longitude(-0.0166).build())
                .website("https://www.whufc.com")
                .winPercentage(52.3)
                .build()

        val body = params._body()

        assertThat(body.cultureScore()).isEqualTo(70L)
        assertThat(body.foundedYear()).isEqualTo(1895L)
        assertThat(body.league()).isEqualTo(League.PREMIER_LEAGUE)
        assertThat(body.name()).isEqualTo("West Ham United")
        assertThat(body.stadium()).isEqualTo("London Stadium")
        assertThat(body.values())
            .isEqualTo(
                TeamValues.builder()
                    .primaryValue("Pride")
                    .secondaryValues(listOf("History", "Community", "Passion"))
                    .teamMotto("Forever Blowing Bubbles")
                    .build()
            )
        assertThat(body.annualBudgetGbp())
            .contains(TeamCreateParams.AnnualBudgetGbp.ofString("150000000.00"))
        assertThat(body.averageAttendance()).contains(59988.0)
        assertThat(body.contactEmail()).contains("info@westhamunited.co.uk")
        assertThat(body.isActive()).contains(true)
        assertThat(body.nickname()).contains("The Hammers")
        assertThat(body.primaryColor()).contains("#7A263A")
        assertThat(body.rivalTeams().getOrNull()).containsExactly("afc-richmond", "tottenham")
        assertThat(body.secondaryColor()).contains("#1BB1E7")
        assertThat(body.stadiumLocation())
            .contains(GeoLocation.builder().latitude(51.5387).longitude(-0.0166).build())
        assertThat(body.website()).contains("https://www.whufc.com")
        assertThat(body.winPercentage()).contains(52.3)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
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
                .build()

        val body = params._body()

        assertThat(body.cultureScore()).isEqualTo(70L)
        assertThat(body.foundedYear()).isEqualTo(1895L)
        assertThat(body.league()).isEqualTo(League.PREMIER_LEAGUE)
        assertThat(body.name()).isEqualTo("West Ham United")
        assertThat(body.stadium()).isEqualTo("London Stadium")
        assertThat(body.values())
            .isEqualTo(
                TeamValues.builder()
                    .primaryValue("Pride")
                    .secondaryValues(listOf("History", "Community", "Passion"))
                    .teamMotto("Forever Blowing Bubbles")
                    .build()
            )
    }
}
