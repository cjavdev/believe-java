// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CharacterGetQuotesParamsTest {

    @Test
    fun create() {
        CharacterGetQuotesParams.builder().characterId("character_id").build()
    }

    @Test
    fun pathParams() {
        val params = CharacterGetQuotesParams.builder().characterId("character_id").build()

        assertThat(params._pathParam(0)).isEqualTo("character_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
