// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamTest {

    @Test
    fun create() {
        val team =
            Team.builder()
                .id("afc-richmond")
                .cultureScore(85L)
                .foundedYear(1897L)
                .league(League.PREMIER_LEAGUE)
                .name("AFC Richmond")
                .stadium("Nelson Road")
                .values(
                    TeamValues.builder()
                        .primaryValue("Believe")
                        .secondaryValues(listOf("Family", "Resilience", "Joy"))
                        .teamMotto("Football is life!")
                        .build()
                )
                .annualBudgetGbp("50000000.00")
                .averageAttendance(24500.5)
                .contactEmail("info@afcrichmond.com")
                .isActive(true)
                .nickname("The Greyhounds")
                .primaryColor("#0033A0")
                .addRivalTeam("west-ham")
                .addRivalTeam("rupert-fc")
                .secondaryColor("#FFFFFF")
                .stadiumLocation(GeoLocation.builder().latitude(51.4816).longitude(-0.191).build())
                .website("https://www.afcrichmond.com")
                .winPercentage(45.5)
                .build()

        assertThat(team.id()).isEqualTo("afc-richmond")
        assertThat(team.cultureScore()).isEqualTo(85L)
        assertThat(team.foundedYear()).isEqualTo(1897L)
        assertThat(team.league()).isEqualTo(League.PREMIER_LEAGUE)
        assertThat(team.name()).isEqualTo("AFC Richmond")
        assertThat(team.stadium()).isEqualTo("Nelson Road")
        assertThat(team.values())
            .isEqualTo(
                TeamValues.builder()
                    .primaryValue("Believe")
                    .secondaryValues(listOf("Family", "Resilience", "Joy"))
                    .teamMotto("Football is life!")
                    .build()
            )
        assertThat(team.annualBudgetGbp()).contains("50000000.00")
        assertThat(team.averageAttendance()).contains(24500.5)
        assertThat(team.contactEmail()).contains("info@afcrichmond.com")
        assertThat(team.isActive()).contains(true)
        assertThat(team.nickname()).contains("The Greyhounds")
        assertThat(team.primaryColor()).contains("#0033A0")
        assertThat(team.rivalTeams().getOrNull()).containsExactly("west-ham", "rupert-fc")
        assertThat(team.secondaryColor()).contains("#FFFFFF")
        assertThat(team.stadiumLocation())
            .contains(GeoLocation.builder().latitude(51.4816).longitude(-0.191).build())
        assertThat(team.website()).contains("https://www.afcrichmond.com")
        assertThat(team.winPercentage()).contains(45.5)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val team =
            Team.builder()
                .id("afc-richmond")
                .cultureScore(85L)
                .foundedYear(1897L)
                .league(League.PREMIER_LEAGUE)
                .name("AFC Richmond")
                .stadium("Nelson Road")
                .values(
                    TeamValues.builder()
                        .primaryValue("Believe")
                        .secondaryValues(listOf("Family", "Resilience", "Joy"))
                        .teamMotto("Football is life!")
                        .build()
                )
                .annualBudgetGbp("50000000.00")
                .averageAttendance(24500.5)
                .contactEmail("info@afcrichmond.com")
                .isActive(true)
                .nickname("The Greyhounds")
                .primaryColor("#0033A0")
                .addRivalTeam("west-ham")
                .addRivalTeam("rupert-fc")
                .secondaryColor("#FFFFFF")
                .stadiumLocation(GeoLocation.builder().latitude(51.4816).longitude(-0.191).build())
                .website("https://www.afcrichmond.com")
                .winPercentage(45.5)
                .build()

        val roundtrippedTeam =
            jsonMapper.readValue(jsonMapper.writeValueAsString(team), jacksonTypeRef<Team>())

        assertThat(roundtrippedTeam).isEqualTo(team)
    }
}
