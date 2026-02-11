// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateParamsTest {

    @Test
    fun create() {
        WebhookCreateParams.builder()
            .url("https://example.com/webhooks")
            .description("Production webhook for match notifications")
            .addEventType(WebhookCreateParams.EventType.MATCH_COMPLETED)
            .addEventType(WebhookCreateParams.EventType.TEAM_MEMBER_TRANSFERRED)
            .build()
    }

    @Test
    fun body() {
        val params =
            WebhookCreateParams.builder()
                .url("https://example.com/webhooks")
                .description("Production webhook for match notifications")
                .addEventType(WebhookCreateParams.EventType.MATCH_COMPLETED)
                .addEventType(WebhookCreateParams.EventType.TEAM_MEMBER_TRANSFERRED)
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com/webhooks")
        assertThat(body.description()).contains("Production webhook for match notifications")
        assertThat(body.eventTypes().getOrNull())
            .containsExactly(
                WebhookCreateParams.EventType.MATCH_COMPLETED,
                WebhookCreateParams.EventType.TEAM_MEMBER_TRANSFERRED,
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WebhookCreateParams.builder().url("https://example.com/webhooks").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com/webhooks")
    }
}
