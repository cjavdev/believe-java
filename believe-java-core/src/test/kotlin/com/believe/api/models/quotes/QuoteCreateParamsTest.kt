// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuoteCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.characterId()).isEqualTo("ted-lasso")
        assertThat(body.context())
            .isEqualTo("Ted's first team meeting, revealing his coaching philosophy")
        assertThat(body.momentType()).isEqualTo(QuoteMoment.LOCKER_ROOM)
        assertThat(body.text()).isEqualTo("I believe in believe.")
        assertThat(body.theme()).isEqualTo(QuoteTheme.BELIEF)
        assertThat(body.episodeId()).contains("s01e01")
        assertThat(body.isFunny()).contains(false)
        assertThat(body.isInspirational()).contains(true)
        assertThat(body.popularityScore()).contains(98.5)
        assertThat(body.secondaryThemes().getOrNull())
            .containsExactly(QuoteTheme.LEADERSHIP, QuoteTheme.TEAMWORK)
        assertThat(body.timesShared()).contains(250000L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            QuoteCreateParams.builder()
                .characterId("ted-lasso")
                .context("Ted's first team meeting, revealing his coaching philosophy")
                .momentType(QuoteMoment.LOCKER_ROOM)
                .text("I believe in believe.")
                .theme(QuoteTheme.BELIEF)
                .build()

        val body = params._body()

        assertThat(body.characterId()).isEqualTo("ted-lasso")
        assertThat(body.context())
            .isEqualTo("Ted's first team meeting, revealing his coaching philosophy")
        assertThat(body.momentType()).isEqualTo(QuoteMoment.LOCKER_ROOM)
        assertThat(body.text()).isEqualTo("I believe in believe.")
        assertThat(body.theme()).isEqualTo(QuoteTheme.BELIEF)
    }
}
