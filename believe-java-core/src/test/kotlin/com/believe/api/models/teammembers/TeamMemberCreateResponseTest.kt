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

internal class TeamMemberCreateResponseTest {

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

        val teamMemberCreateResponse = TeamMemberCreateResponse.ofPlayer(player)

        assertThat(teamMemberCreateResponse.player()).contains(player)
        assertThat(teamMemberCreateResponse.coach()).isEmpty
        assertThat(teamMemberCreateResponse.medicalStaff()).isEmpty
        assertThat(teamMemberCreateResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofPlayerRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberCreateResponse =
            TeamMemberCreateResponse.ofPlayer(
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

        val roundtrippedTeamMemberCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberCreateResponse),
                jacksonTypeRef<TeamMemberCreateResponse>(),
            )

        assertThat(roundtrippedTeamMemberCreateResponse).isEqualTo(teamMemberCreateResponse)
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

        val teamMemberCreateResponse = TeamMemberCreateResponse.ofCoach(coach)

        assertThat(teamMemberCreateResponse.player()).isEmpty
        assertThat(teamMemberCreateResponse.coach()).contains(coach)
        assertThat(teamMemberCreateResponse.medicalStaff()).isEmpty
        assertThat(teamMemberCreateResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofCoachRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberCreateResponse =
            TeamMemberCreateResponse.ofCoach(
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

        val roundtrippedTeamMemberCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberCreateResponse),
                jacksonTypeRef<TeamMemberCreateResponse>(),
            )

        assertThat(roundtrippedTeamMemberCreateResponse).isEqualTo(teamMemberCreateResponse)
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

        val teamMemberCreateResponse = TeamMemberCreateResponse.ofMedicalStaff(medicalStaff)

        assertThat(teamMemberCreateResponse.player()).isEmpty
        assertThat(teamMemberCreateResponse.coach()).isEmpty
        assertThat(teamMemberCreateResponse.medicalStaff()).contains(medicalStaff)
        assertThat(teamMemberCreateResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofMedicalStaffRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberCreateResponse =
            TeamMemberCreateResponse.ofMedicalStaff(
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

        val roundtrippedTeamMemberCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberCreateResponse),
                jacksonTypeRef<TeamMemberCreateResponse>(),
            )

        assertThat(roundtrippedTeamMemberCreateResponse).isEqualTo(teamMemberCreateResponse)
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

        val teamMemberCreateResponse = TeamMemberCreateResponse.ofEquipmentManager(equipmentManager)

        assertThat(teamMemberCreateResponse.player()).isEmpty
        assertThat(teamMemberCreateResponse.coach()).isEmpty
        assertThat(teamMemberCreateResponse.medicalStaff()).isEmpty
        assertThat(teamMemberCreateResponse.equipmentManager()).contains(equipmentManager)
    }

    @Test
    fun ofEquipmentManagerRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberCreateResponse =
            TeamMemberCreateResponse.ofEquipmentManager(
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

        val roundtrippedTeamMemberCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberCreateResponse),
                jacksonTypeRef<TeamMemberCreateResponse>(),
            )

        assertThat(roundtrippedTeamMemberCreateResponse).isEqualTo(teamMemberCreateResponse)
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
        val teamMemberCreateResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TeamMemberCreateResponse>())

        val e = assertThrows<BelieveInvalidDataException> { teamMemberCreateResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
