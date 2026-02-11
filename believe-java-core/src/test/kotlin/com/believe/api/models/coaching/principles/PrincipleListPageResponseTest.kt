// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.coaching.principles

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrincipleListPageResponseTest {

    @Test
    fun create() {
        val principleListPageResponse =
            PrincipleListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        assertThat(principleListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(principleListPageResponse.hasMore()).isEqualTo(true)
        assertThat(principleListPageResponse.limit()).isEqualTo(0L)
        assertThat(principleListPageResponse.page()).isEqualTo(0L)
        assertThat(principleListPageResponse.pages()).isEqualTo(0L)
        assertThat(principleListPageResponse.skip()).isEqualTo(0L)
        assertThat(principleListPageResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val principleListPageResponse =
            PrincipleListPageResponse.builder()
                .addData(
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
                )
                .hasMore(true)
                .limit(0L)
                .page(0L)
                .pages(0L)
                .skip(0L)
                .total(0L)
                .build()

        val roundtrippedPrincipleListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(principleListPageResponse),
                jacksonTypeRef<PrincipleListPageResponse>(),
            )

        assertThat(roundtrippedPrincipleListPageResponse).isEqualTo(principleListPageResponse)
    }
}
