// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.conflicts

import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.checkKnown
import com.believe.api.core.checkRequired
import com.believe.api.core.toImmutable
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Conflict resolution response. */
class ConflictResolveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val barbecueSauceWisdom: JsonField<String>,
    private val diagnosis: JsonField<String>,
    private val diamondDogsAdvice: JsonField<String>,
    private val potentialOutcome: JsonField<String>,
    private val stepsToResolution: JsonField<List<String>>,
    private val tedApproach: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("barbecue_sauce_wisdom")
        @ExcludeMissing
        barbecueSauceWisdom: JsonField<String> = JsonMissing.of(),
        @JsonProperty("diagnosis") @ExcludeMissing diagnosis: JsonField<String> = JsonMissing.of(),
        @JsonProperty("diamond_dogs_advice")
        @ExcludeMissing
        diamondDogsAdvice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("potential_outcome")
        @ExcludeMissing
        potentialOutcome: JsonField<String> = JsonMissing.of(),
        @JsonProperty("steps_to_resolution")
        @ExcludeMissing
        stepsToResolution: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("ted_approach")
        @ExcludeMissing
        tedApproach: JsonField<String> = JsonMissing.of(),
    ) : this(
        barbecueSauceWisdom,
        diagnosis,
        diamondDogsAdvice,
        potentialOutcome,
        stepsToResolution,
        tedApproach,
        mutableMapOf(),
    )

    /**
     * A folksy metaphor to remember
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun barbecueSauceWisdom(): String = barbecueSauceWisdom.getRequired("barbecue_sauce_wisdom")

    /**
     * Understanding the root cause
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun diagnosis(): String = diagnosis.getRequired("diagnosis")

    /**
     * Advice from the Diamond Dogs support group
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun diamondDogsAdvice(): String = diamondDogsAdvice.getRequired("diamond_dogs_advice")

    /**
     * What resolution could look like
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun potentialOutcome(): String = potentialOutcome.getRequired("potential_outcome")

    /**
     * Concrete steps to resolve the conflict
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stepsToResolution(): List<String> = stepsToResolution.getRequired("steps_to_resolution")

    /**
     * How Ted would handle this
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tedApproach(): String = tedApproach.getRequired("ted_approach")

    /**
     * Returns the raw JSON value of [barbecueSauceWisdom].
     *
     * Unlike [barbecueSauceWisdom], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("barbecue_sauce_wisdom")
    @ExcludeMissing
    fun _barbecueSauceWisdom(): JsonField<String> = barbecueSauceWisdom

    /**
     * Returns the raw JSON value of [diagnosis].
     *
     * Unlike [diagnosis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("diagnosis") @ExcludeMissing fun _diagnosis(): JsonField<String> = diagnosis

    /**
     * Returns the raw JSON value of [diamondDogsAdvice].
     *
     * Unlike [diamondDogsAdvice], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("diamond_dogs_advice")
    @ExcludeMissing
    fun _diamondDogsAdvice(): JsonField<String> = diamondDogsAdvice

    /**
     * Returns the raw JSON value of [potentialOutcome].
     *
     * Unlike [potentialOutcome], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("potential_outcome")
    @ExcludeMissing
    fun _potentialOutcome(): JsonField<String> = potentialOutcome

    /**
     * Returns the raw JSON value of [stepsToResolution].
     *
     * Unlike [stepsToResolution], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("steps_to_resolution")
    @ExcludeMissing
    fun _stepsToResolution(): JsonField<List<String>> = stepsToResolution

    /**
     * Returns the raw JSON value of [tedApproach].
     *
     * Unlike [tedApproach], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ted_approach")
    @ExcludeMissing
    fun _tedApproach(): JsonField<String> = tedApproach

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
         * Returns a mutable builder for constructing an instance of [ConflictResolveResponse].
         *
         * The following fields are required:
         * ```java
         * .barbecueSauceWisdom()
         * .diagnosis()
         * .diamondDogsAdvice()
         * .potentialOutcome()
         * .stepsToResolution()
         * .tedApproach()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConflictResolveResponse]. */
    class Builder internal constructor() {

        private var barbecueSauceWisdom: JsonField<String>? = null
        private var diagnosis: JsonField<String>? = null
        private var diamondDogsAdvice: JsonField<String>? = null
        private var potentialOutcome: JsonField<String>? = null
        private var stepsToResolution: JsonField<MutableList<String>>? = null
        private var tedApproach: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(conflictResolveResponse: ConflictResolveResponse) = apply {
            barbecueSauceWisdom = conflictResolveResponse.barbecueSauceWisdom
            diagnosis = conflictResolveResponse.diagnosis
            diamondDogsAdvice = conflictResolveResponse.diamondDogsAdvice
            potentialOutcome = conflictResolveResponse.potentialOutcome
            stepsToResolution = conflictResolveResponse.stepsToResolution.map { it.toMutableList() }
            tedApproach = conflictResolveResponse.tedApproach
            additionalProperties = conflictResolveResponse.additionalProperties.toMutableMap()
        }

        /** A folksy metaphor to remember */
        fun barbecueSauceWisdom(barbecueSauceWisdom: String) =
            barbecueSauceWisdom(JsonField.of(barbecueSauceWisdom))

        /**
         * Sets [Builder.barbecueSauceWisdom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.barbecueSauceWisdom] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun barbecueSauceWisdom(barbecueSauceWisdom: JsonField<String>) = apply {
            this.barbecueSauceWisdom = barbecueSauceWisdom
        }

        /** Understanding the root cause */
        fun diagnosis(diagnosis: String) = diagnosis(JsonField.of(diagnosis))

        /**
         * Sets [Builder.diagnosis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.diagnosis] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun diagnosis(diagnosis: JsonField<String>) = apply { this.diagnosis = diagnosis }

        /** Advice from the Diamond Dogs support group */
        fun diamondDogsAdvice(diamondDogsAdvice: String) =
            diamondDogsAdvice(JsonField.of(diamondDogsAdvice))

        /**
         * Sets [Builder.diamondDogsAdvice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.diamondDogsAdvice] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun diamondDogsAdvice(diamondDogsAdvice: JsonField<String>) = apply {
            this.diamondDogsAdvice = diamondDogsAdvice
        }

        /** What resolution could look like */
        fun potentialOutcome(potentialOutcome: String) =
            potentialOutcome(JsonField.of(potentialOutcome))

        /**
         * Sets [Builder.potentialOutcome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.potentialOutcome] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun potentialOutcome(potentialOutcome: JsonField<String>) = apply {
            this.potentialOutcome = potentialOutcome
        }

        /** Concrete steps to resolve the conflict */
        fun stepsToResolution(stepsToResolution: List<String>) =
            stepsToResolution(JsonField.of(stepsToResolution))

        /**
         * Sets [Builder.stepsToResolution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stepsToResolution] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun stepsToResolution(stepsToResolution: JsonField<List<String>>) = apply {
            this.stepsToResolution = stepsToResolution.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.stepsToResolution].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStepsToResolution(stepsToResolution: String) = apply {
            this.stepsToResolution =
                (this.stepsToResolution ?: JsonField.of(mutableListOf())).also {
                    checkKnown("stepsToResolution", it).add(stepsToResolution)
                }
        }

        /** How Ted would handle this */
        fun tedApproach(tedApproach: String) = tedApproach(JsonField.of(tedApproach))

        /**
         * Sets [Builder.tedApproach] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tedApproach] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tedApproach(tedApproach: JsonField<String>) = apply { this.tedApproach = tedApproach }

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
         * Returns an immutable instance of [ConflictResolveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .barbecueSauceWisdom()
         * .diagnosis()
         * .diamondDogsAdvice()
         * .potentialOutcome()
         * .stepsToResolution()
         * .tedApproach()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConflictResolveResponse =
            ConflictResolveResponse(
                checkRequired("barbecueSauceWisdom", barbecueSauceWisdom),
                checkRequired("diagnosis", diagnosis),
                checkRequired("diamondDogsAdvice", diamondDogsAdvice),
                checkRequired("potentialOutcome", potentialOutcome),
                checkRequired("stepsToResolution", stepsToResolution).map { it.toImmutable() },
                checkRequired("tedApproach", tedApproach),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConflictResolveResponse = apply {
        if (validated) {
            return@apply
        }

        barbecueSauceWisdom()
        diagnosis()
        diamondDogsAdvice()
        potentialOutcome()
        stepsToResolution()
        tedApproach()
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
        (if (barbecueSauceWisdom.asKnown().isPresent) 1 else 0) +
            (if (diagnosis.asKnown().isPresent) 1 else 0) +
            (if (diamondDogsAdvice.asKnown().isPresent) 1 else 0) +
            (if (potentialOutcome.asKnown().isPresent) 1 else 0) +
            (stepsToResolution.asKnown().getOrNull()?.size ?: 0) +
            (if (tedApproach.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConflictResolveResponse &&
            barbecueSauceWisdom == other.barbecueSauceWisdom &&
            diagnosis == other.diagnosis &&
            diamondDogsAdvice == other.diamondDogsAdvice &&
            potentialOutcome == other.potentialOutcome &&
            stepsToResolution == other.stepsToResolution &&
            tedApproach == other.tedApproach &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            barbecueSauceWisdom,
            diagnosis,
            diamondDogsAdvice,
            potentialOutcome,
            stepsToResolution,
            tedApproach,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConflictResolveResponse{barbecueSauceWisdom=$barbecueSauceWisdom, diagnosis=$diagnosis, diamondDogsAdvice=$diamondDogsAdvice, potentialOutcome=$potentialOutcome, stepsToResolution=$stepsToResolution, tedApproach=$tedApproach, additionalProperties=$additionalProperties}"
}
