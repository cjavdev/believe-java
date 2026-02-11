// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import com.believe.api.core.JsonValue
import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamGetCultureResponseTest {

    @Test
    fun create() {
        val teamGetCultureResponse =
            TeamGetCultureResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamGetCultureResponse =
            TeamGetCultureResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedTeamGetCultureResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamGetCultureResponse),
                jacksonTypeRef<TeamGetCultureResponse>(),
            )

        assertThat(roundtrippedTeamGetCultureResponse).isEqualTo(teamGetCultureResponse)
    }
}
