// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import dev.cjav.believe.client.okhttp.BelieveOkHttpClient
import dev.cjav.believe.models.believe.BelieveSubmitParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BelieveServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
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
