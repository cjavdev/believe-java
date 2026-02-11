// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.episodes

import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeUpdateParamsTest {

    @Test
    fun create() {
        EpisodeUpdateParams.builder()
            .episodeId("episode_id")
            .airDate(LocalDate.parse("2019-12-27"))
            .biscuitsWithBossMoment("biscuits_with_boss_moment")
            .addCharacterFocus("string")
            .director("director")
            .episodeNumber(1L)
            .mainTheme("main_theme")
            .addMemorableMoment("string")
            .runtimeMinutes(20L)
            .season(1L)
            .synopsis("synopsis")
            .tedWisdom("ted_wisdom")
            .title("x")
            .usViewersMillions(0.0)
            .viewerRating(0.0)
            .writer("writer")
            .build()
    }

    @Test
    fun pathParams() {
        val params = EpisodeUpdateParams.builder().episodeId("episode_id").build()

        assertThat(params._pathParam(0)).isEqualTo("episode_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EpisodeUpdateParams.builder()
                .episodeId("episode_id")
                .airDate(LocalDate.parse("2019-12-27"))
                .biscuitsWithBossMoment("biscuits_with_boss_moment")
                .addCharacterFocus("string")
                .director("director")
                .episodeNumber(1L)
                .mainTheme("main_theme")
                .addMemorableMoment("string")
                .runtimeMinutes(20L)
                .season(1L)
                .synopsis("synopsis")
                .tedWisdom("ted_wisdom")
                .title("x")
                .usViewersMillions(0.0)
                .viewerRating(0.0)
                .writer("writer")
                .build()

        val body = params._body()

        assertThat(body.airDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.biscuitsWithBossMoment()).contains("biscuits_with_boss_moment")
        assertThat(body.characterFocus().getOrNull()).containsExactly("string")
        assertThat(body.director()).contains("director")
        assertThat(body.episodeNumber()).contains(1L)
        assertThat(body.mainTheme()).contains("main_theme")
        assertThat(body.memorableMoments().getOrNull()).containsExactly("string")
        assertThat(body.runtimeMinutes()).contains(20L)
        assertThat(body.season()).contains(1L)
        assertThat(body.synopsis()).contains("synopsis")
        assertThat(body.tedWisdom()).contains("ted_wisdom")
        assertThat(body.title()).contains("x")
        assertThat(body.usViewersMillions()).contains(0.0)
        assertThat(body.viewerRating()).contains(0.0)
        assertThat(body.writer()).contains("writer")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EpisodeUpdateParams.builder().episodeId("episode_id").build()

        val body = params._body()
    }
}
