// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking.client

import dev.cjav.believe.client.okhttp.BelieveOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun test() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val wService = client.client().ws()

        wService.test()
    }
}
