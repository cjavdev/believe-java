// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.TestServerExtension
import com.believe.api.client.okhttp.BelieveOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HealthServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun check() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val healthService = client.health()

        val response = healthService.check()

        response.validate()
    }
}
