// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async

import dev.cjav.believe.client.okhttp.BelieveOkHttpClientAsync
import dev.cjav.believe.models.peptalk.PepTalkRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PepTalkServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val pepTalkServiceAsync = client.pepTalk()

        val pepTalkFuture =
            pepTalkServiceAsync.retrieve(PepTalkRetrieveParams.builder().stream(true).build())

        val pepTalk = pepTalkFuture.get()
        pepTalk.validate()
    }
}
