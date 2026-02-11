// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.biscuits

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BiscuitListPageResponseTest {

    @Test
    fun create() {
        val biscuitListPageResponse =
            BiscuitListPageResponse.builder()
                .addData(
                    Biscuit.builder()
                        .id("biscuit-001")
                        .message(
                            "Sometimes the best thing you can do is just show up with something warm."
                        )
                        .pairsWellWith("A hot cup of tea and an honest conversation")
                        .tedNote(
                            "Made these thinking about you. Hope your day is as sweet as these little fellas. - Ted"
                        )
                        .type(Biscuit.Type.SHORTBREAD)
                        .warmthLevel(9L)
                        .build()
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        assertThat(biscuitListPageResponse.data())
            .containsExactly(
                Biscuit.builder()
                    .id("biscuit-001")
                    .message(
                        "Sometimes the best thing you can do is just show up with something warm."
                    )
                    .pairsWellWith("A hot cup of tea and an honest conversation")
                    .tedNote(
                        "Made these thinking about you. Hope your day is as sweet as these little fellas. - Ted"
                    )
                    .type(Biscuit.Type.SHORTBREAD)
                    .warmthLevel(9L)
                    .build()
            )
        assertThat(biscuitListPageResponse.hasMore()).isEqualTo(true)
        assertThat(biscuitListPageResponse.limit()).isEqualTo(0L)
        assertThat(biscuitListPageResponse.page()).isEqualTo(0L)
        assertThat(biscuitListPageResponse.pages()).isEqualTo(0L)
        assertThat(biscuitListPageResponse.skip()).isEqualTo(0L)
        assertThat(biscuitListPageResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val biscuitListPageResponse =
            BiscuitListPageResponse.builder()
                .addData(
                    Biscuit.builder()
                        .id("biscuit-001")
                        .message(
                            "Sometimes the best thing you can do is just show up with something warm."
                        )
                        .pairsWellWith("A hot cup of tea and an honest conversation")
                        .tedNote(
                            "Made these thinking about you. Hope your day is as sweet as these little fellas. - Ted"
                        )
                        .type(Biscuit.Type.SHORTBREAD)
                        .warmthLevel(9L)
                        .build()
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        val roundtrippedBiscuitListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(biscuitListPageResponse),
                jacksonTypeRef<BiscuitListPageResponse>(),
            )

        assertThat(roundtrippedBiscuitListPageResponse).isEqualTo(biscuitListPageResponse)
    }
}
