// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Full player model with ID. */
class Player
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val characterId: JsonField<String>,
    private val jerseyNumber: JsonField<Long>,
    private val position: JsonField<Position>,
    private val teamId: JsonField<String>,
    private val yearsWithTeam: JsonField<Long>,
    private val assists: JsonField<Long>,
    private val goalsScored: JsonField<Long>,
    private val isCaptain: JsonField<Boolean>,
    private val memberType: JsonField<MemberType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("character_id")
        @ExcludeMissing
        characterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jersey_number")
        @ExcludeMissing
        jerseyNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("position") @ExcludeMissing position: JsonField<Position> = JsonMissing.of(),
        @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("years_with_team")
        @ExcludeMissing
        yearsWithTeam: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("assists") @ExcludeMissing assists: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("goals_scored")
        @ExcludeMissing
        goalsScored: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("is_captain")
        @ExcludeMissing
        isCaptain: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("member_type")
        @ExcludeMissing
        memberType: JsonField<MemberType> = JsonMissing.of(),
    ) : this(
        id,
        characterId,
        jerseyNumber,
        position,
        teamId,
        yearsWithTeam,
        assists,
        goalsScored,
        isCaptain,
        memberType,
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
     * Jersey/shirt number
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jerseyNumber(): Long = jerseyNumber.getRequired("jersey_number")

    /**
     * Playing position on the field
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun position(): Position = position.getRequired("position")

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
     * Total assists for the team
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assists(): Optional<Long> = assists.getOptional("assists")

    /**
     * Total goals scored for the team
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun goalsScored(): Optional<Long> = goalsScored.getOptional("goals_scored")

    /**
     * Whether this player is team captain
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isCaptain(): Optional<Boolean> = isCaptain.getOptional("is_captain")

    /**
     * Discriminator field indicating this is a player
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memberType(): Optional<MemberType> = memberType.getOptional("member_type")

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
     * Returns the raw JSON value of [jerseyNumber].
     *
     * Unlike [jerseyNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jersey_number")
    @ExcludeMissing
    fun _jerseyNumber(): JsonField<Long> = jerseyNumber

    /**
     * Returns the raw JSON value of [position].
     *
     * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<Position> = position

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
     * Returns the raw JSON value of [assists].
     *
     * Unlike [assists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assists") @ExcludeMissing fun _assists(): JsonField<Long> = assists

    /**
     * Returns the raw JSON value of [goalsScored].
     *
     * Unlike [goalsScored], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("goals_scored") @ExcludeMissing fun _goalsScored(): JsonField<Long> = goalsScored

    /**
     * Returns the raw JSON value of [isCaptain].
     *
     * Unlike [isCaptain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_captain") @ExcludeMissing fun _isCaptain(): JsonField<Boolean> = isCaptain

    /**
     * Returns the raw JSON value of [memberType].
     *
     * Unlike [memberType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("member_type")
    @ExcludeMissing
    fun _memberType(): JsonField<MemberType> = memberType

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
         * Returns a mutable builder for constructing an instance of [Player].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .characterId()
         * .jerseyNumber()
         * .position()
         * .teamId()
         * .yearsWithTeam()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Player]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var characterId: JsonField<String>? = null
        private var jerseyNumber: JsonField<Long>? = null
        private var position: JsonField<Position>? = null
        private var teamId: JsonField<String>? = null
        private var yearsWithTeam: JsonField<Long>? = null
        private var assists: JsonField<Long> = JsonMissing.of()
        private var goalsScored: JsonField<Long> = JsonMissing.of()
        private var isCaptain: JsonField<Boolean> = JsonMissing.of()
        private var memberType: JsonField<MemberType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(player: Player) = apply {
            id = player.id
            characterId = player.characterId
            jerseyNumber = player.jerseyNumber
            position = player.position
            teamId = player.teamId
            yearsWithTeam = player.yearsWithTeam
            assists = player.assists
            goalsScored = player.goalsScored
            isCaptain = player.isCaptain
            memberType = player.memberType
            additionalProperties = player.additionalProperties.toMutableMap()
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

        /** Jersey/shirt number */
        fun jerseyNumber(jerseyNumber: Long) = jerseyNumber(JsonField.of(jerseyNumber))

        /**
         * Sets [Builder.jerseyNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jerseyNumber] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jerseyNumber(jerseyNumber: JsonField<Long>) = apply { this.jerseyNumber = jerseyNumber }

        /** Playing position on the field */
        fun position(position: Position) = position(JsonField.of(position))

        /**
         * Sets [Builder.position] to an arbitrary JSON value.
         *
         * You should usually call [Builder.position] with a well-typed [Position] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun position(position: JsonField<Position>) = apply { this.position = position }

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

        /** Total assists for the team */
        fun assists(assists: Long) = assists(JsonField.of(assists))

        /**
         * Sets [Builder.assists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assists] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun assists(assists: JsonField<Long>) = apply { this.assists = assists }

        /** Total goals scored for the team */
        fun goalsScored(goalsScored: Long) = goalsScored(JsonField.of(goalsScored))

        /**
         * Sets [Builder.goalsScored] to an arbitrary JSON value.
         *
         * You should usually call [Builder.goalsScored] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun goalsScored(goalsScored: JsonField<Long>) = apply { this.goalsScored = goalsScored }

        /** Whether this player is team captain */
        fun isCaptain(isCaptain: Boolean) = isCaptain(JsonField.of(isCaptain))

        /**
         * Sets [Builder.isCaptain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isCaptain] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isCaptain(isCaptain: JsonField<Boolean>) = apply { this.isCaptain = isCaptain }

        /** Discriminator field indicating this is a player */
        fun memberType(memberType: MemberType) = memberType(JsonField.of(memberType))

        /**
         * Sets [Builder.memberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memberType] with a well-typed [MemberType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun memberType(memberType: JsonField<MemberType>) = apply { this.memberType = memberType }

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
         * Returns an immutable instance of [Player].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .characterId()
         * .jerseyNumber()
         * .position()
         * .teamId()
         * .yearsWithTeam()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Player =
            Player(
                checkRequired("id", id),
                checkRequired("characterId", characterId),
                checkRequired("jerseyNumber", jerseyNumber),
                checkRequired("position", position),
                checkRequired("teamId", teamId),
                checkRequired("yearsWithTeam", yearsWithTeam),
                assists,
                goalsScored,
                isCaptain,
                memberType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Player = apply {
        if (validated) {
            return@apply
        }

        id()
        characterId()
        jerseyNumber()
        position().validate()
        teamId()
        yearsWithTeam()
        assists()
        goalsScored()
        isCaptain()
        memberType().ifPresent { it.validate() }
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
            (if (jerseyNumber.asKnown().isPresent) 1 else 0) +
            (position.asKnown().getOrNull()?.validity() ?: 0) +
            (if (teamId.asKnown().isPresent) 1 else 0) +
            (if (yearsWithTeam.asKnown().isPresent) 1 else 0) +
            (if (assists.asKnown().isPresent) 1 else 0) +
            (if (goalsScored.asKnown().isPresent) 1 else 0) +
            (if (isCaptain.asKnown().isPresent) 1 else 0) +
            (memberType.asKnown().getOrNull()?.validity() ?: 0)

    /** Discriminator field indicating this is a player */
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

            @JvmField val PLAYER = of("player")

            @JvmStatic fun of(value: String) = MemberType(JsonField.of(value))
        }

        /** An enum containing [MemberType]'s known values. */
        enum class Known {
            PLAYER
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
            PLAYER,
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
                PLAYER -> Value.PLAYER
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
                PLAYER -> Known.PLAYER
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

        return other is Player &&
            id == other.id &&
            characterId == other.characterId &&
            jerseyNumber == other.jerseyNumber &&
            position == other.position &&
            teamId == other.teamId &&
            yearsWithTeam == other.yearsWithTeam &&
            assists == other.assists &&
            goalsScored == other.goalsScored &&
            isCaptain == other.isCaptain &&
            memberType == other.memberType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            characterId,
            jerseyNumber,
            position,
            teamId,
            yearsWithTeam,
            assists,
            goalsScored,
            isCaptain,
            memberType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Player{id=$id, characterId=$characterId, jerseyNumber=$jerseyNumber, position=$position, teamId=$teamId, yearsWithTeam=$yearsWithTeam, assists=$assists, goalsScored=$goalsScored, isCaptain=$isCaptain, memberType=$memberType, additionalProperties=$additionalProperties}"
}
