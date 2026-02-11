// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatchListParamsTest {

    @Test
    fun create() {
        MatchListParams.builder()
            .limit(10L)
            .matchType(MatchType.LEAGUE)
            .result(MatchResult.WIN)
            .skip(0L)
            .teamId("team_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MatchListParams.builder()
                .limit(10L)
                .matchType(MatchType.LEAGUE)
                .result(MatchResult.WIN)
                .skip(0L)
                .teamId("team_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "10")
                    .put("match_type", "league")
                    .put("result", "win")
                    .put("skip", "0")
                    .put("team_id", "team_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MatchListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
