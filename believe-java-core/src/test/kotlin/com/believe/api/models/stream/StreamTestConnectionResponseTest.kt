// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.stream

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamTestConnectionResponseTest {

    @Test
    fun create() {
        val streamTestConnectionResponse = StreamTestConnectionResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val streamTestConnectionResponse = StreamTestConnectionResponse.builder().build()

        val roundtrippedStreamTestConnectionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamTestConnectionResponse),
                jacksonTypeRef<StreamTestConnectionResponse>(),
            )

        assertThat(roundtrippedStreamTestConnectionResponse).isEqualTo(streamTestConnectionResponse)
    }
}
