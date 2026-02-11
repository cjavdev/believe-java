// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

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

/** A pivotal moment in a match. */
class TurningPoint
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val emotionalImpact: JsonField<String>,
    private val minute: JsonField<Long>,
    private val characterInvolved: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emotional_impact")
        @ExcludeMissing
        emotionalImpact: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minute") @ExcludeMissing minute: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("character_involved")
        @ExcludeMissing
        characterInvolved: JsonField<String> = JsonMissing.of(),
    ) : this(description, emotionalImpact, minute, characterInvolved, mutableMapOf())

    /**
     * What happened
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * How this affected the team emotionally
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emotionalImpact(): String = emotionalImpact.getRequired("emotional_impact")

    /**
     * Minute of the match
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minute(): Long = minute.getRequired("minute")

    /**
     * Character ID who was central to this moment
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun characterInvolved(): Optional<String> = characterInvolved.getOptional("character_involved")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [emotionalImpact].
     *
     * Unlike [emotionalImpact], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emotional_impact")
    @ExcludeMissing
    fun _emotionalImpact(): JsonField<String> = emotionalImpact

    /**
     * Returns the raw JSON value of [minute].
     *
     * Unlike [minute], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minute") @ExcludeMissing fun _minute(): JsonField<Long> = minute

    /**
     * Returns the raw JSON value of [characterInvolved].
     *
     * Unlike [characterInvolved], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("character_involved")
    @ExcludeMissing
    fun _characterInvolved(): JsonField<String> = characterInvolved

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
         * Returns a mutable builder for constructing an instance of [TurningPoint].
         *
         * The following fields are required:
         * ```java
         * .description()
         * .emotionalImpact()
         * .minute()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TurningPoint]. */
    class Builder internal constructor() {

        private var description: JsonField<String>? = null
        private var emotionalImpact: JsonField<String>? = null
        private var minute: JsonField<Long>? = null
        private var characterInvolved: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(turningPoint: TurningPoint) = apply {
            description = turningPoint.description
            emotionalImpact = turningPoint.emotionalImpact
            minute = turningPoint.minute
            characterInvolved = turningPoint.characterInvolved
            additionalProperties = turningPoint.additionalProperties.toMutableMap()
        }

        /** What happened */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** How this affected the team emotionally */
        fun emotionalImpact(emotionalImpact: String) =
            emotionalImpact(JsonField.of(emotionalImpact))

        /**
         * Sets [Builder.emotionalImpact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emotionalImpact] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emotionalImpact(emotionalImpact: JsonField<String>) = apply {
            this.emotionalImpact = emotionalImpact
        }

        /** Minute of the match */
        fun minute(minute: Long) = minute(JsonField.of(minute))

        /**
         * Sets [Builder.minute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minute] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minute(minute: JsonField<Long>) = apply { this.minute = minute }

        /** Character ID who was central to this moment */
        fun characterInvolved(characterInvolved: String?) =
            characterInvolved(JsonField.ofNullable(characterInvolved))

        /** Alias for calling [Builder.characterInvolved] with `characterInvolved.orElse(null)`. */
        fun characterInvolved(characterInvolved: Optional<String>) =
            characterInvolved(characterInvolved.getOrNull())

        /**
         * Sets [Builder.characterInvolved] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characterInvolved] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun characterInvolved(characterInvolved: JsonField<String>) = apply {
            this.characterInvolved = characterInvolved
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
         * Returns an immutable instance of [TurningPoint].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .description()
         * .emotionalImpact()
         * .minute()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TurningPoint =
            TurningPoint(
                checkRequired("description", description),
                checkRequired("emotionalImpact", emotionalImpact),
                checkRequired("minute", minute),
                characterInvolved,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TurningPoint = apply {
        if (validated) {
            return@apply
        }

        description()
        emotionalImpact()
        minute()
        characterInvolved()
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (if (emotionalImpact.asKnown().isPresent) 1 else 0) +
            (if (minute.asKnown().isPresent) 1 else 0) +
            (if (characterInvolved.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TurningPoint &&
            description == other.description &&
            emotionalImpact == other.emotionalImpact &&
            minute == other.minute &&
            characterInvolved == other.characterInvolved &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(description, emotionalImpact, minute, characterInvolved, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TurningPoint{description=$description, emotionalImpact=$emotionalImpact, minute=$minute, characterInvolved=$characterInvolved, additionalProperties=$additionalProperties}"
}
