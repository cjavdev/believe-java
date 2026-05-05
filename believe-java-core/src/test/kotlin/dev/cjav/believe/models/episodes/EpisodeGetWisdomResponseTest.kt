// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.models.episodes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.believe.core.JsonValue
import dev.cjav.believe.core.jsonMapper
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
