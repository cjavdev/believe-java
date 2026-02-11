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

/** Emotional intelligence statistics for a character. */
class EmotionalStats
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val curiosity: JsonField<Long>,
    private val empathy: JsonField<Long>,
    private val optimism: JsonField<Long>,
    private val resilience: JsonField<Long>,
    private val vulnerability: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("curiosity") @ExcludeMissing curiosity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("empathy") @ExcludeMissing empathy: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("optimism") @ExcludeMissing optimism: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("resilience") @ExcludeMissing resilience: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("vulnerability")
        @ExcludeMissing
        vulnerability: JsonField<Long> = JsonMissing.of(),
    ) : this(curiosity, empathy, optimism, resilience, vulnerability, mutableMapOf())

    /**
     * Level of curiosity over judgment (0-100)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun curiosity(): Long = curiosity.getRequired("curiosity")

    /**
     * Capacity for empathy (0-100)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun empathy(): Long = empathy.getRequired("empathy")

    /**
     * Level of optimism (0-100)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optimism(): Long = optimism.getRequired("optimism")

    /**
     * Bounce-back ability (0-100)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resilience(): Long = resilience.getRequired("resilience")

    /**
     * Willingness to be vulnerable (0-100)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vulnerability(): Long = vulnerability.getRequired("vulnerability")

    /**
     * Returns the raw JSON value of [curiosity].
     *
     * Unlike [curiosity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("curiosity") @ExcludeMissing fun _curiosity(): JsonField<Long> = curiosity

    /**
     * Returns the raw JSON value of [empathy].
     *
     * Unlike [empathy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("empathy") @ExcludeMissing fun _empathy(): JsonField<Long> = empathy

    /**
     * Returns the raw JSON value of [optimism].
     *
     * Unlike [optimism], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("optimism") @ExcludeMissing fun _optimism(): JsonField<Long> = optimism

    /**
     * Returns the raw JSON value of [resilience].
     *
     * Unlike [resilience], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resilience") @ExcludeMissing fun _resilience(): JsonField<Long> = resilience

    /**
     * Returns the raw JSON value of [vulnerability].
     *
     * Unlike [vulnerability], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vulnerability")
    @ExcludeMissing
    fun _vulnerability(): JsonField<Long> = vulnerability

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
         * Returns a mutable builder for constructing an instance of [EmotionalStats].
         *
         * The following fields are required:
         * ```java
         * .curiosity()
         * .empathy()
         * .optimism()
         * .resilience()
         * .vulnerability()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmotionalStats]. */
    class Builder internal constructor() {

        private var curiosity: JsonField<Long>? = null
        private var empathy: JsonField<Long>? = null
        private var optimism: JsonField<Long>? = null
        private var resilience: JsonField<Long>? = null
        private var vulnerability: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emotionalStats: EmotionalStats) = apply {
            curiosity = emotionalStats.curiosity
            empathy = emotionalStats.empathy
            optimism = emotionalStats.optimism
            resilience = emotionalStats.resilience
            vulnerability = emotionalStats.vulnerability
            additionalProperties = emotionalStats.additionalProperties.toMutableMap()
        }

        /** Level of curiosity over judgment (0-100) */
        fun curiosity(curiosity: Long) = curiosity(JsonField.of(curiosity))

        /**
         * Sets [Builder.curiosity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.curiosity] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun curiosity(curiosity: JsonField<Long>) = apply { this.curiosity = curiosity }

        /** Capacity for empathy (0-100) */
        fun empathy(empathy: Long) = empathy(JsonField.of(empathy))

        /**
         * Sets [Builder.empathy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.empathy] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun empathy(empathy: JsonField<Long>) = apply { this.empathy = empathy }

        /** Level of optimism (0-100) */
        fun optimism(optimism: Long) = optimism(JsonField.of(optimism))

        /**
         * Sets [Builder.optimism] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optimism] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun optimism(optimism: JsonField<Long>) = apply { this.optimism = optimism }

        /** Bounce-back ability (0-100) */
        fun resilience(resilience: Long) = resilience(JsonField.of(resilience))

        /**
         * Sets [Builder.resilience] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resilience] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun resilience(resilience: JsonField<Long>) = apply { this.resilience = resilience }

        /** Willingness to be vulnerable (0-100) */
        fun vulnerability(vulnerability: Long) = vulnerability(JsonField.of(vulnerability))

        /**
         * Sets [Builder.vulnerability] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vulnerability] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vulnerability(vulnerability: JsonField<Long>) = apply {
            this.vulnerability = vulnerability
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
         * Returns an immutable instance of [EmotionalStats].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .curiosity()
         * .empathy()
         * .optimism()
         * .resilience()
         * .vulnerability()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmotionalStats =
            EmotionalStats(
                checkRequired("curiosity", curiosity),
                checkRequired("empathy", empathy),
                checkRequired("optimism", optimism),
                checkRequired("resilience", resilience),
                checkRequired("vulnerability", vulnerability),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EmotionalStats = apply {
        if (validated) {
            return@apply
        }

        curiosity()
        empathy()
        optimism()
        resilience()
        vulnerability()
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
        (if (curiosity.asKnown().isPresent) 1 else 0) +
            (if (empathy.asKnown().isPresent) 1 else 0) +
            (if (optimism.asKnown().isPresent) 1 else 0) +
            (if (resilience.asKnown().isPresent) 1 else 0) +
            (if (vulnerability.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmotionalStats &&
            curiosity == other.curiosity &&
            empathy == other.empathy &&
            optimism == other.optimism &&
            resilience == other.resilience &&
            vulnerability == other.vulnerability &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(curiosity, empathy, optimism, resilience, vulnerability, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmotionalStats{curiosity=$curiosity, empathy=$empathy, optimism=$optimism, resilience=$resilience, vulnerability=$vulnerability, additionalProperties=$additionalProperties}"
}
