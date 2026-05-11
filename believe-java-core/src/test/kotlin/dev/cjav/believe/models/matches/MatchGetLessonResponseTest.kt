// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.models.matches

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.believe.core.JsonValue
import dev.cjav.believe.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MatchGetLessonResponseTest {

    @Test
    fun create() {
        val matchGetLessonResponse =
            MatchGetLessonResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val matchGetLessonResponse =
            MatchGetLessonResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedMatchGetLessonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(matchGetLessonResponse),
                jacksonTypeRef<MatchGetLessonResponse>(),
            )

        assertThat(roundtrippedMatchGetLessonResponse).isEqualTo(matchGetLessonResponse)
    }
}
