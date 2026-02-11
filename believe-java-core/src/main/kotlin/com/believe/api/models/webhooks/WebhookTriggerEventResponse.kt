// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

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

/** Response after triggering webhook events. */
class WebhookTriggerEventResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deliveries: JsonField<List<Delivery>>,
    private val eventId: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val successfulDeliveries: JsonField<Long>,
    private val tedSays: JsonField<String>,
    private val totalWebhooks: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("deliveries")
        @ExcludeMissing
        deliveries: JsonField<List<Delivery>> = JsonMissing.of(),
        @JsonProperty("event_id") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("successful_deliveries")
        @ExcludeMissing
        successfulDeliveries: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ted_says") @ExcludeMissing tedSays: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_webhooks")
        @ExcludeMissing
        totalWebhooks: JsonField<Long> = JsonMissing.of(),
    ) : this(
        deliveries,
        eventId,
        eventType,
        successfulDeliveries,
        tedSays,
        totalWebhooks,
        mutableMapOf(),
    )

    /**
     * Results of webhook deliveries
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deliveries(): List<Delivery> = deliveries.getRequired("deliveries")

    /**
     * Unique event identifier
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventId(): String = eventId.getRequired("event_id")

    /**
     * The type of event triggered
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * Number of successful deliveries
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun successfulDeliveries(): Long = successfulDeliveries.getRequired("successful_deliveries")

    /**
     * Ted's reaction
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tedSays(): String = tedSays.getRequired("ted_says")

    /**
     * Total number of webhooks that received this event
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalWebhooks(): Long = totalWebhooks.getRequired("total_webhooks")

    /**
     * Returns the raw JSON value of [deliveries].
     *
     * Unlike [deliveries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deliveries")
    @ExcludeMissing
    fun _deliveries(): JsonField<List<Delivery>> = deliveries

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

    /**
     * Returns the raw JSON value of [successfulDeliveries].
     *
     * Unlike [successfulDeliveries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("successful_deliveries")
    @ExcludeMissing
    fun _successfulDeliveries(): JsonField<Long> = successfulDeliveries

    /**
     * Returns the raw JSON value of [tedSays].
     *
     * Unlike [tedSays], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ted_says") @ExcludeMissing fun _tedSays(): JsonField<String> = tedSays

    /**
     * Returns the raw JSON value of [totalWebhooks].
     *
     * Unlike [totalWebhooks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_webhooks")
    @ExcludeMissing
    fun _totalWebhooks(): JsonField<Long> = totalWebhooks

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
         * Returns a mutable builder for constructing an instance of [WebhookTriggerEventResponse].
         *
         * The following fields are required:
         * ```java
         * .deliveries()
         * .eventId()
         * .eventType()
         * .successfulDeliveries()
         * .tedSays()
         * .totalWebhooks()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookTriggerEventResponse]. */
    class Builder internal constructor() {

        private var deliveries: JsonField<MutableList<Delivery>>? = null
        private var eventId: JsonField<String>? = null
        private var eventType: JsonField<EventType>? = null
        private var successfulDeliveries: JsonField<Long>? = null
        private var tedSays: JsonField<String>? = null
        private var totalWebhooks: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookTriggerEventResponse: WebhookTriggerEventResponse) = apply {
            deliveries = webhookTriggerEventResponse.deliveries.map { it.toMutableList() }
            eventId = webhookTriggerEventResponse.eventId
            eventType = webhookTriggerEventResponse.eventType
            successfulDeliveries = webhookTriggerEventResponse.successfulDeliveries
            tedSays = webhookTriggerEventResponse.tedSays
            totalWebhooks = webhookTriggerEventResponse.totalWebhooks
            additionalProperties = webhookTriggerEventResponse.additionalProperties.toMutableMap()
        }

        /** Results of webhook deliveries */
        fun deliveries(deliveries: List<Delivery>) = deliveries(JsonField.of(deliveries))

        /**
         * Sets [Builder.deliveries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveries] with a well-typed `List<Delivery>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deliveries(deliveries: JsonField<List<Delivery>>) = apply {
            this.deliveries = deliveries.map { it.toMutableList() }
        }

        /**
         * Adds a single [Delivery] to [deliveries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDelivery(delivery: Delivery) = apply {
            deliveries =
                (deliveries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("deliveries", it).add(delivery)
                }
        }

        /** Unique event identifier */
        fun eventId(eventId: String) = eventId(JsonField.of(eventId))

        /**
         * Sets [Builder.eventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

        /** The type of event triggered */
        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        /** Number of successful deliveries */
        fun successfulDeliveries(successfulDeliveries: Long) =
            successfulDeliveries(JsonField.of(successfulDeliveries))

        /**
         * Sets [Builder.successfulDeliveries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.successfulDeliveries] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun successfulDeliveries(successfulDeliveries: JsonField<Long>) = apply {
            this.successfulDeliveries = successfulDeliveries
        }

        /** Ted's reaction */
        fun tedSays(tedSays: String) = tedSays(JsonField.of(tedSays))

        /**
         * Sets [Builder.tedSays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tedSays] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tedSays(tedSays: JsonField<String>) = apply { this.tedSays = tedSays }

        /** Total number of webhooks that received this event */
        fun totalWebhooks(totalWebhooks: Long) = totalWebhooks(JsonField.of(totalWebhooks))

        /**
         * Sets [Builder.totalWebhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalWebhooks] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalWebhooks(totalWebhooks: JsonField<Long>) = apply {
            this.totalWebhooks = totalWebhooks
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
         * Returns an immutable instance of [WebhookTriggerEventResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .deliveries()
         * .eventId()
         * .eventType()
         * .successfulDeliveries()
         * .tedSays()
         * .totalWebhooks()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookTriggerEventResponse =
            WebhookTriggerEventResponse(
                checkRequired("deliveries", deliveries).map { it.toImmutable() },
                checkRequired("eventId", eventId),
                checkRequired("eventType", eventType),
                checkRequired("successfulDeliveries", successfulDeliveries),
                checkRequired("tedSays", tedSays),
                checkRequired("totalWebhooks", totalWebhooks),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WebhookTriggerEventResponse = apply {
        if (validated) {
            return@apply
        }

        deliveries().forEach { it.validate() }
        eventId()
        eventType().validate()
        successfulDeliveries()
        tedSays()
        totalWebhooks()
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
        (deliveries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (eventId.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (successfulDeliveries.asKnown().isPresent) 1 else 0) +
            (if (tedSays.asKnown().isPresent) 1 else 0) +
            (if (totalWebhooks.asKnown().isPresent) 1 else 0)

    /** Result of delivering a webhook to a single endpoint. */
    class Delivery
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val success: JsonField<Boolean>,
        private val url: JsonField<String>,
        private val webhookId: JsonField<String>,
        private val error: JsonField<String>,
        private val statusCode: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_id")
            @ExcludeMissing
            webhookId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status_code")
            @ExcludeMissing
            statusCode: JsonField<Long> = JsonMissing.of(),
        ) : this(success, url, webhookId, error, statusCode, mutableMapOf())

        /**
         * Whether delivery was successful
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun success(): Boolean = success.getRequired("success")

        /**
         * URL the webhook was sent to
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * ID of the webhook
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun webhookId(): String = webhookId.getRequired("webhook_id")

        /**
         * Error message if delivery failed
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * HTTP status code from the endpoint
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCode(): Optional<Long> = statusCode.getOptional("status_code")

        /**
         * Returns the raw JSON value of [success].
         *
         * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [webhookId].
         *
         * Unlike [webhookId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_id") @ExcludeMissing fun _webhookId(): JsonField<String> = webhookId

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [statusCode].
         *
         * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status_code") @ExcludeMissing fun _statusCode(): JsonField<Long> = statusCode

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
             * Returns a mutable builder for constructing an instance of [Delivery].
             *
             * The following fields are required:
             * ```java
             * .success()
             * .url()
             * .webhookId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Delivery]. */
        class Builder internal constructor() {

            private var success: JsonField<Boolean>? = null
            private var url: JsonField<String>? = null
            private var webhookId: JsonField<String>? = null
            private var error: JsonField<String> = JsonMissing.of()
            private var statusCode: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(delivery: Delivery) = apply {
                success = delivery.success
                url = delivery.url
                webhookId = delivery.webhookId
                error = delivery.error
                statusCode = delivery.statusCode
                additionalProperties = delivery.additionalProperties.toMutableMap()
            }

            /** Whether delivery was successful */
            fun success(success: Boolean) = success(JsonField.of(success))

            /**
             * Sets [Builder.success] to an arbitrary JSON value.
             *
             * You should usually call [Builder.success] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun success(success: JsonField<Boolean>) = apply { this.success = success }

            /** URL the webhook was sent to */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** ID of the webhook */
            fun webhookId(webhookId: String) = webhookId(JsonField.of(webhookId))

            /**
             * Sets [Builder.webhookId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookId(webhookId: JsonField<String>) = apply { this.webhookId = webhookId }

            /** Error message if delivery failed */
            fun error(error: String?) = error(JsonField.ofNullable(error))

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<String>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            /** HTTP status code from the endpoint */
            fun statusCode(statusCode: Long?) = statusCode(JsonField.ofNullable(statusCode))

            /**
             * Alias for [Builder.statusCode].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun statusCode(statusCode: Long) = statusCode(statusCode as Long?)

            /** Alias for calling [Builder.statusCode] with `statusCode.orElse(null)`. */
            fun statusCode(statusCode: Optional<Long>) = statusCode(statusCode.getOrNull())

            /**
             * Sets [Builder.statusCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCode] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

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
             * Returns an immutable instance of [Delivery].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .success()
             * .url()
             * .webhookId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Delivery =
                Delivery(
                    checkRequired("success", success),
                    checkRequired("url", url),
                    checkRequired("webhookId", webhookId),
                    error,
                    statusCode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Delivery = apply {
            if (validated) {
                return@apply
            }

            success()
            url()
            webhookId()
            error()
            statusCode()
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
            (if (success.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0) +
                (if (webhookId.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (if (statusCode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Delivery &&
                success == other.success &&
                url == other.url &&
                webhookId == other.webhookId &&
                error == other.error &&
                statusCode == other.statusCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(success, url, webhookId, error, statusCode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Delivery{success=$success, url=$url, webhookId=$webhookId, error=$error, statusCode=$statusCode, additionalProperties=$additionalProperties}"
    }

    /** The type of event triggered */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookTriggerEventResponse &&
            deliveries == other.deliveries &&
            eventId == other.eventId &&
            eventType == other.eventType &&
            successfulDeliveries == other.successfulDeliveries &&
            tedSays == other.tedSays &&
            totalWebhooks == other.totalWebhooks &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            deliveries,
            eventId,
            eventType,
            successfulDeliveries,
            tedSays,
            totalWebhooks,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookTriggerEventResponse{deliveries=$deliveries, eventId=$eventId, eventType=$eventType, successfulDeliveries=$successfulDeliveries, tedSays=$tedSays, totalWebhooks=$totalWebhooks, additionalProperties=$additionalProperties}"
}
