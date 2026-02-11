// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.quotes

import com.believe.api.core.Enum
import com.believe.api.core.JsonField
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Themes that quotes can be categorized under. */
class QuoteTheme @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val BELIEF = of("belief")

        @JvmField val TEAMWORK = of("teamwork")

        @JvmField val CURIOSITY = of("curiosity")

        @JvmField val KINDNESS = of("kindness")

        @JvmField val RESILIENCE = of("resilience")

        @JvmField val VULNERABILITY = of("vulnerability")

        @JvmField val GROWTH = of("growth")

        @JvmField val HUMOR = of("humor")

        @JvmField val WISDOM = of("wisdom")

        @JvmField val LEADERSHIP = of("leadership")

        @JvmField val LOVE = of("love")

        @JvmField val FORGIVENESS = of("forgiveness")

        @JvmField val PHILOSOPHY = of("philosophy")

        @JvmField val ROMANCE = of("romance")

        @JvmField val CULTURAL_PRIDE = of("cultural-pride")

        @JvmField val CULTURAL_DIFFERENCES = of("cultural-differences")

        @JvmField val ANTAGONISM = of("antagonism")

        @JvmField val CELEBRATION = of("celebration")

        @JvmField val IDENTITY = of("identity")

        @JvmField val ISOLATION = of("isolation")

        @JvmField val POWER = of("power")

        @JvmField val SACRIFICE = of("sacrifice")

        @JvmField val STANDARDS = of("standards")

        @JvmField val CONFIDENCE = of("confidence")

        @JvmField val CONFLICT = of("conflict")

        @JvmField val HONESTY = of("honesty")

        @JvmField val INTEGRITY = of("integrity")

        @JvmStatic fun of(value: String) = QuoteTheme(JsonField.of(value))
    }

    /** An enum containing [QuoteTheme]'s known values. */
    enum class Known {
        BELIEF,
        TEAMWORK,
        CURIOSITY,
        KINDNESS,
        RESILIENCE,
        VULNERABILITY,
        GROWTH,
        HUMOR,
        WISDOM,
        LEADERSHIP,
        LOVE,
        FORGIVENESS,
        PHILOSOPHY,
        ROMANCE,
        CULTURAL_PRIDE,
        CULTURAL_DIFFERENCES,
        ANTAGONISM,
        CELEBRATION,
        IDENTITY,
        ISOLATION,
        POWER,
        SACRIFICE,
        STANDARDS,
        CONFIDENCE,
        CONFLICT,
        HONESTY,
        INTEGRITY,
    }

    /**
     * An enum containing [QuoteTheme]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [QuoteTheme] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        BELIEF,
        TEAMWORK,
        CURIOSITY,
        KINDNESS,
        RESILIENCE,
        VULNERABILITY,
        GROWTH,
        HUMOR,
        WISDOM,
        LEADERSHIP,
        LOVE,
        FORGIVENESS,
        PHILOSOPHY,
        ROMANCE,
        CULTURAL_PRIDE,
        CULTURAL_DIFFERENCES,
        ANTAGONISM,
        CELEBRATION,
        IDENTITY,
        ISOLATION,
        POWER,
        SACRIFICE,
        STANDARDS,
        CONFIDENCE,
        CONFLICT,
        HONESTY,
        INTEGRITY,
        /** An enum member indicating that [QuoteTheme] was instantiated with an unknown value. */
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
            BELIEF -> Value.BELIEF
            TEAMWORK -> Value.TEAMWORK
            CURIOSITY -> Value.CURIOSITY
            KINDNESS -> Value.KINDNESS
            RESILIENCE -> Value.RESILIENCE
            VULNERABILITY -> Value.VULNERABILITY
            GROWTH -> Value.GROWTH
            HUMOR -> Value.HUMOR
            WISDOM -> Value.WISDOM
            LEADERSHIP -> Value.LEADERSHIP
            LOVE -> Value.LOVE
            FORGIVENESS -> Value.FORGIVENESS
            PHILOSOPHY -> Value.PHILOSOPHY
            ROMANCE -> Value.ROMANCE
            CULTURAL_PRIDE -> Value.CULTURAL_PRIDE
            CULTURAL_DIFFERENCES -> Value.CULTURAL_DIFFERENCES
            ANTAGONISM -> Value.ANTAGONISM
            CELEBRATION -> Value.CELEBRATION
            IDENTITY -> Value.IDENTITY
            ISOLATION -> Value.ISOLATION
            POWER -> Value.POWER
            SACRIFICE -> Value.SACRIFICE
            STANDARDS -> Value.STANDARDS
            CONFIDENCE -> Value.CONFIDENCE
            CONFLICT -> Value.CONFLICT
            HONESTY -> Value.HONESTY
            INTEGRITY -> Value.INTEGRITY
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
            BELIEF -> Known.BELIEF
            TEAMWORK -> Known.TEAMWORK
            CURIOSITY -> Known.CURIOSITY
            KINDNESS -> Known.KINDNESS
            RESILIENCE -> Known.RESILIENCE
            VULNERABILITY -> Known.VULNERABILITY
            GROWTH -> Known.GROWTH
            HUMOR -> Known.HUMOR
            WISDOM -> Known.WISDOM
            LEADERSHIP -> Known.LEADERSHIP
            LOVE -> Known.LOVE
            FORGIVENESS -> Known.FORGIVENESS
            PHILOSOPHY -> Known.PHILOSOPHY
            ROMANCE -> Known.ROMANCE
            CULTURAL_PRIDE -> Known.CULTURAL_PRIDE
            CULTURAL_DIFFERENCES -> Known.CULTURAL_DIFFERENCES
            ANTAGONISM -> Known.ANTAGONISM
            CELEBRATION -> Known.CELEBRATION
            IDENTITY -> Known.IDENTITY
            ISOLATION -> Known.ISOLATION
            POWER -> Known.POWER
            SACRIFICE -> Known.SACRIFICE
            STANDARDS -> Known.STANDARDS
            CONFIDENCE -> Known.CONFIDENCE
            CONFLICT -> Known.CONFLICT
            HONESTY -> Known.HONESTY
            INTEGRITY -> Known.INTEGRITY
            else -> throw BelieveInvalidDataException("Unknown QuoteTheme: $value")
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

    fun validate(): QuoteTheme = apply {
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

        return other is QuoteTheme && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
