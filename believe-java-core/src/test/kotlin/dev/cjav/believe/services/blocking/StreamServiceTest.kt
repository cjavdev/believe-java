// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import dev.cjav.believe.client.okhttp.BelieveOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StreamServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun testConnection() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val streamService = client.stream()

        val response = streamService.testConnection()

        response.validate()
    }
}
