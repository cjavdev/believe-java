// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import com.believe.api.core.Enum
import com.believe.api.core.JsonField
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Football leagues. */
class League @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val PREMIER_LEAGUE = of("Premier League")

        @JvmField val CHAMPIONSHIP = of("Championship")

        @JvmField val LEAGUE_ONE = of("League One")

        @JvmField val LEAGUE_TWO = of("League Two")

        @JvmField val LA_LIGA = of("La Liga")

        @JvmField val SERIE_A = of("Serie A")

        @JvmField val BUNDESLIGA = of("Bundesliga")

        @JvmField val LIGUE_1 = of("Ligue 1")

        @JvmStatic fun of(value: String) = League(JsonField.of(value))
    }

    /** An enum containing [League]'s known values. */
    enum class Known {
        PREMIER_LEAGUE,
        CHAMPIONSHIP,
        LEAGUE_ONE,
        LEAGUE_TWO,
        LA_LIGA,
        SERIE_A,
        BUNDESLIGA,
        LIGUE_1,
    }

    /**
     * An enum containing [League]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [League] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PREMIER_LEAGUE,
        CHAMPIONSHIP,
        LEAGUE_ONE,
        LEAGUE_TWO,
        LA_LIGA,
        SERIE_A,
        BUNDESLIGA,
        LIGUE_1,
        /** An enum member indicating that [League] was instantiated with an unknown value. */
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
            PREMIER_LEAGUE -> Value.PREMIER_LEAGUE
            CHAMPIONSHIP -> Value.CHAMPIONSHIP
            LEAGUE_ONE -> Value.LEAGUE_ONE
            LEAGUE_TWO -> Value.LEAGUE_TWO
            LA_LIGA -> Value.LA_LIGA
            SERIE_A -> Value.SERIE_A
            BUNDESLIGA -> Value.BUNDESLIGA
            LIGUE_1 -> Value.LIGUE_1
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
            PREMIER_LEAGUE -> Known.PREMIER_LEAGUE
            CHAMPIONSHIP -> Known.CHAMPIONSHIP
            LEAGUE_ONE -> Known.LEAGUE_ONE
            LEAGUE_TWO -> Known.LEAGUE_TWO
            LA_LIGA -> Known.LA_LIGA
            SERIE_A -> Known.SERIE_A
            BUNDESLIGA -> Known.BUNDESLIGA
            LIGUE_1 -> Known.LIGUE_1
            else -> throw BelieveInvalidDataException("Unknown League: $value")
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

    fun validate(): League = apply {
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

        return other is League && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
