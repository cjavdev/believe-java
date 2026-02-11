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

internal class TeamMemberUpdateResponseTest {

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

        val teamMemberUpdateResponse = TeamMemberUpdateResponse.ofPlayer(player)

        assertThat(teamMemberUpdateResponse.player()).contains(player)
        assertThat(teamMemberUpdateResponse.coach()).isEmpty
        assertThat(teamMemberUpdateResponse.medicalStaff()).isEmpty
        assertThat(teamMemberUpdateResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofPlayerRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberUpdateResponse =
            TeamMemberUpdateResponse.ofPlayer(
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

        val roundtrippedTeamMemberUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberUpdateResponse),
                jacksonTypeRef<TeamMemberUpdateResponse>(),
            )

        assertThat(roundtrippedTeamMemberUpdateResponse).isEqualTo(teamMemberUpdateResponse)
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

        val teamMemberUpdateResponse = TeamMemberUpdateResponse.ofCoach(coach)

        assertThat(teamMemberUpdateResponse.player()).isEmpty
        assertThat(teamMemberUpdateResponse.coach()).contains(coach)
        assertThat(teamMemberUpdateResponse.medicalStaff()).isEmpty
        assertThat(teamMemberUpdateResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofCoachRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberUpdateResponse =
            TeamMemberUpdateResponse.ofCoach(
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

        val roundtrippedTeamMemberUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberUpdateResponse),
                jacksonTypeRef<TeamMemberUpdateResponse>(),
            )

        assertThat(roundtrippedTeamMemberUpdateResponse).isEqualTo(teamMemberUpdateResponse)
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

        val teamMemberUpdateResponse = TeamMemberUpdateResponse.ofMedicalStaff(medicalStaff)

        assertThat(teamMemberUpdateResponse.player()).isEmpty
        assertThat(teamMemberUpdateResponse.coach()).isEmpty
        assertThat(teamMemberUpdateResponse.medicalStaff()).contains(medicalStaff)
        assertThat(teamMemberUpdateResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofMedicalStaffRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberUpdateResponse =
            TeamMemberUpdateResponse.ofMedicalStaff(
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

        val roundtrippedTeamMemberUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberUpdateResponse),
                jacksonTypeRef<TeamMemberUpdateResponse>(),
            )

        assertThat(roundtrippedTeamMemberUpdateResponse).isEqualTo(teamMemberUpdateResponse)
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

        val teamMemberUpdateResponse = TeamMemberUpdateResponse.ofEquipmentManager(equipmentManager)

        assertThat(teamMemberUpdateResponse.player()).isEmpty
        assertThat(teamMemberUpdateResponse.coach()).isEmpty
        assertThat(teamMemberUpdateResponse.medicalStaff()).isEmpty
        assertThat(teamMemberUpdateResponse.equipmentManager()).contains(equipmentManager)
    }

    @Test
    fun ofEquipmentManagerRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberUpdateResponse =
            TeamMemberUpdateResponse.ofEquipmentManager(
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

        val roundtrippedTeamMemberUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberUpdateResponse),
                jacksonTypeRef<TeamMemberUpdateResponse>(),
            )

        assertThat(roundtrippedTeamMemberUpdateResponse).isEqualTo(teamMemberUpdateResponse)
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
        val teamMemberUpdateResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TeamMemberUpdateResponse>())

        val e = assertThrows<BelieveInvalidDataException> { teamMemberUpdateResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
