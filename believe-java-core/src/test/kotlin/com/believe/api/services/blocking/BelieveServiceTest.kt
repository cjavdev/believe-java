// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.TestServerExtension
import com.believe.api.client.okhttp.BelieveOkHttpClient
import com.believe.api.models.believe.BelieveSubmitParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BelieveServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun submit() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val believeService = client.believe()

        val response =
            believeService.submit(
                BelieveSubmitParams.builder()
                    .situation(
                        "I just got passed over for a promotion I've been working toward for two years."
                    )
                    .situationType(BelieveSubmitParams.SituationType.WORK_CHALLENGE)
                    .context("I've always tried to be a team player and support my colleagues.")
                    .intensity(7L)
                    .build()
            )

        response.validate()
    }
}
