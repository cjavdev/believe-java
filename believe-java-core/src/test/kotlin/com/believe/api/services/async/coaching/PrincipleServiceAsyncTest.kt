// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async.coaching

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PrincipleServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val principleServiceAsync = client.coaching().principles()

        val coachingPrincipleFuture = principleServiceAsync.retrieve("principle_id")

        val coachingPrinciple = coachingPrincipleFuture.get()
        coachingPrinciple.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val principleServiceAsync = client.coaching().principles()

        val pageFuture = principleServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRandom() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val principleServiceAsync = client.coaching().principles()

        val coachingPrincipleFuture = principleServiceAsync.getRandom()

        val coachingPrinciple = coachingPrincipleFuture.get()
        coachingPrinciple.validate()
    }
}
