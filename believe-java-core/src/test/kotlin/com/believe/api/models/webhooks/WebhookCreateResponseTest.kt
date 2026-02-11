// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateResponseTest {

    @Test
    fun create() {
        val webhookCreateResponse =
            WebhookCreateResponse.builder()
                .webhook(
                    RegisteredWebhook.builder()
                        .id("wh_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addEventType(RegisteredWebhook.EventType.MATCH_COMPLETED)
                        .secret("whsec_abc123def456...")
                        .url("https://example.com")
                        .description("description")
                        .build()
                )
                .message("message")
                .tedSays("ted_says")
                .build()

        assertThat(webhookCreateResponse.webhook())
            .isEqualTo(
                RegisteredWebhook.builder()
                    .id("wh_abc123")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addEventType(RegisteredWebhook.EventType.MATCH_COMPLETED)
                    .secret("whsec_abc123def456...")
                    .url("https://example.com")
                    .description("description")
                    .build()
            )
        assertThat(webhookCreateResponse.message()).contains("message")
        assertThat(webhookCreateResponse.tedSays()).contains("ted_says")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookCreateResponse =
            WebhookCreateResponse.builder()
                .webhook(
                    RegisteredWebhook.builder()
                        .id("wh_abc123")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addEventType(RegisteredWebhook.EventType.MATCH_COMPLETED)
                        .secret("whsec_abc123def456...")
                        .url("https://example.com")
                        .description("description")
                        .build()
                )
                .message("message")
                .tedSays("ted_says")
                .build()

        val roundtrippedWebhookCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookCreateResponse),
                jacksonTypeRef<WebhookCreateResponse>(),
            )

        assertThat(roundtrippedWebhookCreateResponse).isEqualTo(webhookCreateResponse)
    }
}
