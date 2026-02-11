// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.episodes

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeTest {

    @Test
    fun create() {
        val episode =
            Episode.builder()
                .id("s01e01")
                .airDate(LocalDate.parse("2020-08-14"))
                .characterFocus(listOf("ted-lasso", "rebecca-welton", "coach-beard"))
                .director("Tom Marshall")
                .episodeNumber(1L)
                .mainTheme("Taking chances and believing in yourself")
                .runtimeMinutes(32L)
                .season(1L)
                .synopsis(
                    "American football coach Ted Lasso is hired to manage AFC Richmond, a struggling English Premier League team."
                )
                .tedWisdom(
                    "Taking on a challenge is a lot like riding a horse. If you're comfortable while you're doing it, you're probably doing it wrong."
                )
                .title("Pilot")
                .writer("Jason Sudeikis, Bill Lawrence, Brendan Hunt, Joe Kelly")
                .biscuitsWithBossMoment("Ted brings Rebecca homemade biscuits for the first time.")
                .memorableMoments(
                    listOf(
                        "Ted's first press conference",
                        "The BELIEVE sign goes up",
                        "Ted tastes his first 'garbage water' (English tea)",
                    )
                )
                .usViewersMillions(1.25)
                .viewerRating(8.7)
                .build()

        assertThat(episode.id()).isEqualTo("s01e01")
        assertThat(episode.airDate()).isEqualTo(LocalDate.parse("2020-08-14"))
        assertThat(episode.characterFocus())
            .containsExactly("ted-lasso", "rebecca-welton", "coach-beard")
        assertThat(episode.director()).isEqualTo("Tom Marshall")
        assertThat(episode.episodeNumber()).isEqualTo(1L)
        assertThat(episode.mainTheme()).isEqualTo("Taking chances and believing in yourself")
        assertThat(episode.runtimeMinutes()).isEqualTo(32L)
        assertThat(episode.season()).isEqualTo(1L)
        assertThat(episode.synopsis())
            .isEqualTo(
                "American football coach Ted Lasso is hired to manage AFC Richmond, a struggling English Premier League team."
            )
        assertThat(episode.tedWisdom())
            .isEqualTo(
                "Taking on a challenge is a lot like riding a horse. If you're comfortable while you're doing it, you're probably doing it wrong."
            )
        assertThat(episode.title()).isEqualTo("Pilot")
        assertThat(episode.writer())
            .isEqualTo("Jason Sudeikis, Bill Lawrence, Brendan Hunt, Joe Kelly")
        assertThat(episode.biscuitsWithBossMoment())
            .contains("Ted brings Rebecca homemade biscuits for the first time.")
        assertThat(episode.memorableMoments().getOrNull())
            .containsExactly(
                "Ted's first press conference",
                "The BELIEVE sign goes up",
                "Ted tastes his first 'garbage water' (English tea)",
            )
        assertThat(episode.usViewersMillions()).contains(1.25)
        assertThat(episode.viewerRating()).contains(8.7)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val episode =
            Episode.builder()
                .id("s01e01")
                .airDate(LocalDate.parse("2020-08-14"))
                .characterFocus(listOf("ted-lasso", "rebecca-welton", "coach-beard"))
                .director("Tom Marshall")
                .episodeNumber(1L)
                .mainTheme("Taking chances and believing in yourself")
                .runtimeMinutes(32L)
                .season(1L)
                .synopsis(
                    "American football coach Ted Lasso is hired to manage AFC Richmond, a struggling English Premier League team."
                )
                .tedWisdom(
                    "Taking on a challenge is a lot like riding a horse. If you're comfortable while you're doing it, you're probably doing it wrong."
                )
                .title("Pilot")
                .writer("Jason Sudeikis, Bill Lawrence, Brendan Hunt, Joe Kelly")
                .biscuitsWithBossMoment("Ted brings Rebecca homemade biscuits for the first time.")
                .memorableMoments(
                    listOf(
                        "Ted's first press conference",
                        "The BELIEVE sign goes up",
                        "Ted tastes his first 'garbage water' (English tea)",
                    )
                )
                .usViewersMillions(1.25)
                .viewerRating(8.7)
                .build()

        val roundtrippedEpisode =
            jsonMapper.readValue(jsonMapper.writeValueAsString(episode), jacksonTypeRef<Episode>())

        assertThat(roundtrippedEpisode).isEqualTo(episode)
    }
}
