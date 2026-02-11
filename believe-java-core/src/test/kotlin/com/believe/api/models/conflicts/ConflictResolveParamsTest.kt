// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.conflicts

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConflictResolveParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.conflictType()).isEqualTo(ConflictResolveParams.ConflictType.INTERPERSONAL)
        assertThat(body.description())
            .isEqualTo(
                "Alex keeps taking credit for my ideas in meetings and I'm getting resentful."
            )
        assertThat(body.partiesInvolved()).containsExactly("Me", "My teammate Alex")
        assertThat(body.attemptsMade().getOrNull())
            .containsExactly("Mentioned it casually", "Avoided them")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConflictResolveParams.builder()
                .conflictType(ConflictResolveParams.ConflictType.INTERPERSONAL)
                .description(
                    "Alex keeps taking credit for my ideas in meetings and I'm getting resentful."
                )
                .addPartiesInvolved("Me")
                .addPartiesInvolved("My teammate Alex")
                .build()

        val body = params._body()

        assertThat(body.conflictType()).isEqualTo(ConflictResolveParams.ConflictType.INTERPERSONAL)
        assertThat(body.description())
            .isEqualTo(
                "Alex keeps taking credit for my ideas in meetings and I'm getting resentful."
            )
        assertThat(body.partiesInvolved()).containsExactly("Me", "My teammate Alex")
    }
}
