// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.characters

import com.believe.api.core.Enum
import com.believe.api.core.JsonField
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Roles characters can have. */
class CharacterRole @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val COACH = of("coach")

        @JvmField val PLAYER = of("player")

        @JvmField val OWNER = of("owner")

        @JvmField val MANAGER = of("manager")

        @JvmField val STAFF = of("staff")

        @JvmField val JOURNALIST = of("journalist")

        @JvmField val FAMILY = of("family")

        @JvmField val FRIEND = of("friend")

        @JvmField val FAN = of("fan")

        @JvmField val OTHER = of("other")

        @JvmStatic fun of(value: String) = CharacterRole(JsonField.of(value))
    }

    /** An enum containing [CharacterRole]'s known values. */
    enum class Known {
        COACH,
        PLAYER,
        OWNER,
        MANAGER,
        STAFF,
        JOURNALIST,
        FAMILY,
        FRIEND,
        FAN,
        OTHER,
    }

    /**
     * An enum containing [CharacterRole]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [CharacterRole] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        COACH,
        PLAYER,
        OWNER,
        MANAGER,
        STAFF,
        JOURNALIST,
        FAMILY,
        FRIEND,
        FAN,
        OTHER,
        /**
         * An enum member indicating that [CharacterRole] was instantiated with an unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            COACH -> Value.COACH
            PLAYER -> Value.PLAYER
            OWNER -> Value.OWNER
            MANAGER -> Value.MANAGER
            STAFF -> Value.STAFF
            JOURNALIST -> Value.JOURNALIST
            FAMILY -> Value.FAMILY
            FRIEND -> Value.FRIEND
            FAN -> Value.FAN
            OTHER -> Value.OTHER
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws BelieveInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            COACH -> Known.COACH
            PLAYER -> Known.PLAYER
            OWNER -> Known.OWNER
            MANAGER -> Known.MANAGER
            STAFF -> Known.STAFF
            JOURNALIST -> Known.JOURNALIST
            FAMILY -> Known.FAMILY
            FRIEND -> Known.FRIEND
            FAN -> Known.FAN
            OTHER -> Known.OTHER
            else -> throw BelieveInvalidDataException("Unknown CharacterRole: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws BelieveInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { BelieveInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): CharacterRole = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CharacterRole && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
