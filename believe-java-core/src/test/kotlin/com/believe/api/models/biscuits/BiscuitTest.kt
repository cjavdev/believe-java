// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.biscuits

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BiscuitTest {

    @Test
    fun create() {
        val biscuit =
            Biscuit.builder()
                .id("biscuit-001")
                .message("Sometimes the best thing you can do is just show up with something warm.")
                .pairsWellWith("A hot cup of tea and an honest conversation")
                .tedNote(
                    "Made these thinking about you. Hope your day is as sweet as these little fellas. - Ted"
                )
                .type(Biscuit.Type.SHORTBREAD)
                .warmthLevel(9L)
                .build()

        assertThat(biscuit.id()).isEqualTo("biscuit-001")
        assertThat(biscuit.message())
            .isEqualTo("Sometimes the best thing you can do is just show up with something warm.")
        assertThat(biscuit.pairsWellWith()).isEqualTo("A hot cup of tea and an honest conversation")
        assertThat(biscuit.tedNote())
            .isEqualTo(
                "Made these thinking about you. Hope your day is as sweet as these little fellas. - Ted"
            )
        assertThat(biscuit.type()).isEqualTo(Biscuit.Type.SHORTBREAD)
        assertThat(biscuit.warmthLevel()).isEqualTo(9L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val biscuit =
            Biscuit.builder()
                .id("biscuit-001")
                .message("Sometimes the best thing you can do is just show up with something warm.")
                .pairsWellWith("A hot cup of tea and an honest conversation")
                .tedNote(
                    "Made these thinking about you. Hope your day is as sweet as these little fellas. - Ted"
                )
                .type(Biscuit.Type.SHORTBREAD)
                .warmthLevel(9L)
                .build()

        val roundtrippedBiscuit =
            jsonMapper.readValue(jsonMapper.writeValueAsString(biscuit), jacksonTypeRef<Biscuit>())

        assertThat(roundtrippedBiscuit).isEqualTo(biscuit)
    }
}
