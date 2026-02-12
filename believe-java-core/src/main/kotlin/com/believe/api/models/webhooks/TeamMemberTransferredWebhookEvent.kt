// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Webhook event sent when a team member (player, coach, staff) transfers between teams. */
class TeamMemberTransferredWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val data: JsonField<Data>,
    private val eventId: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("event_id") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
    ) : this(createdAt, data, eventId, eventType, mutableMapOf())

    /**
     * When the event was created
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Data payload for a team member transfer event.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Unique identifier for this event
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventId(): String = eventId.getRequired("event_id")

    /**
     * The type of webhook event
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [eventId].
     *
     * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_id") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

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
         * Returns a mutable builder for constructing an instance of
         * [TeamMemberTransferredWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .data()
         * .eventId()
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TeamMemberTransferredWebhookEvent]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var data: JsonField<Data>? = null
        private var eventId: JsonField<String>? = null
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(teamMemberTransferredWebhookEvent: TeamMemberTransferredWebhookEvent) =
            apply {
                createdAt = teamMemberTransferredWebhookEvent.createdAt
                data = teamMemberTransferredWebhookEvent.data
                eventId = teamMemberTransferredWebhookEvent.eventId
                eventType = teamMemberTransferredWebhookEvent.eventType
                additionalProperties =
                    teamMemberTransferredWebhookEvent.additionalProperties.toMutableMap()
            }

        /** When the event was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Data payload for a team member transfer event. */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** Unique identifier for this event */
        fun eventId(eventId: String) = eventId(JsonField.of(eventId))

        /**
         * Sets [Builder.eventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

        /** The type of webhook event */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

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
         * Returns an immutable instance of [TeamMemberTransferredWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .data()
         * .eventId()
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TeamMemberTransferredWebhookEvent =
            TeamMemberTransferredWebhookEvent(
                checkRequired("createdAt", createdAt),
                checkRequired("data", data),
                checkRequired("eventId", eventId),
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TeamMemberTransferredWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        data().validate()
        eventId()
        eventType().validate()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (data.asKnown().getOrNull()?.validity() ?: 0) +
            (if (eventId.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0)

    /** Data payload for a team member transfer event. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val characterId: JsonField<String>,
        private val characterName: JsonField<String>,
        private val memberType: JsonField<MemberType>,
        private val teamId: JsonField<String>,
        private val teamMemberId: JsonField<String>,
        private val teamName: JsonField<String>,
        private val tedReaction: JsonField<String>,
        private val transferType: JsonField<TransferType>,
        private val previousTeamId: JsonField<String>,
        private val previousTeamName: JsonField<String>,
        private val transferFeeGbp: JsonField<String>,
        private val yearsWithPreviousTeam: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("character_id")
            @ExcludeMissing
            characterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("character_name")
            @ExcludeMissing
            characterName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("member_type")
            @ExcludeMissing
            memberType: JsonField<MemberType> = JsonMissing.of(),
            @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("team_member_id")
            @ExcludeMissing
            teamMemberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("team_name")
            @ExcludeMissing
            teamName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ted_reaction")
            @ExcludeMissing
            tedReaction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transfer_type")
            @ExcludeMissing
            transferType: JsonField<TransferType> = JsonMissing.of(),
            @JsonProperty("previous_team_id")
            @ExcludeMissing
            previousTeamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("previous_team_name")
            @ExcludeMissing
            previousTeamName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transfer_fee_gbp")
            @ExcludeMissing
            transferFeeGbp: JsonField<String> = JsonMissing.of(),
            @JsonProperty("years_with_previous_team")
            @ExcludeMissing
            yearsWithPreviousTeam: JsonField<Long> = JsonMissing.of(),
        ) : this(
            characterId,
            characterName,
            memberType,
            teamId,
            teamMemberId,
            teamName,
            tedReaction,
            transferType,
            previousTeamId,
            previousTeamName,
            transferFeeGbp,
            yearsWithPreviousTeam,
            mutableMapOf(),
        )

        /**
         * ID of the character (links to /characters)
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun characterId(): String = characterId.getRequired("character_id")

        /**
         * Name of the character
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun characterName(): String = characterName.getRequired("character_name")

        /**
         * Type of team member
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun memberType(): MemberType = memberType.getRequired("member_type")

        /**
         * ID of the team involved
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun teamId(): String = teamId.getRequired("team_id")

        /**
         * ID of the team member
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun teamMemberId(): String = teamMemberId.getRequired("team_member_id")

        /**
         * Name of the team involved
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun teamName(): String = teamName.getRequired("team_name")

        /**
         * Ted's reaction to the transfer
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tedReaction(): String = tedReaction.getRequired("ted_reaction")

        /**
         * Whether the member joined or departed
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transferType(): TransferType = transferType.getRequired("transfer_type")

        /**
         * Previous team ID (for joins from another team)
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previousTeamId(): Optional<String> = previousTeamId.getOptional("previous_team_id")

        /**
         * Previous team name (for joins from another team)
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previousTeamName(): Optional<String> =
            previousTeamName.getOptional("previous_team_name")

        /**
         * Transfer fee in GBP (for players)
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transferFeeGbp(): Optional<String> = transferFeeGbp.getOptional("transfer_fee_gbp")

        /**
         * Years spent with previous team
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun yearsWithPreviousTeam(): Optional<Long> =
            yearsWithPreviousTeam.getOptional("years_with_previous_team")

        /**
         * Returns the raw JSON value of [characterId].
         *
         * Unlike [characterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("character_id")
        @ExcludeMissing
        fun _characterId(): JsonField<String> = characterId

        /**
         * Returns the raw JSON value of [characterName].
         *
         * Unlike [characterName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("character_name")
        @ExcludeMissing
        fun _characterName(): JsonField<String> = characterName

        /**
         * Returns the raw JSON value of [memberType].
         *
         * Unlike [memberType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("member_type")
        @ExcludeMissing
        fun _memberType(): JsonField<MemberType> = memberType

        /**
         * Returns the raw JSON value of [teamId].
         *
         * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

        /**
         * Returns the raw JSON value of [teamMemberId].
         *
         * Unlike [teamMemberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("team_member_id")
        @ExcludeMissing
        fun _teamMemberId(): JsonField<String> = teamMemberId

        /**
         * Returns the raw JSON value of [teamName].
         *
         * Unlike [teamName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("team_name") @ExcludeMissing fun _teamName(): JsonField<String> = teamName

        /**
         * Returns the raw JSON value of [tedReaction].
         *
         * Unlike [tedReaction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ted_reaction")
        @ExcludeMissing
        fun _tedReaction(): JsonField<String> = tedReaction

        /**
         * Returns the raw JSON value of [transferType].
         *
         * Unlike [transferType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transfer_type")
        @ExcludeMissing
        fun _transferType(): JsonField<TransferType> = transferType

        /**
         * Returns the raw JSON value of [previousTeamId].
         *
         * Unlike [previousTeamId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("previous_team_id")
        @ExcludeMissing
        fun _previousTeamId(): JsonField<String> = previousTeamId

        /**
         * Returns the raw JSON value of [previousTeamName].
         *
         * Unlike [previousTeamName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("previous_team_name")
        @ExcludeMissing
        fun _previousTeamName(): JsonField<String> = previousTeamName

        /**
         * Returns the raw JSON value of [transferFeeGbp].
         *
         * Unlike [transferFeeGbp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transfer_fee_gbp")
        @ExcludeMissing
        fun _transferFeeGbp(): JsonField<String> = transferFeeGbp

        /**
         * Returns the raw JSON value of [yearsWithPreviousTeam].
         *
         * Unlike [yearsWithPreviousTeam], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("years_with_previous_team")
        @ExcludeMissing
        fun _yearsWithPreviousTeam(): JsonField<Long> = yearsWithPreviousTeam

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .characterId()
             * .characterName()
             * .memberType()
             * .teamId()
             * .teamMemberId()
             * .teamName()
             * .tedReaction()
             * .transferType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var characterId: JsonField<String>? = null
            private var characterName: JsonField<String>? = null
            private var memberType: JsonField<MemberType>? = null
            private var teamId: JsonField<String>? = null
            private var teamMemberId: JsonField<String>? = null
            private var teamName: JsonField<String>? = null
            private var tedReaction: JsonField<String>? = null
            private var transferType: JsonField<TransferType>? = null
            private var previousTeamId: JsonField<String> = JsonMissing.of()
            private var previousTeamName: JsonField<String> = JsonMissing.of()
            private var transferFeeGbp: JsonField<String> = JsonMissing.of()
            private var yearsWithPreviousTeam: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                characterId = data.characterId
                characterName = data.characterName
                memberType = data.memberType
                teamId = data.teamId
                teamMemberId = data.teamMemberId
                teamName = data.teamName
                tedReaction = data.tedReaction
                transferType = data.transferType
                previousTeamId = data.previousTeamId
                previousTeamName = data.previousTeamName
                transferFeeGbp = data.transferFeeGbp
                yearsWithPreviousTeam = data.yearsWithPreviousTeam
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** ID of the character (links to /characters) */
            fun characterId(characterId: String) = characterId(JsonField.of(characterId))

            /**
             * Sets [Builder.characterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.characterId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun characterId(characterId: JsonField<String>) = apply {
                this.characterId = characterId
            }

            /** Name of the character */
            fun characterName(characterName: String) = characterName(JsonField.of(characterName))

            /**
             * Sets [Builder.characterName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.characterName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun characterName(characterName: JsonField<String>) = apply {
                this.characterName = characterName
            }

            /** Type of team member */
            fun memberType(memberType: MemberType) = memberType(JsonField.of(memberType))

            /**
             * Sets [Builder.memberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memberType] with a well-typed [MemberType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memberType(memberType: JsonField<MemberType>) = apply {
                this.memberType = memberType
            }

            /** ID of the team involved */
            fun teamId(teamId: String) = teamId(JsonField.of(teamId))

            /**
             * Sets [Builder.teamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

            /** ID of the team member */
            fun teamMemberId(teamMemberId: String) = teamMemberId(JsonField.of(teamMemberId))

            /**
             * Sets [Builder.teamMemberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamMemberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamMemberId(teamMemberId: JsonField<String>) = apply {
                this.teamMemberId = teamMemberId
            }

            /** Name of the team involved */
            fun teamName(teamName: String) = teamName(JsonField.of(teamName))

            /**
             * Sets [Builder.teamName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teamName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teamName(teamName: JsonField<String>) = apply { this.teamName = teamName }

            /** Ted's reaction to the transfer */
            fun tedReaction(tedReaction: String) = tedReaction(JsonField.of(tedReaction))

            /**
             * Sets [Builder.tedReaction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tedReaction] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tedReaction(tedReaction: JsonField<String>) = apply {
                this.tedReaction = tedReaction
            }

            /** Whether the member joined or departed */
            fun transferType(transferType: TransferType) = transferType(JsonField.of(transferType))

            /**
             * Sets [Builder.transferType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferType] with a well-typed [TransferType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transferType(transferType: JsonField<TransferType>) = apply {
                this.transferType = transferType
            }

            /** Previous team ID (for joins from another team) */
            fun previousTeamId(previousTeamId: String?) =
                previousTeamId(JsonField.ofNullable(previousTeamId))

            /** Alias for calling [Builder.previousTeamId] with `previousTeamId.orElse(null)`. */
            fun previousTeamId(previousTeamId: Optional<String>) =
                previousTeamId(previousTeamId.getOrNull())

            /**
             * Sets [Builder.previousTeamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previousTeamId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previousTeamId(previousTeamId: JsonField<String>) = apply {
                this.previousTeamId = previousTeamId
            }

            /** Previous team name (for joins from another team) */
            fun previousTeamName(previousTeamName: String?) =
                previousTeamName(JsonField.ofNullable(previousTeamName))

            /**
             * Alias for calling [Builder.previousTeamName] with `previousTeamName.orElse(null)`.
             */
            fun previousTeamName(previousTeamName: Optional<String>) =
                previousTeamName(previousTeamName.getOrNull())

            /**
             * Sets [Builder.previousTeamName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previousTeamName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previousTeamName(previousTeamName: JsonField<String>) = apply {
                this.previousTeamName = previousTeamName
            }

            /** Transfer fee in GBP (for players) */
            fun transferFeeGbp(transferFeeGbp: String?) =
                transferFeeGbp(JsonField.ofNullable(transferFeeGbp))

            /** Alias for calling [Builder.transferFeeGbp] with `transferFeeGbp.orElse(null)`. */
            fun transferFeeGbp(transferFeeGbp: Optional<String>) =
                transferFeeGbp(transferFeeGbp.getOrNull())

            /**
             * Sets [Builder.transferFeeGbp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferFeeGbp] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transferFeeGbp(transferFeeGbp: JsonField<String>) = apply {
                this.transferFeeGbp = transferFeeGbp
            }

            /** Years spent with previous team */
            fun yearsWithPreviousTeam(yearsWithPreviousTeam: Long?) =
                yearsWithPreviousTeam(JsonField.ofNullable(yearsWithPreviousTeam))

            /**
             * Alias for [Builder.yearsWithPreviousTeam].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun yearsWithPreviousTeam(yearsWithPreviousTeam: Long) =
                yearsWithPreviousTeam(yearsWithPreviousTeam as Long?)

            /**
             * Alias for calling [Builder.yearsWithPreviousTeam] with
             * `yearsWithPreviousTeam.orElse(null)`.
             */
            fun yearsWithPreviousTeam(yearsWithPreviousTeam: Optional<Long>) =
                yearsWithPreviousTeam(yearsWithPreviousTeam.getOrNull())

            /**
             * Sets [Builder.yearsWithPreviousTeam] to an arbitrary JSON value.
             *
             * You should usually call [Builder.yearsWithPreviousTeam] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun yearsWithPreviousTeam(yearsWithPreviousTeam: JsonField<Long>) = apply {
                this.yearsWithPreviousTeam = yearsWithPreviousTeam
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .characterId()
             * .characterName()
             * .memberType()
             * .teamId()
             * .teamMemberId()
             * .teamName()
             * .tedReaction()
             * .transferType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("characterId", characterId),
                    checkRequired("characterName", characterName),
                    checkRequired("memberType", memberType),
                    checkRequired("teamId", teamId),
                    checkRequired("teamMemberId", teamMemberId),
                    checkRequired("teamName", teamName),
                    checkRequired("tedReaction", tedReaction),
                    checkRequired("transferType", transferType),
                    previousTeamId,
                    previousTeamName,
                    transferFeeGbp,
                    yearsWithPreviousTeam,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            characterId()
            characterName()
            memberType().validate()
            teamId()
            teamMemberId()
            teamName()
            tedReaction()
            transferType().validate()
            previousTeamId()
            previousTeamName()
            transferFeeGbp()
            yearsWithPreviousTeam()
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
                (if (characterName.asKnown().isPresent) 1 else 0) +
                (memberType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (teamId.asKnown().isPresent) 1 else 0) +
                (if (teamMemberId.asKnown().isPresent) 1 else 0) +
                (if (teamName.asKnown().isPresent) 1 else 0) +
                (if (tedReaction.asKnown().isPresent) 1 else 0) +
                (transferType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (previousTeamId.asKnown().isPresent) 1 else 0) +
                (if (previousTeamName.asKnown().isPresent) 1 else 0) +
                (if (transferFeeGbp.asKnown().isPresent) 1 else 0) +
                (if (yearsWithPreviousTeam.asKnown().isPresent) 1 else 0)

        /** Type of team member */
        class MemberType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PLAYER = of("player")

                @JvmField val COACH = of("coach")

                @JvmField val MEDICAL_STAFF = of("medical_staff")

                @JvmField val EQUIPMENT_MANAGER = of("equipment_manager")

                @JvmStatic fun of(value: String) = MemberType(JsonField.of(value))
            }

            /** An enum containing [MemberType]'s known values. */
            enum class Known {
                PLAYER,
                COACH,
                MEDICAL_STAFF,
                EQUIPMENT_MANAGER,
            }

            /**
             * An enum containing [MemberType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [MemberType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PLAYER,
                COACH,
                MEDICAL_STAFF,
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PLAYER -> Value.PLAYER
                    COACH -> Value.COACH
                    MEDICAL_STAFF -> Value.MEDICAL_STAFF
                    EQUIPMENT_MANAGER -> Value.EQUIPMENT_MANAGER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BelieveInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PLAYER -> Known.PLAYER
                    COACH -> Known.COACH
                    MEDICAL_STAFF -> Known.MEDICAL_STAFF
                    EQUIPMENT_MANAGER -> Known.EQUIPMENT_MANAGER
                    else -> throw BelieveInvalidDataException("Unknown MemberType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BelieveInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
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

        /** Whether the member joined or departed */
        class TransferType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val JOINED = of("joined")

                @JvmField val DEPARTED = of("departed")

                @JvmStatic fun of(value: String) = TransferType(JsonField.of(value))
            }

            /** An enum containing [TransferType]'s known values. */
            enum class Known {
                JOINED,
                DEPARTED,
            }

            /**
             * An enum containing [TransferType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TransferType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                JOINED,
                DEPARTED,
                /**
                 * An enum member indicating that [TransferType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    JOINED -> Value.JOINED
                    DEPARTED -> Value.DEPARTED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BelieveInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    JOINED -> Known.JOINED
                    DEPARTED -> Known.DEPARTED
                    else -> throw BelieveInvalidDataException("Unknown TransferType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BelieveInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BelieveInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): TransferType = apply {
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

                return other is TransferType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                characterId == other.characterId &&
                characterName == other.characterName &&
                memberType == other.memberType &&
                teamId == other.teamId &&
                teamMemberId == other.teamMemberId &&
                teamName == other.teamName &&
                tedReaction == other.tedReaction &&
                transferType == other.transferType &&
                previousTeamId == other.previousTeamId &&
                previousTeamName == other.previousTeamName &&
                transferFeeGbp == other.transferFeeGbp &&
                yearsWithPreviousTeam == other.yearsWithPreviousTeam &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                characterId,
                characterName,
                memberType,
                teamId,
                teamMemberId,
                teamName,
                tedReaction,
                transferType,
                previousTeamId,
                previousTeamName,
                transferFeeGbp,
                yearsWithPreviousTeam,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{characterId=$characterId, characterName=$characterName, memberType=$memberType, teamId=$teamId, teamMemberId=$teamMemberId, teamName=$teamName, tedReaction=$tedReaction, transferType=$transferType, previousTeamId=$previousTeamId, previousTeamName=$previousTeamName, transferFeeGbp=$transferFeeGbp, yearsWithPreviousTeam=$yearsWithPreviousTeam, additionalProperties=$additionalProperties}"
    }

    /** The type of webhook event */
    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TEAM_MEMBER_TRANSFERRED = of("team_member.transferred")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            TEAM_MEMBER_TRANSFERRED
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TEAM_MEMBER_TRANSFERRED,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
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
                TEAM_MEMBER_TRANSFERRED -> Value.TEAM_MEMBER_TRANSFERRED
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
                TEAM_MEMBER_TRANSFERRED -> Known.TEAM_MEMBER_TRANSFERRED
                else -> throw BelieveInvalidDataException("Unknown EventType: $value")
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

        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamMemberTransferredWebhookEvent &&
            createdAt == other.createdAt &&
            data == other.data &&
            eventId == other.eventId &&
            eventType == other.eventType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(createdAt, data, eventId, eventType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TeamMemberTransferredWebhookEvent{createdAt=$createdAt, data=$data, eventId=$eventId, eventType=$eventType, additionalProperties=$additionalProperties}"
}
