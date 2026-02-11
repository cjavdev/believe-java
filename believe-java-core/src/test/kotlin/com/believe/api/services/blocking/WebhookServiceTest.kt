// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.TestServerExtension
import com.believe.api.client.okhttp.BelieveOkHttpClient
import com.believe.api.models.webhooks.WebhookCreateParams
import com.believe.api.models.webhooks.WebhookTriggerEventParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookService = client.webhooks()

        val webhook =
            webhookService.create(
                WebhookCreateParams.builder()
                    .url("https://example.com/webhooks")
                    .description("Production webhook for match notifications")
                    .addEventType(WebhookCreateParams.EventType.MATCH_COMPLETED)
                    .addEventType(WebhookCreateParams.EventType.TEAM_MEMBER_TRANSFERRED)
                    .build()
            )

        webhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookService = client.webhooks()

        val registeredWebhook = webhookService.retrieve("webhook_id")

        registeredWebhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookService = client.webhooks()

        val registeredWebhooks = webhookService.list()

        registeredWebhooks.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookService = client.webhooks()

        val webhook = webhookService.delete("webhook_id")

        webhook.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun triggerEvent() {
        val client =
            BelieveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookService = client.webhooks()

        val response =
            webhookService.triggerEvent(
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

        response.validate()
    }
}
