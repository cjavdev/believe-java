// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches.commentary

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
