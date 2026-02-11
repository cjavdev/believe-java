// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

import com.believe.api.core.BaseDeserializer
import com.believe.api.core.BaseSerializer
import com.believe.api.core.Enum
import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.Params
import com.believe.api.core.checkRequired
import com.believe.api.core.getOrThrow
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Trigger a webhook event and deliver it to all subscribed endpoints.
 *
 * This endpoint is useful for testing your webhook integration. It will:
 * 1. Generate an event with the specified type and payload
 * 2. Find all webhooks subscribed to that event type
 * 3. Send a POST request to each webhook URL with signature headers
 * 4. Return the delivery results
 *
 * ## Event Payload
 *
 * You can provide a custom payload, or leave it empty to use a sample payload.
 *
 * ## Webhook Signature Headers
 *
 * Each webhook delivery includes:
 * - `webhook-id` - Unique event identifier (e.g., `evt_abc123...`)
 * - `webhook-timestamp` - Unix timestamp
 * - `webhook-signature` - HMAC-SHA256 signature (`v1,{base64}`)
 *
 * To verify signatures, compute:
 * ```
 * signature = HMAC-SHA256(
 *     key = base64_decode(secret_without_prefix),
 *     message = "{timestamp}.{raw_json_payload}"
 * )
 * ```
 */
class WebhookTriggerEventParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The type of event to trigger
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = body.eventType()

    /**
     * Optional event payload. If not provided, a sample payload will be generated.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payload(): Optional<Payload> = body.payload()

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _eventType(): JsonField<EventType> = body._eventType()

    /**
     * Returns the raw JSON value of [payload].
     *
     * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _payload(): JsonField<Payload> = body._payload()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookTriggerEventParams].
         *
         * The following fields are required:
         * ```java
         * .eventType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookTriggerEventParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(webhookTriggerEventParams: WebhookTriggerEventParams) = apply {
            body = webhookTriggerEventParams.body.toBuilder()
            additionalHeaders = webhookTriggerEventParams.additionalHeaders.toBuilder()
            additionalQueryParams = webhookTriggerEventParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [eventType]
         * - [payload]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The type of event to trigger */
        fun eventType(eventType: EventType) = apply { body.eventType(eventType) }

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { body.eventType(eventType) }

        /** Optional event payload. If not provided, a sample payload will be generated. */
        fun payload(payload: Payload?) = apply { body.payload(payload) }

        /** Alias for calling [Builder.payload] with `payload.orElse(null)`. */
        fun payload(payload: Optional<Payload>) = payload(payload.getOrNull())

        /**
         * Sets [Builder.payload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payload] with a well-typed [Payload] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payload(payload: JsonField<Payload>) = apply { body.payload(payload) }

        /** Alias for calling [payload] with `Payload.ofMatchCompleted(matchCompleted)`. */
        fun payload(matchCompleted: Payload.MatchCompleted) = apply { body.payload(matchCompleted) }

        /**
         * Alias for calling [payload] with the following:
         * ```java
         * Payload.MatchCompleted.builder()
         *     .eventType(WebhookTriggerEventParams.Payload.MatchCompleted.EventType.MATCH_COMPLETED)
         *     .data(data)
         *     .build()
         * ```
         */
        fun matchCompletedPayload(data: Payload.MatchCompleted.Data) = apply {
            body.matchCompletedPayload(data)
        }

        /**
         * Alias for calling [payload] with
         * `Payload.ofTeamMemberTransferred(teamMemberTransferred)`.
         */
        fun payload(teamMemberTransferred: Payload.TeamMemberTransferred) = apply {
            body.payload(teamMemberTransferred)
        }

        /**
         * Alias for calling [payload] with the following:
         * ```java
         * Payload.TeamMemberTransferred.builder()
         *     .eventType(WebhookTriggerEventParams.Payload.TeamMemberTransferred.EventType.TEAM_MEMBER_TRANSFERRED)
         *     .data(data)
         *     .build()
         * ```
         */
        fun teamMemberTransferredPayload(data: Payload.TeamMemberTransferred.Data) = apply {
            body.teamMemberTransferredPayload(data)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [WebhookTriggerEventParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookTriggerEventParams =
            WebhookTriggerEventParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request to trigger a webhook event. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val eventType: JsonField<EventType>,
        private val payload: JsonField<Payload>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<EventType> = JsonMissing.of(),
            @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
        ) : this(eventType, payload, mutableMapOf())

        /**
         * The type of event to trigger
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun eventType(): EventType = eventType.getRequired("event_type")

        /**
         * Optional event payload. If not provided, a sample payload will be generated.
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun payload(): Optional<Payload> = payload.getOptional("payload")

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<EventType> = eventType

        /**
         * Returns the raw JSON value of [payload].
         *
         * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .eventType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var eventType: JsonField<EventType>? = null
            private var payload: JsonField<Payload> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                eventType = body.eventType
                payload = body.payload
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The type of event to trigger */
            fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [EventType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

            /** Optional event payload. If not provided, a sample payload will be generated. */
            fun payload(payload: Payload?) = payload(JsonField.ofNullable(payload))

            /** Alias for calling [Builder.payload] with `payload.orElse(null)`. */
            fun payload(payload: Optional<Payload>) = payload(payload.getOrNull())

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [Payload] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

            /** Alias for calling [payload] with `Payload.ofMatchCompleted(matchCompleted)`. */
            fun payload(matchCompleted: Payload.MatchCompleted) =
                payload(Payload.ofMatchCompleted(matchCompleted))

            /**
             * Alias for calling [payload] with the following:
             * ```java
             * Payload.MatchCompleted.builder()
             *     .eventType(WebhookTriggerEventParams.Payload.MatchCompleted.EventType.MATCH_COMPLETED)
             *     .data(data)
             *     .build()
             * ```
             */
            fun matchCompletedPayload(data: Payload.MatchCompleted.Data) =
                payload(
                    Payload.MatchCompleted.builder()
                        .eventType(
                            WebhookTriggerEventParams.Payload.MatchCompleted.EventType
                                .MATCH_COMPLETED
                        )
                        .data(data)
                        .build()
                )

            /**
             * Alias for calling [payload] with
             * `Payload.ofTeamMemberTransferred(teamMemberTransferred)`.
             */
            fun payload(teamMemberTransferred: Payload.TeamMemberTransferred) =
                payload(Payload.ofTeamMemberTransferred(teamMemberTransferred))

            /**
             * Alias for calling [payload] with the following:
             * ```java
             * Payload.TeamMemberTransferred.builder()
             *     .eventType(WebhookTriggerEventParams.Payload.TeamMemberTransferred.EventType.TEAM_MEMBER_TRANSFERRED)
             *     .data(data)
             *     .build()
             * ```
             */
            fun teamMemberTransferredPayload(data: Payload.TeamMemberTransferred.Data) =
                payload(
                    Payload.TeamMemberTransferred.builder()
                        .eventType(
                            WebhookTriggerEventParams.Payload.TeamMemberTransferred.EventType
                                .TEAM_MEMBER_TRANSFERRED
                        )
                        .data(data)
                        .build()
                )

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .eventType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("eventType", eventType),
                    payload,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            eventType().validate()
            payload().ifPresent { it.validate() }
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
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
                (payload.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                eventType == other.eventType &&
                payload == other.payload &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(eventType, payload, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{eventType=$eventType, payload=$payload, additionalProperties=$additionalProperties}"
    }

    /** The type of event to trigger */
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

            @JvmField val TEAM_MEMBER_TRANSFERRED = of("team_member.transferred")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            MATCH_COMPLETED,
            TEAM_MEMBER_TRANSFERRED,
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
                MATCH_COMPLETED -> Value.MATCH_COMPLETED
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
                MATCH_COMPLETED -> Known.MATCH_COMPLETED
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

    /** Optional event payload. If not provided, a sample payload will be generated. */
    @JsonDeserialize(using = Payload.Deserializer::class)
    @JsonSerialize(using = Payload.Serializer::class)
    class Payload
    private constructor(
        private val matchCompleted: MatchCompleted? = null,
        private val teamMemberTransferred: TeamMemberTransferred? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Payload for match.completed event. */
        fun matchCompleted(): Optional<MatchCompleted> = Optional.ofNullable(matchCompleted)

        /** Payload for team_member.transferred event. */
        fun teamMemberTransferred(): Optional<TeamMemberTransferred> =
            Optional.ofNullable(teamMemberTransferred)

        fun isMatchCompleted(): Boolean = matchCompleted != null

        fun isTeamMemberTransferred(): Boolean = teamMemberTransferred != null

        /** Payload for match.completed event. */
        fun asMatchCompleted(): MatchCompleted = matchCompleted.getOrThrow("matchCompleted")

        /** Payload for team_member.transferred event. */
        fun asTeamMemberTransferred(): TeamMemberTransferred =
            teamMemberTransferred.getOrThrow("teamMemberTransferred")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                matchCompleted != null -> visitor.visitMatchCompleted(matchCompleted)
                teamMemberTransferred != null ->
                    visitor.visitTeamMemberTransferred(teamMemberTransferred)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Payload = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitMatchCompleted(matchCompleted: MatchCompleted) {
                        matchCompleted.validate()
                    }

                    override fun visitTeamMemberTransferred(
                        teamMemberTransferred: TeamMemberTransferred
                    ) {
                        teamMemberTransferred.validate()
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
                    override fun visitMatchCompleted(matchCompleted: MatchCompleted) =
                        matchCompleted.validity()

                    override fun visitTeamMemberTransferred(
                        teamMemberTransferred: TeamMemberTransferred
                    ) = teamMemberTransferred.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payload &&
                matchCompleted == other.matchCompleted &&
                teamMemberTransferred == other.teamMemberTransferred
        }

        override fun hashCode(): Int = Objects.hash(matchCompleted, teamMemberTransferred)

        override fun toString(): String =
            when {
                matchCompleted != null -> "Payload{matchCompleted=$matchCompleted}"
                teamMemberTransferred != null ->
                    "Payload{teamMemberTransferred=$teamMemberTransferred}"
                _json != null -> "Payload{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Payload")
            }

        companion object {

            /** Payload for match.completed event. */
            @JvmStatic
            fun ofMatchCompleted(matchCompleted: MatchCompleted) =
                Payload(matchCompleted = matchCompleted)

            /** Payload for team_member.transferred event. */
            @JvmStatic
            fun ofTeamMemberTransferred(teamMemberTransferred: TeamMemberTransferred) =
                Payload(teamMemberTransferred = teamMemberTransferred)
        }

        /**
         * An interface that defines how to map each variant of [Payload] to a value of type [T].
         */
        interface Visitor<out T> {

            /** Payload for match.completed event. */
            fun visitMatchCompleted(matchCompleted: MatchCompleted): T

            /** Payload for team_member.transferred event. */
            fun visitTeamMemberTransferred(teamMemberTransferred: TeamMemberTransferred): T

            /**
             * Maps an unknown variant of [Payload] to a value of type [T].
             *
             * An instance of [Payload] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws BelieveInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BelieveInvalidDataException("Unknown Payload: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Payload>(Payload::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Payload {
                val json = JsonValue.fromJsonNode(node)
                val eventType =
                    json.asObject().getOrNull()?.get("event_type")?.asString()?.getOrNull()

                when (eventType) {
                    "match.completed" -> {
                        return tryDeserialize(node, jacksonTypeRef<MatchCompleted>())?.let {
                            Payload(matchCompleted = it, _json = json)
                        } ?: Payload(_json = json)
                    }
                    "team_member.transferred" -> {
                        return tryDeserialize(node, jacksonTypeRef<TeamMemberTransferred>())?.let {
                            Payload(teamMemberTransferred = it, _json = json)
                        } ?: Payload(_json = json)
                    }
                }

                return Payload(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Payload>(Payload::class) {

            override fun serialize(
                value: Payload,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.matchCompleted != null -> generator.writeObject(value.matchCompleted)
                    value.teamMemberTransferred != null ->
                        generator.writeObject(value.teamMemberTransferred)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Payload")
                }
            }
        }

        /** Payload for match.completed event. */
        class MatchCompleted
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val data: JsonField<Data>,
            private val eventType: JsonField<EventType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
                @JsonProperty("event_type")
                @ExcludeMissing
                eventType: JsonField<EventType> = JsonMissing.of(),
            ) : this(data, eventType, mutableMapOf())

            /**
             * Event data
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun data(): Data = data.getRequired("data")

            /**
             * The type of webhook event
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

            /**
             * Returns the raw JSON value of [data].
             *
             * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

            /**
             * Returns the raw JSON value of [eventType].
             *
             * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("event_type")
            @ExcludeMissing
            fun _eventType(): JsonField<EventType> = eventType

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
                 * Returns a mutable builder for constructing an instance of [MatchCompleted].
                 *
                 * The following fields are required:
                 * ```java
                 * .data()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MatchCompleted]. */
            class Builder internal constructor() {

                private var data: JsonField<Data>? = null
                private var eventType: JsonField<EventType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(matchCompleted: MatchCompleted) = apply {
                    data = matchCompleted.data
                    eventType = matchCompleted.eventType
                    additionalProperties = matchCompleted.additionalProperties.toMutableMap()
                }

                /** Event data */
                fun data(data: Data) = data(JsonField.of(data))

                /**
                 * Sets [Builder.data] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.data] with a well-typed [Data] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun data(data: JsonField<Data>) = apply { this.data = data }

                /** The type of webhook event */
                fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                /**
                 * Sets [Builder.eventType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventType] with a well-typed [EventType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventType(eventType: JsonField<EventType>) = apply {
                    this.eventType = eventType
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
                 * Returns an immutable instance of [MatchCompleted].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .data()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MatchCompleted =
                    MatchCompleted(
                        checkRequired("data", data),
                        eventType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MatchCompleted = apply {
                if (validated) {
                    return@apply
                }

                data().validate()
                eventType().ifPresent { it.validate() }
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
                (data.asKnown().getOrNull()?.validity() ?: 0) +
                    (eventType.asKnown().getOrNull()?.validity() ?: 0)

            /** Event data */
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
                    @JsonProperty("match_id")
                    @ExcludeMissing
                    matchId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("match_type")
                    @ExcludeMissing
                    matchType: JsonField<MatchType> = JsonMissing.of(),
                    @JsonProperty("result")
                    @ExcludeMissing
                    result: JsonField<Result> = JsonMissing.of(),
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
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun awayScore(): Long = awayScore.getRequired("away_score")

                /**
                 * Away team ID
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun awayTeamId(): String = awayTeamId.getRequired("away_team_id")

                /**
                 * When the match completed
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun completedAt(): OffsetDateTime = completedAt.getRequired("completed_at")

                /**
                 * Final home team score
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun homeScore(): Long = homeScore.getRequired("home_score")

                /**
                 * Home team ID
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun homeTeamId(): String = homeTeamId.getRequired("home_team_id")

                /**
                 * Unique match identifier
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun matchId(): String = matchId.getRequired("match_id")

                /**
                 * Type of match
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun matchType(): MatchType = matchType.getRequired("match_type")

                /**
                 * Match result from home team perspective
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun result(): Result = result.getRequired("result")

                /**
                 * Ted's post-match wisdom
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tedPostMatchQuote(): String =
                    tedPostMatchQuote.getRequired("ted_post_match_quote")

                /**
                 * Ted's lesson from the match
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun lessonLearned(): Optional<String> = lessonLearned.getOptional("lesson_learned")

                /**
                 * Player of the match (if awarded)
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun manOfTheMatch(): Optional<String> =
                    manOfTheMatch.getOptional("man_of_the_match")

                /**
                 * Returns the raw JSON value of [awayScore].
                 *
                 * Unlike [awayScore], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("away_score")
                @ExcludeMissing
                fun _awayScore(): JsonField<Long> = awayScore

                /**
                 * Returns the raw JSON value of [awayTeamId].
                 *
                 * Unlike [awayTeamId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("away_team_id")
                @ExcludeMissing
                fun _awayTeamId(): JsonField<String> = awayTeamId

                /**
                 * Returns the raw JSON value of [completedAt].
                 *
                 * Unlike [completedAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("completed_at")
                @ExcludeMissing
                fun _completedAt(): JsonField<OffsetDateTime> = completedAt

                /**
                 * Returns the raw JSON value of [homeScore].
                 *
                 * Unlike [homeScore], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("home_score")
                @ExcludeMissing
                fun _homeScore(): JsonField<Long> = homeScore

                /**
                 * Returns the raw JSON value of [homeTeamId].
                 *
                 * Unlike [homeTeamId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("home_team_id")
                @ExcludeMissing
                fun _homeTeamId(): JsonField<String> = homeTeamId

                /**
                 * Returns the raw JSON value of [matchId].
                 *
                 * Unlike [matchId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("match_id")
                @ExcludeMissing
                fun _matchId(): JsonField<String> = matchId

                /**
                 * Returns the raw JSON value of [matchType].
                 *
                 * Unlike [matchType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("match_type")
                @ExcludeMissing
                fun _matchType(): JsonField<MatchType> = matchType

                /**
                 * Returns the raw JSON value of [result].
                 *
                 * Unlike [result], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

                /**
                 * Returns the raw JSON value of [tedPostMatchQuote].
                 *
                 * Unlike [tedPostMatchQuote], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ted_post_match_quote")
                @ExcludeMissing
                fun _tedPostMatchQuote(): JsonField<String> = tedPostMatchQuote

                /**
                 * Returns the raw JSON value of [lessonLearned].
                 *
                 * Unlike [lessonLearned], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("lesson_learned")
                @ExcludeMissing
                fun _lessonLearned(): JsonField<String> = lessonLearned

                /**
                 * Returns the raw JSON value of [manOfTheMatch].
                 *
                 * Unlike [manOfTheMatch], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                     * You should usually call [Builder.awayScore] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun awayScore(awayScore: JsonField<Long>) = apply { this.awayScore = awayScore }

                    /** Away team ID */
                    fun awayTeamId(awayTeamId: String) = awayTeamId(JsonField.of(awayTeamId))

                    /**
                     * Sets [Builder.awayTeamId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.awayTeamId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun awayTeamId(awayTeamId: JsonField<String>) = apply {
                        this.awayTeamId = awayTeamId
                    }

                    /** When the match completed */
                    fun completedAt(completedAt: OffsetDateTime) =
                        completedAt(JsonField.of(completedAt))

                    /**
                     * Sets [Builder.completedAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.completedAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                        this.completedAt = completedAt
                    }

                    /** Final home team score */
                    fun homeScore(homeScore: Long) = homeScore(JsonField.of(homeScore))

                    /**
                     * Sets [Builder.homeScore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.homeScore] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun homeScore(homeScore: JsonField<Long>) = apply { this.homeScore = homeScore }

                    /** Home team ID */
                    fun homeTeamId(homeTeamId: String) = homeTeamId(JsonField.of(homeTeamId))

                    /**
                     * Sets [Builder.homeTeamId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.homeTeamId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun homeTeamId(homeTeamId: JsonField<String>) = apply {
                        this.homeTeamId = homeTeamId
                    }

                    /** Unique match identifier */
                    fun matchId(matchId: String) = matchId(JsonField.of(matchId))

                    /**
                     * Sets [Builder.matchId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.matchId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun matchId(matchId: JsonField<String>) = apply { this.matchId = matchId }

                    /** Type of match */
                    fun matchType(matchType: MatchType) = matchType(JsonField.of(matchType))

                    /**
                     * Sets [Builder.matchType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.matchType] with a well-typed [MatchType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun matchType(matchType: JsonField<MatchType>) = apply {
                        this.matchType = matchType
                    }

                    /** Match result from home team perspective */
                    fun result(result: Result) = result(JsonField.of(result))

                    /**
                     * Sets [Builder.result] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.result] with a well-typed [Result] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun result(result: JsonField<Result>) = apply { this.result = result }

                    /** Ted's post-match wisdom */
                    fun tedPostMatchQuote(tedPostMatchQuote: String) =
                        tedPostMatchQuote(JsonField.of(tedPostMatchQuote))

                    /**
                     * Sets [Builder.tedPostMatchQuote] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tedPostMatchQuote] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun tedPostMatchQuote(tedPostMatchQuote: JsonField<String>) = apply {
                        this.tedPostMatchQuote = tedPostMatchQuote
                    }

                    /** Ted's lesson from the match */
                    fun lessonLearned(lessonLearned: String?) =
                        lessonLearned(JsonField.ofNullable(lessonLearned))

                    /**
                     * Alias for calling [Builder.lessonLearned] with `lessonLearned.orElse(null)`.
                     */
                    fun lessonLearned(lessonLearned: Optional<String>) =
                        lessonLearned(lessonLearned.getOrNull())

                    /**
                     * Sets [Builder.lessonLearned] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lessonLearned] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun lessonLearned(lessonLearned: JsonField<String>) = apply {
                        this.lessonLearned = lessonLearned
                    }

                    /** Player of the match (if awarded) */
                    fun manOfTheMatch(manOfTheMatch: String?) =
                        manOfTheMatch(JsonField.ofNullable(manOfTheMatch))

                    /**
                     * Alias for calling [Builder.manOfTheMatch] with `manOfTheMatch.orElse(null)`.
                     */
                    fun manOfTheMatch(manOfTheMatch: Optional<String>) =
                        manOfTheMatch(manOfTheMatch.getOrNull())

                    /**
                     * Sets [Builder.manOfTheMatch] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.manOfTheMatch] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                class MatchType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [MatchType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [MatchType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        LEAGUE,
                        CUP,
                        FRIENDLY,
                        PLAYOFF,
                        FINAL,
                        /**
                         * An enum member indicating that [MatchType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws BelieveInvalidDataException if this class instance's value is a not a
                     *   known member.
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
                     * @throws BelieveInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
                class Result
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        HOME_WIN,
                        AWAY_WIN,
                        DRAW,
                        /**
                         * An enum member indicating that [Result] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws BelieveInvalidDataException if this class instance's value is a not a
                     *   known member.
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
                     * @throws BelieveInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
            class EventType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MATCH_COMPLETED,
                    /**
                     * An enum member indicating that [EventType] was instantiated with an unknown
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
                        MATCH_COMPLETED -> Value.MATCH_COMPLETED
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
                        MATCH_COMPLETED -> Known.MATCH_COMPLETED
                        else -> throw BelieveInvalidDataException("Unknown EventType: $value")
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

                return other is MatchCompleted &&
                    data == other.data &&
                    eventType == other.eventType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(data, eventType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MatchCompleted{data=$data, eventType=$eventType, additionalProperties=$additionalProperties}"
        }

        /** Payload for team_member.transferred event. */
        class TeamMemberTransferred
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val data: JsonField<Data>,
            private val eventType: JsonField<EventType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
                @JsonProperty("event_type")
                @ExcludeMissing
                eventType: JsonField<EventType> = JsonMissing.of(),
            ) : this(data, eventType, mutableMapOf())

            /**
             * Event data
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun data(): Data = data.getRequired("data")

            /**
             * The type of webhook event
             *
             * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

            /**
             * Returns the raw JSON value of [data].
             *
             * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

            /**
             * Returns the raw JSON value of [eventType].
             *
             * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("event_type")
            @ExcludeMissing
            fun _eventType(): JsonField<EventType> = eventType

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
                 * [TeamMemberTransferred].
                 *
                 * The following fields are required:
                 * ```java
                 * .data()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TeamMemberTransferred]. */
            class Builder internal constructor() {

                private var data: JsonField<Data>? = null
                private var eventType: JsonField<EventType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(teamMemberTransferred: TeamMemberTransferred) = apply {
                    data = teamMemberTransferred.data
                    eventType = teamMemberTransferred.eventType
                    additionalProperties = teamMemberTransferred.additionalProperties.toMutableMap()
                }

                /** Event data */
                fun data(data: Data) = data(JsonField.of(data))

                /**
                 * Sets [Builder.data] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.data] with a well-typed [Data] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun data(data: JsonField<Data>) = apply { this.data = data }

                /** The type of webhook event */
                fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                /**
                 * Sets [Builder.eventType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventType] with a well-typed [EventType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventType(eventType: JsonField<EventType>) = apply {
                    this.eventType = eventType
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
                 * Returns an immutable instance of [TeamMemberTransferred].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .data()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TeamMemberTransferred =
                    TeamMemberTransferred(
                        checkRequired("data", data),
                        eventType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TeamMemberTransferred = apply {
                if (validated) {
                    return@apply
                }

                data().validate()
                eventType().ifPresent { it.validate() }
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
                (data.asKnown().getOrNull()?.validity() ?: 0) +
                    (eventType.asKnown().getOrNull()?.validity() ?: 0)

            /** Event data */
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
                    @JsonProperty("team_id")
                    @ExcludeMissing
                    teamId: JsonField<String> = JsonMissing.of(),
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
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun characterId(): String = characterId.getRequired("character_id")

                /**
                 * Name of the character
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun characterName(): String = characterName.getRequired("character_name")

                /**
                 * Type of team member
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun memberType(): MemberType = memberType.getRequired("member_type")

                /**
                 * ID of the team involved
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun teamId(): String = teamId.getRequired("team_id")

                /**
                 * ID of the team member
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun teamMemberId(): String = teamMemberId.getRequired("team_member_id")

                /**
                 * Name of the team involved
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun teamName(): String = teamName.getRequired("team_name")

                /**
                 * Ted's reaction to the transfer
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tedReaction(): String = tedReaction.getRequired("ted_reaction")

                /**
                 * Whether the member joined or departed
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun transferType(): TransferType = transferType.getRequired("transfer_type")

                /**
                 * Previous team ID (for joins from another team)
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun previousTeamId(): Optional<String> =
                    previousTeamId.getOptional("previous_team_id")

                /**
                 * Previous team name (for joins from another team)
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun previousTeamName(): Optional<String> =
                    previousTeamName.getOptional("previous_team_name")

                /**
                 * Transfer fee in GBP (for players)
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun transferFeeGbp(): Optional<String> =
                    transferFeeGbp.getOptional("transfer_fee_gbp")

                /**
                 * Years spent with previous team
                 *
                 * @throws BelieveInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun yearsWithPreviousTeam(): Optional<Long> =
                    yearsWithPreviousTeam.getOptional("years_with_previous_team")

                /**
                 * Returns the raw JSON value of [characterId].
                 *
                 * Unlike [characterId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("character_id")
                @ExcludeMissing
                fun _characterId(): JsonField<String> = characterId

                /**
                 * Returns the raw JSON value of [characterName].
                 *
                 * Unlike [characterName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("character_name")
                @ExcludeMissing
                fun _characterName(): JsonField<String> = characterName

                /**
                 * Returns the raw JSON value of [memberType].
                 *
                 * Unlike [memberType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("member_type")
                @ExcludeMissing
                fun _memberType(): JsonField<MemberType> = memberType

                /**
                 * Returns the raw JSON value of [teamId].
                 *
                 * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

                /**
                 * Returns the raw JSON value of [teamMemberId].
                 *
                 * Unlike [teamMemberId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("team_member_id")
                @ExcludeMissing
                fun _teamMemberId(): JsonField<String> = teamMemberId

                /**
                 * Returns the raw JSON value of [teamName].
                 *
                 * Unlike [teamName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("team_name")
                @ExcludeMissing
                fun _teamName(): JsonField<String> = teamName

                /**
                 * Returns the raw JSON value of [tedReaction].
                 *
                 * Unlike [tedReaction], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ted_reaction")
                @ExcludeMissing
                fun _tedReaction(): JsonField<String> = tedReaction

                /**
                 * Returns the raw JSON value of [transferType].
                 *
                 * Unlike [transferType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("transfer_type")
                @ExcludeMissing
                fun _transferType(): JsonField<TransferType> = transferType

                /**
                 * Returns the raw JSON value of [previousTeamId].
                 *
                 * Unlike [previousTeamId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("previous_team_id")
                @ExcludeMissing
                fun _previousTeamId(): JsonField<String> = previousTeamId

                /**
                 * Returns the raw JSON value of [previousTeamName].
                 *
                 * Unlike [previousTeamName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("previous_team_name")
                @ExcludeMissing
                fun _previousTeamName(): JsonField<String> = previousTeamName

                /**
                 * Returns the raw JSON value of [transferFeeGbp].
                 *
                 * Unlike [transferFeeGbp], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("transfer_fee_gbp")
                @ExcludeMissing
                fun _transferFeeGbp(): JsonField<String> = transferFeeGbp

                /**
                 * Returns the raw JSON value of [yearsWithPreviousTeam].
                 *
                 * Unlike [yearsWithPreviousTeam], this method doesn't throw if the JSON field has
                 * an unexpected type.
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
                     * You should usually call [Builder.characterId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun characterId(characterId: JsonField<String>) = apply {
                        this.characterId = characterId
                    }

                    /** Name of the character */
                    fun characterName(characterName: String) =
                        characterName(JsonField.of(characterName))

                    /**
                     * Sets [Builder.characterName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.characterName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun characterName(characterName: JsonField<String>) = apply {
                        this.characterName = characterName
                    }

                    /** Type of team member */
                    fun memberType(memberType: MemberType) = memberType(JsonField.of(memberType))

                    /**
                     * Sets [Builder.memberType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.memberType] with a well-typed [MemberType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun memberType(memberType: JsonField<MemberType>) = apply {
                        this.memberType = memberType
                    }

                    /** ID of the team involved */
                    fun teamId(teamId: String) = teamId(JsonField.of(teamId))

                    /**
                     * Sets [Builder.teamId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.teamId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

                    /** ID of the team member */
                    fun teamMemberId(teamMemberId: String) =
                        teamMemberId(JsonField.of(teamMemberId))

                    /**
                     * Sets [Builder.teamMemberId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.teamMemberId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun teamMemberId(teamMemberId: JsonField<String>) = apply {
                        this.teamMemberId = teamMemberId
                    }

                    /** Name of the team involved */
                    fun teamName(teamName: String) = teamName(JsonField.of(teamName))

                    /**
                     * Sets [Builder.teamName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.teamName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun teamName(teamName: JsonField<String>) = apply { this.teamName = teamName }

                    /** Ted's reaction to the transfer */
                    fun tedReaction(tedReaction: String) = tedReaction(JsonField.of(tedReaction))

                    /**
                     * Sets [Builder.tedReaction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tedReaction] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun tedReaction(tedReaction: JsonField<String>) = apply {
                        this.tedReaction = tedReaction
                    }

                    /** Whether the member joined or departed */
                    fun transferType(transferType: TransferType) =
                        transferType(JsonField.of(transferType))

                    /**
                     * Sets [Builder.transferType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.transferType] with a well-typed
                     * [TransferType] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun transferType(transferType: JsonField<TransferType>) = apply {
                        this.transferType = transferType
                    }

                    /** Previous team ID (for joins from another team) */
                    fun previousTeamId(previousTeamId: String?) =
                        previousTeamId(JsonField.ofNullable(previousTeamId))

                    /**
                     * Alias for calling [Builder.previousTeamId] with
                     * `previousTeamId.orElse(null)`.
                     */
                    fun previousTeamId(previousTeamId: Optional<String>) =
                        previousTeamId(previousTeamId.getOrNull())

                    /**
                     * Sets [Builder.previousTeamId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.previousTeamId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun previousTeamId(previousTeamId: JsonField<String>) = apply {
                        this.previousTeamId = previousTeamId
                    }

                    /** Previous team name (for joins from another team) */
                    fun previousTeamName(previousTeamName: String?) =
                        previousTeamName(JsonField.ofNullable(previousTeamName))

                    /**
                     * Alias for calling [Builder.previousTeamName] with
                     * `previousTeamName.orElse(null)`.
                     */
                    fun previousTeamName(previousTeamName: Optional<String>) =
                        previousTeamName(previousTeamName.getOrNull())

                    /**
                     * Sets [Builder.previousTeamName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.previousTeamName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun previousTeamName(previousTeamName: JsonField<String>) = apply {
                        this.previousTeamName = previousTeamName
                    }

                    /** Transfer fee in GBP (for players) */
                    fun transferFeeGbp(transferFeeGbp: String?) =
                        transferFeeGbp(JsonField.ofNullable(transferFeeGbp))

                    /**
                     * Alias for calling [Builder.transferFeeGbp] with
                     * `transferFeeGbp.orElse(null)`.
                     */
                    fun transferFeeGbp(transferFeeGbp: Optional<String>) =
                        transferFeeGbp(transferFeeGbp.getOrNull())

                    /**
                     * Sets [Builder.transferFeeGbp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.transferFeeGbp] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * You should usually call [Builder.yearsWithPreviousTeam] with a well-typed
                     * [Long] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                class MemberType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [MemberType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [MemberType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PLAYER,
                        COACH,
                        MEDICAL_STAFF,
                        EQUIPMENT_MANAGER,
                        /**
                         * An enum member indicating that [MemberType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws BelieveInvalidDataException if this class instance's value is a not a
                     *   known member.
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
                     * @throws BelieveInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
                class TransferType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [TransferType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [TransferType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        JOINED,
                        DEPARTED,
                        /**
                         * An enum member indicating that [TransferType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws BelieveInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            JOINED -> Known.JOINED
                            DEPARTED -> Known.DEPARTED
                            else ->
                                throw BelieveInvalidDataException("Unknown TransferType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws BelieveInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
            class EventType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TEAM_MEMBER_TRANSFERRED,
                    /**
                     * An enum member indicating that [EventType] was instantiated with an unknown
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
                        TEAM_MEMBER_TRANSFERRED -> Value.TEAM_MEMBER_TRANSFERRED
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
                        TEAM_MEMBER_TRANSFERRED -> Known.TEAM_MEMBER_TRANSFERRED
                        else -> throw BelieveInvalidDataException("Unknown EventType: $value")
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

                return other is TeamMemberTransferred &&
                    data == other.data &&
                    eventType == other.eventType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(data, eventType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TeamMemberTransferred{data=$data, eventType=$eventType, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookTriggerEventParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WebhookTriggerEventParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
