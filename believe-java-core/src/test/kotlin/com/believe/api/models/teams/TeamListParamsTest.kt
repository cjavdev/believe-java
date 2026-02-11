// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamListParamsTest {

    @Test
    fun create() {
        TeamListParams.builder()
            .league(League.PREMIER_LEAGUE)
            .limit(10L)
            .minCultureScore(0L)
            .skip(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TeamListParams.builder()
                .league(League.PREMIER_LEAGUE)
                .limit(10L)
                .minCultureScore(0L)
                .skip(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("league", "Premier League")
                    .put("limit", "10")
                    .put("min_culture_score", "0")
                    .put("skip", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TeamListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
