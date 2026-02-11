// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.BaseDeserializer
import com.believe.api.core.BaseSerializer
import com.believe.api.core.Enum
import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.Params
import com.believe.api.core.checkKnown
import com.believe.api.core.checkRequired
import com.believe.api.core.getOrThrow
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import com.believe.api.core.toImmutable
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Add a new team member to a team.
 *
 * The request body is a **union type (oneOf)** - you must include the `member_type` discriminator
 * field:
 * - `"member_type": "player"` - Creates a player (requires position, jersey_number, etc.)
 * - `"member_type": "coach"` - Creates a coach (requires specialty, etc.)
 * - `"member_type": "medical_staff"` - Creates medical staff (requires medical specialty, etc.)
 * - `"member_type": "equipment_manager"` - Creates equipment manager (requires responsibilities,
 *   etc.)
 *
 * The `character_id` field references an existing character from `/characters/{id}`.
 *
 * **Example for creating a player:**
 *
 * ```json
 * {
 *   "member_type": "player",
 *   "character_id": "sam-obisanya",
 *   "team_id": "afc-richmond",
 *   "years_with_team": 2,
 *   "position": "midfielder",
 *   "jersey_number": 24,
 *   "goals_scored": 12,
 *   "assists": 15
 * }
 * ```
 */
