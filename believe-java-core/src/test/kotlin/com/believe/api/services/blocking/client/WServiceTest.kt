// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking.client

import com.believe.api.TestServerExtension
import com.believe.api.client.okhttp.BelieveOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WServiceTest {

    @Disabled("Prism doesn't support callbacks yet")
    @Test
    fun test() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wService = client.client().ws()

        wService.test()
    }
}
