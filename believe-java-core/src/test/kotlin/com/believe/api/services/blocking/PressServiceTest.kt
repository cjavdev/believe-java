// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.client.okhttp.BelieveOkHttpClient
import com.believe.api.models.press.PressSimulateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PressServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun simulate() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val pressService = client.press()

        val response =
            pressService.simulate(
                PressSimulateParams.builder()
                    .question(
                        "Ted, your team just lost 5-0. How do you explain this embarrassing defeat?"
                    )
                    .hostile(true)
                    .topic("match_result")
                    .build()
            )

        response.validate()
    }
}
