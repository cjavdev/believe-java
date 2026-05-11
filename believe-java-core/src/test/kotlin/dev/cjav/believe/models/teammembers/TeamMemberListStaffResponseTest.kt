// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.models.teammembers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.believe.core.JsonValue
import dev.cjav.believe.core.jsonMapper
import dev.cjav.believe.errors.BelieveInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TeamMemberListStaffResponseTest {

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

        val teamMemberListStaffResponse = TeamMemberListStaffResponse.ofMedicalStaff(medicalStaff)

        assertThat(teamMemberListStaffResponse.medicalStaff()).contains(medicalStaff)
        assertThat(teamMemberListStaffResponse.equipmentManager()).isEmpty
    }

    @Test
    fun ofMedicalStaffRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberListStaffResponse =
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

        val roundtrippedTeamMemberListStaffResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberListStaffResponse),
                jacksonTypeRef<TeamMemberListStaffResponse>(),
            )

        assertThat(roundtrippedTeamMemberListStaffResponse).isEqualTo(teamMemberListStaffResponse)
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

        val teamMemberListStaffResponse =
            TeamMemberListStaffResponse.ofEquipmentManager(equipmentManager)

        assertThat(teamMemberListStaffResponse.medicalStaff()).isEmpty
        assertThat(teamMemberListStaffResponse.equipmentManager()).contains(equipmentManager)
    }

    @Test
    fun ofEquipmentManagerRoundtrip() {
        val jsonMapper = jsonMapper()
        val teamMemberListStaffResponse =
            TeamMemberListStaffResponse.ofEquipmentManager(
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

        val roundtrippedTeamMemberListStaffResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamMemberListStaffResponse),
                jacksonTypeRef<TeamMemberListStaffResponse>(),
            )

        assertThat(roundtrippedTeamMemberListStaffResponse).isEqualTo(teamMemberListStaffResponse)
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
        val teamMemberListStaffResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TeamMemberListStaffResponse>())

        val e = assertThrows<BelieveInvalidDataException> { teamMemberListStaffResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
