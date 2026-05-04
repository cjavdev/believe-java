// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async

import dev.cjav.believe.client.okhttp.BelieveOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StreamServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun testConnection() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val streamServiceAsync = client.stream()

        val responseFuture = streamServiceAsync.testConnection()

        val response = responseFuture.get()
        response.validate()
    }
}
