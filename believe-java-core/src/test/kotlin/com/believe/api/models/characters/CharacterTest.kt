// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CharacterTest {

    @Test
    fun create() {
        val character =
            Character.builder()
                .id("ted-lasso")
                .background(
                    "Former American football coach from Kansas who moved to London to coach AFC Richmond"
                )
                .emotionalStats(
                    EmotionalStats.builder()
                        .curiosity(99L)
                        .empathy(100L)
                        .optimism(95L)
                        .resilience(90L)
                        .vulnerability(80L)
                        .build()
                )
                .name("Ted Lasso")
                .personalityTraits(listOf("optimistic", "kind", "folksy", "persistent"))
                .role(CharacterRole.COACH)
                .dateOfBirth(LocalDate.parse("1970-09-22"))
                .email("ted.lasso@afcrichmond.com")
                .addGrowthArc(
                    GrowthArc.builder()
                        .breakthrough("Showing vulnerability about his marriage")
                        .challenge("Earning respect despite inexperience")
                        .endingPoint("Accepted by the team despite relegation")
                        .season(1L)
                        .startingPoint("Fish out of water, hiding pain with humor")
                        .build()
                )
                .heightMeters(1.83)
                .profileImageUrl("https://afcrichmond.com/images/ted-lasso.jpg")
                .salaryGbp("150000.00")
                .addSignatureQuote("I believe in believe.")
                .addSignatureQuote("Be curious, not judgmental.")
                .teamId("afc-richmond")
                .build()

        assertThat(character.id()).isEqualTo("ted-lasso")
        assertThat(character.background())
            .isEqualTo(
                "Former American football coach from Kansas who moved to London to coach AFC Richmond"
            )
        assertThat(character.emotionalStats())
            .isEqualTo(
                EmotionalStats.builder()
                    .curiosity(99L)
                    .empathy(100L)
                    .optimism(95L)
                    .resilience(90L)
                    .vulnerability(80L)
                    .build()
            )
        assertThat(character.name()).isEqualTo("Ted Lasso")
        assertThat(character.personalityTraits())
            .containsExactly("optimistic", "kind", "folksy", "persistent")
        assertThat(character.role()).isEqualTo(CharacterRole.COACH)
        assertThat(character.dateOfBirth()).contains(LocalDate.parse("1970-09-22"))
        assertThat(character.email()).contains("ted.lasso@afcrichmond.com")
        assertThat(character.growthArcs().getOrNull())
            .containsExactly(
                GrowthArc.builder()
                    .breakthrough("Showing vulnerability about his marriage")
                    .challenge("Earning respect despite inexperience")
                    .endingPoint("Accepted by the team despite relegation")
                    .season(1L)
                    .startingPoint("Fish out of water, hiding pain with humor")
                    .build()
            )
        assertThat(character.heightMeters()).contains(1.83)
        assertThat(character.profileImageUrl())
            .contains("https://afcrichmond.com/images/ted-lasso.jpg")
        assertThat(character.salaryGbp()).contains("150000.00")
        assertThat(character.signatureQuotes().getOrNull())
            .containsExactly("I believe in believe.", "Be curious, not judgmental.")
        assertThat(character.teamId()).contains("afc-richmond")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val character =
            Character.builder()
                .id("ted-lasso")
                .background(
                    "Former American football coach from Kansas who moved to London to coach AFC Richmond"
                )
                .emotionalStats(
                    EmotionalStats.builder()
                        .curiosity(99L)
                        .empathy(100L)
                        .optimism(95L)
                        .resilience(90L)
                        .vulnerability(80L)
                        .build()
                )
                .name("Ted Lasso")
                .personalityTraits(listOf("optimistic", "kind", "folksy", "persistent"))
                .role(CharacterRole.COACH)
                .dateOfBirth(LocalDate.parse("1970-09-22"))
                .email("ted.lasso@afcrichmond.com")
                .addGrowthArc(
                    GrowthArc.builder()
                        .breakthrough("Showing vulnerability about his marriage")
                        .challenge("Earning respect despite inexperience")
                        .endingPoint("Accepted by the team despite relegation")
                        .season(1L)
                        .startingPoint("Fish out of water, hiding pain with humor")
                        .build()
                )
                .heightMeters(1.83)
                .profileImageUrl("https://afcrichmond.com/images/ted-lasso.jpg")
                .salaryGbp("150000.00")
                .addSignatureQuote("I believe in believe.")
                .addSignatureQuote("Be curious, not judgmental.")
                .teamId("afc-richmond")
                .build()

        val roundtrippedCharacter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(character),
                jacksonTypeRef<Character>(),
            )

        assertThat(roundtrippedCharacter).isEqualTo(character)
    }
}
