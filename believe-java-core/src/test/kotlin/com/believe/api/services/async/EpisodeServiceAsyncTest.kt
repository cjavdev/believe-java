// File generated from our OpenAPI spec by Stainless.

package com.believe.api.services.async

import com.believe.api.client.okhttp.BelieveOkHttpClientAsync
import com.believe.api.models.episodes.EpisodeCreateParams
import com.believe.api.models.episodes.EpisodeUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EpisodeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val episodeServiceAsync = client.episodes()

        val episodeFuture =
            episodeServiceAsync.create(
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

        val episode = episodeFuture.get()
        episode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val episodeServiceAsync = client.episodes()

        val episodeFuture = episodeServiceAsync.retrieve("episode_id")

        val episode = episodeFuture.get()
        episode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val episodeServiceAsync = client.episodes()

        val episodeFuture =
            episodeServiceAsync.update(
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

        val episode = episodeFuture.get()
        episode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val episodeServiceAsync = client.episodes()

        val pageFuture = episodeServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val episodeServiceAsync = client.episodes()

        val future = episodeServiceAsync.delete("episode_id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getWisdom() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val episodeServiceAsync = client.episodes()

        val responseFuture = episodeServiceAsync.getWisdom("episode_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listBySeason() {
        val client = BelieveOkHttpClientAsync.builder().apiKey("My API Key").build()
        val episodeServiceAsync = client.episodes()

        val pageFuture = episodeServiceAsync.listBySeason(0L)

        val page = pageFuture.get()
        page.response().validate()
    }
}
