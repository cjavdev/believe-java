// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamListPageResponseTest {

    @Test
    fun create() {
        val teamListPageResponse =
            TeamListPageResponse.builder()
                .addData(
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
                        .stadiumLocation(
                            GeoLocation.builder().latitude(51.4816).longitude(-0.191).build()
                        )
                        .website("https://www.afcrichmond.com")
                        .winPercentage(45.5)
                        .build()
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        assertThat(teamListPageResponse.data())
            .containsExactly(
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
                    .stadiumLocation(
                        GeoLocation.builder().latitude(51.4816).longitude(-0.191).build()
                    )
                    .website("https://www.afcrichmond.com")
                    .winPercentage(45.5)
                    .build()
            )
        assertThat(teamListPageResponse.hasMore()).isEqualTo(true)
        assertThat(teamListPageResponse.limit()).isEqualTo(0L)
        assertThat(teamListPageResponse.page()).isEqualTo(0L)
        assertThat(teamListPageResponse.pages()).isEqualTo(0L)
        assertThat(teamListPageResponse.skip()).isEqualTo(0L)
        assertThat(teamListPageResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamListPageResponse =
            TeamListPageResponse.builder()
                .addData(
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
                        .stadiumLocation(
                            GeoLocation.builder().latitude(51.4816).longitude(-0.191).build()
                        )
                        .website("https://www.afcrichmond.com")
                        .winPercentage(45.5)
                        .build()
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        val roundtrippedTeamListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamListPageResponse),
                jacksonTypeRef<TeamListPageResponse>(),
            )

        assertThat(roundtrippedTeamListPageResponse).isEqualTo(teamListPageResponse)
    }
}
