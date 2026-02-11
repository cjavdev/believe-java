// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.TestServerExtension
import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import com.believe.api.models.reframe.ReframeTransformNegativeThoughtsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReframeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun transformNegativeThoughts() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val reframeServiceAsync = client.reframe()

        val responseFuture =
            reframeServiceAsync.transformNegativeThoughts(
                ReframeTransformNegativeThoughtsParams.builder()
                    .negativeThought("I'm not good enough for this job.")
                    .recurring(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
