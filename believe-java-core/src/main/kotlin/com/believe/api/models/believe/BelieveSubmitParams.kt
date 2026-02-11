// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.believe

import com.believe.api.core.Enum
import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.Params
import com.believe.api.core.checkRequired
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Submit your situation and receive Ted Lasso-style motivational guidance. */
class BelieveSubmitParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Describe your situation
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun situation(): String = body.situation()

    /**
     * Type of situation
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun situationType(): SituationType = body.situationType()

    /**
     * Additional context
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun context(): Optional<String> = body.context()

    /**
     * How intense is the response needed (1=gentle, 10=full Ted)
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun intensity(): Optional<Long> = body.intensity()

    /**
     * Returns the raw JSON value of [situation].
     *
     * Unlike [situation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _situation(): JsonField<String> = body._situation()

    /**
     * Returns the raw JSON value of [situationType].
     *
     * Unlike [situationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _situationType(): JsonField<SituationType> = body._situationType()

    /**
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _context(): JsonField<String> = body._context()

    /**
     * Returns the raw JSON value of [intensity].
     *
     * Unlike [intensity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _intensity(): JsonField<Long> = body._intensity()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BelieveSubmitParams].
         *
         * The following fields are required:
         * ```java
         * .situation()
         * .situationType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BelieveSubmitParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(believeSubmitParams: BelieveSubmitParams) = apply {
            body = believeSubmitParams.body.toBuilder()
            additionalHeaders = believeSubmitParams.additionalHeaders.toBuilder()
            additionalQueryParams = believeSubmitParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [situation]
         * - [situationType]
         * - [context]
         * - [intensity]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Describe your situation */
        fun situation(situation: String) = apply { body.situation(situation) }

        /**
         * Sets [Builder.situation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.situation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun situation(situation: JsonField<String>) = apply { body.situation(situation) }

        /** Type of situation */
        fun situationType(situationType: SituationType) = apply {
            body.situationType(situationType)
        }

        /**
         * Sets [Builder.situationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.situationType] with a well-typed [SituationType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun situationType(situationType: JsonField<SituationType>) = apply {
            body.situationType(situationType)
        }

        /** Additional context */
        fun context(context: String?) = apply { body.context(context) }

        /** Alias for calling [Builder.context] with `context.orElse(null)`. */
        fun context(context: Optional<String>) = context(context.getOrNull())

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun context(context: JsonField<String>) = apply { body.context(context) }

        /** How intense is the response needed (1=gentle, 10=full Ted) */
        fun intensity(intensity: Long) = apply { body.intensity(intensity) }

        /**
         * Sets [Builder.intensity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intensity] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun intensity(intensity: JsonField<Long>) = apply { body.intensity(intensity) }

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
         * Returns an immutable instance of [BelieveSubmitParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .situation()
         * .situationType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BelieveSubmitParams =
            BelieveSubmitParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request for the Believe Engine. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val situation: JsonField<String>,
        private val situationType: JsonField<SituationType>,
        private val context: JsonField<String>,
        private val intensity: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("situation")
            @ExcludeMissing
            situation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("situation_type")
            @ExcludeMissing
            situationType: JsonField<SituationType> = JsonMissing.of(),
            @JsonProperty("context") @ExcludeMissing context: JsonField<String> = JsonMissing.of(),
            @JsonProperty("intensity") @ExcludeMissing intensity: JsonField<Long> = JsonMissing.of(),
        ) : this(situation, situationType, context, intensity, mutableMapOf())

        /**
         * Describe your situation
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun situation(): String = situation.getRequired("situation")

        /**
         * Type of situation
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun situationType(): SituationType = situationType.getRequired("situation_type")

        /**
         * Additional context
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun context(): Optional<String> = context.getOptional("context")

        /**
         * How intense is the response needed (1=gentle, 10=full Ted)
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun intensity(): Optional<Long> = intensity.getOptional("intensity")

        /**
         * Returns the raw JSON value of [situation].
         *
         * Unlike [situation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("situation") @ExcludeMissing fun _situation(): JsonField<String> = situation

        /**
         * Returns the raw JSON value of [situationType].
         *
         * Unlike [situationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("situation_type")
        @ExcludeMissing
        fun _situationType(): JsonField<SituationType> = situationType

        /**
         * Returns the raw JSON value of [context].
         *
         * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<String> = context

        /**
         * Returns the raw JSON value of [intensity].
         *
         * Unlike [intensity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("intensity") @ExcludeMissing fun _intensity(): JsonField<Long> = intensity

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
             * .situation()
             * .situationType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var situation: JsonField<String>? = null
            private var situationType: JsonField<SituationType>? = null
            private var context: JsonField<String> = JsonMissing.of()
            private var intensity: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                situation = body.situation
                situationType = body.situationType
                context = body.context
                intensity = body.intensity
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Describe your situation */
            fun situation(situation: String) = situation(JsonField.of(situation))

            /**
             * Sets [Builder.situation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.situation] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun situation(situation: JsonField<String>) = apply { this.situation = situation }

            /** Type of situation */
            fun situationType(situationType: SituationType) =
                situationType(JsonField.of(situationType))

            /**
             * Sets [Builder.situationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.situationType] with a well-typed [SituationType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun situationType(situationType: JsonField<SituationType>) = apply {
                this.situationType = situationType
            }

            /** Additional context */
            fun context(context: String?) = context(JsonField.ofNullable(context))

            /** Alias for calling [Builder.context] with `context.orElse(null)`. */
            fun context(context: Optional<String>) = context(context.getOrNull())

            /**
             * Sets [Builder.context] to an arbitrary JSON value.
             *
             * You should usually call [Builder.context] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun context(context: JsonField<String>) = apply { this.context = context }

            /** How intense is the response needed (1=gentle, 10=full Ted) */
            fun intensity(intensity: Long) = intensity(JsonField.of(intensity))

            /**
             * Sets [Builder.intensity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.intensity] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun intensity(intensity: JsonField<Long>) = apply { this.intensity = intensity }

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
             * .situation()
             * .situationType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("situation", situation),
                    checkRequired("situationType", situationType),
                    context,
                    intensity,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            situation()
            situationType().validate()
            context()
            intensity()
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
            (if (situation.asKnown().isPresent) 1 else 0) +
                (situationType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (context.asKnown().isPresent) 1 else 0) +
                (if (intensity.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                situation == other.situation &&
                situationType == other.situationType &&
                context == other.context &&
                intensity == other.intensity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(situation, situationType, context, intensity, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{situation=$situation, situationType=$situationType, context=$context, intensity=$intensity, additionalProperties=$additionalProperties}"
    }

    /** Type of situation */
    class SituationType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val WORK_CHALLENGE = of("work_challenge")

            @JvmField val PERSONAL_SETBACK = of("personal_setback")

            @JvmField val TEAM_CONFLICT = of("team_conflict")

            @JvmField val SELF_DOUBT = of("self_doubt")

            @JvmField val BIG_DECISION = of("big_decision")

            @JvmField val FAILURE = of("failure")

            @JvmField val NEW_BEGINNING = of("new_beginning")

            @JvmField val RELATIONSHIP = of("relationship")

            @JvmStatic fun of(value: String) = SituationType(JsonField.of(value))
        }

        /** An enum containing [SituationType]'s known values. */
        enum class Known {
            WORK_CHALLENGE,
            PERSONAL_SETBACK,
            TEAM_CONFLICT,
            SELF_DOUBT,
            BIG_DECISION,
            FAILURE,
            NEW_BEGINNING,
            RELATIONSHIP,
        }

        /**
         * An enum containing [SituationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SituationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WORK_CHALLENGE,
            PERSONAL_SETBACK,
            TEAM_CONFLICT,
            SELF_DOUBT,
            BIG_DECISION,
            FAILURE,
            NEW_BEGINNING,
            RELATIONSHIP,
            /**
             * An enum member indicating that [SituationType] was instantiated with an unknown
             * value.
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
                WORK_CHALLENGE -> Value.WORK_CHALLENGE
                PERSONAL_SETBACK -> Value.PERSONAL_SETBACK
                TEAM_CONFLICT -> Value.TEAM_CONFLICT
                SELF_DOUBT -> Value.SELF_DOUBT
                BIG_DECISION -> Value.BIG_DECISION
                FAILURE -> Value.FAILURE
                NEW_BEGINNING -> Value.NEW_BEGINNING
                RELATIONSHIP -> Value.RELATIONSHIP
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
                WORK_CHALLENGE -> Known.WORK_CHALLENGE
                PERSONAL_SETBACK -> Known.PERSONAL_SETBACK
                TEAM_CONFLICT -> Known.TEAM_CONFLICT
                SELF_DOUBT -> Known.SELF_DOUBT
                BIG_DECISION -> Known.BIG_DECISION
                FAILURE -> Known.FAILURE
                NEW_BEGINNING -> Known.NEW_BEGINNING
                RELATIONSHIP -> Known.RELATIONSHIP
                else -> throw BelieveInvalidDataException("Unknown SituationType: $value")
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

        fun validate(): SituationType = apply {
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

            return other is SituationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BelieveSubmitParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BelieveSubmitParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
