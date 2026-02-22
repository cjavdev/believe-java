// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking.client

import com.believe.api.client.okhttp.BelieveOkHttpClient
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
