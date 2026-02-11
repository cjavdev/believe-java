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

/** Full medical staff model with ID. */
class MedicalStaff
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val characterId: JsonField<String>,
    private val specialty: JsonField<MedicalSpecialty>,
    private val teamId: JsonField<String>,
    private val yearsWithTeam: JsonField<Long>,
    private val licenseNumber: JsonField<String>,
    private val memberType: JsonField<MemberType>,
    private val qualifications: JsonField<List<String>>,
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
        specialty: JsonField<MedicalSpecialty> = JsonMissing.of(),
        @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("years_with_team")
        @ExcludeMissing
        yearsWithTeam: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("license_number")
        @ExcludeMissing
        licenseNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("member_type")
        @ExcludeMissing
        memberType: JsonField<MemberType> = JsonMissing.of(),
        @JsonProperty("qualifications")
        @ExcludeMissing
        qualifications: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        characterId,
        specialty,
        teamId,
        yearsWithTeam,
        licenseNumber,
        memberType,
        qualifications,
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
     * Medical specialty
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun specialty(): MedicalSpecialty = specialty.getRequired("specialty")

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
     * Professional license number
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun licenseNumber(): Optional<String> = licenseNumber.getOptional("license_number")

    /**
     * Discriminator field indicating this is medical staff
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memberType(): Optional<MemberType> = memberType.getOptional("member_type")

    /**
     * Medical qualifications and degrees
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun qualifications(): Optional<List<String>> = qualifications.getOptional("qualifications")

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
    fun _specialty(): JsonField<MedicalSpecialty> = specialty

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
     * Returns the raw JSON value of [licenseNumber].
     *
     * Unlike [licenseNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("license_number")
    @ExcludeMissing
    fun _licenseNumber(): JsonField<String> = licenseNumber

    /**
     * Returns the raw JSON value of [memberType].
     *
     * Unlike [memberType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("member_type")
    @ExcludeMissing
    fun _memberType(): JsonField<MemberType> = memberType

    /**
     * Returns the raw JSON value of [qualifications].
     *
     * Unlike [qualifications], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qualifications")
    @ExcludeMissing
    fun _qualifications(): JsonField<List<String>> = qualifications

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
         * Returns a mutable builder for constructing an instance of [MedicalStaff].
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

    /** A builder for [MedicalStaff]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var characterId: JsonField<String>? = null
        private var specialty: JsonField<MedicalSpecialty>? = null
        private var teamId: JsonField<String>? = null
        private var yearsWithTeam: JsonField<Long>? = null
        private var licenseNumber: JsonField<String> = JsonMissing.of()
        private var memberType: JsonField<MemberType> = JsonMissing.of()
        private var qualifications: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(medicalStaff: MedicalStaff) = apply {
            id = medicalStaff.id
            characterId = medicalStaff.characterId
            specialty = medicalStaff.specialty
            teamId = medicalStaff.teamId
            yearsWithTeam = medicalStaff.yearsWithTeam
            licenseNumber = medicalStaff.licenseNumber
            memberType = medicalStaff.memberType
            qualifications = medicalStaff.qualifications.map { it.toMutableList() }
            additionalProperties = medicalStaff.additionalProperties.toMutableMap()
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

        /** Medical specialty */
        fun specialty(specialty: MedicalSpecialty) = specialty(JsonField.of(specialty))

        /**
         * Sets [Builder.specialty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specialty] with a well-typed [MedicalSpecialty] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun specialty(specialty: JsonField<MedicalSpecialty>) = apply { this.specialty = specialty }

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

        /** Professional license number */
        fun licenseNumber(licenseNumber: String?) =
            licenseNumber(JsonField.ofNullable(licenseNumber))

        /** Alias for calling [Builder.licenseNumber] with `licenseNumber.orElse(null)`. */
        fun licenseNumber(licenseNumber: Optional<String>) =
            licenseNumber(licenseNumber.getOrNull())

        /**
         * Sets [Builder.licenseNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun licenseNumber(licenseNumber: JsonField<String>) = apply {
            this.licenseNumber = licenseNumber
        }

        /** Discriminator field indicating this is medical staff */
        fun memberType(memberType: MemberType) = memberType(JsonField.of(memberType))

        /**
         * Sets [Builder.memberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memberType] with a well-typed [MemberType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun memberType(memberType: JsonField<MemberType>) = apply { this.memberType = memberType }

        /** Medical qualifications and degrees */
        fun qualifications(qualifications: List<String>) =
            qualifications(JsonField.of(qualifications))

        /**
         * Sets [Builder.qualifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qualifications] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun qualifications(qualifications: JsonField<List<String>>) = apply {
            this.qualifications = qualifications.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [qualifications].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addQualification(qualification: String) = apply {
            qualifications =
                (qualifications ?: JsonField.of(mutableListOf())).also {
                    checkKnown("qualifications", it).add(qualification)
                }
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
         * Returns an immutable instance of [MedicalStaff].
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
        fun build(): MedicalStaff =
            MedicalStaff(
                checkRequired("id", id),
                checkRequired("characterId", characterId),
                checkRequired("specialty", specialty),
                checkRequired("teamId", teamId),
                checkRequired("yearsWithTeam", yearsWithTeam),
                licenseNumber,
                memberType,
                (qualifications ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MedicalStaff = apply {
        if (validated) {
            return@apply
        }

        id()
        characterId()
        specialty().validate()
        teamId()
        yearsWithTeam()
        licenseNumber()
        memberType().ifPresent { it.validate() }
        qualifications()
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
            (if (licenseNumber.asKnown().isPresent) 1 else 0) +
            (memberType.asKnown().getOrNull()?.validity() ?: 0) +
            (qualifications.asKnown().getOrNull()?.size ?: 0)

    /** Discriminator field indicating this is medical staff */
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

            @JvmField val MEDICAL_STAFF = of("medical_staff")

            @JvmStatic fun of(value: String) = MemberType(JsonField.of(value))
        }

        /** An enum containing [MemberType]'s known values. */
        enum class Known {
            MEDICAL_STAFF
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
            MEDICAL_STAFF,
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
                MEDICAL_STAFF -> Value.MEDICAL_STAFF
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
                MEDICAL_STAFF -> Known.MEDICAL_STAFF
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

        return other is MedicalStaff &&
            id == other.id &&
            characterId == other.characterId &&
            specialty == other.specialty &&
            teamId == other.teamId &&
            yearsWithTeam == other.yearsWithTeam &&
            licenseNumber == other.licenseNumber &&
            memberType == other.memberType &&
            qualifications == other.qualifications &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            characterId,
            specialty,
            teamId,
            yearsWithTeam,
            licenseNumber,
            memberType,
            qualifications,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MedicalStaff{id=$id, characterId=$characterId, specialty=$specialty, teamId=$teamId, yearsWithTeam=$yearsWithTeam, licenseNumber=$licenseNumber, memberType=$memberType, qualifications=$qualifications, additionalProperties=$additionalProperties}"
}
