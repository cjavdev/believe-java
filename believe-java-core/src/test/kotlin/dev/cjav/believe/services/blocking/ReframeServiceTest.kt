// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import dev.cjav.believe.client.okhttp.BelieveOkHttpClient
import dev.cjav.believe.models.reframe.ReframeTransformNegativeThoughtsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReframeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun transformNegativeThoughts() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val reframeService = client.reframe()

        val response =
            reframeService.transformNegativeThoughts(
                ReframeTransformNegativeThoughtsParams.builder()
                    .negativeThought("I'm not good enough for this job.")
                    .recurring(true)
                    .build()
            )

        response.validate()
    }
}
