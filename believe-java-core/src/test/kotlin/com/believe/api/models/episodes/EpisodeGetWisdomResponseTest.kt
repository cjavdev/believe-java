// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.episodes

import com.believe.api.core.JsonValue
import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeGetWisdomResponseTest {

    @Test
    fun create() {
        val episodeGetWisdomResponse =
            EpisodeGetWisdomResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val episodeGetWisdomResponse =
            EpisodeGetWisdomResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedEpisodeGetWisdomResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(episodeGetWisdomResponse),
                jacksonTypeRef<EpisodeGetWisdomResponse>(),
            )

        assertThat(roundtrippedEpisodeGetWisdomResponse).isEqualTo(episodeGetWisdomResponse)
    }
}
