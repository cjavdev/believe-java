// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GrowthArcTest {

    @Test
    fun create() {
        val growthArc =
            GrowthArc.builder()
                .breakthrough("breakthrough")
                .challenge("challenge")
                .endingPoint("ending_point")
                .season(1L)
                .startingPoint("starting_point")
                .build()

        assertThat(growthArc.breakthrough()).isEqualTo("breakthrough")
        assertThat(growthArc.challenge()).isEqualTo("challenge")
        assertThat(growthArc.endingPoint()).isEqualTo("ending_point")
        assertThat(growthArc.season()).isEqualTo(1L)
        assertThat(growthArc.startingPoint()).isEqualTo("starting_point")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val growthArc =
            GrowthArc.builder()
                .breakthrough("breakthrough")
                .challenge("challenge")
                .endingPoint("ending_point")
                .season(1L)
                .startingPoint("starting_point")
                .build()

        val roundtrippedGrowthArc =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(growthArc),
                jacksonTypeRef<GrowthArc>(),
            )

        assertThat(roundtrippedGrowthArc).isEqualTo(growthArc)
    }
}
