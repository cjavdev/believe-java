// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamMemberListPlayersParamsTest {

    @Test
    fun create() {
        TeamMemberListPlayersParams.builder()
            .limit(10L)
            .position(Position.GOALKEEPER)
            .skip(0L)
            .teamId("team_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TeamMemberListPlayersParams.builder()
                .limit(10L)
                .position(Position.GOALKEEPER)
                .skip(0L)
                .teamId("team_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "10")
                    .put("position", "goalkeeper")
                    .put("skip", "0")
                    .put("team_id", "team_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TeamMemberListPlayersParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
