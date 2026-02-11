// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.believe

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BelieveSubmitResponseTest {

    @Test
    fun create() {
        val believeSubmitResponse =
            BelieveSubmitResponse.builder()
                .actionSuggestion(
                    "Schedule a one-on-one with your manager to understand what growth areas they'd like to see, and ask them to be your partner in getting you ready for the next opportunity."
                )
                .believeScore(78L)
                .goldfishWisdom(
                    "Remember, a goldfish has a 10-second memory. Feel this disappointment, then let it swim on by. Tomorrow's a new tank, friend."
                )
                .relevantQuote("I believe in believe.")
                .tedResponse(
                    "Well shoot, partner, I know that stings like a bee that just watched Field of Dreams. But here's the thing about getting passed over - it don't mean you're not good enough, it just means your moment ain't arrived yet. And let me tell you, when it does? It's gonna be sweeter than my Aunt Mildred's pecan pie."
                )
                .build()

        assertThat(believeSubmitResponse.actionSuggestion())
            .isEqualTo(
                "Schedule a one-on-one with your manager to understand what growth areas they'd like to see, and ask them to be your partner in getting you ready for the next opportunity."
            )
        assertThat(believeSubmitResponse.believeScore()).isEqualTo(78L)
        assertThat(believeSubmitResponse.goldfishWisdom())
            .isEqualTo(
                "Remember, a goldfish has a 10-second memory. Feel this disappointment, then let it swim on by. Tomorrow's a new tank, friend."
            )
        assertThat(believeSubmitResponse.relevantQuote()).isEqualTo("I believe in believe.")
        assertThat(believeSubmitResponse.tedResponse())
            .isEqualTo(
                "Well shoot, partner, I know that stings like a bee that just watched Field of Dreams. But here's the thing about getting passed over - it don't mean you're not good enough, it just means your moment ain't arrived yet. And let me tell you, when it does? It's gonna be sweeter than my Aunt Mildred's pecan pie."
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val believeSubmitResponse =
            BelieveSubmitResponse.builder()
                .actionSuggestion(
                    "Schedule a one-on-one with your manager to understand what growth areas they'd like to see, and ask them to be your partner in getting you ready for the next opportunity."
                )
                .believeScore(78L)
                .goldfishWisdom(
                    "Remember, a goldfish has a 10-second memory. Feel this disappointment, then let it swim on by. Tomorrow's a new tank, friend."
                )
                .relevantQuote("I believe in believe.")
                .tedResponse(
                    "Well shoot, partner, I know that stings like a bee that just watched Field of Dreams. But here's the thing about getting passed over - it don't mean you're not good enough, it just means your moment ain't arrived yet. And let me tell you, when it does? It's gonna be sweeter than my Aunt Mildred's pecan pie."
                )
                .build()

        val roundtrippedBelieveSubmitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(believeSubmitResponse),
                jacksonTypeRef<BelieveSubmitResponse>(),
            )

        assertThat(roundtrippedBelieveSubmitResponse).isEqualTo(believeSubmitResponse)
    }
}
