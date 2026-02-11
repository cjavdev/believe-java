// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuoteGetRandomParamsTest {

    @Test
    fun create() {
        QuoteGetRandomParams.builder()
            .characterId("character_id")
            .inspirational(true)
            .theme(QuoteTheme.BELIEF)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            QuoteGetRandomParams.builder()
                .characterId("character_id")
                .inspirational(true)
                .theme(QuoteTheme.BELIEF)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("character_id", "character_id")
                    .put("inspirational", "true")
                    .put("theme", "belief")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = QuoteGetRandomParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
