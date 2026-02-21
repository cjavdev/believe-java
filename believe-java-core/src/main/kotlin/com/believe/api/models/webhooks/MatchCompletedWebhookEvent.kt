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

/** Webhook event sent when a match completes. */
class MatchCompletedWebhookEvent
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
     * Data payload for a match completed event.
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
         * Returns a mutable builder for constructing an instance of [MatchCompletedWebhookEvent].
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

    /** A builder for [MatchCompletedWebhookEvent]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var data: JsonField<Data>? = null
        private var eventId: JsonField<String>? = null
        private var eventType: JsonField<EventType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(matchCompletedWebhookEvent: MatchCompletedWebhookEvent) = apply {
            createdAt = matchCompletedWebhookEvent.createdAt
            data = matchCompletedWebhookEvent.data
            eventId = matchCompletedWebhookEvent.eventId
            eventType = matchCompletedWebhookEvent.eventType
            additionalProperties = matchCompletedWebhookEvent.additionalProperties.toMutableMap()
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

        /** Data payload for a match completed event. */
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
         * Returns an immutable instance of [MatchCompletedWebhookEvent].
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
        fun build(): MatchCompletedWebhookEvent =
            MatchCompletedWebhookEvent(
                checkRequired("createdAt", createdAt),
                checkRequired("data", data),
                checkRequired("eventId", eventId),
                checkRequired("eventType", eventType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MatchCompletedWebhookEvent = apply {
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

    /** Data payload for a match completed event. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val awayScore: JsonField<Long>,
        private val awayTeamId: JsonField<String>,
        private val completedAt: JsonField<OffsetDateTime>,
        private val homeScore: JsonField<Long>,
        private val homeTeamId: JsonField<String>,
        private val matchId: JsonField<String>,
        private val matchType: JsonField<MatchType>,
        private val result: JsonField<Result>,
        private val tedPostMatchQuote: JsonField<String>,
        private val lessonLearned: JsonField<String>,
        private val manOfTheMatch: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("away_score")
            @ExcludeMissing
            awayScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("away_team_id")
            @ExcludeMissing
            awayTeamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("completed_at")
            @ExcludeMissing
            completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("home_score")
            @ExcludeMissing
            homeScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("home_team_id")
            @ExcludeMissing
            homeTeamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("match_id") @ExcludeMissing matchId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("match_type")
            @ExcludeMissing
            matchType: JsonField<MatchType> = JsonMissing.of(),
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
            @JsonProperty("ted_post_match_quote")
            @ExcludeMissing
            tedPostMatchQuote: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lesson_learned")
            @ExcludeMissing
            lessonLearned: JsonField<String> = JsonMissing.of(),
            @JsonProperty("man_of_the_match")
            @ExcludeMissing
            manOfTheMatch: JsonField<String> = JsonMissing.of(),
        ) : this(
            awayScore,
            awayTeamId,
            completedAt,
            homeScore,
            homeTeamId,
            matchId,
            matchType,
            result,
            tedPostMatchQuote,
            lessonLearned,
            manOfTheMatch,
            mutableMapOf(),
        )

        /**
         * Final away team score
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun awayScore(): Long = awayScore.getRequired("away_score")

        /**
         * Away team ID
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun awayTeamId(): String = awayTeamId.getRequired("away_team_id")

        /**
         * When the match completed
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun completedAt(): OffsetDateTime = completedAt.getRequired("completed_at")

        /**
         * Final home team score
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun homeScore(): Long = homeScore.getRequired("home_score")

        /**
         * Home team ID
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun homeTeamId(): String = homeTeamId.getRequired("home_team_id")

        /**
         * Unique match identifier
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun matchId(): String = matchId.getRequired("match_id")

        /**
         * Type of match
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun matchType(): MatchType = matchType.getRequired("match_type")

        /**
         * Match result from home team perspective
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): Result = result.getRequired("result")

        /**
         * Ted's post-match wisdom
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tedPostMatchQuote(): String = tedPostMatchQuote.getRequired("ted_post_match_quote")

        /**
         * Ted's lesson from the match
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lessonLearned(): Optional<String> = lessonLearned.getOptional("lesson_learned")

        /**
         * Player of the match (if awarded)
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun manOfTheMatch(): Optional<String> = manOfTheMatch.getOptional("man_of_the_match")

        /**
         * Returns the raw JSON value of [awayScore].
         *
         * Unlike [awayScore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("away_score") @ExcludeMissing fun _awayScore(): JsonField<Long> = awayScore

        /**
         * Returns the raw JSON value of [awayTeamId].
         *
         * Unlike [awayTeamId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("away_team_id")
        @ExcludeMissing
        fun _awayTeamId(): JsonField<String> = awayTeamId

        /**
         * Returns the raw JSON value of [completedAt].
         *
         * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completed_at")
        @ExcludeMissing
        fun _completedAt(): JsonField<OffsetDateTime> = completedAt

        /**
         * Returns the raw JSON value of [homeScore].
         *
         * Unlike [homeScore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("home_score") @ExcludeMissing fun _homeScore(): JsonField<Long> = homeScore

        /**
         * Returns the raw JSON value of [homeTeamId].
         *
         * Unlike [homeTeamId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("home_team_id")
        @ExcludeMissing
        fun _homeTeamId(): JsonField<String> = homeTeamId

        /**
         * Returns the raw JSON value of [matchId].
         *
         * Unlike [matchId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match_id") @ExcludeMissing fun _matchId(): JsonField<String> = matchId

        /**
         * Returns the raw JSON value of [matchType].
         *
         * Unlike [matchType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match_type")
        @ExcludeMissing
        fun _matchType(): JsonField<MatchType> = matchType

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        /**
         * Returns the raw JSON value of [tedPostMatchQuote].
         *
         * Unlike [tedPostMatchQuote], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ted_post_match_quote")
        @ExcludeMissing
        fun _tedPostMatchQuote(): JsonField<String> = tedPostMatchQuote

        /**
         * Returns the raw JSON value of [lessonLearned].
         *
         * Unlike [lessonLearned], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lesson_learned")
        @ExcludeMissing
        fun _lessonLearned(): JsonField<String> = lessonLearned

        /**
         * Returns the raw JSON value of [manOfTheMatch].
         *
         * Unlike [manOfTheMatch], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("man_of_the_match")
        @ExcludeMissing
        fun _manOfTheMatch(): JsonField<String> = manOfTheMatch

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
             * .awayScore()
             * .awayTeamId()
             * .completedAt()
             * .homeScore()
             * .homeTeamId()
             * .matchId()
             * .matchType()
             * .result()
             * .tedPostMatchQuote()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var awayScore: JsonField<Long>? = null
            private var awayTeamId: JsonField<String>? = null
            private var completedAt: JsonField<OffsetDateTime>? = null
            private var homeScore: JsonField<Long>? = null
            private var homeTeamId: JsonField<String>? = null
            private var matchId: JsonField<String>? = null
            private var matchType: JsonField<MatchType>? = null
            private var result: JsonField<Result>? = null
            private var tedPostMatchQuote: JsonField<String>? = null
            private var lessonLearned: JsonField<String> = JsonMissing.of()
            private var manOfTheMatch: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                awayScore = data.awayScore
                awayTeamId = data.awayTeamId
                completedAt = data.completedAt
                homeScore = data.homeScore
                homeTeamId = data.homeTeamId
                matchId = data.matchId
                matchType = data.matchType
                result = data.result
                tedPostMatchQuote = data.tedPostMatchQuote
                lessonLearned = data.lessonLearned
                manOfTheMatch = data.manOfTheMatch
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Final away team score */
            fun awayScore(awayScore: Long) = awayScore(JsonField.of(awayScore))

            /**
             * Sets [Builder.awayScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awayScore] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awayScore(awayScore: JsonField<Long>) = apply { this.awayScore = awayScore }

            /** Away team ID */
            fun awayTeamId(awayTeamId: String) = awayTeamId(JsonField.of(awayTeamId))

            /**
             * Sets [Builder.awayTeamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awayTeamId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awayTeamId(awayTeamId: JsonField<String>) = apply { this.awayTeamId = awayTeamId }

            /** When the match completed */
            fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

            /**
             * Sets [Builder.completedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                this.completedAt = completedAt
            }

            /** Final home team score */
            fun homeScore(homeScore: Long) = homeScore(JsonField.of(homeScore))

            /**
             * Sets [Builder.homeScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.homeScore] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun homeScore(homeScore: JsonField<Long>) = apply { this.homeScore = homeScore }

            /** Home team ID */
            fun homeTeamId(homeTeamId: String) = homeTeamId(JsonField.of(homeTeamId))

            /**
             * Sets [Builder.homeTeamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.homeTeamId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun homeTeamId(homeTeamId: JsonField<String>) = apply { this.homeTeamId = homeTeamId }

            /** Unique match identifier */
            fun matchId(matchId: String) = matchId(JsonField.of(matchId))

            /**
             * Sets [Builder.matchId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchId(matchId: JsonField<String>) = apply { this.matchId = matchId }

            /** Type of match */
            fun matchType(matchType: MatchType) = matchType(JsonField.of(matchType))

            /**
             * Sets [Builder.matchType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchType] with a well-typed [MatchType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchType(matchType: JsonField<MatchType>) = apply { this.matchType = matchType }

            /** Match result from home team perspective */
            fun result(result: Result) = result(JsonField.of(result))

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [Result] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** Ted's post-match wisdom */
            fun tedPostMatchQuote(tedPostMatchQuote: String) =
                tedPostMatchQuote(JsonField.of(tedPostMatchQuote))

            /**
             * Sets [Builder.tedPostMatchQuote] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tedPostMatchQuote] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tedPostMatchQuote(tedPostMatchQuote: JsonField<String>) = apply {
                this.tedPostMatchQuote = tedPostMatchQuote
            }

            /** Ted's lesson from the match */
            fun lessonLearned(lessonLearned: String?) =
                lessonLearned(JsonField.ofNullable(lessonLearned))

            /** Alias for calling [Builder.lessonLearned] with `lessonLearned.orElse(null)`. */
            fun lessonLearned(lessonLearned: Optional<String>) =
                lessonLearned(lessonLearned.getOrNull())

            /**
             * Sets [Builder.lessonLearned] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lessonLearned] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lessonLearned(lessonLearned: JsonField<String>) = apply {
                this.lessonLearned = lessonLearned
            }

            /** Player of the match (if awarded) */
            fun manOfTheMatch(manOfTheMatch: String?) =
                manOfTheMatch(JsonField.ofNullable(manOfTheMatch))

            /** Alias for calling [Builder.manOfTheMatch] with `manOfTheMatch.orElse(null)`. */
            fun manOfTheMatch(manOfTheMatch: Optional<String>) =
                manOfTheMatch(manOfTheMatch.getOrNull())

            /**
             * Sets [Builder.manOfTheMatch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.manOfTheMatch] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun manOfTheMatch(manOfTheMatch: JsonField<String>) = apply {
                this.manOfTheMatch = manOfTheMatch
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
             * .awayScore()
             * .awayTeamId()
             * .completedAt()
             * .homeScore()
             * .homeTeamId()
             * .matchId()
             * .matchType()
             * .result()
             * .tedPostMatchQuote()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("awayScore", awayScore),
                    checkRequired("awayTeamId", awayTeamId),
                    checkRequired("completedAt", completedAt),
                    checkRequired("homeScore", homeScore),
                    checkRequired("homeTeamId", homeTeamId),
                    checkRequired("matchId", matchId),
                    checkRequired("matchType", matchType),
                    checkRequired("result", result),
                    checkRequired("tedPostMatchQuote", tedPostMatchQuote),
                    lessonLearned,
                    manOfTheMatch,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            awayScore()
            awayTeamId()
            completedAt()
            homeScore()
            homeTeamId()
            matchId()
            matchType().validate()
            result().validate()
            tedPostMatchQuote()
            lessonLearned()
            manOfTheMatch()
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
            (if (awayScore.asKnown().isPresent) 1 else 0) +
                (if (awayTeamId.asKnown().isPresent) 1 else 0) +
                (if (completedAt.asKnown().isPresent) 1 else 0) +
                (if (homeScore.asKnown().isPresent) 1 else 0) +
                (if (homeTeamId.asKnown().isPresent) 1 else 0) +
                (if (matchId.asKnown().isPresent) 1 else 0) +
                (matchType.asKnown().getOrNull()?.validity() ?: 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tedPostMatchQuote.asKnown().isPresent) 1 else 0) +
                (if (lessonLearned.asKnown().isPresent) 1 else 0) +
                (if (manOfTheMatch.asKnown().isPresent) 1 else 0)

        /** Type of match */
        class MatchType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val LEAGUE = of("league")

                @JvmField val CUP = of("cup")

                @JvmField val FRIENDLY = of("friendly")

                @JvmField val PLAYOFF = of("playoff")

                @JvmField val FINAL = of("final")

                @JvmStatic fun of(value: String) = MatchType(JsonField.of(value))
            }

            /** An enum containing [MatchType]'s known values. */
            enum class Known {
                LEAGUE,
                CUP,
                FRIENDLY,
                PLAYOFF,
                FINAL,
            }

            /**
             * An enum containing [MatchType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [MatchType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LEAGUE,
                CUP,
                FRIENDLY,
                PLAYOFF,
                FINAL,
                /**
                 * An enum member indicating that [MatchType] was instantiated with an unknown
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
                    LEAGUE -> Value.LEAGUE
                    CUP -> Value.CUP
                    FRIENDLY -> Value.FRIENDLY
                    PLAYOFF -> Value.PLAYOFF
                    FINAL -> Value.FINAL
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
                    LEAGUE -> Known.LEAGUE
                    CUP -> Known.CUP
                    FRIENDLY -> Known.FRIENDLY
                    PLAYOFF -> Known.PLAYOFF
                    FINAL -> Known.FINAL
                    else -> throw BelieveInvalidDataException("Unknown MatchType: $value")
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

            fun validate(): MatchType = apply {
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

                return other is MatchType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Match result from home team perspective */
        class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val HOME_WIN = of("home_win")

                @JvmField val AWAY_WIN = of("away_win")

                @JvmField val DRAW = of("draw")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            /** An enum containing [Result]'s known values. */
            enum class Known {
                HOME_WIN,
                AWAY_WIN,
                DRAW,
            }

            /**
             * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Result] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HOME_WIN,
                AWAY_WIN,
                DRAW,
                /**
                 * An enum member indicating that [Result] was instantiated with an unknown value.
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
                    HOME_WIN -> Value.HOME_WIN
                    AWAY_WIN -> Value.AWAY_WIN
                    DRAW -> Value.DRAW
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
                    HOME_WIN -> Known.HOME_WIN
                    AWAY_WIN -> Known.AWAY_WIN
                    DRAW -> Known.DRAW
                    else -> throw BelieveInvalidDataException("Unknown Result: $value")
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

            fun validate(): Result = apply {
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

                return other is Result && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                awayScore == other.awayScore &&
                awayTeamId == other.awayTeamId &&
                completedAt == other.completedAt &&
                homeScore == other.homeScore &&
                homeTeamId == other.homeTeamId &&
                matchId == other.matchId &&
                matchType == other.matchType &&
                result == other.result &&
                tedPostMatchQuote == other.tedPostMatchQuote &&
                lessonLearned == other.lessonLearned &&
                manOfTheMatch == other.manOfTheMatch &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                awayScore,
                awayTeamId,
                completedAt,
                homeScore,
                homeTeamId,
                matchId,
                matchType,
                result,
                tedPostMatchQuote,
                lessonLearned,
                manOfTheMatch,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{awayScore=$awayScore, awayTeamId=$awayTeamId, completedAt=$completedAt, homeScore=$homeScore, homeTeamId=$homeTeamId, matchId=$matchId, matchType=$matchType, result=$result, tedPostMatchQuote=$tedPostMatchQuote, lessonLearned=$lessonLearned, manOfTheMatch=$manOfTheMatch, additionalProperties=$additionalProperties}"
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

            @JvmField val MATCH_COMPLETED = of("match.completed")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            MATCH_COMPLETED
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
            MATCH_COMPLETED,
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
                MATCH_COMPLETED -> Value.MATCH_COMPLETED
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
                MATCH_COMPLETED -> Known.MATCH_COMPLETED
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

        return other is MatchCompletedWebhookEvent &&
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
        "MatchCompletedWebhookEvent{createdAt=$createdAt, data=$data, eventId=$eventId, eventType=$eventType, additionalProperties=$additionalProperties}"
}
