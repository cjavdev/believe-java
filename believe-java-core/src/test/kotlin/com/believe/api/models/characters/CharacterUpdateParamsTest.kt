// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CharacterUpdateParamsTest {

    @Test
    fun create() {
        CharacterUpdateParams.builder()
            .characterId("character_id")
            .background("background")
            .dateOfBirth(LocalDate.parse("2019-12-27"))
            .email("dev@stainless.com")
            .emotionalStats(
                EmotionalStats.builder()
                    .curiosity(99L)
                    .empathy(100L)
                    .optimism(95L)
                    .resilience(90L)
                    .vulnerability(80L)
                    .build()
            )
            .addGrowthArc(
                GrowthArc.builder()
                    .breakthrough("breakthrough")
                    .challenge("challenge")
                    .endingPoint("ending_point")
                    .season(1L)
                    .startingPoint("starting_point")
                    .build()
            )
            .heightMeters(1.0)
            .name("x")
            .addPersonalityTrait("string")
            .profileImageUrl("https://example.com")
            .role(CharacterRole.COACH)
            .salaryGbp(0.0)
            .addSignatureQuote("string")
            .teamId("team_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CharacterUpdateParams.builder().characterId("character_id").build()

        assertThat(params._pathParam(0)).isEqualTo("character_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CharacterUpdateParams.builder()
                .characterId("character_id")
                .background("background")
                .dateOfBirth(LocalDate.parse("2019-12-27"))
                .email("dev@stainless.com")
                .emotionalStats(
                    EmotionalStats.builder()
                        .curiosity(99L)
                        .empathy(100L)
                        .optimism(95L)
                        .resilience(90L)
                        .vulnerability(80L)
                        .build()
                )
                .addGrowthArc(
                    GrowthArc.builder()
                        .breakthrough("breakthrough")
                        .challenge("challenge")
                        .endingPoint("ending_point")
                        .season(1L)
                        .startingPoint("starting_point")
                        .build()
                )
                .heightMeters(1.0)
                .name("x")
                .addPersonalityTrait("string")
                .profileImageUrl("https://example.com")
                .role(CharacterRole.COACH)
                .salaryGbp(0.0)
                .addSignatureQuote("string")
                .teamId("team_id")
                .build()

        val body = params._body()

        assertThat(body.background()).contains("background")
        assertThat(body.dateOfBirth()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.email()).contains("dev@stainless.com")
        assertThat(body.emotionalStats())
            .contains(
                EmotionalStats.builder()
                    .curiosity(99L)
                    .empathy(100L)
                    .optimism(95L)
                    .resilience(90L)
                    .vulnerability(80L)
                    .build()
            )
        assertThat(body.growthArcs().getOrNull())
            .containsExactly(
                GrowthArc.builder()
                    .breakthrough("breakthrough")
                    .challenge("challenge")
                    .endingPoint("ending_point")
                    .season(1L)
                    .startingPoint("starting_point")
                    .build()
            )
        assertThat(body.heightMeters()).contains(1.0)
        assertThat(body.name()).contains("x")
        assertThat(body.personalityTraits().getOrNull()).containsExactly("string")
        assertThat(body.profileImageUrl()).contains("https://example.com")
        assertThat(body.role()).contains(CharacterRole.COACH)
        assertThat(body.salaryGbp()).contains(CharacterUpdateParams.SalaryGbp.ofNumber(0.0))
        assertThat(body.signatureQuotes().getOrNull()).containsExactly("string")
        assertThat(body.teamId()).contains("team_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CharacterUpdateParams.builder().characterId("character_id").build()

        val body = params._body()
    }
}
