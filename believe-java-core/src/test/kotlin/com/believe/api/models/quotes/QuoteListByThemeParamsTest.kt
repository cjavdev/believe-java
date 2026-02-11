// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuoteListByThemeParamsTest {

    @Test
    fun create() {
        QuoteListByThemeParams.builder().theme(QuoteTheme.BELIEF).limit(10L).skip(0L).build()
    }

    @Test
    fun pathParams() {
        val params = QuoteListByThemeParams.builder().theme(QuoteTheme.BELIEF).build()

        assertThat(params._pathParam(0)).isEqualTo("belief")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            QuoteListByThemeParams.builder().theme(QuoteTheme.BELIEF).limit(10L).skip(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "10").put("skip", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = QuoteListByThemeParams.builder().theme(QuoteTheme.BELIEF).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
