// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BiscuitServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val biscuitServiceAsync = client.biscuits()

        val biscuitFuture = biscuitServiceAsync.retrieve("biscuit_id")

        val biscuit = biscuitFuture.get()
        biscuit.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val biscuitServiceAsync = client.biscuits()

        val pageFuture = biscuitServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getFresh() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val biscuitServiceAsync = client.biscuits()

        val biscuitFuture = biscuitServiceAsync.getFresh()

        val biscuit = biscuitFuture.get()
        biscuit.validate()
    }
}
