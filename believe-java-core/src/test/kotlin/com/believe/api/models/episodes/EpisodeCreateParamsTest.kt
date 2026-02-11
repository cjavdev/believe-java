// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.episodes

import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeCreateParamsTest {

    @Test
    fun create() {
        EpisodeCreateParams.builder()
            .airDate(LocalDate.parse("2020-10-02"))
            .characterFocus(listOf("ted-lasso", "coach-beard", "higgins", "nate"))
            .director("MJ Delaney")
            .episodeNumber(8L)
            .mainTheme("The power of vulnerability and male friendship")
            .runtimeMinutes(29L)
            .season(1L)
            .synopsis(
                "Ted creates a support group for the coaching staff while Rebecca faces a difficult decision about her future."
            )
            .tedWisdom("There's two buttons I never like to hit: that's panic and snooze.")
            .title("The Diamond Dogs")
            .writer("Jason Sudeikis, Brendan Hunt, Joe Kelly")
            .biscuitsWithBossMoment("Ted and Rebecca have an honest conversation about trust.")
            .memorableMoments(
                listOf(
                    "First Diamond Dogs meeting",
                    "The famous dart scene with Rupert",
                    "Be curious, not judgmental speech",
                )
            )
            .usViewersMillions(1.42)
            .viewerRating(9.1)
            .build()
    }

    @Test
    fun body() {
        val params =
            EpisodeCreateParams.builder()
                .airDate(LocalDate.parse("2020-10-02"))
                .characterFocus(listOf("ted-lasso", "coach-beard", "higgins", "nate"))
                .director("MJ Delaney")
                .episodeNumber(8L)
                .mainTheme("The power of vulnerability and male friendship")
                .runtimeMinutes(29L)
                .season(1L)
                .synopsis(
                    "Ted creates a support group for the coaching staff while Rebecca faces a difficult decision about her future."
                )
                .tedWisdom("There's two buttons I never like to hit: that's panic and snooze.")
                .title("The Diamond Dogs")
                .writer("Jason Sudeikis, Brendan Hunt, Joe Kelly")
                .biscuitsWithBossMoment("Ted and Rebecca have an honest conversation about trust.")
                .memorableMoments(
                    listOf(
                        "First Diamond Dogs meeting",
                        "The famous dart scene with Rupert",
                        "Be curious, not judgmental speech",
                    )
                )
                .usViewersMillions(1.42)
                .viewerRating(9.1)
                .build()

        val body = params._body()

        assertThat(body.airDate()).isEqualTo(LocalDate.parse("2020-10-02"))
        assertThat(body.characterFocus())
            .containsExactly("ted-lasso", "coach-beard", "higgins", "nate")
        assertThat(body.director()).isEqualTo("MJ Delaney")
        assertThat(body.episodeNumber()).isEqualTo(8L)
        assertThat(body.mainTheme()).isEqualTo("The power of vulnerability and male friendship")
        assertThat(body.runtimeMinutes()).isEqualTo(29L)
        assertThat(body.season()).isEqualTo(1L)
        assertThat(body.synopsis())
            .isEqualTo(
                "Ted creates a support group for the coaching staff while Rebecca faces a difficult decision about her future."
            )
        assertThat(body.tedWisdom())
            .isEqualTo("There's two buttons I never like to hit: that's panic and snooze.")
        assertThat(body.title()).isEqualTo("The Diamond Dogs")
        assertThat(body.writer()).isEqualTo("Jason Sudeikis, Brendan Hunt, Joe Kelly")
        assertThat(body.biscuitsWithBossMoment())
            .contains("Ted and Rebecca have an honest conversation about trust.")
        assertThat(body.memorableMoments().getOrNull())
            .containsExactly(
                "First Diamond Dogs meeting",
                "The famous dart scene with Rupert",
                "Be curious, not judgmental speech",
            )
        assertThat(body.usViewersMillions()).contains(1.42)
        assertThat(body.viewerRating()).contains(9.1)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EpisodeCreateParams.builder()
                .airDate(LocalDate.parse("2020-10-02"))
                .characterFocus(listOf("ted-lasso", "coach-beard", "higgins", "nate"))
                .director("MJ Delaney")
                .episodeNumber(8L)
                .mainTheme("The power of vulnerability and male friendship")
                .runtimeMinutes(29L)
                .season(1L)
                .synopsis(
                    "Ted creates a support group for the coaching staff while Rebecca faces a difficult decision about her future."
                )
                .tedWisdom("There's two buttons I never like to hit: that's panic and snooze.")
                .title("The Diamond Dogs")
                .writer("Jason Sudeikis, Brendan Hunt, Joe Kelly")
                .build()

        val body = params._body()

        assertThat(body.airDate()).isEqualTo(LocalDate.parse("2020-10-02"))
        assertThat(body.characterFocus())
            .containsExactly("ted-lasso", "coach-beard", "higgins", "nate")
        assertThat(body.director()).isEqualTo("MJ Delaney")
        assertThat(body.episodeNumber()).isEqualTo(8L)
        assertThat(body.mainTheme()).isEqualTo("The power of vulnerability and male friendship")
        assertThat(body.runtimeMinutes()).isEqualTo(29L)
        assertThat(body.season()).isEqualTo(1L)
        assertThat(body.synopsis())
            .isEqualTo(
                "Ted creates a support group for the coaching staff while Rebecca faces a difficult decision about her future."
            )
        assertThat(body.tedWisdom())
            .isEqualTo("There's two buttons I never like to hit: that's panic and snooze.")
        assertThat(body.title()).isEqualTo("The Diamond Dogs")
        assertThat(body.writer()).isEqualTo("Jason Sudeikis, Brendan Hunt, Joe Kelly")
    }
}
