// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.biscuits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BiscuitRetrieveParamsTest {

    @Test
    fun create() {
        BiscuitRetrieveParams.builder().biscuitId("biscuit_id").build()
    }

    @Test
    fun pathParams() {
        val params = BiscuitRetrieveParams.builder().biscuitId("biscuit_id").build()

        assertThat(params._pathParam(0)).isEqualTo("biscuit_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
