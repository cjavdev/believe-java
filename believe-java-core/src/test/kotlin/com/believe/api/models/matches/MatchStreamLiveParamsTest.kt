// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatchStreamLiveParamsTest {

    @Test
    fun create() {
        MatchStreamLiveParams.builder()
            .awayTeam("away_team")
            .excitementLevel(1L)
            .homeTeam("home_team")
            .speed(0.1)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MatchStreamLiveParams.builder()
                .awayTeam("away_team")
                .excitementLevel(1L)
                .homeTeam("home_team")
                .speed(0.1)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("away_team", "away_team")
                    .put("excitement_level", "1")
                    .put("home_team", "home_team")
                    .put("speed", "0.1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MatchStreamLiveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
