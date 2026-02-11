// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.TestServerExtension
import com.believe.api.client.okhttp.BelieveOkHttpClient
import com.believe.api.models.reframe.ReframeTransformNegativeThoughtsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReframeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun transformNegativeThoughts() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
