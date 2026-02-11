// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamValuesTest {

    @Test
    fun create() {
        val teamValues =
            TeamValues.builder()
                .primaryValue("Believe")
                .secondaryValues(listOf("Family", "Resilience", "Joy"))
                .teamMotto("Football is life!")
                .build()

        assertThat(teamValues.primaryValue()).isEqualTo("Believe")
        assertThat(teamValues.secondaryValues()).containsExactly("Family", "Resilience", "Joy")
        assertThat(teamValues.teamMotto()).isEqualTo("Football is life!")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamValues =
            TeamValues.builder()
                .primaryValue("Believe")
                .secondaryValues(listOf("Family", "Resilience", "Joy"))
                .teamMotto("Football is life!")
                .build()

        val roundtrippedTeamValues =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamValues),
                jacksonTypeRef<TeamValues>(),
            )

        assertThat(roundtrippedTeamValues).isEqualTo(teamValues)
    }
}
