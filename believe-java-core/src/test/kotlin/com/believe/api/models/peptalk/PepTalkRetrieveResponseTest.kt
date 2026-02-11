// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.peptalk

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PepTalkRetrieveResponseTest {

    @Test
    fun create() {
        val pepTalkRetrieveResponse =
            PepTalkRetrieveResponse.builder()
                .chunks(
                    listOf(
                        PepTalkRetrieveResponse.Chunk.builder()
                            .chunkId(1L)
                            .isFinal(false)
                            .text("Hey there, friend. ")
                            .emotionalBeat("connection")
                            .build(),
                        PepTalkRetrieveResponse.Chunk.builder()
                            .chunkId(2L)
                            .isFinal(false)
                            .text("I know things feel tough right now. ")
                            .emotionalBeat("acknowledgment")
                            .build(),
                        PepTalkRetrieveResponse.Chunk.builder()
                            .chunkId(3L)
                            .isFinal(false)
                            .text(
                                "And that's the thing about hard times - they're like a good barbecue rub. "
                            )
                            .emotionalBeat("building_metaphor")
                            .build(),
                        PepTalkRetrieveResponse.Chunk.builder()
                            .chunkId(4L)
                            .isFinal(false)
                            .text("They might sting at first, but they're what give you flavor. ")
                            .emotionalBeat("wisdom")
                            .build(),
                        PepTalkRetrieveResponse.Chunk.builder()
                            .chunkId(5L)
                            .isFinal(true)
                            .text("You got this.")
                            .emotionalBeat("encouragement")
                            .build(),
                    )
                )
                .text(
                    "Hey there, friend. I know things feel tough right now. And that's the thing about hard times - they're like a good barbecue rub. They might sting at first, but they're what give you flavor. You got this."
                )
                .build()

        assertThat(pepTalkRetrieveResponse.chunks())
            .containsExactly(
                PepTalkRetrieveResponse.Chunk.builder()
                    .chunkId(1L)
                    .isFinal(false)
                    .text("Hey there, friend. ")
                    .emotionalBeat("connection")
                    .build(),
                PepTalkRetrieveResponse.Chunk.builder()
                    .chunkId(2L)
                    .isFinal(false)
                    .text("I know things feel tough right now. ")
                    .emotionalBeat("acknowledgment")
                    .build(),
                PepTalkRetrieveResponse.Chunk.builder()
                    .chunkId(3L)
                    .isFinal(false)
                    .text(
                        "And that's the thing about hard times - they're like a good barbecue rub. "
                    )
                    .emotionalBeat("building_metaphor")
                    .build(),
                PepTalkRetrieveResponse.Chunk.builder()
                    .chunkId(4L)
                    .isFinal(false)
                    .text("They might sting at first, but they're what give you flavor. ")
                    .emotionalBeat("wisdom")
                    .build(),
                PepTalkRetrieveResponse.Chunk.builder()
                    .chunkId(5L)
                    .isFinal(true)
                    .text("You got this.")
                    .emotionalBeat("encouragement")
                    .build(),
            )
        assertThat(pepTalkRetrieveResponse.text())
            .isEqualTo(
                "Hey there, friend. I know things feel tough right now. And that's the thing about hard times - they're like a good barbecue rub. They might sting at first, but they're what give you flavor. You got this."
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pepTalkRetrieveResponse =
            PepTalkRetrieveResponse.builder()
                .chunks(
                    listOf(
                        PepTalkRetrieveResponse.Chunk.builder()
                            .chunkId(1L)
                            .isFinal(false)
                            .text("Hey there, friend. ")
                            .emotionalBeat("connection")
                            .build(),
                        PepTalkRetrieveResponse.Chunk.builder()
                            .chunkId(2L)
                            .isFinal(false)
                            .text("I know things feel tough right now. ")
                            .emotionalBeat("acknowledgment")
                            .build(),
                        PepTalkRetrieveResponse.Chunk.builder()
                            .chunkId(3L)
                            .isFinal(false)
                            .text(
                                "And that's the thing about hard times - they're like a good barbecue rub. "
                            )
                            .emotionalBeat("building_metaphor")
                            .build(),
                        PepTalkRetrieveResponse.Chunk.builder()
                            .chunkId(4L)
                            .isFinal(false)
                            .text("They might sting at first, but they're what give you flavor. ")
                            .emotionalBeat("wisdom")
                            .build(),
                        PepTalkRetrieveResponse.Chunk.builder()
                            .chunkId(5L)
                            .isFinal(true)
                            .text("You got this.")
                            .emotionalBeat("encouragement")
                            .build(),
                    )
                )
                .text(
                    "Hey there, friend. I know things feel tough right now. And that's the thing about hard times - they're like a good barbecue rub. They might sting at first, but they're what give you flavor. You got this."
                )
                .build()

        val roundtrippedPepTalkRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pepTalkRetrieveResponse),
                jacksonTypeRef<PepTalkRetrieveResponse>(),
            )

        assertThat(roundtrippedPepTalkRetrieveResponse).isEqualTo(pepTalkRetrieveResponse)
    }
}
