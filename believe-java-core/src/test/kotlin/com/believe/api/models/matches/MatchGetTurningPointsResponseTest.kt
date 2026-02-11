// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import com.believe.api.core.JsonValue
import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatchGetTurningPointsResponseTest {

    @Test
    fun create() {
        val matchGetTurningPointsResponse =
            MatchGetTurningPointsResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val matchGetTurningPointsResponse =
            MatchGetTurningPointsResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedMatchGetTurningPointsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(matchGetTurningPointsResponse),
                jacksonTypeRef<MatchGetTurningPointsResponse>(),
            )

        assertThat(roundtrippedMatchGetTurningPointsResponse)
            .isEqualTo(matchGetTurningPointsResponse)
    }
}
