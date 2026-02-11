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

internal class TeamMemberRetrieveResponseTest {

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

        val teamMemberRetrieveResponse = TeamMemberRetrieveResponse.ofPlayer(player)

        assertThat(teamMemberRetrieveResponse.player()).contains(player)
        assertThat(teamMemberRetrieveResponse.coach()).isEmpty
        assertThat(teamMemberRetrieveResponse.medicalStaff()).isEmpty
        assertThat(teamMemberRetrieveResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofPlayerRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberRetrieveResponse =
            TeamMemberRetrieveResponse.ofPlayer(
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

        val roundtrippedTeamMemberRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberRetrieveResponse),
                jacksonTypeRef<TeamMemberRetrieveResponse>(),
            )

        assertThat(roundtrippedTeamMemberRetrieveResponse).isEqualTo(teamMemberRetrieveResponse)
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

        val teamMemberRetrieveResponse = TeamMemberRetrieveResponse.ofCoach(coach)

        assertThat(teamMemberRetrieveResponse.player()).isEmpty
        assertThat(teamMemberRetrieveResponse.coach()).contains(coach)
        assertThat(teamMemberRetrieveResponse.medicalStaff()).isEmpty
        assertThat(teamMemberRetrieveResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofCoachRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberRetrieveResponse =
            TeamMemberRetrieveResponse.ofCoach(
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

        val roundtrippedTeamMemberRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberRetrieveResponse),
                jacksonTypeRef<TeamMemberRetrieveResponse>(),
            )

        assertThat(roundtrippedTeamMemberRetrieveResponse).isEqualTo(teamMemberRetrieveResponse)
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

        val teamMemberRetrieveResponse = TeamMemberRetrieveResponse.ofMedicalStaff(medicalStaff)

        assertThat(teamMemberRetrieveResponse.player()).isEmpty
        assertThat(teamMemberRetrieveResponse.coach()).isEmpty
        assertThat(teamMemberRetrieveResponse.medicalStaff()).contains(medicalStaff)
        assertThat(teamMemberRetrieveResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofMedicalStaffRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberRetrieveResponse =
            TeamMemberRetrieveResponse.ofMedicalStaff(
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

        val roundtrippedTeamMemberRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberRetrieveResponse),
                jacksonTypeRef<TeamMemberRetrieveResponse>(),
            )

        assertThat(roundtrippedTeamMemberRetrieveResponse).isEqualTo(teamMemberRetrieveResponse)
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

        val teamMemberRetrieveResponse =
            TeamMemberRetrieveResponse.ofEquipmentManager(equipmentManager)

        assertThat(teamMemberRetrieveResponse.player()).isEmpty
        assertThat(teamMemberRetrieveResponse.coach()).isEmpty
        assertThat(teamMemberRetrieveResponse.medicalStaff()).isEmpty
        assertThat(teamMemberRetrieveResponse.equipmentManager()).contains(equipmentManager)
    }

    @Test
    fun ofEquipmentManagerRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberRetrieveResponse =
            TeamMemberRetrieveResponse.ofEquipmentManager(
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

        val roundtrippedTeamMemberRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberRetrieveResponse),
                jacksonTypeRef<TeamMemberRetrieveResponse>(),
            )

        assertThat(roundtrippedTeamMemberRetrieveResponse).isEqualTo(teamMemberRetrieveResponse)
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
        val teamMemberRetrieveResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TeamMemberRetrieveResponse>())

        val e = assertThrows<BelieveInvalidDataException> { teamMemberRetrieveResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
