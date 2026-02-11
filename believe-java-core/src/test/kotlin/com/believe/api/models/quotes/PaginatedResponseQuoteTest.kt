// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginatedResponseQuoteTest {

    @Test
    fun create() {
        val paginatedResponseQuote =
            PaginatedResponseQuote.builder()
                .addData(
                    Quote.builder()
                        .id("quote-001")
                        .characterId("ted-lasso")
                        .context(
                            "Ted playing darts against Rupert in the pub, explaining his philosophy"
                        )
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
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        assertThat(paginatedResponseQuote.data())
            .containsExactly(
                Quote.builder()
                    .id("quote-001")
                    .characterId("ted-lasso")
                    .context(
                        "Ted playing darts against Rupert in the pub, explaining his philosophy"
                    )
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
            )
        assertThat(paginatedResponseQuote.hasMore()).isEqualTo(true)
        assertThat(paginatedResponseQuote.limit()).isEqualTo(0L)
        assertThat(paginatedResponseQuote.page()).isEqualTo(0L)
        assertThat(paginatedResponseQuote.pages()).isEqualTo(0L)
        assertThat(paginatedResponseQuote.skip()).isEqualTo(0L)
        assertThat(paginatedResponseQuote.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paginatedResponseQuote =
            PaginatedResponseQuote.builder()
                .addData(
                    Quote.builder()
                        .id("quote-001")
                        .characterId("ted-lasso")
                        .context(
                            "Ted playing darts against Rupert in the pub, explaining his philosophy"
                        )
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
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        val roundtrippedPaginatedResponseQuote =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paginatedResponseQuote),
                jacksonTypeRef<PaginatedResponseQuote>(),
            )

        assertThat(roundtrippedPaginatedResponseQuote).isEqualTo(paginatedResponseQuote)
    }
}
