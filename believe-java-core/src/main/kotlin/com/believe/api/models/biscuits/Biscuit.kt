// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.biscuits

import com.believe.api.core.Enum
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
import kotlin.jvm.optionals.getOrNull

/** A biscuit from Ted. */
class Biscuit
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val message: JsonField<String>,
    private val pairsWellWith: JsonField<String>,
    private val tedNote: JsonField<String>,
    private val type: JsonField<Type>,
    private val warmthLevel: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pairs_well_with")
        @ExcludeMissing
        pairsWellWith: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ted_note") @ExcludeMissing tedNote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("warmth_level")
        @ExcludeMissing
        warmthLevel: JsonField<Long> = JsonMissing.of(),
    ) : this(id, message, pairsWellWith, tedNote, type, warmthLevel, mutableMapOf())

    /**
     * Biscuit identifier
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Message that comes with the biscuit
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * What this biscuit pairs well with
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pairsWellWith(): String = pairsWellWith.getRequired("pairs_well_with")

    /**
     * A handwritten note from Ted
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tedNote(): String = tedNote.getRequired("ted_note")

    /**
     * Type of biscuit
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * How warm and fresh (1-10)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun warmthLevel(): Long = warmthLevel.getRequired("warmth_level")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [pairsWellWith].
     *
     * Unlike [pairsWellWith], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pairs_well_with")
    @ExcludeMissing
    fun _pairsWellWith(): JsonField<String> = pairsWellWith

    /**
     * Returns the raw JSON value of [tedNote].
     *
     * Unlike [tedNote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ted_note") @ExcludeMissing fun _tedNote(): JsonField<String> = tedNote

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [warmthLevel].
     *
     * Unlike [warmthLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("warmth_level") @ExcludeMissing fun _warmthLevel(): JsonField<Long> = warmthLevel

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
         * Returns a mutable builder for constructing an instance of [Biscuit].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .message()
         * .pairsWellWith()
         * .tedNote()
         * .type()
         * .warmthLevel()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Biscuit]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var message: JsonField<String>? = null
        private var pairsWellWith: JsonField<String>? = null
        private var tedNote: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var warmthLevel: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(biscuit: Biscuit) = apply {
            id = biscuit.id
            message = biscuit.message
            pairsWellWith = biscuit.pairsWellWith
            tedNote = biscuit.tedNote
            type = biscuit.type
            warmthLevel = biscuit.warmthLevel
            additionalProperties = biscuit.additionalProperties.toMutableMap()
        }

        /** Biscuit identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Message that comes with the biscuit */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** What this biscuit pairs well with */
        fun pairsWellWith(pairsWellWith: String) = pairsWellWith(JsonField.of(pairsWellWith))

        /**
         * Sets [Builder.pairsWellWith] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pairsWellWith] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pairsWellWith(pairsWellWith: JsonField<String>) = apply {
            this.pairsWellWith = pairsWellWith
        }

        /** A handwritten note from Ted */
        fun tedNote(tedNote: String) = tedNote(JsonField.of(tedNote))

        /**
         * Sets [Builder.tedNote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tedNote] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tedNote(tedNote: JsonField<String>) = apply { this.tedNote = tedNote }

        /** Type of biscuit */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** How warm and fresh (1-10) */
        fun warmthLevel(warmthLevel: Long) = warmthLevel(JsonField.of(warmthLevel))

        /**
         * Sets [Builder.warmthLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.warmthLevel] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun warmthLevel(warmthLevel: JsonField<Long>) = apply { this.warmthLevel = warmthLevel }

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
         * Returns an immutable instance of [Biscuit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .message()
         * .pairsWellWith()
         * .tedNote()
         * .type()
         * .warmthLevel()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Biscuit =
            Biscuit(
                checkRequired("id", id),
                checkRequired("message", message),
                checkRequired("pairsWellWith", pairsWellWith),
                checkRequired("tedNote", tedNote),
                checkRequired("type", type),
                checkRequired("warmthLevel", warmthLevel),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Biscuit = apply {
        if (validated) {
            return@apply
        }

        id()
        message()
        pairsWellWith()
        tedNote()
        type().validate()
        warmthLevel()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (pairsWellWith.asKnown().isPresent) 1 else 0) +
            (if (tedNote.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (warmthLevel.asKnown().isPresent) 1 else 0)

    /** Type of biscuit */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CLASSIC = of("classic")

            @JvmField val SHORTBREAD = of("shortbread")

            @JvmField val CHOCOLATE_CHIP = of("chocolate_chip")

            @JvmField val OATMEAL_RAISIN = of("oatmeal_raisin")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CLASSIC,
            SHORTBREAD,
            CHOCOLATE_CHIP,
            OATMEAL_RAISIN,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CLASSIC,
            SHORTBREAD,
            CHOCOLATE_CHIP,
            OATMEAL_RAISIN,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CLASSIC -> Value.CLASSIC
                SHORTBREAD -> Value.SHORTBREAD
                CHOCOLATE_CHIP -> Value.CHOCOLATE_CHIP
                OATMEAL_RAISIN -> Value.OATMEAL_RAISIN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BelieveInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CLASSIC -> Known.CLASSIC
                SHORTBREAD -> Known.SHORTBREAD
                CHOCOLATE_CHIP -> Known.CHOCOLATE_CHIP
                OATMEAL_RAISIN -> Known.OATMEAL_RAISIN
                else -> throw BelieveInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BelieveInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { BelieveInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Biscuit &&
            id == other.id &&
            message == other.message &&
            pairsWellWith == other.pairsWellWith &&
            tedNote == other.tedNote &&
            type == other.type &&
            warmthLevel == other.warmthLevel &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, message, pairsWellWith, tedNote, type, warmthLevel, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Biscuit{id=$id, message=$message, pairsWellWith=$pairsWellWith, tedNote=$tedNote, type=$type, warmthLevel=$warmthLevel, additionalProperties=$additionalProperties}"
}
