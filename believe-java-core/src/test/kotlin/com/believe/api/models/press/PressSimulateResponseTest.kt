// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.press

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PressSimulateResponseTest {

    @Test
    fun create() {
        val pressSimulateResponse =
            PressSimulateResponse.builder()
                .actualWisdom(
                    "Every loss is a lesson. We didn't play our best today, but I saw something in those players' eyes at the final whistle - hunger. And you can't teach hunger."
                )
                .followUpDodge(
                    "I'd love to answer that, but I promised Coach Beard I'd help him find his lucky whistle. Y'all have a good one!"
                )
                .reporterReaction(
                    "Confused chuckles turn to thoughtful nods as they realize Ted has somehow made them feel better about a 5-0 loss."
                )
                .response(
                    "Well, I'll tell you what, that score reminded me of my high school combination lock - 5-0 - except instead of opening my locker, it opened up a whole lot of learning opportunities for us today."
                )
                .deflectionHumor(
                    "Speaking of combinations, did y'all know that the average person forgets their password 37 times a year? Unrelated, but I just think that's fascinating."
                )
                .build()

        assertThat(pressSimulateResponse.actualWisdom())
            .isEqualTo(
                "Every loss is a lesson. We didn't play our best today, but I saw something in those players' eyes at the final whistle - hunger. And you can't teach hunger."
            )
        assertThat(pressSimulateResponse.followUpDodge())
            .isEqualTo(
                "I'd love to answer that, but I promised Coach Beard I'd help him find his lucky whistle. Y'all have a good one!"
            )
        assertThat(pressSimulateResponse.reporterReaction())
            .isEqualTo(
                "Confused chuckles turn to thoughtful nods as they realize Ted has somehow made them feel better about a 5-0 loss."
            )
        assertThat(pressSimulateResponse.response())
            .isEqualTo(
                "Well, I'll tell you what, that score reminded me of my high school combination lock - 5-0 - except instead of opening my locker, it opened up a whole lot of learning opportunities for us today."
            )
        assertThat(pressSimulateResponse.deflectionHumor())
            .contains(
                "Speaking of combinations, did y'all know that the average person forgets their password 37 times a year? Unrelated, but I just think that's fascinating."
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pressSimulateResponse =
            PressSimulateResponse.builder()
                .actualWisdom(
                    "Every loss is a lesson. We didn't play our best today, but I saw something in those players' eyes at the final whistle - hunger. And you can't teach hunger."
                )
                .followUpDodge(
                    "I'd love to answer that, but I promised Coach Beard I'd help him find his lucky whistle. Y'all have a good one!"
                )
                .reporterReaction(
                    "Confused chuckles turn to thoughtful nods as they realize Ted has somehow made them feel better about a 5-0 loss."
                )
                .response(
                    "Well, I'll tell you what, that score reminded me of my high school combination lock - 5-0 - except instead of opening my locker, it opened up a whole lot of learning opportunities for us today."
                )
                .deflectionHumor(
                    "Speaking of combinations, did y'all know that the average person forgets their password 37 times a year? Unrelated, but I just think that's fascinating."
                )
                .build()

        val roundtrippedPressSimulateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pressSimulateResponse),
                jacksonTypeRef<PressSimulateResponse>(),
            )

        assertThat(roundtrippedPressSimulateResponse).isEqualTo(pressSimulateResponse)
    }
}
