// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.believe

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BelieveSubmitParamsTest {

    @Test
    fun create() {
        BelieveSubmitParams.builder()
            .situation(
                "I just got passed over for a promotion I've been working toward for two years."
            )
            .situationType(BelieveSubmitParams.SituationType.WORK_CHALLENGE)
            .context("I've always tried to be a team player and support my colleagues.")
            .intensity(7L)
            .build()
    }

    @Test
    fun body() {
        val params =
            BelieveSubmitParams.builder()
                .situation(
                    "I just got passed over for a promotion I've been working toward for two years."
                )
                .situationType(BelieveSubmitParams.SituationType.WORK_CHALLENGE)
                .context("I've always tried to be a team player and support my colleagues.")
                .intensity(7L)
                .build()

        val body = params._body()

        assertThat(body.situation())
            .isEqualTo(
                "I just got passed over for a promotion I've been working toward for two years."
            )
        assertThat(body.situationType()).isEqualTo(BelieveSubmitParams.SituationType.WORK_CHALLENGE)
        assertThat(body.context())
            .contains("I've always tried to be a team player and support my colleagues.")
        assertThat(body.intensity()).contains(7L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BelieveSubmitParams.builder()
                .situation(
                    "I just got passed over for a promotion I've been working toward for two years."
                )
                .situationType(BelieveSubmitParams.SituationType.WORK_CHALLENGE)
                .build()

        val body = params._body()

        assertThat(body.situation())
            .isEqualTo(
                "I just got passed over for a promotion I've been working toward for two years."
            )
        assertThat(body.situationType()).isEqualTo(BelieveSubmitParams.SituationType.WORK_CHALLENGE)
    }
}