class TeamMemberCreateParams
private constructor(
    private val member: Member,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A football player on the team. */
    fun member(): Member = member

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TeamMemberCreateParams].
         *
         * The following fields are required:
         * ```java
         * .member()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TeamMemberCreateParams]. */
    class Builder internal constructor() {

        private var member: Member? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(teamMemberCreateParams: TeamMemberCreateParams) = apply {
            member = teamMemberCreateParams.member
            additionalHeaders = teamMemberCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = teamMemberCreateParams.additionalQueryParams.toBuilder()
        }

        /** A football player on the team. */
        fun member(member: Member) = apply { this.member = member }

        /** Alias for calling [member] with `Member.ofPlayer(player)`. */
        fun member(player: Member.Player) = member(Member.ofPlayer(player))

        /** Alias for calling [member] with `Member.ofCoach(coach)`. */
        fun member(coach: Member.Coach) = member(Member.ofCoach(coach))

        /** Alias for calling [member] with `Member.ofMedicalStaff(medicalStaff)`. */
        fun member(medicalStaff: Member.MedicalStaff) = member(Member.ofMedicalStaff(medicalStaff))

        /** Alias for calling [member] with `Member.ofEquipmentManager(equipmentManager)`. */
        fun member(equipmentManager: Member.EquipmentManager) =
            member(Member.ofEquipmentManager(equipmentManager))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [TeamMemberCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .member()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TeamMemberCreateParams =
            TeamMemberCreateParams(
                checkRequired("member", member),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Member = member

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** A football player on the team. */
    @JsonDeserialize(using = Member.Deserializer::class)
    @JsonSerialize(using = Member.Serializer::class)
    class Member
    private constructor(
        private val player: Player? = null,
        private val coach: Coach? = null,
        private val medicalStaff: MedicalStaff? = null,
        private val equipmentManager: EquipmentManager? = null,
        private val _json: JsonValue? = null,
    ) {

        /** A football player on the team. */
        fun player(): Optional<Player> = Optional.ofNullable(player)

        /** A coach or coaching staff member. */
        fun coach(): Optional<Coach> = Optional.ofNullable(coach)

        /** Medical and wellness staff member. */
        fun medicalStaff(): Optional<MedicalStaff> = Optional.ofNullable(medicalStaff)

        /** Equipment and kit management staff. */
        fun equipmentManager(): Optional<EquipmentManager> = Optional.ofNullable(equipmentManager)

        fun isPlayer(): Boolean = player != null

        fun isCoach(): Boolean = coach != null

        fun isMedicalStaff(): Boolean = medicalStaff != null

        fun isEquipmentManager(): Boolean = equipmentManager != null

        /** A football player on the team. */
        fun asPlayer(): Player = player.getOrThrow("player")

        /** A coach or coaching staff member. */
        fun asCoach(): Coach = coach.getOrThrow("coach")

        /** Medical and wellness staff member. */
        fun asMedicalStaff(): MedicalStaff = medicalStaff.getOrThrow("medicalStaff")

        /** Equipment and kit management staff. */
        fun asEquipmentManager(): EquipmentManager = equipmentManager.getOrThrow("equipmentManager")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                player != null -> visitor.visitPlayer(player)
                coach != null -> visitor.visitCoach(coach)
                medicalStaff != null -> visitor.visitMedicalStaff(medicalStaff)
                equipmentManager != null -> visitor.visitEquipmentManager(equipmentManager)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Member = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPlayer(player: Player) {
                        player.validate()
                    }

                    override fun visitCoach(coach: Coach) {
                        coach.validate()
                    }

                    override fun visitMedicalStaff(medicalStaff: MedicalStaff) {
                        medicalStaff.validate()
                    }

                    override fun visitEquipmentManager(equipmentManager: EquipmentManager) {
                        equipmentManager.validate()
                    }
                }
            )
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
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitPlayer(player: Player) = player.validity()

                    override fun visitCoach(coach: Coach) = coach.validity()

                    override fun visitMedicalStaff(medicalStaff: MedicalStaff) =
                        medicalStaff.validity()

                    override fun visitEquipmentManager(equipmentManager: EquipmentManager) =
                        equipmentManager.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Member &&
                player == other.player &&
                coach == other.coach &&
                medicalStaff == other.medicalStaff &&
                equipmentManager == other.equipmentManager
        }

        override fun hashCode(): Int = Objects.hash(player, coach, medicalStaff, equipmentManager)

        override fun toString(): String =
            when {
                player != null -> "Member{player=$player}"
                coach != null -> "Member{coach=$coach}"
                medicalStaff != null -> "Member{medicalStaff=$medicalStaff}"
                equipmentManager != null -> "Member{equipmentManager=$equipmentManager}"
                _json != null -> "Member{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Member")
            }

        companion object {

            /** A football player on the team. */
            @JvmStatic fun ofPlayer(player: Player) = Member(player = player)

            /** A coach or coaching staff member. */
            @JvmStatic fun ofCoach(coach: Coach) = Member(coach = coach)

            /** Medical and wellness staff member. */
            @JvmStatic
            fun ofMedicalStaff(medicalStaff: MedicalStaff) = Member(medicalStaff = medicalStaff)

            /** Equipment and kit management staff. */
            @JvmStatic
            fun ofEquipmentManager(equipmentManager: EquipmentManager) =
                Member(equipmentManager = equipmentManager)
        }

        /** An interface that defines how to map each variant of [Member] to a value of type [T]. */
        interface Visitor<out T> {

            /** A football player on the team. */
            fun visitPlayer(player: Player): T

            /** A coach or coaching staff member. */
            fun visitCoach(coach: Coach): T

            /** Medical and wellness staff member. */
            fun visitMedicalStaff(medicalStaff: MedicalStaff): T

            /** Equipment and kit management staff. */
            fun visitEquipmentManager(equipmentManager: EquipmentManager): T

            /**
             * Maps an unknown variant of [Member] to a value of type [T].
             *
             * An instance of [Member] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws BelieveInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BelieveInvalidDataException("Unknown Member: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Member>(Member::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Member {
                val json = JsonValue.fromJsonNode(node)
                val memberType =
                    json.asObject().getOrNull()?.get("member_type")?.asString()?.getOrNull()

                when (memberType) {
                    "player" -> {
                        return tryDeserialize(node, jacksonTypeRef<Player>())?.let {
                            Member(player = it, _json = json)
                        } ?: Member(_json = json)
                    }
                    "coach" -> {
                        return tryDeserialize(node, jacksonTypeRef<Coach>())?.let {
                            Member(coach = it, _json = json)
                        } ?: Member(_json = json)
                    }
                    "medical_staff" -> {
                        return tryDeserialize(node, jacksonTypeRef<MedicalStaff>())?.let {
                            Member(medicalStaff = it, _json = json)
                        } ?: Member(_json = json)
                    }
                    "equipment_manager" -> {
                        return tryDeserialize(node, jacksonTypeRef<EquipmentManager>())?.let {
                            Member(equipmentManager = it, _json = json)
                        } ?: Member(_json = json)
                    }
                }

                return Member(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Member>(Member::class) {

            override fun serialize(
                value: Member,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.player != null -> generator.writeObject(value.player)
                    value.coach != null -> generator.writeObject(value.coach)
                    value.medicalStaff != null -> generator.writeObject(value.medicalStaff)
                    value.equipmentManager != null -> generator.writeObject(value.equipmentManager)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Member")
                }
            }
        }

        /** A football player on the team. */
        class Player
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
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
                @JsonProperty("character_id")
                @ExcludeMissing
                characterId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("jersey_number")
                @ExcludeMissing
                jerseyNumber: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("position")
                @ExcludeMissing
                position: JsonField<Position> = JsonMissing.of(),
                @JsonProperty("team_id")
                @ExcludeMissing
                teamId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("years_with_team")
                @ExcludeMissing
                yearsWithTeam: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("assists")
                @ExcludeMissing
                assists: JsonField<Long> = JsonMissing.of(),
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
             * ID of the character (references /characters/{id})
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun characterId(): String = characterId.getRequired("character_id")

            /**
             * Jersey/shirt number
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun jerseyNumber(): Long = jerseyNumber.getRequired("jersey_number")

            /**
             * Playing position on the field
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun position(): Position = position.getRequired("position")

            /**
             * ID of the team they belong to
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun teamId(): String = teamId.getRequired("team_id")

            /**
             * Number of years with the current team
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun yearsWithTeam(): Long = yearsWithTeam.getRequired("years_with_team")

            /**
             * Total assists for the team
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun assists(): Optional<Long> = assists.getOptional("assists")

            /**
             * Total goals scored for the team
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun goalsScored(): Optional<Long> = goalsScored.getOptional("goals_scored")

            /**
             * Whether this player is team captain
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isCaptain(): Optional<Boolean> = isCaptain.getOptional("is_captain")

            /**
             * Discriminator field indicating this is a player
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun memberType(): Optional<MemberType> = memberType.getOptional("member_type")

            /**
             * Returns the raw JSON value of [characterId].
             *
             * Unlike [characterId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("character_id")
            @ExcludeMissing
            fun _characterId(): JsonField<String> = characterId

            /**
             * Returns the raw JSON value of [jerseyNumber].
             *
             * Unlike [jerseyNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("jersey_number")
            @ExcludeMissing
            fun _jerseyNumber(): JsonField<Long> = jerseyNumber

            /**
             * Returns the raw JSON value of [position].
             *
             * Unlike [position], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("position")
            @ExcludeMissing
            fun _position(): JsonField<Position> = position

            /**
             * Returns the raw JSON value of [teamId].
             *
             * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

            /**
             * Returns the raw JSON value of [yearsWithTeam].
             *
             * Unlike [yearsWithTeam], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [goalsScored], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("goals_scored")
            @ExcludeMissing
            fun _goalsScored(): JsonField<Long> = goalsScored

            /**
             * Returns the raw JSON value of [isCaptain].
             *
             * Unlike [isCaptain], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_captain")
            @ExcludeMissing
            fun _isCaptain(): JsonField<Boolean> = isCaptain

            /**
             * Returns the raw JSON value of [memberType].
             *
             * Unlike [memberType], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /** ID of the character (references /characters/{id}) */
                fun characterId(characterId: String) = characterId(JsonField.of(characterId))

                /**
                 * Sets [Builder.characterId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.characterId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun characterId(characterId: JsonField<String>) = apply {
                    this.characterId = characterId
                }

                /** Jersey/shirt number */
                fun jerseyNumber(jerseyNumber: Long) = jerseyNumber(JsonField.of(jerseyNumber))

                /**
                 * Sets [Builder.jerseyNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.jerseyNumber] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun jerseyNumber(jerseyNumber: JsonField<Long>) = apply {
                    this.jerseyNumber = jerseyNumber
                }

                /** Playing position on the field */
                fun position(position: Position) = position(JsonField.of(position))

                /**
                 * Sets [Builder.position] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.position] with a well-typed [Position] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun position(position: JsonField<Position>) = apply { this.position = position }

                /** ID of the team they belong to */
                fun teamId(teamId: String) = teamId(JsonField.of(teamId))

                /**
                 * Sets [Builder.teamId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

                /** Number of years with the current team */
                fun yearsWithTeam(yearsWithTeam: Long) = yearsWithTeam(JsonField.of(yearsWithTeam))

                /**
                 * Sets [Builder.yearsWithTeam] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yearsWithTeam] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun yearsWithTeam(yearsWithTeam: JsonField<Long>) = apply {
                    this.yearsWithTeam = yearsWithTeam
                }

                /** Total assists for the team */
                fun assists(assists: Long) = assists(JsonField.of(assists))

                /**
                 * Sets [Builder.assists] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assists] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun assists(assists: JsonField<Long>) = apply { this.assists = assists }

                /** Total goals scored for the team */
                fun goalsScored(goalsScored: Long) = goalsScored(JsonField.of(goalsScored))

                /**
                 * Sets [Builder.goalsScored] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.goalsScored] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun goalsScored(goalsScored: JsonField<Long>) = apply {
                    this.goalsScored = goalsScored
                }

                /** Whether this player is team captain */
                fun isCaptain(isCaptain: Boolean) = isCaptain(JsonField.of(isCaptain))

                /**
                 * Sets [Builder.isCaptain] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isCaptain] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isCaptain(isCaptain: JsonField<Boolean>) = apply { this.isCaptain = isCaptain }

                /** Discriminator field indicating this is a player */
                fun memberType(memberType: MemberType) = memberType(JsonField.of(memberType))

                /**
                 * Sets [Builder.memberType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberType] with a well-typed [MemberType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun memberType(memberType: JsonField<MemberType>) = apply {
                    this.memberType = memberType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
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
            class MemberType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PLAYER,
                    /**
                     * An enum member indicating that [MemberType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PLAYER -> Value.PLAYER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BelieveInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PLAYER -> Known.PLAYER
                        else -> throw BelieveInvalidDataException("Unknown MemberType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BelieveInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BelieveInvalidDataException("Value is not a String")
                    }

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
                "Player{characterId=$characterId, jerseyNumber=$jerseyNumber, position=$position, teamId=$teamId, yearsWithTeam=$yearsWithTeam, assists=$assists, goalsScored=$goalsScored, isCaptain=$isCaptain, memberType=$memberType, additionalProperties=$additionalProperties}"
        }

        /** A coach or coaching staff member. */
        class Coach
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
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
                @JsonProperty("character_id")
                @ExcludeMissing
                characterId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("specialty")
                @ExcludeMissing
                specialty: JsonField<CoachSpecialty> = JsonMissing.of(),
                @JsonProperty("team_id")
                @ExcludeMissing
                teamId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("years_with_team")
                @ExcludeMissing
                yearsWithTeam: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("certifications")
                @ExcludeMissing
                certifications: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("member_type")
                @ExcludeMissing
                memberType: JsonField<MemberType> = JsonMissing.of(),
                @JsonProperty("win_rate")
                @ExcludeMissing
                winRate: JsonField<Double> = JsonMissing.of(),
            ) : this(
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
             * ID of the character (references /characters/{id})
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun characterId(): String = characterId.getRequired("character_id")

            /**
             * Coaching specialty/role
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun specialty(): CoachSpecialty = specialty.getRequired("specialty")

            /**
             * ID of the team they belong to
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun teamId(): String = teamId.getRequired("team_id")

            /**
             * Number of years with the current team
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun yearsWithTeam(): Long = yearsWithTeam.getRequired("years_with_team")

            /**
             * Coaching certifications and licenses
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun certifications(): Optional<List<String>> =
                certifications.getOptional("certifications")

            /**
             * Discriminator field indicating this is a coach
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun memberType(): Optional<MemberType> = memberType.getOptional("member_type")

            /**
             * Career win rate (0.0 to 1.0)
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun winRate(): Optional<Double> = winRate.getOptional("win_rate")

            /**
             * Returns the raw JSON value of [characterId].
             *
             * Unlike [characterId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("character_id")
            @ExcludeMissing
            fun _characterId(): JsonField<String> = characterId

            /**
             * Returns the raw JSON value of [specialty].
             *
             * Unlike [specialty], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [yearsWithTeam], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("years_with_team")
            @ExcludeMissing
            fun _yearsWithTeam(): JsonField<Long> = yearsWithTeam

            /**
             * Returns the raw JSON value of [certifications].
             *
             * Unlike [certifications], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("certifications")
            @ExcludeMissing
            fun _certifications(): JsonField<List<String>> = certifications

            /**
             * Returns the raw JSON value of [memberType].
             *
             * Unlike [memberType], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                    characterId = coach.characterId
                    specialty = coach.specialty
                    teamId = coach.teamId
                    yearsWithTeam = coach.yearsWithTeam
                    certifications = coach.certifications.map { it.toMutableList() }
                    memberType = coach.memberType
                    winRate = coach.winRate
                    additionalProperties = coach.additionalProperties.toMutableMap()
                }

                /** ID of the character (references /characters/{id}) */
                fun characterId(characterId: String) = characterId(JsonField.of(characterId))

                /**
                 * Sets [Builder.characterId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.characterId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun characterId(characterId: JsonField<String>) = apply {
                    this.characterId = characterId
                }

                /** Coaching specialty/role */
                fun specialty(specialty: CoachSpecialty) = specialty(JsonField.of(specialty))

                /**
                 * Sets [Builder.specialty] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.specialty] with a well-typed [CoachSpecialty]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun specialty(specialty: JsonField<CoachSpecialty>) = apply {
                    this.specialty = specialty
                }

                /** ID of the team they belong to */
                fun teamId(teamId: String) = teamId(JsonField.of(teamId))

                /**
                 * Sets [Builder.teamId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

                /** Number of years with the current team */
                fun yearsWithTeam(yearsWithTeam: Long) = yearsWithTeam(JsonField.of(yearsWithTeam))

                /**
                 * Sets [Builder.yearsWithTeam] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yearsWithTeam] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.certifications] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun memberType(memberType: JsonField<MemberType>) = apply {
                    this.memberType = memberType
                }

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
                 * You should usually call [Builder.winRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun winRate(winRate: JsonField<Double>) = apply { this.winRate = winRate }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (characterId.asKnown().isPresent) 1 else 0) +
                    (specialty.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (teamId.asKnown().isPresent) 1 else 0) +
                    (if (yearsWithTeam.asKnown().isPresent) 1 else 0) +
                    (certifications.asKnown().getOrNull()?.size ?: 0) +
                    (memberType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (winRate.asKnown().isPresent) 1 else 0)

            /** Discriminator field indicating this is a coach */
            class MemberType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COACH,
                    /**
                     * An enum member indicating that [MemberType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        COACH -> Value.COACH
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BelieveInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        COACH -> Known.COACH
                        else -> throw BelieveInvalidDataException("Unknown MemberType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BelieveInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BelieveInvalidDataException("Value is not a String")
                    }

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
                "Coach{characterId=$characterId, specialty=$specialty, teamId=$teamId, yearsWithTeam=$yearsWithTeam, certifications=$certifications, memberType=$memberType, winRate=$winRate, additionalProperties=$additionalProperties}"
        }

        /** Medical and wellness staff member. */
        class MedicalStaff
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
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
                @JsonProperty("character_id")
                @ExcludeMissing
                characterId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("specialty")
                @ExcludeMissing
                specialty: JsonField<MedicalSpecialty> = JsonMissing.of(),
                @JsonProperty("team_id")
                @ExcludeMissing
                teamId: JsonField<String> = JsonMissing.of(),
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
             * ID of the character (references /characters/{id})
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun characterId(): String = characterId.getRequired("character_id")

            /**
             * Medical specialty
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun specialty(): MedicalSpecialty = specialty.getRequired("specialty")

            /**
             * ID of the team they belong to
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun teamId(): String = teamId.getRequired("team_id")

            /**
             * Number of years with the current team
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun yearsWithTeam(): Long = yearsWithTeam.getRequired("years_with_team")

            /**
             * Professional license number
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun licenseNumber(): Optional<String> = licenseNumber.getOptional("license_number")

            /**
             * Discriminator field indicating this is medical staff
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun memberType(): Optional<MemberType> = memberType.getOptional("member_type")

            /**
             * Medical qualifications and degrees
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun qualifications(): Optional<List<String>> =
                qualifications.getOptional("qualifications")

            /**
             * Returns the raw JSON value of [characterId].
             *
             * Unlike [characterId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("character_id")
            @ExcludeMissing
            fun _characterId(): JsonField<String> = characterId

            /**
             * Returns the raw JSON value of [specialty].
             *
             * Unlike [specialty], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [yearsWithTeam], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("years_with_team")
            @ExcludeMissing
            fun _yearsWithTeam(): JsonField<Long> = yearsWithTeam

            /**
             * Returns the raw JSON value of [licenseNumber].
             *
             * Unlike [licenseNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("license_number")
            @ExcludeMissing
            fun _licenseNumber(): JsonField<String> = licenseNumber

            /**
             * Returns the raw JSON value of [memberType].
             *
             * Unlike [memberType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("member_type")
            @ExcludeMissing
            fun _memberType(): JsonField<MemberType> = memberType

            /**
             * Returns the raw JSON value of [qualifications].
             *
             * Unlike [qualifications], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                    characterId = medicalStaff.characterId
                    specialty = medicalStaff.specialty
                    teamId = medicalStaff.teamId
                    yearsWithTeam = medicalStaff.yearsWithTeam
                    licenseNumber = medicalStaff.licenseNumber
                    memberType = medicalStaff.memberType
                    qualifications = medicalStaff.qualifications.map { it.toMutableList() }
                    additionalProperties = medicalStaff.additionalProperties.toMutableMap()
                }

                /** ID of the character (references /characters/{id}) */
                fun characterId(characterId: String) = characterId(JsonField.of(characterId))

                /**
                 * Sets [Builder.characterId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.characterId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun characterId(characterId: JsonField<String>) = apply {
                    this.characterId = characterId
                }

                /** Medical specialty */
                fun specialty(specialty: MedicalSpecialty) = specialty(JsonField.of(specialty))

                /**
                 * Sets [Builder.specialty] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.specialty] with a well-typed [MedicalSpecialty]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun specialty(specialty: JsonField<MedicalSpecialty>) = apply {
                    this.specialty = specialty
                }

                /** ID of the team they belong to */
                fun teamId(teamId: String) = teamId(JsonField.of(teamId))

                /**
                 * Sets [Builder.teamId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

                /** Number of years with the current team */
                fun yearsWithTeam(yearsWithTeam: Long) = yearsWithTeam(JsonField.of(yearsWithTeam))

                /**
                 * Sets [Builder.yearsWithTeam] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yearsWithTeam] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.licenseNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun memberType(memberType: JsonField<MemberType>) = apply {
                    this.memberType = memberType
                }

                /** Medical qualifications and degrees */
                fun qualifications(qualifications: List<String>) =
                    qualifications(JsonField.of(qualifications))

                /**
                 * Sets [Builder.qualifications] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.qualifications] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (characterId.asKnown().isPresent) 1 else 0) +
                    (specialty.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (teamId.asKnown().isPresent) 1 else 0) +
                    (if (yearsWithTeam.asKnown().isPresent) 1 else 0) +
                    (if (licenseNumber.asKnown().isPresent) 1 else 0) +
                    (memberType.asKnown().getOrNull()?.validity() ?: 0) +
                    (qualifications.asKnown().getOrNull()?.size ?: 0)

            /** Discriminator field indicating this is medical staff */
            class MemberType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MEDICAL_STAFF,
                    /**
                     * An enum member indicating that [MemberType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MEDICAL_STAFF -> Value.MEDICAL_STAFF
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BelieveInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MEDICAL_STAFF -> Known.MEDICAL_STAFF
                        else -> throw BelieveInvalidDataException("Unknown MemberType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BelieveInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BelieveInvalidDataException("Value is not a String")
                    }

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
                "MedicalStaff{characterId=$characterId, specialty=$specialty, teamId=$teamId, yearsWithTeam=$yearsWithTeam, licenseNumber=$licenseNumber, memberType=$memberType, qualifications=$qualifications, additionalProperties=$additionalProperties}"
        }

        /** Equipment and kit management staff. */
        class EquipmentManager
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val characterId: JsonField<String>,
            private val teamId: JsonField<String>,
            private val yearsWithTeam: JsonField<Long>,
            private val isHeadKitman: JsonField<Boolean>,
            private val memberType: JsonField<MemberType>,
            private val responsibilities: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("character_id")
                @ExcludeMissing
                characterId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("team_id")
                @ExcludeMissing
                teamId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("years_with_team")
                @ExcludeMissing
                yearsWithTeam: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("is_head_kitman")
                @ExcludeMissing
                isHeadKitman: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("member_type")
                @ExcludeMissing
                memberType: JsonField<MemberType> = JsonMissing.of(),
                @JsonProperty("responsibilities")
                @ExcludeMissing
                responsibilities: JsonField<List<String>> = JsonMissing.of(),
            ) : this(
                characterId,
                teamId,
                yearsWithTeam,
                isHeadKitman,
                memberType,
                responsibilities,
                mutableMapOf(),
            )

            /**
             * ID of the character (references /characters/{id})
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun characterId(): String = characterId.getRequired("character_id")

            /**
             * ID of the team they belong to
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun teamId(): String = teamId.getRequired("team_id")

            /**
             * Number of years with the current team
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun yearsWithTeam(): Long = yearsWithTeam.getRequired("years_with_team")

            /**
             * Whether this is the head equipment manager
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isHeadKitman(): Optional<Boolean> = isHeadKitman.getOptional("is_head_kitman")

            /**
             * Discriminator field indicating this is an equipment manager
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun memberType(): Optional<MemberType> = memberType.getOptional("member_type")

            /**
             * List of responsibilities
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun responsibilities(): Optional<List<String>> =
                responsibilities.getOptional("responsibilities")

            /**
             * Returns the raw JSON value of [characterId].
             *
             * Unlike [characterId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("character_id")
            @ExcludeMissing
            fun _characterId(): JsonField<String> = characterId

            /**
             * Returns the raw JSON value of [teamId].
             *
             * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

            /**
             * Returns the raw JSON value of [yearsWithTeam].
             *
             * Unlike [yearsWithTeam], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("years_with_team")
            @ExcludeMissing
            fun _yearsWithTeam(): JsonField<Long> = yearsWithTeam

            /**
             * Returns the raw JSON value of [isHeadKitman].
             *
             * Unlike [isHeadKitman], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_head_kitman")
            @ExcludeMissing
            fun _isHeadKitman(): JsonField<Boolean> = isHeadKitman

            /**
             * Returns the raw JSON value of [memberType].
             *
             * Unlike [memberType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("member_type")
            @ExcludeMissing
            fun _memberType(): JsonField<MemberType> = memberType

            /**
             * Returns the raw JSON value of [responsibilities].
             *
             * Unlike [responsibilities], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("responsibilities")
            @ExcludeMissing
            fun _responsibilities(): JsonField<List<String>> = responsibilities

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
                 * Returns a mutable builder for constructing an instance of [EquipmentManager].
                 *
                 * The following fields are required:
                 * ```java
                 * .characterId()
                 * .teamId()
                 * .yearsWithTeam()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [EquipmentManager]. */
            class Builder internal constructor() {

                private var characterId: JsonField<String>? = null
                private var teamId: JsonField<String>? = null
                private var yearsWithTeam: JsonField<Long>? = null
                private var isHeadKitman: JsonField<Boolean> = JsonMissing.of()
                private var memberType: JsonField<MemberType> = JsonMissing.of()
                private var responsibilities: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(equipmentManager: EquipmentManager) = apply {
                    characterId = equipmentManager.characterId
                    teamId = equipmentManager.teamId
                    yearsWithTeam = equipmentManager.yearsWithTeam
                    isHeadKitman = equipmentManager.isHeadKitman
                    memberType = equipmentManager.memberType
                    responsibilities = equipmentManager.responsibilities.map { it.toMutableList() }
                    additionalProperties = equipmentManager.additionalProperties.toMutableMap()
                }

                /** ID of the character (references /characters/{id}) */
                fun characterId(characterId: String) = characterId(JsonField.of(characterId))

                /**
                 * Sets [Builder.characterId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.characterId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun characterId(characterId: JsonField<String>) = apply {
                    this.characterId = characterId
                }

                /** ID of the team they belong to */
                fun teamId(teamId: String) = teamId(JsonField.of(teamId))

                /**
                 * Sets [Builder.teamId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.teamId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

                /** Number of years with the current team */
                fun yearsWithTeam(yearsWithTeam: Long) = yearsWithTeam(JsonField.of(yearsWithTeam))

                /**
                 * Sets [Builder.yearsWithTeam] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yearsWithTeam] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun yearsWithTeam(yearsWithTeam: JsonField<Long>) = apply {
                    this.yearsWithTeam = yearsWithTeam
                }

                /** Whether this is the head equipment manager */
                fun isHeadKitman(isHeadKitman: Boolean) = isHeadKitman(JsonField.of(isHeadKitman))

                /**
                 * Sets [Builder.isHeadKitman] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isHeadKitman] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isHeadKitman(isHeadKitman: JsonField<Boolean>) = apply {
                    this.isHeadKitman = isHeadKitman
                }

                /** Discriminator field indicating this is an equipment manager */
                fun memberType(memberType: MemberType) = memberType(JsonField.of(memberType))

                /**
                 * Sets [Builder.memberType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberType] with a well-typed [MemberType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun memberType(memberType: JsonField<MemberType>) = apply {
                    this.memberType = memberType
                }

                /** List of responsibilities */
                fun responsibilities(responsibilities: List<String>) =
                    responsibilities(JsonField.of(responsibilities))

                /**
                 * Sets [Builder.responsibilities] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responsibilities] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun responsibilities(responsibilities: JsonField<List<String>>) = apply {
                    this.responsibilities = responsibilities.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [responsibilities].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addResponsibility(responsibility: String) = apply {
                    responsibilities =
                        (responsibilities ?: JsonField.of(mutableListOf())).also {
                            checkKnown("responsibilities", it).add(responsibility)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [EquipmentManager].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .characterId()
                 * .teamId()
                 * .yearsWithTeam()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EquipmentManager =
                    EquipmentManager(
                        checkRequired("characterId", characterId),
                        checkRequired("teamId", teamId),
                        checkRequired("yearsWithTeam", yearsWithTeam),
                        isHeadKitman,
                        memberType,
                        (responsibilities ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): EquipmentManager = apply {
                if (validated) {
                    return@apply
                }

                characterId()
                teamId()
                yearsWithTeam()
                isHeadKitman()
                memberType().ifPresent { it.validate() }
                responsibilities()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (characterId.asKnown().isPresent) 1 else 0) +
                    (if (teamId.asKnown().isPresent) 1 else 0) +
                    (if (yearsWithTeam.asKnown().isPresent) 1 else 0) +
                    (if (isHeadKitman.asKnown().isPresent) 1 else 0) +
                    (memberType.asKnown().getOrNull()?.validity() ?: 0) +
                    (responsibilities.asKnown().getOrNull()?.size ?: 0)

            /** Discriminator field indicating this is an equipment manager */
            class MemberType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EQUIPMENT_MANAGER = of("equipment_manager")

                    @JvmStatic fun of(value: String) = MemberType(JsonField.of(value))
                }

                /** An enum containing [MemberType]'s known values. */
                enum class Known {
                    EQUIPMENT_MANAGER
                }

                /**
                 * An enum containing [MemberType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [MemberType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EQUIPMENT_MANAGER,
                    /**
                     * An enum member indicating that [MemberType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EQUIPMENT_MANAGER -> Value.EQUIPMENT_MANAGER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws BelieveInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        EQUIPMENT_MANAGER -> Known.EQUIPMENT_MANAGER
                        else -> throw BelieveInvalidDataException("Unknown MemberType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BelieveInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BelieveInvalidDataException("Value is not a String")
                    }

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

                return other is EquipmentManager &&
                    characterId == other.characterId &&
                    teamId == other.teamId &&
                    yearsWithTeam == other.yearsWithTeam &&
                    isHeadKitman == other.isHeadKitman &&
                    memberType == other.memberType &&
                    responsibilities == other.responsibilities &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    characterId,
                    teamId,
                    yearsWithTeam,
                    isHeadKitman,
                    memberType,
                    responsibilities,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EquipmentManager{characterId=$characterId, teamId=$teamId, yearsWithTeam=$yearsWithTeam, isHeadKitman=$isHeadKitman, memberType=$memberType, responsibilities=$responsibilities, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamMemberCreateParams &&
            member == other.member &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(member, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TeamMemberCreateParams{member=$member, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
