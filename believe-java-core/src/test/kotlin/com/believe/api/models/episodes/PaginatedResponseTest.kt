// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.episodes

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginatedResponseTest {

    @Test
    fun create() {
        val paginatedResponse =
            PaginatedResponse.builder()
                .addData(
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
                        .biscuitsWithBossMoment(
                            "Ted brings Rebecca homemade biscuits for the first time."
                        )
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
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        assertThat(paginatedResponse.data())
            .containsExactly(
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
                    .biscuitsWithBossMoment(
                        "Ted brings Rebecca homemade biscuits for the first time."
                    )
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
            )
        assertThat(paginatedResponse.hasMore()).isEqualTo(true)
        assertThat(paginatedResponse.limit()).isEqualTo(0L)
        assertThat(paginatedResponse.page()).isEqualTo(0L)
        assertThat(paginatedResponse.pages()).isEqualTo(0L)
        assertThat(paginatedResponse.skip()).isEqualTo(0L)
        assertThat(paginatedResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paginatedResponse =
            PaginatedResponse.builder()
                .addData(
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
                        .biscuitsWithBossMoment(
                            "Ted brings Rebecca homemade biscuits for the first time."
                        )
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
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        val roundtrippedPaginatedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paginatedResponse),
                jacksonTypeRef<PaginatedResponse>(),
            )

        assertThat(roundtrippedPaginatedResponse).isEqualTo(paginatedResponse)
    }
}
