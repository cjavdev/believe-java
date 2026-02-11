// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TurningPointTest {

    @Test
    fun create() {
        val turningPoint =
            TurningPoint.builder()
                .description("description")
                .emotionalImpact("Galvanized the team's fighting spirit")
                .minute(0L)
                .characterInvolved("jamie-tartt")
                .build()

        assertThat(turningPoint.description()).isEqualTo("description")
        assertThat(turningPoint.emotionalImpact())
            .isEqualTo("Galvanized the team's fighting spirit")
        assertThat(turningPoint.minute()).isEqualTo(0L)
        assertThat(turningPoint.characterInvolved()).contains("jamie-tartt")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val turningPoint =
            TurningPoint.builder()
                .description("description")
                .emotionalImpact("Galvanized the team's fighting spirit")
                .minute(0L)
                .characterInvolved("jamie-tartt")
                .build()

        val roundtrippedTurningPoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(turningPoint),
                jacksonTypeRef<TurningPoint>(),
            )

        assertThat(roundtrippedTurningPoint).isEqualTo(turningPoint)
    }
}
