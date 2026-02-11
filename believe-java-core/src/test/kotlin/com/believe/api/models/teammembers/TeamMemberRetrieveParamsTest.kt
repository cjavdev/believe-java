// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamMemberRetrieveParamsTest {

    @Test
    fun create() {
        TeamMemberRetrieveParams.builder().memberId("member_id").build()
    }

    @Test
    fun pathParams() {
        val params = TeamMemberRetrieveParams.builder().memberId("member_id").build()

        assertThat(params._pathParam(0)).isEqualTo("member_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
