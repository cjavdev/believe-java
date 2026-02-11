// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.coaching.principles

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrincipleListParamsTest {

    @Test
    fun create() {
        PrincipleListParams.builder().limit(10L).skip(0L).build()
    }

    @Test
    fun queryParams() {
        val params = PrincipleListParams.builder().limit(10L).skip(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "10").put("skip", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PrincipleListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
