// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VersionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val versionServiceAsync = client.version()

        val versionFuture = versionServiceAsync.retrieve()

        val version = versionFuture.get()
        version.validate()
    }
}
