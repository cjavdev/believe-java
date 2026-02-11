// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuoteTest {

    @Test
    fun create() {
        val quote =
            Quote.builder()
                .id("quote-001")
                .characterId("ted-lasso")
                .context("Ted playing darts against Rupert in the pub, explaining his philosophy")
                .momentType(QuoteMoment.PUB)
                .text("Be curious, not judgmental.")
                .theme(QuoteTheme.CURIOSITY)
                .episodeId("s01e08")
                .isFunny(false)
                .isInspirational(true)
                .popularityScore(95.5)
                .addSecondaryTheme(QuoteTheme.WISDOM)
                .addSecondaryTheme(QuoteTheme.KINDNESS)
                .timesShared(150000L)
                .build()

        assertThat(quote.id()).isEqualTo("quote-001")
        assertThat(quote.characterId()).isEqualTo("ted-lasso")
        assertThat(quote.context())
            .isEqualTo("Ted playing darts against Rupert in the pub, explaining his philosophy")
        assertThat(quote.momentType()).isEqualTo(QuoteMoment.PUB)
        assertThat(quote.text()).isEqualTo("Be curious, not judgmental.")
        assertThat(quote.theme()).isEqualTo(QuoteTheme.CURIOSITY)
        assertThat(quote.episodeId()).contains("s01e08")
        assertThat(quote.isFunny()).contains(false)
        assertThat(quote.isInspirational()).contains(true)
        assertThat(quote.popularityScore()).contains(95.5)
        assertThat(quote.secondaryThemes().getOrNull())
            .containsExactly(QuoteTheme.WISDOM, QuoteTheme.KINDNESS)
        assertThat(quote.timesShared()).contains(150000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val quote =
            Quote.builder()
                .id("quote-001")
                .characterId("ted-lasso")
                .context("Ted playing darts against Rupert in the pub, explaining his philosophy")
                .momentType(QuoteMoment.PUB)
                .text("Be curious, not judgmental.")
                .theme(QuoteTheme.CURIOSITY)
                .episodeId("s01e08")
                .isFunny(false)
                .isInspirational(true)
                .popularityScore(95.5)
                .addSecondaryTheme(QuoteTheme.WISDOM)
                .addSecondaryTheme(QuoteTheme.KINDNESS)
                .timesShared(150000L)
                .build()

        val roundtrippedQuote =
            jsonMapper.readValue(jsonMapper.writeValueAsString(quote), jacksonTypeRef<Quote>())

        assertThat(roundtrippedQuote).isEqualTo(quote)
    }
}
