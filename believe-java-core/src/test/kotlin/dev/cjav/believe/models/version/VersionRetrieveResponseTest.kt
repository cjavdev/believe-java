// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.models.version

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.believe.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionRetrieveResponseTest {

    @Test
    fun create() {
        val versionRetrieveResponse = VersionRetrieveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val versionRetrieveResponse = VersionRetrieveResponse.builder().build()

        val roundtrippedVersionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionRetrieveResponse),
                jacksonTypeRef<VersionRetrieveResponse>(),
            )

        assertThat(roundtrippedVersionRetrieveResponse).isEqualTo(versionRetrieveResponse)
    }
}
