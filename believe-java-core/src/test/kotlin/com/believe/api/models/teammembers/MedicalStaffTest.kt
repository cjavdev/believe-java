// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MedicalStaffTest {

    @Test
    fun create() {
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

        assertThat(medicalStaff.id()).isEqualTo("sharon-fieldstone-richmond")
        assertThat(medicalStaff.characterId()).isEqualTo("dr-sharon")
        assertThat(medicalStaff.specialty()).isEqualTo(MedicalSpecialty.SPORTS_PSYCHOLOGIST)
        assertThat(medicalStaff.teamId()).isEqualTo("afc-richmond")
        assertThat(medicalStaff.yearsWithTeam()).isEqualTo(1L)
        assertThat(medicalStaff.licenseNumber()).contains("PSY-12345")
        assertThat(medicalStaff.memberType()).contains(MedicalStaff.MemberType.MEDICAL_STAFF)
        assertThat(medicalStaff.qualifications().getOrNull())
            .containsExactly("PhD Clinical Psychology")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedMedicalStaff =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(medicalStaff),
                jacksonTypeRef<MedicalStaff>(),
            )

        assertThat(roundtrippedMedicalStaff).isEqualTo(medicalStaff)
    }
}
