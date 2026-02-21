// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.client.okhttp.BelieveOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BiscuitServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val biscuitService = client.biscuits()

        val biscuit = biscuitService.retrieve("biscuit_id")

        biscuit.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val biscuitService = client.biscuits()

        val page = biscuitService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFresh() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val biscuitService = client.biscuits()

        val biscuit = biscuitService.getFresh()

        biscuit.validate()
    }
}
