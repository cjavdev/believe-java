// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking.matches

import com.believe.api.client.okhttp.BelieveOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CommentaryServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun stream() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val commentaryService = client.matches().commentary()

        val response = commentaryService.stream("match_id")

        response.validate()
    }
}
