// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.models.teams

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.believe.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeoLocationTest {

    @Test
    fun create() {
        val geoLocation = GeoLocation.builder().latitude(51.4816).longitude(-0.191).build()

        assertThat(geoLocation.latitude()).isEqualTo(51.4816)
        assertThat(geoLocation.longitude()).isEqualTo(-0.191)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geoLocation = GeoLocation.builder().latitude(51.4816).longitude(-0.191).build()

        val roundtrippedGeoLocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geoLocation),
                jacksonTypeRef<GeoLocation>(),
            )

        assertThat(roundtrippedGeoLocation).isEqualTo(geoLocation)
    }
}
