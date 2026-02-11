// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.TestServerExtension
import com.believe.api.client.okhttp.BelieveOkHttpClient
import com.believe.api.models.peptalk.PepTalkRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PepTalkServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pepTalkService = client.pepTalk()

        val pepTalk = pepTalkService.retrieve(PepTalkRetrieveParams.builder().stream(true).build())

        pepTalk.validate()
    }
}
