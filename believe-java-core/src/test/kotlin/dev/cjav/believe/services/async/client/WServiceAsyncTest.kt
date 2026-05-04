// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async.client

import dev.cjav.believe.client.okhttp.BelieveOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun test() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val wServiceAsync = client.client().ws()

        val future = wServiceAsync.test()

        val response = future.get()
    }
}
