// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.Enum
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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Full coach model with ID. */
class Coach
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val characterId: JsonField<String>,
    private val specialty: JsonField<CoachSpecialty>,
    private val teamId: JsonField<String>,
    private val yearsWithTeam: JsonField<Long>,
    private val certifications: JsonField<List<String>>,
    private val memberType: JsonField<MemberType>,
    private val winRate: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("character_id")
        @ExcludeMissing
        characterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("specialty")
        @ExcludeMissing
        specialty: JsonField<CoachSpecialty> = JsonMissing.of(),
        @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("years_with_team")
        @ExcludeMissing
        yearsWithTeam: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("certifications")
        @ExcludeMissing
        certifications: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("member_type")
        @ExcludeMissing
        memberType: JsonField<MemberType> = JsonMissing.of(),
        @JsonProperty("win_rate") @ExcludeMissing winRate: JsonField<Double> = JsonMissing.of(),
    ) : this(
        id,
        characterId,
        specialty,
        teamId,
        yearsWithTeam,
        certifications,
        memberType,
        winRate,
        mutableMapOf(),
    )

    /**
     * Unique identifier for this team membership
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * ID of the character (references /characters/{id})
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun characterId(): String = characterId.getRequired("character_id")

    /**
     * Coaching specialty/role
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun specialty(): CoachSpecialty = specialty.getRequired("specialty")

    /**
     * ID of the team they belong to
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun teamId(): String = teamId.getRequired("team_id")

    /**
     * Number of years with the current team
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun yearsWithTeam(): Long = yearsWithTeam.getRequired("years_with_team")

    /**
     * Coaching certifications and licenses
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun certifications(): Optional<List<String>> = certifications.getOptional("certifications")

    /**
     * Discriminator field indicating this is a coach
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memberType(): Optional<MemberType> = memberType.getOptional("member_type")

    /**
     * Career win rate (0.0 to 1.0)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun winRate(): Optional<Double> = winRate.getOptional("win_rate")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [characterId].
     *
     * Unlike [characterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("character_id")
    @ExcludeMissing
    fun _characterId(): JsonField<String> = characterId

    /**
     * Returns the raw JSON value of [specialty].
     *
     * Unlike [specialty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("specialty")
    @ExcludeMissing
    fun _specialty(): JsonField<CoachSpecialty> = specialty

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

    /**
     * Returns the raw JSON value of [yearsWithTeam].
     *
     * Unlike [yearsWithTeam], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("years_with_team")
    @ExcludeMissing
    fun _yearsWithTeam(): JsonField<Long> = yearsWithTeam

    /**
     * Returns the raw JSON value of [certifications].
     *
     * Unlike [certifications], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("certifications")
    @ExcludeMissing
    fun _certifications(): JsonField<List<String>> = certifications

    /**
     * Returns the raw JSON value of [memberType].
     *
     * Unlike [memberType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("member_type")
    @ExcludeMissing
    fun _memberType(): JsonField<MemberType> = memberType

    /**
     * Returns the raw JSON value of [winRate].
     *
     * Unlike [winRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("win_rate") @ExcludeMissing fun _winRate(): JsonField<Double> = winRate

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
         * Returns a mutable builder for constructing an instance of [Coach].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .characterId()
         * .specialty()
         * .teamId()
         * .yearsWithTeam()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Coach]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var characterId: JsonField<String>? = null
        private var specialty: JsonField<CoachSpecialty>? = null
        private var teamId: JsonField<String>? = null
        private var yearsWithTeam: JsonField<Long>? = null
        private var certifications: JsonField<MutableList<String>>? = null
        private var memberType: JsonField<MemberType> = JsonMissing.of()
        private var winRate: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(coach: Coach) = apply {
            id = coach.id
            characterId = coach.characterId
            specialty = coach.specialty
            teamId = coach.teamId
            yearsWithTeam = coach.yearsWithTeam
            certifications = coach.certifications.map { it.toMutableList() }
            memberType = coach.memberType
            winRate = coach.winRate
            additionalProperties = coach.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this team membership */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ID of the character (references /characters/{id}) */
        fun characterId(characterId: String) = characterId(JsonField.of(characterId))

        /**
         * Sets [Builder.characterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.characterId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun characterId(characterId: JsonField<String>) = apply { this.characterId = characterId }

        /** Coaching specialty/role */
        fun specialty(specialty: CoachSpecialty) = specialty(JsonField.of(specialty))

        /**
         * Sets [Builder.specialty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specialty] with a well-typed [CoachSpecialty] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun specialty(specialty: JsonField<CoachSpecialty>) = apply { this.specialty = specialty }

        /** ID of the team they belong to */
        fun teamId(teamId: String) = teamId(JsonField.of(teamId))

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

        /** Number of years with the current team */
        fun yearsWithTeam(yearsWithTeam: Long) = yearsWithTeam(JsonField.of(yearsWithTeam))

        /**
         * Sets [Builder.yearsWithTeam] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yearsWithTeam] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun yearsWithTeam(yearsWithTeam: JsonField<Long>) = apply {
            this.yearsWithTeam = yearsWithTeam
        }

        /** Coaching certifications and licenses */
        fun certifications(certifications: List<String>) =
            certifications(JsonField.of(certifications))

        /**
         * Sets [Builder.certifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.certifications] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun certifications(certifications: JsonField<List<String>>) = apply {
            this.certifications = certifications.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [certifications].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCertification(certification: String) = apply {
            certifications =
                (certifications ?: JsonField.of(mutableListOf())).also {
                    checkKnown("certifications", it).add(certification)
                }
        }

        /** Discriminator field indicating this is a coach */
        fun memberType(memberType: MemberType) = memberType(JsonField.of(memberType))

        /**
         * Sets [Builder.memberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memberType] with a well-typed [MemberType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun memberType(memberType: JsonField<MemberType>) = apply { this.memberType = memberType }

        /** Career win rate (0.0 to 1.0) */
        fun winRate(winRate: Double?) = winRate(JsonField.ofNullable(winRate))

        /**
         * Alias for [Builder.winRate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun winRate(winRate: Double) = winRate(winRate as Double?)

        /** Alias for calling [Builder.winRate] with `winRate.orElse(null)`. */
        fun winRate(winRate: Optional<Double>) = winRate(winRate.getOrNull())

        /**
         * Sets [Builder.winRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.winRate] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun winRate(winRate: JsonField<Double>) = apply { this.winRate = winRate }

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
         * Returns an immutable instance of [Coach].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .characterId()
         * .specialty()
         * .teamId()
         * .yearsWithTeam()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Coach =
            Coach(
                checkRequired("id", id),
                checkRequired("characterId", characterId),
                checkRequired("specialty", specialty),
                checkRequired("teamId", teamId),
                checkRequired("yearsWithTeam", yearsWithTeam),
                (certifications ?: JsonMissing.of()).map { it.toImmutable() },
                memberType,
                winRate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Coach = apply {
        if (validated) {
            return@apply
        }

        id()
        characterId()
        specialty().validate()
        teamId()
        yearsWithTeam()
        certifications()
        memberType().ifPresent { it.validate() }
        winRate()
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
            (if (characterId.asKnown().isPresent) 1 else 0) +
            (specialty.asKnown().getOrNull()?.validity() ?: 0) +
            (if (teamId.asKnown().isPresent) 1 else 0) +
            (if (yearsWithTeam.asKnown().isPresent) 1 else 0) +
            (certifications.asKnown().getOrNull()?.size ?: 0) +
            (memberType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (winRate.asKnown().isPresent) 1 else 0)

    /** Discriminator field indicating this is a coach */
    class MemberType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val COACH = of("coach")

            @JvmStatic fun of(value: String) = MemberType(JsonField.of(value))
        }

        /** An enum containing [MemberType]'s known values. */
        enum class Known {
            COACH
        }

        /**
         * An enum containing [MemberType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MemberType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COACH,
            /**
             * An enum member indicating that [MemberType] was instantiated with an unknown value.
             */
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
                COACH -> Value.COACH
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
                COACH -> Known.COACH
                else -> throw BelieveInvalidDataException("Unknown MemberType: $value")
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

        fun validate(): MemberType = apply {
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

            return other is MemberType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Coach &&
            id == other.id &&
            characterId == other.characterId &&
            specialty == other.specialty &&
            teamId == other.teamId &&
            yearsWithTeam == other.yearsWithTeam &&
            certifications == other.certifications &&
            memberType == other.memberType &&
            winRate == other.winRate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            characterId,
            specialty,
            teamId,
            yearsWithTeam,
            certifications,
            memberType,
            winRate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Coach{id=$id, characterId=$characterId, specialty=$specialty, teamId=$teamId, yearsWithTeam=$yearsWithTeam, certifications=$certifications, memberType=$memberType, winRate=$winRate, additionalProperties=$additionalProperties}"
}
