// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamMemberListCoachesParamsTest {

    @Test
    fun create() {
        TeamMemberListCoachesParams.builder()
            .limit(10L)
            .skip(0L)
            .specialty(CoachSpecialty.HEAD_COACH)
            .teamId("team_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TeamMemberListCoachesParams.builder()
                .limit(10L)
                .skip(0L)
                .specialty(CoachSpecialty.HEAD_COACH)
                .teamId("team_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "10")
                    .put("skip", "0")
                    .put("specialty", "head_coach")
                    .put("team_id", "team_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TeamMemberListCoachesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
