// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegisteredWebhookTest {

    @Test
    fun create() {
        val registeredWebhook =
            RegisteredWebhook.builder()
                .id("wh_abc123")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addEventType(RegisteredWebhook.EventType.MATCH_COMPLETED)
                .secret("whsec_abc123def456...")
                .url("https://example.com")
                .description("description")
                .build()

        assertThat(registeredWebhook.id()).isEqualTo("wh_abc123")
        assertThat(registeredWebhook.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(registeredWebhook.eventTypes())
            .containsExactly(RegisteredWebhook.EventType.MATCH_COMPLETED)
        assertThat(registeredWebhook.secret()).isEqualTo("whsec_abc123def456...")
        assertThat(registeredWebhook.url()).isEqualTo("https://example.com")
        assertThat(registeredWebhook.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val registeredWebhook =
            RegisteredWebhook.builder()
                .id("wh_abc123")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addEventType(RegisteredWebhook.EventType.MATCH_COMPLETED)
                .secret("whsec_abc123def456...")
                .url("https://example.com")
                .description("description")
                .build()

        val roundtrippedRegisteredWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(registeredWebhook),
                jacksonTypeRef<RegisteredWebhook>(),
            )

        assertThat(roundtrippedRegisteredWebhook).isEqualTo(registeredWebhook)
    }
}
