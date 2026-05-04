// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.models.matches.commentary

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.cjav.believe.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentaryStreamResponseTest {

    @Test
    fun create() {
        val commentaryStreamResponse = CommentaryStreamResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentaryStreamResponse = CommentaryStreamResponse.builder().build()

        val roundtrippedCommentaryStreamResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commentaryStreamResponse),
                jacksonTypeRef<CommentaryStreamResponse>(),
            )

        assertThat(roundtrippedCommentaryStreamResponse).isEqualTo(commentaryStreamResponse)
    }
}
