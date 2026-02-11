// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.coaching.principles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrincipleRetrieveParamsTest {

    @Test
    fun create() {
        PrincipleRetrieveParams.builder().principleId("principle_id").build()
    }

    @Test
    fun pathParams() {
        val params = PrincipleRetrieveParams.builder().principleId("principle_id").build()

        assertThat(params._pathParam(0)).isEqualTo("principle_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
