// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.blocking

import com.believe.api.client.okhttp.BelieveOkHttpClient
import com.believe.api.models.episodes.EpisodeCreateParams
import com.believe.api.models.episodes.EpisodeUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EpisodeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val episodeService = client.episodes()

        val episode =
            episodeService.create(
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
                    .biscuitsWithBossMoment(
                        "Ted and Rebecca have an honest conversation about trust."
                    )
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
            )

        episode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val episodeService = client.episodes()

        val episode = episodeService.retrieve("episode_id")

        episode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val episodeService = client.episodes()

        val episode =
            episodeService.update(
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
            )

        episode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val episodeService = client.episodes()

        val page = episodeService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val episodeService = client.episodes()

        episodeService.delete("episode_id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getWisdom() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val episodeService = client.episodes()

        val response = episodeService.getWisdom("episode_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listBySeason() {
        val client = BelieveOkHttpClient.builder().apiKey("My API Key").build()
        val episodeService = client.episodes()

        val page = episodeService.listBySeason(0L)

        page.response().validate()
    }
}
