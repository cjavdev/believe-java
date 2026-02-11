// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CharacterCreateParamsTest {

    @Test
    fun create() {
        CharacterCreateParams.builder()
            .background(
                "Legendary midfielder for Chelsea and AFC Richmond, now assistant coach. Known for his gruff exterior hiding a heart of gold."
            )
            .emotionalStats(
                EmotionalStats.builder()
                    .curiosity(40L)
                    .empathy(85L)
                    .optimism(45L)
                    .resilience(95L)
                    .vulnerability(60L)
                    .build()
            )
            .name("Roy Kent")
            .personalityTraits(listOf("intense", "loyal", "secretly caring", "profane"))
            .role(CharacterRole.COACH)
            .dateOfBirth(LocalDate.parse("1977-03-15"))
            .email("roy.kent@afcrichmond.com")
            .addGrowthArc(
                GrowthArc.builder()
                    .breakthrough("Finding purpose beyond playing")
                    .challenge("Accepting his body's limitations")
                    .endingPoint("Retired but lost")
                    .season(1L)
                    .startingPoint("Aging footballer facing retirement")
                    .build()
            )
            .heightMeters(1.78)
            .profileImageUrl("https://afcrichmond.com/images/roy-kent.jpg")
            .salaryGbp("175000.00")
            .addSignatureQuote("He's here, he's there, he's every-f***ing-where, Roy Kent!")
            .addSignatureQuote("Whistle!")
            .teamId("afc-richmond")
            .build()
    }

    @Test
    fun body() {
        val params =
            CharacterCreateParams.builder()
                .background(
                    "Legendary midfielder for Chelsea and AFC Richmond, now assistant coach. Known for his gruff exterior hiding a heart of gold."
                )
                .emotionalStats(
                    EmotionalStats.builder()
                        .curiosity(40L)
                        .empathy(85L)
                        .optimism(45L)
                        .resilience(95L)
                        .vulnerability(60L)
                        .build()
                )
                .name("Roy Kent")
                .personalityTraits(listOf("intense", "loyal", "secretly caring", "profane"))
                .role(CharacterRole.COACH)
                .dateOfBirth(LocalDate.parse("1977-03-15"))
                .email("roy.kent@afcrichmond.com")
                .addGrowthArc(
                    GrowthArc.builder()
                        .breakthrough("Finding purpose beyond playing")
                        .challenge("Accepting his body's limitations")
                        .endingPoint("Retired but lost")
                        .season(1L)
                        .startingPoint("Aging footballer facing retirement")
                        .build()
                )
                .heightMeters(1.78)
                .profileImageUrl("https://afcrichmond.com/images/roy-kent.jpg")
                .salaryGbp("175000.00")
                .addSignatureQuote("He's here, he's there, he's every-f***ing-where, Roy Kent!")
                .addSignatureQuote("Whistle!")
                .teamId("afc-richmond")
                .build()

        val body = params._body()

        assertThat(body.background())
            .isEqualTo(
                "Legendary midfielder for Chelsea and AFC Richmond, now assistant coach. Known for his gruff exterior hiding a heart of gold."
            )
        assertThat(body.emotionalStats())
            .isEqualTo(
                EmotionalStats.builder()
                    .curiosity(40L)
                    .empathy(85L)
                    .optimism(45L)
                    .resilience(95L)
                    .vulnerability(60L)
                    .build()
            )
        assertThat(body.name()).isEqualTo("Roy Kent")
        assertThat(body.personalityTraits())
            .containsExactly("intense", "loyal", "secretly caring", "profane")
        assertThat(body.role()).isEqualTo(CharacterRole.COACH)
        assertThat(body.dateOfBirth()).contains(LocalDate.parse("1977-03-15"))
        assertThat(body.email()).contains("roy.kent@afcrichmond.com")
        assertThat(body.growthArcs().getOrNull())
            .containsExactly(
                GrowthArc.builder()
                    .breakthrough("Finding purpose beyond playing")
                    .challenge("Accepting his body's limitations")
                    .endingPoint("Retired but lost")
                    .season(1L)
                    .startingPoint("Aging footballer facing retirement")
                    .build()
            )
        assertThat(body.heightMeters()).contains(1.78)
        assertThat(body.profileImageUrl()).contains("https://afcrichmond.com/images/roy-kent.jpg")
        assertThat(body.salaryGbp()).contains(CharacterCreateParams.SalaryGbp.ofString("175000.00"))
        assertThat(body.signatureQuotes().getOrNull())
            .containsExactly(
                "He's here, he's there, he's every-f***ing-where, Roy Kent!",
                "Whistle!",
            )
        assertThat(body.teamId()).contains("afc-richmond")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CharacterCreateParams.builder()
                .background(
                    "Legendary midfielder for Chelsea and AFC Richmond, now assistant coach. Known for his gruff exterior hiding a heart of gold."
                )
                .emotionalStats(
                    EmotionalStats.builder()
                        .curiosity(40L)
                        .empathy(85L)
                        .optimism(45L)
                        .resilience(95L)
                        .vulnerability(60L)
                        .build()
                )
                .name("Roy Kent")
                .personalityTraits(listOf("intense", "loyal", "secretly caring", "profane"))
                .role(CharacterRole.COACH)
                .build()

        val body = params._body()

        assertThat(body.background())
            .isEqualTo(
                "Legendary midfielder for Chelsea and AFC Richmond, now assistant coach. Known for his gruff exterior hiding a heart of gold."
            )
        assertThat(body.emotionalStats())
            .isEqualTo(
                EmotionalStats.builder()
                    .curiosity(40L)
                    .empathy(85L)
                    .optimism(45L)
                    .resilience(95L)
                    .vulnerability(60L)
                    .build()
            )
        assertThat(body.name()).isEqualTo("Roy Kent")
        assertThat(body.personalityTraits())
            .containsExactly("intense", "loyal", "secretly caring", "profane")
        assertThat(body.role()).isEqualTo(CharacterRole.COACH)
    }
}
