// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.models.teams

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.believe.core.JsonValue
import dev.cjav.believe.core.jsonMapper
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
