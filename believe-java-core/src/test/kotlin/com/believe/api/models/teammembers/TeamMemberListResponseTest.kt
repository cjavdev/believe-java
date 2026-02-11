// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.JsonValue
import com.believe.api.core.jsonMapper
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TeamMemberListResponseTest {

    @Test
    fun ofPlayer() {
        val player =
            Player.builder()
                .id("jamie-tartt-richmond")
                .characterId("jamie-tartt")
                .jerseyNumber(9L)
                .position(Position.FORWARD)
                .teamId("afc-richmond")
                .yearsWithTeam(3L)
                .assists(23L)
                .goalsScored(47L)
                .isCaptain(false)
                .memberType(Player.MemberType.PLAYER)
                .build()

        val teamMemberListResponse = TeamMemberListResponse.ofPlayer(player)

        assertThat(teamMemberListResponse.player()).contains(player)
        assertThat(teamMemberListResponse.coach()).isEmpty
        assertThat(teamMemberListResponse.medicalStaff()).isEmpty
        assertThat(teamMemberListResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofPlayerRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberListResponse =
            TeamMemberListResponse.ofPlayer(
                Player.builder()
                    .id("jamie-tartt-richmond")
                    .characterId("jamie-tartt")
                    .jerseyNumber(9L)
                    .position(Position.FORWARD)
                    .teamId("afc-richmond")
                    .yearsWithTeam(3L)
                    .assists(23L)
                    .goalsScored(47L)
                    .isCaptain(false)
                    .memberType(Player.MemberType.PLAYER)
                    .build()
            )

        val roundtrippedTeamMemberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberListResponse),
                jacksonTypeRef<TeamMemberListResponse>(),
            )

        assertThat(roundtrippedTeamMemberListResponse).isEqualTo(teamMemberListResponse)
    }

    @Test
    fun ofCoach() {
        val coach =
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

        val teamMemberListResponse = TeamMemberListResponse.ofCoach(coach)

        assertThat(teamMemberListResponse.player()).isEmpty
        assertThat(teamMemberListResponse.coach()).contains(coach)
        assertThat(teamMemberListResponse.medicalStaff()).isEmpty
        assertThat(teamMemberListResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofCoachRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberListResponse =
            TeamMemberListResponse.ofCoach(
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

        val roundtrippedTeamMemberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberListResponse),
                jacksonTypeRef<TeamMemberListResponse>(),
            )

        assertThat(roundtrippedTeamMemberListResponse).isEqualTo(teamMemberListResponse)
    }

    @Test
    fun ofMedicalStaff() {
        val medicalStaff =
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

        val teamMemberListResponse = TeamMemberListResponse.ofMedicalStaff(medicalStaff)

        assertThat(teamMemberListResponse.player()).isEmpty
        assertThat(teamMemberListResponse.coach()).isEmpty
        assertThat(teamMemberListResponse.medicalStaff()).contains(medicalStaff)
        assertThat(teamMemberListResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofMedicalStaffRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberListResponse =
            TeamMemberListResponse.ofMedicalStaff(
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

        val roundtrippedTeamMemberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberListResponse),
                jacksonTypeRef<TeamMemberListResponse>(),
            )

        assertThat(roundtrippedTeamMemberListResponse).isEqualTo(teamMemberListResponse)
    }

    @Test
    fun ofEquipmentManager() {
        val equipmentManager =
            EquipmentManager.builder()
                .id("nate-kitman-richmond")
                .characterId("nathan-shelley")
                .teamId("afc-richmond")
                .yearsWithTeam(5L)
                .isHeadKitman(true)
                .memberType(EquipmentManager.MemberType.EQUIPMENT_MANAGER)
                .addResponsibility("Kit preparation")
                .addResponsibility("Equipment maintenance")
                .build()

        val teamMemberListResponse = TeamMemberListResponse.ofEquipmentManager(equipmentManager)

        assertThat(teamMemberListResponse.player()).isEmpty
        assertThat(teamMemberListResponse.coach()).isEmpty
        assertThat(teamMemberListResponse.medicalStaff()).isEmpty
        assertThat(teamMemberListResponse.equipmentManager()).contains(equipmentManager)
    }

    @Test
    fun ofEquipmentManagerRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberListResponse =
            TeamMemberListResponse.ofEquipmentManager(
                EquipmentManager.builder()
                    .id("nate-kitman-richmond")
                    .characterId("nathan-shelley")
                    .teamId("afc-richmond")
                    .yearsWithTeam(5L)
                    .isHeadKitman(true)
                    .memberType(EquipmentManager.MemberType.EQUIPMENT_MANAGER)
                    .addResponsibility("Kit preparation")
                    .addResponsibility("Equipment maintenance")
                    .build()
            )

        val roundtrippedTeamMemberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberListResponse),
                jacksonTypeRef<TeamMemberListResponse>(),
            )

        assertThat(roundtrippedTeamMemberListResponse).isEqualTo(teamMemberListResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val teamMemberListResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TeamMemberListResponse>())

        val e = assertThrows<BelieveInvalidDataException> { teamMemberListResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
