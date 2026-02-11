// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.peptalk

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PepTalkRetrieveParamsTest {

    @Test
    fun create() {
        PepTalkRetrieveParams.builder().stream(true).build()
    }

    @Test
    fun queryParams() {
        val params = PepTalkRetrieveParams.builder().stream(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("stream", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PepTalkRetrieveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
