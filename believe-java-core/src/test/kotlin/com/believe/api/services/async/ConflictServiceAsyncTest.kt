// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import com.believe.api.models.conflicts.ConflictResolveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConflictServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun resolve() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val conflictServiceAsync = client.conflicts()

        val responseFuture =
            conflictServiceAsync.resolve(
                ConflictResolveParams.builder()
                    .conflictType(ConflictResolveParams.ConflictType.INTERPERSONAL)
                    .description(
                        "Alex keeps taking credit for my ideas in meetings and I'm getting resentful."
                    )
                    .addPartiesInvolved("Me")
                    .addPartiesInvolved("My teammate Alex")
                    .addAttemptsMade("Mentioned it casually")
                    .addAttemptsMade("Avoided them")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
