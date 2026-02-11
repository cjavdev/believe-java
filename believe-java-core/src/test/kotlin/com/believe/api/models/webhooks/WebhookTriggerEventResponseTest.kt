// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookTriggerEventResponseTest {

    @Test
    fun create() {
        val webhookTriggerEventResponse =
            WebhookTriggerEventResponse.builder()
                .addDelivery(
                    WebhookTriggerEventResponse.Delivery.builder()
                        .success(true)
                        .url("url")
                        .webhookId("webhook_id")
                        .error("error")
                        .statusCode(0L)
                        .build()
                )
                .eventId("event_id")
                .eventType(WebhookTriggerEventResponse.EventType.MATCH_COMPLETED)
                .successfulDeliveries(0L)
                .tedSays("ted_says")
                .totalWebhooks(0L)
                .build()

        assertThat(webhookTriggerEventResponse.deliveries())
            .containsExactly(
                WebhookTriggerEventResponse.Delivery.builder()
                    .success(true)
                    .url("url")
                    .webhookId("webhook_id")
                    .error("error")
                    .statusCode(0L)
                    .build()
            )
        assertThat(webhookTriggerEventResponse.eventId()).isEqualTo("event_id")
        assertThat(webhookTriggerEventResponse.eventType())
            .isEqualTo(WebhookTriggerEventResponse.EventType.MATCH_COMPLETED)
        assertThat(webhookTriggerEventResponse.successfulDeliveries()).isEqualTo(0L)
        assertThat(webhookTriggerEventResponse.tedSays()).isEqualTo("ted_says")
        assertThat(webhookTriggerEventResponse.totalWebhooks()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookTriggerEventResponse =
            WebhookTriggerEventResponse.builder()
                .addDelivery(
                    WebhookTriggerEventResponse.Delivery.builder()
                        .success(true)
                        .url("url")
                        .webhookId("webhook_id")
                        .error("error")
                        .statusCode(0L)
                        .build()
                )
                .eventId("event_id")
                .eventType(WebhookTriggerEventResponse.EventType.MATCH_COMPLETED)
                .successfulDeliveries(0L)
                .tedSays("ted_says")
                .totalWebhooks(0L)
                .build()

        val roundtrippedWebhookTriggerEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookTriggerEventResponse),
                jacksonTypeRef<WebhookTriggerEventResponse>(),
            )

        assertThat(roundtrippedWebhookTriggerEventResponse).isEqualTo(webhookTriggerEventResponse)
    }
}
