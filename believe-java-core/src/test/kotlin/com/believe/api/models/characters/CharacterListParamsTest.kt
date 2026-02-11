// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CharacterListParamsTest {

    @Test
    fun create() {
        CharacterListParams.builder()
            .limit(10L)
            .minOptimism(0L)
            .role(CharacterRole.COACH)
            .skip(0L)
            .teamId("team_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CharacterListParams.builder()
                .limit(10L)
                .minOptimism(0L)
                .role(CharacterRole.COACH)
                .skip(0L)
                .teamId("team_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "10")
                    .put("min_optimism", "0")
                    .put("role", "coach")
                    .put("skip", "0")
                    .put("team_id", "team_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CharacterListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
