// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamMemberListStaffPageResponseTest {

    @Test
    fun create() {
        val teamMemberListStaffPageResponse =
            TeamMemberListStaffPageResponse.builder()
                .addData(
                    MedicalStaff.builder()
                        .id("sharon-fieldstone-richmond")
                        .characterId("dr-sharon")
                        .specialty(MedicalSpecialty.SPORTS_PSYCHOLOGIST)
                        .teamId("afc-richmond")
                        .yearsWithTeam(1L)
                        .licenseNumber("PSY-12345")
                        .memberType(MedicalStaff.MemberType.MEDICAL_STAFF)
                        .addQualification("PhD Clinical Psychology")
                        .build()
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        assertThat(teamMemberListStaffPageResponse.data())
            .containsExactly(
                TeamMemberListStaffResponse.ofMedicalStaff(
                    MedicalStaff.builder()
                        .id("sharon-fieldstone-richmond")
                        .characterId("dr-sharon")
                        .specialty(MedicalSpecialty.SPORTS_PSYCHOLOGIST)
                        .teamId("afc-richmond")
                        .yearsWithTeam(1L)
                        .licenseNumber("PSY-12345")
                        .memberType(MedicalStaff.MemberType.MEDICAL_STAFF)
                        .addQualification("PhD Clinical Psychology")
                        .build()
                )
            )
        assertThat(teamMemberListStaffPageResponse.hasMore()).isEqualTo(true)
        assertThat(teamMemberListStaffPageResponse.limit()).isEqualTo(0L)
        assertThat(teamMemberListStaffPageResponse.page()).isEqualTo(0L)
        assertThat(teamMemberListStaffPageResponse.pages()).isEqualTo(0L)
        assertThat(teamMemberListStaffPageResponse.skip()).isEqualTo(0L)
        assertThat(teamMemberListStaffPageResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberListStaffPageResponse =
            TeamMemberListStaffPageResponse.builder()
                .addData(
                    MedicalStaff.builder()
                        .id("sharon-fieldstone-richmond")
                        .characterId("dr-sharon")
                        .specialty(MedicalSpecialty.SPORTS_PSYCHOLOGIST)
                        .teamId("afc-richmond")
                        .yearsWithTeam(1L)
                        .licenseNumber("PSY-12345")
                        .memberType(MedicalStaff.MemberType.MEDICAL_STAFF)
                        .addQualification("PhD Clinical Psychology")
                        .build()
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        val roundtrippedTeamMemberListStaffPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberListStaffPageResponse),
                jacksonTypeRef<TeamMemberListStaffPageResponse>(),
            )

        assertThat(roundtrippedTeamMemberListStaffPageResponse)
            .isEqualTo(teamMemberListStaffPageResponse)
    }
}
