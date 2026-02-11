// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.reframe

import com.believe.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReframeTransformNegativeThoughtsResponseTest {

    @Test
    fun create() {
        val reframeTransformNegativeThoughtsResponse =
            ReframeTransformNegativeThoughtsResponse.builder()
                .dailyAffirmation("I am capable, I am learning, and I belong exactly where I am.")
                .originalThought("I'm not good enough for this job.")
                .reframedThought(
                    "I'm still learning and growing in this role, and that's exactly where I should be."
                )
                .tedPerspective(
                    "You know what? Imposter syndrome is just your brain's way of telling you that you care. The folks who think they know everything? They're the ones you gotta worry about. You questioning yourself means you're paying attention."
                )
                .drSharonInsight(
                    "This thought pattern often stems from comparing your internal experience to others' external presentations. Consider: what evidence do you have that contradicts this belief?"
                )
                .build()

        assertThat(reframeTransformNegativeThoughtsResponse.dailyAffirmation())
            .isEqualTo("I am capable, I am learning, and I belong exactly where I am.")
        assertThat(reframeTransformNegativeThoughtsResponse.originalThought())
            .isEqualTo("I'm not good enough for this job.")
        assertThat(reframeTransformNegativeThoughtsResponse.reframedThought())
            .isEqualTo(
                "I'm still learning and growing in this role, and that's exactly where I should be."
            )
        assertThat(reframeTransformNegativeThoughtsResponse.tedPerspective())
            .isEqualTo(
                "You know what? Imposter syndrome is just your brain's way of telling you that you care. The folks who think they know everything? They're the ones you gotta worry about. You questioning yourself means you're paying attention."
            )
        assertThat(reframeTransformNegativeThoughtsResponse.drSharonInsight())
            .contains(
                "This thought pattern often stems from comparing your internal experience to others' external presentations. Consider: what evidence do you have that contradicts this belief?"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reframeTransformNegativeThoughtsResponse =
            ReframeTransformNegativeThoughtsResponse.builder()
                .dailyAffirmation("I am capable, I am learning, and I belong exactly where I am.")
                .originalThought("I'm not good enough for this job.")
                .reframedThought(
                    "I'm still learning and growing in this role, and that's exactly where I should be."
                )
                .tedPerspective(
                    "You know what? Imposter syndrome is just your brain's way of telling you that you care. The folks who think they know everything? They're the ones you gotta worry about. You questioning yourself means you're paying attention."
                )
                .drSharonInsight(
                    "This thought pattern often stems from comparing your internal experience to others' external presentations. Consider: what evidence do you have that contradicts this belief?"
                )
                .build()

        val roundtrippedReframeTransformNegativeThoughtsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reframeTransformNegativeThoughtsResponse),
                jacksonTypeRef<ReframeTransformNegativeThoughtsResponse>(),
            )

        assertThat(roundtrippedReframeTransformNegativeThoughtsResponse)
            .isEqualTo(reframeTransformNegativeThoughtsResponse)
    }
}
