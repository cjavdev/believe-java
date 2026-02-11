// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamMemberListCoachesPageResponseTest {

    @Test
    fun create() {
        val teamMemberListCoachesPageResponse =
            TeamMemberListCoachesPageResponse.builder()
                .addData(
                    Coach.builder()
                        .id("ted-lasso-richmond")
                        .characterId("ted-lasso")
                        .specialty(CoachSpecialty.HEAD_COACH)
                        .teamId("afc-richmond")
                        .yearsWithTeam(2L)
                        .addCertification("NCAA Division II")
                        .memberType(Coach.MemberType.COACH)
                        .winRate(0.55)
                        .build()
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        assertThat(teamMemberListCoachesPageResponse.data())
            .containsExactly(
                Coach.builder()
                    .id("ted-lasso-richmond")
                    .characterId("ted-lasso")
                    .specialty(CoachSpecialty.HEAD_COACH)
                    .teamId("afc-richmond")
                    .yearsWithTeam(2L)
                    .addCertification("NCAA Division II")
                    .memberType(Coach.MemberType.COACH)
                    .winRate(0.55)
                    .build()
            )
        assertThat(teamMemberListCoachesPageResponse.hasMore()).isEqualTo(true)
        assertThat(teamMemberListCoachesPageResponse.limit()).isEqualTo(0L)
        assertThat(teamMemberListCoachesPageResponse.page()).isEqualTo(0L)
        assertThat(teamMemberListCoachesPageResponse.pages()).isEqualTo(0L)
        assertThat(teamMemberListCoachesPageResponse.skip()).isEqualTo(0L)
        assertThat(teamMemberListCoachesPageResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberListCoachesPageResponse =
            TeamMemberListCoachesPageResponse.builder()
                .addData(
                    Coach.builder()
                        .id("ted-lasso-richmond")
                        .characterId("ted-lasso")
                        .specialty(CoachSpecialty.HEAD_COACH)
                        .teamId("afc-richmond")
                        .yearsWithTeam(2L)
                        .addCertification("NCAA Division II")
                        .memberType(Coach.MemberType.COACH)
                        .winRate(0.55)
                        .build()
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        val roundtrippedTeamMemberListCoachesPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberListCoachesPageResponse),
                jacksonTypeRef<TeamMemberListCoachesPageResponse>(),
            )

        assertThat(roundtrippedTeamMemberListCoachesPageResponse)
            .isEqualTo(teamMemberListCoachesPageResponse)
    }
}
