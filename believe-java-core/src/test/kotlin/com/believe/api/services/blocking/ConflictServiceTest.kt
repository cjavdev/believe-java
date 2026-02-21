// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.client.okhttp.BelieveOkHttpClient
import com.believe.api.models.conflicts.ConflictResolveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConflictServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun resolve() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val conflictService = client.conflicts()

        val response =
            conflictService.resolve(
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

        response.validate()
    }
}
