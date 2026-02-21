// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async.matches

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommentaryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun stream() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val commentaryServiceAsync = client.matches().commentary()

        val responseFuture = commentaryServiceAsync.stream("match_id")

        val response = responseFuture.get()
        response.validate()
    }
}
