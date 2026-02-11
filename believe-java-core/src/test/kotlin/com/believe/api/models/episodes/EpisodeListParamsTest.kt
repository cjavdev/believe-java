// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.episodes

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EpisodeListParamsTest {

    @Test
    fun create() {
        EpisodeListParams.builder()
            .characterFocus("character_focus")
            .limit(10L)
            .season(1L)
            .skip(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EpisodeListParams.builder()
                .characterFocus("character_focus")
                .limit(10L)
                .season(1L)
                .skip(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("character_focus", "character_focus")
                    .put("limit", "10")
                    .put("season", "1")
                    .put("skip", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EpisodeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
