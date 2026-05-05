// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.async

import dev.cjav.believe.client.okhttp.BelieveOkHttpClientAsync
import dev.cjav.believe.models.conflicts.ConflictResolveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConflictServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
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
