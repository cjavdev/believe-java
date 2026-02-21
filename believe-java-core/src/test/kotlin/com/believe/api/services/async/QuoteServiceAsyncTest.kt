// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import com.believe.api.models.quotes.QuoteCreateParams
import com.believe.api.models.quotes.QuoteGetRandomParams
import com.believe.api.models.quotes.QuoteMoment
import com.believe.api.models.quotes.QuoteTheme
import com.believe.api.models.quotes.QuoteUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QuoteServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val quoteServiceAsync = client.quotes()

        val quoteFuture =
            quoteServiceAsync.create(
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
                    .addSecondaryTheme(QuoteTheme.LEADERSHIP)
                    .addSecondaryTheme(QuoteTheme.TEAMWORK)
                    .timesShared(250000L)
                    .build()
            )

        val quote = quoteFuture.get()
        quote.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val quoteServiceAsync = client.quotes()

        val quoteFuture = quoteServiceAsync.retrieve("quote_id")

        val quote = quoteFuture.get()
        quote.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val quoteServiceAsync = client.quotes()

        val quoteFuture =
            quoteServiceAsync.update(
                QuoteUpdateParams.builder()
                    .quoteId("quote_id")
                    .characterId("character_id")
                    .context("context")
                    .episodeId("episode_id")
                    .isFunny(true)
                    .isInspirational(true)
                    .momentType(QuoteMoment.HALFTIME_SPEECH)
                    .popularityScore(0.0)
                    .addSecondaryTheme(QuoteTheme.BELIEF)
                    .text("x")
                    .theme(QuoteTheme.BELIEF)
                    .timesShared(0L)
                    .build()
            )

        val quote = quoteFuture.get()
        quote.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val quoteServiceAsync = client.quotes()

        val pageFuture = quoteServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val quoteServiceAsync = client.quotes()

        val future = quoteServiceAsync.delete("quote_id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRandom() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val quoteServiceAsync = client.quotes()

        val quoteFuture =
            quoteServiceAsync.getRandom(
                QuoteGetRandomParams.builder()
                    .characterId("character_id")
                    .inspirational(true)
                    .theme(QuoteTheme.BELIEF)
                    .build()
            )

        val quote = quoteFuture.get()
        quote.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listByCharacter() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val quoteServiceAsync = client.quotes()

        val pageFuture = quoteServiceAsync.listByCharacter("character_id")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listByTheme() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val quoteServiceAsync = client.quotes()

        val pageFuture = quoteServiceAsync.listByTheme(QuoteTheme.BELIEF)

        val page = pageFuture.get()
        page.response().validate()
    }
}
