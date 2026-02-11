// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.TestServerExtension
import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import com.believe.api.models.webhooks.WebhookCreateParams
import com.believe.api.models.webhooks.WebhookTriggerEventParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture =
            webhookServiceAsync.create(
                WebhookCreateParams.builder()
                    .url("https://example.com/webhooks")
                    .description("Production webhook for match notifications")
                    .addEventType(WebhookCreateParams.EventType.MATCH_COMPLETED)
                    .addEventType(WebhookCreateParams.EventType.TEAM_MEMBER_TRANSFERRED)
                    .build()
            )

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookServiceAsync = client.webhooks()

        val registeredWebhookFuture = webhookServiceAsync.retrieve("webhook_id")

        val registeredWebhook = registeredWebhookFuture.get()
        registeredWebhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookServiceAsync = client.webhooks()

        val registeredWebhooksFuture = webhookServiceAsync.list()

        val registeredWebhooks = registeredWebhooksFuture.get()
        registeredWebhooks.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookServiceAsync = client.webhooks()

        val webhookFuture = webhookServiceAsync.delete("webhook_id")

        val webhook = webhookFuture.get()
        webhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun triggerEvent() {
        val client =
            BelieveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookServiceAsync = client.webhooks()

        val responseFuture =
            webhookServiceAsync.triggerEvent(
                WebhookTriggerEventParams.builder()
                    .eventType(WebhookTriggerEventParams.EventType.MATCH_COMPLETED)
                    .matchCompletedPayload(
                        WebhookTriggerEventParams.Payload.MatchCompleted.Data.builder()
                            .awayScore(0L)
                            .awayTeamId("away_team_id")
                            .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .homeScore(0L)
                            .homeTeamId("home_team_id")
                            .matchId("match_id")
                            .matchType(
                                WebhookTriggerEventParams.Payload.MatchCompleted.Data.MatchType
                                    .LEAGUE
                            )
                            .result(
                                WebhookTriggerEventParams.Payload.MatchCompleted.Data.Result
                                    .HOME_WIN
                            )
                            .tedPostMatchQuote("ted_post_match_quote")
                            .lessonLearned("lesson_learned")
                            .manOfTheMatch("man_of_the_match")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
