// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HealthServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun check() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val healthServiceAsync = client.health()

        val responseFuture = healthServiceAsync.check()

        val response = responseFuture.get()
        response.validate()
    }
}
