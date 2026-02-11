// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamGetCultureParamsTest {

    @Test
    fun create() {
        TeamGetCultureParams.builder().teamId("team_id").build()
    }

    @Test
    fun pathParams() {
        val params = TeamGetCultureParams.builder().teamId("team_id").build()

        assertThat(params._pathParam(0)).isEqualTo("team_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
