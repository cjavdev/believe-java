// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.coaching.principles

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CoachingPrincipleTest {

    @Test
    fun create() {
        val coachingPrinciple =
            CoachingPrinciple.builder()
                .id("be-curious")
                .application(
                    "When someone frustrates you, ask questions before making assumptions. Seek to understand their perspective and motivations."
                )
                .exampleFromShow(
                    "Ted uses this principle during the dart game with Rupert, explaining how people underestimated him his whole life because they judged before being curious."
                )
                .explanation(
                    "Approach people and situations with genuine curiosity rather than preconceived judgments. Everyone has a story worth understanding."
                )
                .principle("Be curious, not judgmental")
                .tedQuote("Be curious, not judgmental. - Walt Whitman... I think.")
                .build()

        assertThat(coachingPrinciple.id()).isEqualTo("be-curious")
        assertThat(coachingPrinciple.application())
            .isEqualTo(
                "When someone frustrates you, ask questions before making assumptions. Seek to understand their perspective and motivations."
            )
        assertThat(coachingPrinciple.exampleFromShow())
            .isEqualTo(
                "Ted uses this principle during the dart game with Rupert, explaining how people underestimated him his whole life because they judged before being curious."
            )
        assertThat(coachingPrinciple.explanation())
            .isEqualTo(
                "Approach people and situations with genuine curiosity rather than preconceived judgments. Everyone has a story worth understanding."
            )
        assertThat(coachingPrinciple.principle()).isEqualTo("Be curious, not judgmental")
        assertThat(coachingPrinciple.tedQuote())
            .isEqualTo("Be curious, not judgmental. - Walt Whitman... I think.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val coachingPrinciple =
            CoachingPrinciple.builder()
                .id("be-curious")
                .application(
                    "When someone frustrates you, ask questions before making assumptions. Seek to understand their perspective and motivations."
                )
                .exampleFromShow(
                    "Ted uses this principle during the dart game with Rupert, explaining how people underestimated him his whole life because they judged before being curious."
                )
                .explanation(
                    "Approach people and situations with genuine curiosity rather than preconceived judgments. Everyone has a story worth understanding."
                )
                .principle("Be curious, not judgmental")
                .tedQuote("Be curious, not judgmental. - Walt Whitman... I think.")
                .build()

        val roundtrippedCoachingPrinciple =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(coachingPrinciple),
                jacksonTypeRef<CoachingPrinciple>(),
            )

        assertThat(roundtrippedCoachingPrinciple).isEqualTo(coachingPrinciple)
    }
}
