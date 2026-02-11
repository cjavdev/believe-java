// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmotionalStatsTest {

    @Test
    fun create() {
        val emotionalStats =
            EmotionalStats.builder()
                .curiosity(99L)
                .empathy(100L)
                .optimism(95L)
                .resilience(90L)
                .vulnerability(80L)
                .build()

        assertThat(emotionalStats.curiosity()).isEqualTo(99L)
        assertThat(emotionalStats.empathy()).isEqualTo(100L)
        assertThat(emotionalStats.optimism()).isEqualTo(95L)
        assertThat(emotionalStats.resilience()).isEqualTo(90L)
        assertThat(emotionalStats.vulnerability()).isEqualTo(80L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emotionalStats =
            EmotionalStats.builder()
                .curiosity(99L)
                .empathy(100L)
                .optimism(95L)
                .resilience(90L)
                .vulnerability(80L)
                .build()

        val roundtrippedEmotionalStats =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emotionalStats),
                jacksonTypeRef<EmotionalStats>(),
            )

        assertThat(roundtrippedEmotionalStats).isEqualTo(emotionalStats)
    }
}
