// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.webhooks

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

/** Response after registering a webhook. */
class WebhookCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val webhook: JsonField<RegisteredWebhook>,
    private val message: JsonField<String>,
    private val tedSays: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("webhook")
        @ExcludeMissing
        webhook: JsonField<RegisteredWebhook> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ted_says") @ExcludeMissing tedSays: JsonField<String> = JsonMissing.of(),
    ) : this(webhook, message, tedSays, mutableMapOf())

    /**
     * The registered webhook details
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun webhook(): RegisteredWebhook = webhook.getRequired("webhook")

    /**
     * Status message
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Ted's reaction
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tedSays(): Optional<String> = tedSays.getOptional("ted_says")

    /**
     * Returns the raw JSON value of [webhook].
     *
     * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook") @ExcludeMissing fun _webhook(): JsonField<RegisteredWebhook> = webhook

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [tedSays].
     *
     * Unlike [tedSays], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ted_says") @ExcludeMissing fun _tedSays(): JsonField<String> = tedSays

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
         * Returns a mutable builder for constructing an instance of [WebhookCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .webhook()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookCreateResponse]. */
    class Builder internal constructor() {

        private var webhook: JsonField<RegisteredWebhook>? = null
        private var message: JsonField<String> = JsonMissing.of()
        private var tedSays: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookCreateResponse: WebhookCreateResponse) = apply {
            webhook = webhookCreateResponse.webhook
            message = webhookCreateResponse.message
            tedSays = webhookCreateResponse.tedSays
            additionalProperties = webhookCreateResponse.additionalProperties.toMutableMap()
        }

        /** The registered webhook details */
        fun webhook(webhook: RegisteredWebhook) = webhook(JsonField.of(webhook))

        /**
         * Sets [Builder.webhook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhook] with a well-typed [RegisteredWebhook] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhook(webhook: JsonField<RegisteredWebhook>) = apply { this.webhook = webhook }

        /** Status message */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Ted's reaction */
        fun tedSays(tedSays: String) = tedSays(JsonField.of(tedSays))

        /**
         * Sets [Builder.tedSays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tedSays] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tedSays(tedSays: JsonField<String>) = apply { this.tedSays = tedSays }

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
         * Returns an immutable instance of [WebhookCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .webhook()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookCreateResponse =
            WebhookCreateResponse(
                checkRequired("webhook", webhook),
                message,
                tedSays,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WebhookCreateResponse = apply {
        if (validated) {
            return@apply
        }

        webhook().validate()
        message()
        tedSays()
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
        (webhook.asKnown().getOrNull()?.validity() ?: 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (tedSays.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookCreateResponse &&
            webhook == other.webhook &&
            message == other.message &&
            tedSays == other.tedSays &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(webhook, message, tedSays, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookCreateResponse{webhook=$webhook, message=$message, tedSays=$tedSays, additionalProperties=$additionalProperties}"
}
