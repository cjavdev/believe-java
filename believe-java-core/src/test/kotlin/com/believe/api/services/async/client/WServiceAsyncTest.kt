// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async.client

import com.believe.api.TestServerExtension
import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WServiceAsyncTest {

    @Disabled("Prism doesn't support callbacks yet")
    @Test
    fun test() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wServiceAsync = client.client().ws()

        val future = wServiceAsync.test()

        val response = future.get()
    }
}
