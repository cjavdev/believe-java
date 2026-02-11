// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.press

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PressSimulateParamsTest {

    @Test
    fun create() {
        PressSimulateParams.builder()
            .question("Ted, your team just lost 5-0. How do you explain this embarrassing defeat?")
            .hostile(true)
            .topic("match_result")
            .build()
    }

    @Test
    fun body() {
        val params =
            PressSimulateParams.builder()
                .question(
                    "Ted, your team just lost 5-0. How do you explain this embarrassing defeat?"
                )
                .hostile(true)
                .topic("match_result")
                .build()

        val body = params._body()

        assertThat(body.question())
            .isEqualTo("Ted, your team just lost 5-0. How do you explain this embarrassing defeat?")
        assertThat(body.hostile()).contains(true)
        assertThat(body.topic()).contains("match_result")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PressSimulateParams.builder()
                .question(
                    "Ted, your team just lost 5-0. How do you explain this embarrassing defeat?"
                )
                .build()

        val body = params._body()

        assertThat(body.question())
            .isEqualTo("Ted, your team just lost 5-0. How do you explain this embarrassing defeat?")
    }
}
