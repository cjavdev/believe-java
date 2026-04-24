// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CharacterListPageResponseTest {

    @Test
    fun create() {
        val characterListPageResponse =
            CharacterListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        assertThat(characterListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(characterListPageResponse.hasMore()).isEqualTo(true)
        assertThat(characterListPageResponse.limit()).isEqualTo(0L)
        assertThat(characterListPageResponse.page()).isEqualTo(0L)
        assertThat(characterListPageResponse.pages()).isEqualTo(0L)
        assertThat(characterListPageResponse.skip()).isEqualTo(0L)
        assertThat(characterListPageResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val characterListPageResponse =
            CharacterListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        val roundtrippedCharacterListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(characterListPageResponse),
                jacksonTypeRef<CharacterListPageResponse>(),
            )

        assertThat(roundtrippedCharacterListPageResponse).isEqualTo(characterListPageResponse)
    }
}
