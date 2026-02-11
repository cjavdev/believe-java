// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.conflicts

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConflictResolveResponseTest {

    @Test
    fun create() {
        val conflictResolveResponse =
            ConflictResolveResponse.builder()
                .barbecueSauceWisdom(
                    "You know what they say - you catch more flies with honey than vinegar. But you also gotta speak up, 'cause a closed mouth don't get fed."
                )
                .diagnosis(
                    "This ain't really about credit, partner. It's about feeling seen and valued. When Alex takes credit, you feel invisible, and that's gonna build up like steam in a pressure cooker."
                )
                .diamondDogsAdvice(
                    "Roy says: 'Tell them to their face.' Higgins says: 'Perhaps document your contributions in emails beforehand.' Coach Beard just nodded mysteriously and quoted Sun Tzu."
                )
                .potentialOutcome(
                    "Y'all might discover Alex didn't even realize they were doing it. Could turn a rival into an ally, like Roy and Jamie... eventually."
                )
                .stepsToResolution(
                    listOf(
                        "Request a private, casual conversation with Alex",
                        "Share how you've been feeling using 'I' statements",
                        "Ask if they're aware this has been happening",
                        "Propose a collaboration system where you both present together",
                        "Set up a weekly sync to align on contributions",
                    )
                )
                .tedApproach(
                    "I'd bring Alex a coffee, maybe a biscuit, and say 'Hey, can we chat?' No accusations, just curiosity. Ask them how they think the project's going and what they see as everyone's contributions."
                )
                .build()

        assertThat(conflictResolveResponse.barbecueSauceWisdom())
            .isEqualTo(
                "You know what they say - you catch more flies with honey than vinegar. But you also gotta speak up, 'cause a closed mouth don't get fed."
            )
        assertThat(conflictResolveResponse.diagnosis())
            .isEqualTo(
                "This ain't really about credit, partner. It's about feeling seen and valued. When Alex takes credit, you feel invisible, and that's gonna build up like steam in a pressure cooker."
            )
        assertThat(conflictResolveResponse.diamondDogsAdvice())
            .isEqualTo(
                "Roy says: 'Tell them to their face.' Higgins says: 'Perhaps document your contributions in emails beforehand.' Coach Beard just nodded mysteriously and quoted Sun Tzu."
            )
        assertThat(conflictResolveResponse.potentialOutcome())
            .isEqualTo(
                "Y'all might discover Alex didn't even realize they were doing it. Could turn a rival into an ally, like Roy and Jamie... eventually."
            )
        assertThat(conflictResolveResponse.stepsToResolution())
            .containsExactly(
                "Request a private, casual conversation with Alex",
                "Share how you've been feeling using 'I' statements",
                "Ask if they're aware this has been happening",
                "Propose a collaboration system where you both present together",
                "Set up a weekly sync to align on contributions",
            )
        assertThat(conflictResolveResponse.tedApproach())
            .isEqualTo(
                "I'd bring Alex a coffee, maybe a biscuit, and say 'Hey, can we chat?' No accusations, just curiosity. Ask them how they think the project's going and what they see as everyone's contributions."
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conflictResolveResponse =
            ConflictResolveResponse.builder()
                .barbecueSauceWisdom(
                    "You know what they say - you catch more flies with honey than vinegar. But you also gotta speak up, 'cause a closed mouth don't get fed."
                )
                .diagnosis(
                    "This ain't really about credit, partner. It's about feeling seen and valued. When Alex takes credit, you feel invisible, and that's gonna build up like steam in a pressure cooker."
                )
                .diamondDogsAdvice(
                    "Roy says: 'Tell them to their face.' Higgins says: 'Perhaps document your contributions in emails beforehand.' Coach Beard just nodded mysteriously and quoted Sun Tzu."
                )
                .potentialOutcome(
                    "Y'all might discover Alex didn't even realize they were doing it. Could turn a rival into an ally, like Roy and Jamie... eventually."
                )
                .stepsToResolution(
                    listOf(
                        "Request a private, casual conversation with Alex",
                        "Share how you've been feeling using 'I' statements",
                        "Ask if they're aware this has been happening",
                        "Propose a collaboration system where you both present together",
                        "Set up a weekly sync to align on contributions",
                    )
                )
                .tedApproach(
                    "I'd bring Alex a coffee, maybe a biscuit, and say 'Hey, can we chat?' No accusations, just curiosity. Ask them how they think the project's going and what they see as everyone's contributions."
                )
                .build()

        val roundtrippedConflictResolveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conflictResolveResponse),
                jacksonTypeRef<ConflictResolveResponse>(),
            )

        assertThat(roundtrippedConflictResolveResponse).isEqualTo(conflictResolveResponse)
    }
}
