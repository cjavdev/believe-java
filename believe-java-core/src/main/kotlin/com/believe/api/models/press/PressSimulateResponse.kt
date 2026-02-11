// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.press

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

/** Ted's press conference response. */
class PressSimulateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actualWisdom: JsonField<String>,
    private val followUpDodge: JsonField<String>,
    private val reporterReaction: JsonField<String>,
    private val response: JsonField<String>,
    private val deflectionHumor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actual_wisdom")
        @ExcludeMissing
        actualWisdom: JsonField<String> = JsonMissing.of(),
        @JsonProperty("follow_up_dodge")
        @ExcludeMissing
        followUpDodge: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reporter_reaction")
        @ExcludeMissing
        reporterReaction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("response") @ExcludeMissing response: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deflection_humor")
        @ExcludeMissing
        deflectionHumor: JsonField<String> = JsonMissing.of(),
    ) : this(
        actualWisdom,
        followUpDodge,
        reporterReaction,
        response,
        deflectionHumor,
        mutableMapOf(),
    )

    /**
     * The actual wisdom beneath the humor
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actualWisdom(): String = actualWisdom.getRequired("actual_wisdom")

    /**
     * How Ted would dodge a follow-up
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun followUpDodge(): String = followUpDodge.getRequired("follow_up_dodge")

    /**
     * How reporters would react
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reporterReaction(): String = reporterReaction.getRequired("reporter_reaction")

    /**
     * Ted's press conference answer
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun response(): String = response.getRequired("response")

    /**
     * Humorous deflection if appropriate
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deflectionHumor(): Optional<String> = deflectionHumor.getOptional("deflection_humor")

    /**
     * Returns the raw JSON value of [actualWisdom].
     *
     * Unlike [actualWisdom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actual_wisdom")
    @ExcludeMissing
    fun _actualWisdom(): JsonField<String> = actualWisdom

    /**
     * Returns the raw JSON value of [followUpDodge].
     *
     * Unlike [followUpDodge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("follow_up_dodge")
    @ExcludeMissing
    fun _followUpDodge(): JsonField<String> = followUpDodge

    /**
     * Returns the raw JSON value of [reporterReaction].
     *
     * Unlike [reporterReaction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reporter_reaction")
    @ExcludeMissing
    fun _reporterReaction(): JsonField<String> = reporterReaction

    /**
     * Returns the raw JSON value of [response].
     *
     * Unlike [response], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response") @ExcludeMissing fun _response(): JsonField<String> = response

    /**
     * Returns the raw JSON value of [deflectionHumor].
     *
     * Unlike [deflectionHumor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deflection_humor")
    @ExcludeMissing
    fun _deflectionHumor(): JsonField<String> = deflectionHumor

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
         * Returns a mutable builder for constructing an instance of [PressSimulateResponse].
         *
         * The following fields are required:
         * ```java
         * .actualWisdom()
         * .followUpDodge()
         * .reporterReaction()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PressSimulateResponse]. */
    class Builder internal constructor() {

        private var actualWisdom: JsonField<String>? = null
        private var followUpDodge: JsonField<String>? = null
        private var reporterReaction: JsonField<String>? = null
        private var response: JsonField<String>? = null
        private var deflectionHumor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pressSimulateResponse: PressSimulateResponse) = apply {
            actualWisdom = pressSimulateResponse.actualWisdom
            followUpDodge = pressSimulateResponse.followUpDodge
            reporterReaction = pressSimulateResponse.reporterReaction
            response = pressSimulateResponse.response
            deflectionHumor = pressSimulateResponse.deflectionHumor
            additionalProperties = pressSimulateResponse.additionalProperties.toMutableMap()
        }

        /** The actual wisdom beneath the humor */
        fun actualWisdom(actualWisdom: String) = actualWisdom(JsonField.of(actualWisdom))

        /**
         * Sets [Builder.actualWisdom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actualWisdom] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actualWisdom(actualWisdom: JsonField<String>) = apply {
            this.actualWisdom = actualWisdom
        }

        /** How Ted would dodge a follow-up */
        fun followUpDodge(followUpDodge: String) = followUpDodge(JsonField.of(followUpDodge))

        /**
         * Sets [Builder.followUpDodge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.followUpDodge] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun followUpDodge(followUpDodge: JsonField<String>) = apply {
            this.followUpDodge = followUpDodge
        }

        /** How reporters would react */
        fun reporterReaction(reporterReaction: String) =
            reporterReaction(JsonField.of(reporterReaction))

        /**
         * Sets [Builder.reporterReaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reporterReaction] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reporterReaction(reporterReaction: JsonField<String>) = apply {
            this.reporterReaction = reporterReaction
        }

        /** Ted's press conference answer */
        fun response(response: String) = response(JsonField.of(response))

        /**
         * Sets [Builder.response] to an arbitrary JSON value.
         *
         * You should usually call [Builder.response] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun response(response: JsonField<String>) = apply { this.response = response }

        /** Humorous deflection if appropriate */
        fun deflectionHumor(deflectionHumor: String?) =
            deflectionHumor(JsonField.ofNullable(deflectionHumor))

        /** Alias for calling [Builder.deflectionHumor] with `deflectionHumor.orElse(null)`. */
        fun deflectionHumor(deflectionHumor: Optional<String>) =
            deflectionHumor(deflectionHumor.getOrNull())

        /**
         * Sets [Builder.deflectionHumor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deflectionHumor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deflectionHumor(deflectionHumor: JsonField<String>) = apply {
            this.deflectionHumor = deflectionHumor
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
         * Returns an immutable instance of [PressSimulateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actualWisdom()
         * .followUpDodge()
         * .reporterReaction()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PressSimulateResponse =
            PressSimulateResponse(
                checkRequired("actualWisdom", actualWisdom),
                checkRequired("followUpDodge", followUpDodge),
                checkRequired("reporterReaction", reporterReaction),
                checkRequired("response", response),
                deflectionHumor,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PressSimulateResponse = apply {
        if (validated) {
            return@apply
        }

        actualWisdom()
        followUpDodge()
        reporterReaction()
        response()
        deflectionHumor()
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
        (if (actualWisdom.asKnown().isPresent) 1 else 0) +
            (if (followUpDodge.asKnown().isPresent) 1 else 0) +
            (if (reporterReaction.asKnown().isPresent) 1 else 0) +
            (if (response.asKnown().isPresent) 1 else 0) +
            (if (deflectionHumor.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PressSimulateResponse &&
            actualWisdom == other.actualWisdom &&
            followUpDodge == other.followUpDodge &&
            reporterReaction == other.reporterReaction &&
            response == other.response &&
            deflectionHumor == other.deflectionHumor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actualWisdom,
            followUpDodge,
            reporterReaction,
            response,
            deflectionHumor,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PressSimulateResponse{actualWisdom=$actualWisdom, followUpDodge=$followUpDodge, reporterReaction=$reporterReaction, response=$response, deflectionHumor=$deflectionHumor, additionalProperties=$additionalProperties}"
}
