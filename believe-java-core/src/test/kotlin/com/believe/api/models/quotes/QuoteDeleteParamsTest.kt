// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuoteDeleteParamsTest {

    @Test
    fun create() {
        QuoteDeleteParams.builder().quoteId("quote_id").build()
    }

    @Test
    fun pathParams() {
        val params = QuoteDeleteParams.builder().quoteId("quote_id").build()

        assertThat(params._pathParam(0)).isEqualTo("quote_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
