// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.reframe

import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.checkRequired
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Reframed perspective response. */
class ReframeTransformNegativeThoughtsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dailyAffirmation: JsonField<String>,
    private val originalThought: JsonField<String>,
    private val reframedThought: JsonField<String>,
    private val tedPerspective: JsonField<String>,
    private val drSharonInsight: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("daily_affirmation")
        @ExcludeMissing
        dailyAffirmation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("original_thought")
        @ExcludeMissing
        originalThought: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reframed_thought")
        @ExcludeMissing
        reframedThought: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ted_perspective")
        @ExcludeMissing
        tedPerspective: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dr_sharon_insight")
        @ExcludeMissing
        drSharonInsight: JsonField<String> = JsonMissing.of(),
    ) : this(
        dailyAffirmation,
        originalThought,
        reframedThought,
        tedPerspective,
        drSharonInsight,
        mutableMapOf(),
    )

    /**
     * A daily affirmation to practice
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dailyAffirmation(): String = dailyAffirmation.getRequired("daily_affirmation")

    /**
     * The original negative thought
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originalThought(): String = originalThought.getRequired("original_thought")

    /**
     * The thought reframed positively
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reframedThought(): String = reframedThought.getRequired("reframed_thought")

    /**
     * Ted's take on this thought
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tedPerspective(): String = tedPerspective.getRequired("ted_perspective")

    /**
     * Dr. Sharon's therapeutic insight
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun drSharonInsight(): Optional<String> = drSharonInsight.getOptional("dr_sharon_insight")

    /**
     * Returns the raw JSON value of [dailyAffirmation].
     *
     * Unlike [dailyAffirmation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("daily_affirmation")
    @ExcludeMissing
    fun _dailyAffirmation(): JsonField<String> = dailyAffirmation

    /**
     * Returns the raw JSON value of [originalThought].
     *
     * Unlike [originalThought], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("original_thought")
    @ExcludeMissing
    fun _originalThought(): JsonField<String> = originalThought

    /**
     * Returns the raw JSON value of [reframedThought].
     *
     * Unlike [reframedThought], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reframed_thought")
    @ExcludeMissing
    fun _reframedThought(): JsonField<String> = reframedThought

    /**
     * Returns the raw JSON value of [tedPerspective].
     *
     * Unlike [tedPerspective], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ted_perspective")
    @ExcludeMissing
    fun _tedPerspective(): JsonField<String> = tedPerspective

    /**
     * Returns the raw JSON value of [drSharonInsight].
     *
     * Unlike [drSharonInsight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dr_sharon_insight")
    @ExcludeMissing
    fun _drSharonInsight(): JsonField<String> = drSharonInsight

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReframeTransformNegativeThoughtsResponse].
         *
         * The following fields are required:
         * ```java
         * .dailyAffirmation()
         * .originalThought()
         * .reframedThought()
         * .tedPerspective()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReframeTransformNegativeThoughtsResponse]. */
    class Builder internal constructor() {

        private var dailyAffirmation: JsonField<String>? = null
        private var originalThought: JsonField<String>? = null
        private var reframedThought: JsonField<String>? = null
        private var tedPerspective: JsonField<String>? = null
        private var drSharonInsight: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            reframeTransformNegativeThoughtsResponse: ReframeTransformNegativeThoughtsResponse
        ) = apply {
            dailyAffirmation = reframeTransformNegativeThoughtsResponse.dailyAffirmation
            originalThought = reframeTransformNegativeThoughtsResponse.originalThought
            reframedThought = reframeTransformNegativeThoughtsResponse.reframedThought
            tedPerspective = reframeTransformNegativeThoughtsResponse.tedPerspective
            drSharonInsight = reframeTransformNegativeThoughtsResponse.drSharonInsight
            additionalProperties =
                reframeTransformNegativeThoughtsResponse.additionalProperties.toMutableMap()
        }

        /** A daily affirmation to practice */
        fun dailyAffirmation(dailyAffirmation: String) =
            dailyAffirmation(JsonField.of(dailyAffirmation))

        /**
         * Sets [Builder.dailyAffirmation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyAffirmation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailyAffirmation(dailyAffirmation: JsonField<String>) = apply {
            this.dailyAffirmation = dailyAffirmation
        }

        /** The original negative thought */
        fun originalThought(originalThought: String) =
            originalThought(JsonField.of(originalThought))

        /**
         * Sets [Builder.originalThought] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalThought] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originalThought(originalThought: JsonField<String>) = apply {
            this.originalThought = originalThought
        }

        /** The thought reframed positively */
        fun reframedThought(reframedThought: String) =
            reframedThought(JsonField.of(reframedThought))

        /**
         * Sets [Builder.reframedThought] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reframedThought] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reframedThought(reframedThought: JsonField<String>) = apply {
            this.reframedThought = reframedThought
        }

        /** Ted's take on this thought */
        fun tedPerspective(tedPerspective: String) = tedPerspective(JsonField.of(tedPerspective))

        /**
         * Sets [Builder.tedPerspective] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tedPerspective] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tedPerspective(tedPerspective: JsonField<String>) = apply {
            this.tedPerspective = tedPerspective
        }

        /** Dr. Sharon's therapeutic insight */
        fun drSharonInsight(drSharonInsight: String?) =
            drSharonInsight(JsonField.ofNullable(drSharonInsight))

        /** Alias for calling [Builder.drSharonInsight] with `drSharonInsight.orElse(null)`. */
        fun drSharonInsight(drSharonInsight: Optional<String>) =
            drSharonInsight(drSharonInsight.getOrNull())

        /**
         * Sets [Builder.drSharonInsight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.drSharonInsight] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun drSharonInsight(drSharonInsight: JsonField<String>) = apply {
            this.drSharonInsight = drSharonInsight
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [ReframeTransformNegativeThoughtsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dailyAffirmation()
         * .originalThought()
         * .reframedThought()
         * .tedPerspective()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReframeTransformNegativeThoughtsResponse =
            ReframeTransformNegativeThoughtsResponse(
                checkRequired("dailyAffirmation", dailyAffirmation),
                checkRequired("originalThought", originalThought),
                checkRequired("reframedThought", reframedThought),
                checkRequired("tedPerspective", tedPerspective),
                drSharonInsight,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ReframeTransformNegativeThoughtsResponse = apply {
        if (validated) {
            return@apply
        }

        dailyAffirmation()
        originalThought()
        reframedThought()
        tedPerspective()
        drSharonInsight()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: BelieveInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (dailyAffirmation.asKnown().isPresent) 1 else 0) +
            (if (originalThought.asKnown().isPresent) 1 else 0) +
            (if (reframedThought.asKnown().isPresent) 1 else 0) +
            (if (tedPerspective.asKnown().isPresent) 1 else 0) +
            (if (drSharonInsight.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReframeTransformNegativeThoughtsResponse &&
            dailyAffirmation == other.dailyAffirmation &&
            originalThought == other.originalThought &&
            reframedThought == other.reframedThought &&
            tedPerspective == other.tedPerspective &&
            drSharonInsight == other.drSharonInsight &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dailyAffirmation,
            originalThought,
            reframedThought,
            tedPerspective,
            drSharonInsight,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReframeTransformNegativeThoughtsResponse{dailyAffirmation=$dailyAffirmation, originalThought=$originalThought, reframedThought=$reframedThought, tedPerspective=$tedPerspective, drSharonInsight=$drSharonInsight, additionalProperties=$additionalProperties}"
}
