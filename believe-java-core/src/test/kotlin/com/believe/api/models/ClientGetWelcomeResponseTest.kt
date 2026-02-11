// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClientGetWelcomeResponseTest {

    @Test
    fun create() {
        val clientGetWelcomeResponse = ClientGetWelcomeResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clientGetWelcomeResponse = ClientGetWelcomeResponse.builder().build()

        val roundtrippedClientGetWelcomeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clientGetWelcomeResponse),
                jacksonTypeRef<ClientGetWelcomeResponse>(),
            )

        assertThat(roundtrippedClientGetWelcomeResponse).isEqualTo(clientGetWelcomeResponse)
    }
}
