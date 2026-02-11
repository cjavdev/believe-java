// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

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

/** Character development arc. */
class GrowthArc
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val breakthrough: JsonField<String>,
    private val challenge: JsonField<String>,
    private val endingPoint: JsonField<String>,
    private val season: JsonField<Long>,
    private val startingPoint: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("breakthrough")
        @ExcludeMissing
        breakthrough: JsonField<String> = JsonMissing.of(),
        @JsonProperty("challenge") @ExcludeMissing challenge: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_point")
        @ExcludeMissing
        endingPoint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("season") @ExcludeMissing season: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("starting_point")
        @ExcludeMissing
        startingPoint: JsonField<String> = JsonMissing.of(),
    ) : this(breakthrough, challenge, endingPoint, season, startingPoint, mutableMapOf())

    /**
     * Key breakthrough moment
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun breakthrough(): String = breakthrough.getRequired("breakthrough")

    /**
     * Main challenge faced
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun challenge(): String = challenge.getRequired("challenge")

    /**
     * Where the character ends up
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endingPoint(): String = endingPoint.getRequired("ending_point")

    /**
     * Season number
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun season(): Long = season.getRequired("season")

    /**
     * Where the character starts emotionally
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingPoint(): String = startingPoint.getRequired("starting_point")

    /**
     * Returns the raw JSON value of [breakthrough].
     *
     * Unlike [breakthrough], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("breakthrough")
    @ExcludeMissing
    fun _breakthrough(): JsonField<String> = breakthrough

    /**
     * Returns the raw JSON value of [challenge].
     *
     * Unlike [challenge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("challenge") @ExcludeMissing fun _challenge(): JsonField<String> = challenge

    /**
     * Returns the raw JSON value of [endingPoint].
     *
     * Unlike [endingPoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_point")
    @ExcludeMissing
    fun _endingPoint(): JsonField<String> = endingPoint

    /**
     * Returns the raw JSON value of [season].
     *
     * Unlike [season], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("season") @ExcludeMissing fun _season(): JsonField<Long> = season

    /**
     * Returns the raw JSON value of [startingPoint].
     *
     * Unlike [startingPoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_point")
    @ExcludeMissing
    fun _startingPoint(): JsonField<String> = startingPoint

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
         * Returns a mutable builder for constructing an instance of [GrowthArc].
         *
         * The following fields are required:
         * ```java
         * .breakthrough()
         * .challenge()
         * .endingPoint()
         * .season()
         * .startingPoint()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GrowthArc]. */
    class Builder internal constructor() {

        private var breakthrough: JsonField<String>? = null
        private var challenge: JsonField<String>? = null
        private var endingPoint: JsonField<String>? = null
        private var season: JsonField<Long>? = null
        private var startingPoint: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(growthArc: GrowthArc) = apply {
            breakthrough = growthArc.breakthrough
            challenge = growthArc.challenge
            endingPoint = growthArc.endingPoint
            season = growthArc.season
            startingPoint = growthArc.startingPoint
            additionalProperties = growthArc.additionalProperties.toMutableMap()
        }

        /** Key breakthrough moment */
        fun breakthrough(breakthrough: String) = breakthrough(JsonField.of(breakthrough))

        /**
         * Sets [Builder.breakthrough] to an arbitrary JSON value.
         *
         * You should usually call [Builder.breakthrough] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun breakthrough(breakthrough: JsonField<String>) = apply {
            this.breakthrough = breakthrough
        }

        /** Main challenge faced */
        fun challenge(challenge: String) = challenge(JsonField.of(challenge))

        /**
         * Sets [Builder.challenge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.challenge] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun challenge(challenge: JsonField<String>) = apply { this.challenge = challenge }

        /** Where the character ends up */
        fun endingPoint(endingPoint: String) = endingPoint(JsonField.of(endingPoint))

        /**
         * Sets [Builder.endingPoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingPoint] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endingPoint(endingPoint: JsonField<String>) = apply { this.endingPoint = endingPoint }

        /** Season number */
        fun season(season: Long) = season(JsonField.of(season))

        /**
         * Sets [Builder.season] to an arbitrary JSON value.
         *
         * You should usually call [Builder.season] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun season(season: JsonField<Long>) = apply { this.season = season }

        /** Where the character starts emotionally */
        fun startingPoint(startingPoint: String) = startingPoint(JsonField.of(startingPoint))

        /**
         * Sets [Builder.startingPoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingPoint] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startingPoint(startingPoint: JsonField<String>) = apply {
            this.startingPoint = startingPoint
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
         * Returns an immutable instance of [GrowthArc].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .breakthrough()
         * .challenge()
         * .endingPoint()
         * .season()
         * .startingPoint()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GrowthArc =
            GrowthArc(
                checkRequired("breakthrough", breakthrough),
                checkRequired("challenge", challenge),
                checkRequired("endingPoint", endingPoint),
                checkRequired("season", season),
                checkRequired("startingPoint", startingPoint),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GrowthArc = apply {
        if (validated) {
            return@apply
        }

        breakthrough()
        challenge()
        endingPoint()
        season()
        startingPoint()
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
        (if (breakthrough.asKnown().isPresent) 1 else 0) +
            (if (challenge.asKnown().isPresent) 1 else 0) +
            (if (endingPoint.asKnown().isPresent) 1 else 0) +
            (if (season.asKnown().isPresent) 1 else 0) +
            (if (startingPoint.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GrowthArc &&
            breakthrough == other.breakthrough &&
            challenge == other.challenge &&
            endingPoint == other.endingPoint &&
            season == other.season &&
            startingPoint == other.startingPoint &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            breakthrough,
            challenge,
            endingPoint,
            season,
            startingPoint,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GrowthArc{breakthrough=$breakthrough, challenge=$challenge, endingPoint=$endingPoint, season=$season, startingPoint=$startingPoint, additionalProperties=$additionalProperties}"
}
