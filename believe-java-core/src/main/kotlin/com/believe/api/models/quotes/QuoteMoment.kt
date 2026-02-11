// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import com.believe.api.core.Enum
import com.believe.api.core.JsonField
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Types of moments when quotes occur. */
class QuoteMoment @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val HALFTIME_SPEECH = of("halftime_speech")

        @JvmField val PRESS_CONFERENCE = of("press_conference")

        @JvmField val LOCKER_ROOM = of("locker_room")

        @JvmField val TRAINING = of("training")

        @JvmField val BISCUITS_WITH_BOSS = of("biscuits_with_boss")

        @JvmField val PUB = of("pub")

        @JvmField val ONE_ON_ONE = of("one_on_one")

        @JvmField val CELEBRATION = of("celebration")

        @JvmField val CRISIS = of("crisis")

        @JvmField val CASUAL = of("casual")

        @JvmField val CONFRONTATION = of("confrontation")

        @JvmStatic fun of(value: String) = QuoteMoment(JsonField.of(value))
    }

    /** An enum containing [QuoteMoment]'s known values. */
    enum class Known {
        HALFTIME_SPEECH,
        PRESS_CONFERENCE,
        LOCKER_ROOM,
        TRAINING,
        BISCUITS_WITH_BOSS,
        PUB,
        ONE_ON_ONE,
        CELEBRATION,
        CRISIS,
        CASUAL,
        CONFRONTATION,
    }

    /**
     * An enum containing [QuoteMoment]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [QuoteMoment] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        HALFTIME_SPEECH,
        PRESS_CONFERENCE,
        LOCKER_ROOM,
        TRAINING,
        BISCUITS_WITH_BOSS,
        PUB,
        ONE_ON_ONE,
        CELEBRATION,
        CRISIS,
        CASUAL,
        CONFRONTATION,
        /** An enum member indicating that [QuoteMoment] was instantiated with an unknown value. */
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
            HALFTIME_SPEECH -> Value.HALFTIME_SPEECH
            PRESS_CONFERENCE -> Value.PRESS_CONFERENCE
            LOCKER_ROOM -> Value.LOCKER_ROOM
            TRAINING -> Value.TRAINING
            BISCUITS_WITH_BOSS -> Value.BISCUITS_WITH_BOSS
            PUB -> Value.PUB
            ONE_ON_ONE -> Value.ONE_ON_ONE
            CELEBRATION -> Value.CELEBRATION
            CRISIS -> Value.CRISIS
            CASUAL -> Value.CASUAL
            CONFRONTATION -> Value.CONFRONTATION
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
            HALFTIME_SPEECH -> Known.HALFTIME_SPEECH
            PRESS_CONFERENCE -> Known.PRESS_CONFERENCE
            LOCKER_ROOM -> Known.LOCKER_ROOM
            TRAINING -> Known.TRAINING
            BISCUITS_WITH_BOSS -> Known.BISCUITS_WITH_BOSS
            PUB -> Known.PUB
            ONE_ON_ONE -> Known.ONE_ON_ONE
            CELEBRATION -> Known.CELEBRATION
            CRISIS -> Known.CRISIS
            CASUAL -> Known.CASUAL
            CONFRONTATION -> Known.CONFRONTATION
            else -> throw BelieveInvalidDataException("Unknown QuoteMoment: $value")
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

    fun validate(): QuoteMoment = apply {
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

        return other is QuoteMoment && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
