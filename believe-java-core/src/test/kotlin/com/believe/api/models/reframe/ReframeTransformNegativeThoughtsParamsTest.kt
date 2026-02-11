// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.reframe

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReframeTransformNegativeThoughtsParamsTest {

    @Test
    fun create() {
        ReframeTransformNegativeThoughtsParams.builder()
            .negativeThought("I'm not good enough for this job.")
            .recurring(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            ReframeTransformNegativeThoughtsParams.builder()
                .negativeThought("I'm not good enough for this job.")
                .recurring(true)
                .build()

        val body = params._body()

        assertThat(body.negativeThought()).isEqualTo("I'm not good enough for this job.")
        assertThat(body.recurring()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReframeTransformNegativeThoughtsParams.builder()
                .negativeThought("I'm not good enough for this job.")
                .build()

        val body = params._body()

        assertThat(body.negativeThought()).isEqualTo("I'm not good enough for this job.")
    }
}
