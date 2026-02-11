// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatchRetrieveParamsTest {

    @Test
    fun create() {
        MatchRetrieveParams.builder().matchId("match_id").build()
    }

    @Test
    fun pathParams() {
        val params = MatchRetrieveParams.builder().matchId("match_id").build()

        assertThat(params._pathParam(0)).isEqualTo("match_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
