// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

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

/** Core values that define a team's culture. */
class TeamValues
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val primaryValue: JsonField<String>,
    private val secondaryValues: JsonField<List<String>>,
    private val teamMotto: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("primary_value")
        @ExcludeMissing
        primaryValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secondary_values")
        @ExcludeMissing
        secondaryValues: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("team_motto") @ExcludeMissing teamMotto: JsonField<String> = JsonMissing.of(),
    ) : this(primaryValue, secondaryValues, teamMotto, mutableMapOf())

    /**
     * The team's primary guiding value
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun primaryValue(): String = primaryValue.getRequired("primary_value")

    /**
     * Supporting values
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secondaryValues(): List<String> = secondaryValues.getRequired("secondary_values")

    /**
     * Team's motivational motto
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun teamMotto(): String = teamMotto.getRequired("team_motto")

    /**
     * Returns the raw JSON value of [primaryValue].
     *
     * Unlike [primaryValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_value")
    @ExcludeMissing
    fun _primaryValue(): JsonField<String> = primaryValue

    /**
     * Returns the raw JSON value of [secondaryValues].
     *
     * Unlike [secondaryValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secondary_values")
    @ExcludeMissing
    fun _secondaryValues(): JsonField<List<String>> = secondaryValues

    /**
     * Returns the raw JSON value of [teamMotto].
     *
     * Unlike [teamMotto], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("team_motto") @ExcludeMissing fun _teamMotto(): JsonField<String> = teamMotto

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
         * Returns a mutable builder for constructing an instance of [TeamValues].
         *
         * The following fields are required:
         * ```java
         * .primaryValue()
         * .secondaryValues()
         * .teamMotto()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TeamValues]. */
    class Builder internal constructor() {

        private var primaryValue: JsonField<String>? = null
        private var secondaryValues: JsonField<MutableList<String>>? = null
        private var teamMotto: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(teamValues: TeamValues) = apply {
            primaryValue = teamValues.primaryValue
            secondaryValues = teamValues.secondaryValues.map { it.toMutableList() }
            teamMotto = teamValues.teamMotto
            additionalProperties = teamValues.additionalProperties.toMutableMap()
        }

        /** The team's primary guiding value */
        fun primaryValue(primaryValue: String) = primaryValue(JsonField.of(primaryValue))

        /**
         * Sets [Builder.primaryValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryValue(primaryValue: JsonField<String>) = apply {
            this.primaryValue = primaryValue
        }

        /** Supporting values */
        fun secondaryValues(secondaryValues: List<String>) =
            secondaryValues(JsonField.of(secondaryValues))

        /**
         * Sets [Builder.secondaryValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryValues] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryValues(secondaryValues: JsonField<List<String>>) = apply {
            this.secondaryValues = secondaryValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [secondaryValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecondaryValue(secondaryValue: String) = apply {
            secondaryValues =
                (secondaryValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("secondaryValues", it).add(secondaryValue)
                }
        }

        /** Team's motivational motto */
        fun teamMotto(teamMotto: String) = teamMotto(JsonField.of(teamMotto))

        /**
         * Sets [Builder.teamMotto] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamMotto] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun teamMotto(teamMotto: JsonField<String>) = apply { this.teamMotto = teamMotto }

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
         * Returns an immutable instance of [TeamValues].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .primaryValue()
         * .secondaryValues()
         * .teamMotto()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TeamValues =
            TeamValues(
                checkRequired("primaryValue", primaryValue),
                checkRequired("secondaryValues", secondaryValues).map { it.toImmutable() },
                checkRequired("teamMotto", teamMotto),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TeamValues = apply {
        if (validated) {
            return@apply
        }

        primaryValue()
        secondaryValues()
        teamMotto()
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
        (if (primaryValue.asKnown().isPresent) 1 else 0) +
            (secondaryValues.asKnown().getOrNull()?.size ?: 0) +
            (if (teamMotto.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamValues &&
            primaryValue == other.primaryValue &&
            secondaryValues == other.secondaryValues &&
            teamMotto == other.teamMotto &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(primaryValue, secondaryValues, teamMotto, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TeamValues{primaryValue=$primaryValue, secondaryValues=$secondaryValues, teamMotto=$teamMotto, additionalProperties=$additionalProperties}"
}
