// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.services.blocking

import dev.cjav.believe.client.okhttp.BelieveOkHttpClient
import dev.cjav.believe.models.quotes.QuoteCreateParams
import dev.cjav.believe.models.quotes.QuoteGetRandomParams
import dev.cjav.believe.models.quotes.QuoteMoment
import dev.cjav.believe.models.quotes.QuoteTheme
import dev.cjav.believe.models.quotes.QuoteUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QuoteServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val quoteService = client.quotes()

        val quote =
            quoteService.create(
                QuoteCreateParams.builder()
                    .characterId("ted-lasso")
                    .context("Ted's first team meeting, revealing his coaching philosophy")
                    .momentType(QuoteMoment.LOCKER_ROOM)
                    .text("I believe in believe.")
                    .theme(QuoteTheme.BELIEF)
                    .episodeId("s01e01")
                    .isFunny(false)
                    .isInspirational(true)
                    .popularityScore(98.5)
                    .season(1L)
                    .addSecondaryTheme(QuoteTheme.LEADERSHIP)
                    .addSecondaryTheme(QuoteTheme.TEAMWORK)
                    .timesShared(250000L)
                    .build()
            )

        quote.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val quoteService = client.quotes()

        val quote = quoteService.retrieve("quote_id")

        quote.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val quoteService = client.quotes()

        val quote =
            quoteService.update(
                QuoteUpdateParams.builder()
                    .quoteId("quote_id")
                    .characterId("character_id")
                    .context("context")
                    .episodeId("episode_id")
                    .isFunny(true)
                    .isInspirational(true)
                    .momentType(QuoteMoment.HALFTIME_SPEECH)
                    .popularityScore(0.0)
                    .season(1L)
                    .addSecondaryTheme(QuoteTheme.BELIEF)
                    .text("x")
                    .theme(QuoteTheme.BELIEF)
                    .timesShared(0L)
                    .build()
            )

        quote.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val quoteService = client.quotes()

        val page = quoteService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val quoteService = client.quotes()

        quoteService.delete("quote_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRandom() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val quoteService = client.quotes()

        val quote =
            quoteService.getRandom(
                QuoteGetRandomParams.builder()
                    .characterId("character_id")
                    .inspirational(true)
                    .theme(QuoteTheme.BELIEF)
                    .build()
            )

        quote.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listByCharacter() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val quoteService = client.quotes()

        val page = quoteService.listByCharacter("character_id")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listByTheme() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val quoteService = client.quotes()

        val page = quoteService.listByTheme(QuoteTheme.BELIEF)

        page.response().validate()
    }
}
