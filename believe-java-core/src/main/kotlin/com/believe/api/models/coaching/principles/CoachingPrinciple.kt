// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.coaching.principles

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

/** A Ted Lasso coaching principle. */
class CoachingPrinciple
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val application: JsonField<String>,
    private val exampleFromShow: JsonField<String>,
    private val explanation: JsonField<String>,
    private val principle: JsonField<String>,
    private val tedQuote: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("application")
        @ExcludeMissing
        application: JsonField<String> = JsonMissing.of(),
        @JsonProperty("example_from_show")
        @ExcludeMissing
        exampleFromShow: JsonField<String> = JsonMissing.of(),
        @JsonProperty("explanation")
        @ExcludeMissing
        explanation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("principle") @ExcludeMissing principle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ted_quote") @ExcludeMissing tedQuote: JsonField<String> = JsonMissing.of(),
    ) : this(id, application, exampleFromShow, explanation, principle, tedQuote, mutableMapOf())

    /**
     * Principle identifier
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * How to apply this principle
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun application(): String = application.getRequired("application")

    /**
     * Example from the show
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exampleFromShow(): String = exampleFromShow.getRequired("example_from_show")

    /**
     * What this principle means
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun explanation(): String = explanation.getRequired("explanation")

    /**
     * The coaching principle
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun principle(): String = principle.getRequired("principle")

    /**
     * Related Ted quote
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tedQuote(): String = tedQuote.getRequired("ted_quote")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [application].
     *
     * Unlike [application], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("application") @ExcludeMissing fun _application(): JsonField<String> = application

    /**
     * Returns the raw JSON value of [exampleFromShow].
     *
     * Unlike [exampleFromShow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("example_from_show")
    @ExcludeMissing
    fun _exampleFromShow(): JsonField<String> = exampleFromShow

    /**
     * Returns the raw JSON value of [explanation].
     *
     * Unlike [explanation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("explanation") @ExcludeMissing fun _explanation(): JsonField<String> = explanation

    /**
     * Returns the raw JSON value of [principle].
     *
     * Unlike [principle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("principle") @ExcludeMissing fun _principle(): JsonField<String> = principle

    /**
     * Returns the raw JSON value of [tedQuote].
     *
     * Unlike [tedQuote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ted_quote") @ExcludeMissing fun _tedQuote(): JsonField<String> = tedQuote

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
         * Returns a mutable builder for constructing an instance of [CoachingPrinciple].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .application()
         * .exampleFromShow()
         * .explanation()
         * .principle()
         * .tedQuote()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CoachingPrinciple]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var application: JsonField<String>? = null
        private var exampleFromShow: JsonField<String>? = null
        private var explanation: JsonField<String>? = null
        private var principle: JsonField<String>? = null
        private var tedQuote: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(coachingPrinciple: CoachingPrinciple) = apply {
            id = coachingPrinciple.id
            application = coachingPrinciple.application
            exampleFromShow = coachingPrinciple.exampleFromShow
            explanation = coachingPrinciple.explanation
            principle = coachingPrinciple.principle
            tedQuote = coachingPrinciple.tedQuote
            additionalProperties = coachingPrinciple.additionalProperties.toMutableMap()
        }

        /** Principle identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** How to apply this principle */
        fun application(application: String) = application(JsonField.of(application))

        /**
         * Sets [Builder.application] to an arbitrary JSON value.
         *
         * You should usually call [Builder.application] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun application(application: JsonField<String>) = apply { this.application = application }

        /** Example from the show */
        fun exampleFromShow(exampleFromShow: String) =
            exampleFromShow(JsonField.of(exampleFromShow))

        /**
         * Sets [Builder.exampleFromShow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exampleFromShow] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exampleFromShow(exampleFromShow: JsonField<String>) = apply {
            this.exampleFromShow = exampleFromShow
        }

        /** What this principle means */
        fun explanation(explanation: String) = explanation(JsonField.of(explanation))

        /**
         * Sets [Builder.explanation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.explanation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun explanation(explanation: JsonField<String>) = apply { this.explanation = explanation }

        /** The coaching principle */
        fun principle(principle: String) = principle(JsonField.of(principle))

        /**
         * Sets [Builder.principle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.principle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun principle(principle: JsonField<String>) = apply { this.principle = principle }

        /** Related Ted quote */
        fun tedQuote(tedQuote: String) = tedQuote(JsonField.of(tedQuote))

        /**
         * Sets [Builder.tedQuote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tedQuote] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tedQuote(tedQuote: JsonField<String>) = apply { this.tedQuote = tedQuote }

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
         * Returns an immutable instance of [CoachingPrinciple].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .application()
         * .exampleFromShow()
         * .explanation()
         * .principle()
         * .tedQuote()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CoachingPrinciple =
            CoachingPrinciple(
                checkRequired("id", id),
                checkRequired("application", application),
                checkRequired("exampleFromShow", exampleFromShow),
                checkRequired("explanation", explanation),
                checkRequired("principle", principle),
                checkRequired("tedQuote", tedQuote),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CoachingPrinciple = apply {
        if (validated) {
            return@apply
        }

        id()
        application()
        exampleFromShow()
        explanation()
        principle()
        tedQuote()
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
            (if (application.asKnown().isPresent) 1 else 0) +
            (if (exampleFromShow.asKnown().isPresent) 1 else 0) +
            (if (explanation.asKnown().isPresent) 1 else 0) +
            (if (principle.asKnown().isPresent) 1 else 0) +
            (if (tedQuote.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CoachingPrinciple &&
            id == other.id &&
            application == other.application &&
            exampleFromShow == other.exampleFromShow &&
            explanation == other.explanation &&
            principle == other.principle &&
            tedQuote == other.tedQuote &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            application,
            exampleFromShow,
            explanation,
            principle,
            tedQuote,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CoachingPrinciple{id=$id, application=$application, exampleFromShow=$exampleFromShow, explanation=$explanation, principle=$principle, tedQuote=$tedQuote, additionalProperties=$additionalProperties}"
}
