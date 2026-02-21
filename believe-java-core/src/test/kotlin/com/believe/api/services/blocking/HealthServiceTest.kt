// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.client.okhttp.BelieveOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HealthServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun check() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val healthService = client.health()

        val response = healthService.check()

        response.validate()
    }
}
