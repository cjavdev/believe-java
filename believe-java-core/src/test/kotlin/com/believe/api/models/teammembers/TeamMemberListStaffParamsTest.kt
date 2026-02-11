// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamMemberListStaffParamsTest {

    @Test
    fun create() {
        TeamMemberListStaffParams.builder().limit(10L).skip(0L).teamId("team_id").build()
    }

    @Test
    fun queryParams() {
        val params =
            TeamMemberListStaffParams.builder().limit(10L).skip(0L).teamId("team_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "10")
                    .put("skip", "0")
                    .put("team_id", "team_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TeamMemberListStaffParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
