// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import com.believe.api.models.believe.BelieveSubmitParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BelieveServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun submit() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val believeServiceAsync = client.believe()

        val responseFuture =
            believeServiceAsync.submit(
                BelieveSubmitParams.builder()
                    .situation(
                        "I just got passed over for a promotion I've been working toward for two years."
                    )
                    .situationType(BelieveSubmitParams.SituationType.WORK_CHALLENGE)
                    .context("I've always tried to be a team player and support my colleagues.")
                    .intensity(7L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
