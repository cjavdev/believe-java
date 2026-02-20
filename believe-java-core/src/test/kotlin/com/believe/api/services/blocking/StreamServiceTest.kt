// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.client.okhttp.BelieveOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StreamServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun testConnection() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val streamService = client.stream()

        val response = streamService.testConnection()

        response.validate()
    }
}
