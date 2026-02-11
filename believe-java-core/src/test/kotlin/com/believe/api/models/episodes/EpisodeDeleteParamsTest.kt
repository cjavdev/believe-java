// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.episodes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeDeleteParamsTest {

    @Test
    fun create() {
        EpisodeDeleteParams.builder().episodeId("episode_id").build()
    }

    @Test
    fun pathParams() {
        val params = EpisodeDeleteParams.builder().episodeId("episode_id").build()

        assertThat(params._pathParam(0)).isEqualTo("episode_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
