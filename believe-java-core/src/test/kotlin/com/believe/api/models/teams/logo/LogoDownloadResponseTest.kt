// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams.logo

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogoDownloadResponseTest {

    @Test
    fun create() {
        val logoDownloadResponse = LogoDownloadResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logoDownloadResponse = LogoDownloadResponse.builder().build()

        val roundtrippedLogoDownloadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logoDownloadResponse),
                jacksonTypeRef<LogoDownloadResponse>(),
            )

        assertThat(roundtrippedLogoDownloadResponse).isEqualTo(logoDownloadResponse)
    }
}
