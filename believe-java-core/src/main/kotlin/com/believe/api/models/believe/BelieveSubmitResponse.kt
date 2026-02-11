// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.believe

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

/** Response from the Believe Engine. */
class BelieveSubmitResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actionSuggestion: JsonField<String>,
    private val believeScore: JsonField<Long>,
    private val goldfishWisdom: JsonField<String>,
    private val relevantQuote: JsonField<String>,
    private val tedResponse: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action_suggestion")
        @ExcludeMissing
        actionSuggestion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("believe_score")
        @ExcludeMissing
        believeScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("goldfish_wisdom")
        @ExcludeMissing
        goldfishWisdom: JsonField<String> = JsonMissing.of(),
        @JsonProperty("relevant_quote")
        @ExcludeMissing
        relevantQuote: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ted_response")
        @ExcludeMissing
        tedResponse: JsonField<String> = JsonMissing.of(),
    ) : this(
        actionSuggestion,
        believeScore,
        goldfishWisdom,
        relevantQuote,
        tedResponse,
        mutableMapOf(),
    )

    /**
     * Suggested action to take
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionSuggestion(): String = actionSuggestion.getRequired("action_suggestion")

    /**
     * Your current believe-o-meter score
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun believeScore(): Long = believeScore.getRequired("believe_score")

    /**
     * A reminder to have a goldfish memory when needed
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun goldfishWisdom(): String = goldfishWisdom.getRequired("goldfish_wisdom")

    /**
     * A relevant Ted Lasso quote
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun relevantQuote(): String = relevantQuote.getRequired("relevant_quote")

    /**
     * Ted's motivational response
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tedResponse(): String = tedResponse.getRequired("ted_response")

    /**
     * Returns the raw JSON value of [actionSuggestion].
     *
     * Unlike [actionSuggestion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("action_suggestion")
    @ExcludeMissing
    fun _actionSuggestion(): JsonField<String> = actionSuggestion

    /**
     * Returns the raw JSON value of [believeScore].
     *
     * Unlike [believeScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("believe_score")
    @ExcludeMissing
    fun _believeScore(): JsonField<Long> = believeScore

    /**
     * Returns the raw JSON value of [goldfishWisdom].
     *
     * Unlike [goldfishWisdom], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("goldfish_wisdom")
    @ExcludeMissing
    fun _goldfishWisdom(): JsonField<String> = goldfishWisdom

    /**
     * Returns the raw JSON value of [relevantQuote].
     *
     * Unlike [relevantQuote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("relevant_quote")
    @ExcludeMissing
    fun _relevantQuote(): JsonField<String> = relevantQuote

    /**
     * Returns the raw JSON value of [tedResponse].
     *
     * Unlike [tedResponse], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ted_response")
    @ExcludeMissing
    fun _tedResponse(): JsonField<String> = tedResponse

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
         * Returns a mutable builder for constructing an instance of [BelieveSubmitResponse].
         *
         * The following fields are required:
         * ```java
         * .actionSuggestion()
         * .believeScore()
         * .goldfishWisdom()
         * .relevantQuote()
         * .tedResponse()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BelieveSubmitResponse]. */
    class Builder internal constructor() {

        private var actionSuggestion: JsonField<String>? = null
        private var believeScore: JsonField<Long>? = null
        private var goldfishWisdom: JsonField<String>? = null
        private var relevantQuote: JsonField<String>? = null
        private var tedResponse: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(believeSubmitResponse: BelieveSubmitResponse) = apply {
            actionSuggestion = believeSubmitResponse.actionSuggestion
            believeScore = believeSubmitResponse.believeScore
            goldfishWisdom = believeSubmitResponse.goldfishWisdom
            relevantQuote = believeSubmitResponse.relevantQuote
            tedResponse = believeSubmitResponse.tedResponse
            additionalProperties = believeSubmitResponse.additionalProperties.toMutableMap()
        }

        /** Suggested action to take */
        fun actionSuggestion(actionSuggestion: String) =
            actionSuggestion(JsonField.of(actionSuggestion))

        /**
         * Sets [Builder.actionSuggestion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionSuggestion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actionSuggestion(actionSuggestion: JsonField<String>) = apply {
            this.actionSuggestion = actionSuggestion
        }

        /** Your current believe-o-meter score */
        fun believeScore(believeScore: Long) = believeScore(JsonField.of(believeScore))

        /**
         * Sets [Builder.believeScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.believeScore] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun believeScore(believeScore: JsonField<Long>) = apply { this.believeScore = believeScore }

        /** A reminder to have a goldfish memory when needed */
        fun goldfishWisdom(goldfishWisdom: String) = goldfishWisdom(JsonField.of(goldfishWisdom))

        /**
         * Sets [Builder.goldfishWisdom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.goldfishWisdom] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun goldfishWisdom(goldfishWisdom: JsonField<String>) = apply {
            this.goldfishWisdom = goldfishWisdom
        }

        /** A relevant Ted Lasso quote */
        fun relevantQuote(relevantQuote: String) = relevantQuote(JsonField.of(relevantQuote))

        /**
         * Sets [Builder.relevantQuote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relevantQuote] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun relevantQuote(relevantQuote: JsonField<String>) = apply {
            this.relevantQuote = relevantQuote
        }

        /** Ted's motivational response */
        fun tedResponse(tedResponse: String) = tedResponse(JsonField.of(tedResponse))

        /**
         * Sets [Builder.tedResponse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tedResponse] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tedResponse(tedResponse: JsonField<String>) = apply { this.tedResponse = tedResponse }

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
         * Returns an immutable instance of [BelieveSubmitResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actionSuggestion()
         * .believeScore()
         * .goldfishWisdom()
         * .relevantQuote()
         * .tedResponse()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BelieveSubmitResponse =
            BelieveSubmitResponse(
                checkRequired("actionSuggestion", actionSuggestion),
                checkRequired("believeScore", believeScore),
                checkRequired("goldfishWisdom", goldfishWisdom),
                checkRequired("relevantQuote", relevantQuote),
                checkRequired("tedResponse", tedResponse),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BelieveSubmitResponse = apply {
        if (validated) {
            return@apply
        }

        actionSuggestion()
        believeScore()
        goldfishWisdom()
        relevantQuote()
        tedResponse()
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
        (if (actionSuggestion.asKnown().isPresent) 1 else 0) +
            (if (believeScore.asKnown().isPresent) 1 else 0) +
            (if (goldfishWisdom.asKnown().isPresent) 1 else 0) +
            (if (relevantQuote.asKnown().isPresent) 1 else 0) +
            (if (tedResponse.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BelieveSubmitResponse &&
            actionSuggestion == other.actionSuggestion &&
            believeScore == other.believeScore &&
            goldfishWisdom == other.goldfishWisdom &&
            relevantQuote == other.relevantQuote &&
            tedResponse == other.tedResponse &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actionSuggestion,
            believeScore,
            goldfishWisdom,
            relevantQuote,
            tedResponse,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BelieveSubmitResponse{actionSuggestion=$actionSuggestion, believeScore=$believeScore, goldfishWisdom=$goldfishWisdom, relevantQuote=$relevantQuote, tedResponse=$tedResponse, additionalProperties=$additionalProperties}"
}
