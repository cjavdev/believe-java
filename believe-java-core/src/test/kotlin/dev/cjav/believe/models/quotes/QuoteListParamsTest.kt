// File generated from our OpenAPI spec by Stainless.

package dev.cjav.believe.models.quotes

import dev.cjav.believe.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuoteListParamsTest {

    @Test
    fun create() {
        QuoteListParams.builder()
            .characterId("character_id")
            .funny(true)
            .inspirational(true)
            .limit(10L)
            .momentType(QuoteMoment.HALFTIME_SPEECH)
            .skip(0L)
            .theme(QuoteTheme.BELIEF)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            QuoteListParams.builder()
                .characterId("character_id")
                .funny(true)
                .inspirational(true)
                .limit(10L)
                .momentType(QuoteMoment.HALFTIME_SPEECH)
                .skip(0L)
                .theme(QuoteTheme.BELIEF)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("character_id", "character_id")
                    .put("funny", "true")
                    .put("inspirational", "true")
                    .put("limit", "10")
                    .put("moment_type", "halftime_speech")
                    .put("skip", "0")
                    .put("theme", "belief")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = QuoteListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
