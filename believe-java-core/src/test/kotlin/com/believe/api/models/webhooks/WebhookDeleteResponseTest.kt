// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

import com.believe.api.core.JsonValue
import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeleteResponseTest {

    @Test
    fun create() {
        val webhookDeleteResponse =
            WebhookDeleteResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookDeleteResponse =
            WebhookDeleteResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedWebhookDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookDeleteResponse),
                jacksonTypeRef<WebhookDeleteResponse>(),
            )

        assertThat(roundtrippedWebhookDeleteResponse).isEqualTo(webhookDeleteResponse)
    }
}
