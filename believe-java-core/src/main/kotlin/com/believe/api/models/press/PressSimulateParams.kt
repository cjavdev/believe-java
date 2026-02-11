// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.press

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

/** Get Ted's response to press conference questions. */
class PressSimulateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The press question to answer
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun question(): String = body.question()

    /**
     * Is this a hostile question from Trent Crimm?
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hostile(): Optional<Boolean> = body.hostile()

    /**
     * Topic category
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topic(): Optional<String> = body.topic()

    /**
     * Returns the raw JSON value of [question].
     *
     * Unlike [question], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _question(): JsonField<String> = body._question()

    /**
     * Returns the raw JSON value of [hostile].
     *
     * Unlike [hostile], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hostile(): JsonField<Boolean> = body._hostile()

    /**
     * Returns the raw JSON value of [topic].
     *
     * Unlike [topic], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topic(): JsonField<String> = body._topic()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PressSimulateParams].
         *
         * The following fields are required:
         * ```java
         * .question()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PressSimulateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(pressSimulateParams: PressSimulateParams) = apply {
            body = pressSimulateParams.body.toBuilder()
            additionalHeaders = pressSimulateParams.additionalHeaders.toBuilder()
            additionalQueryParams = pressSimulateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [question]
         * - [hostile]
         * - [topic]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The press question to answer */
        fun question(question: String) = apply { body.question(question) }

        /**
         * Sets [Builder.question] to an arbitrary JSON value.
         *
         * You should usually call [Builder.question] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun question(question: JsonField<String>) = apply { body.question(question) }

        /** Is this a hostile question from Trent Crimm? */
        fun hostile(hostile: Boolean) = apply { body.hostile(hostile) }

        /**
         * Sets [Builder.hostile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostile] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hostile(hostile: JsonField<Boolean>) = apply { body.hostile(hostile) }

        /** Topic category */
        fun topic(topic: String?) = apply { body.topic(topic) }

        /** Alias for calling [Builder.topic] with `topic.orElse(null)`. */
        fun topic(topic: Optional<String>) = topic(topic.getOrNull())

        /**
         * Sets [Builder.topic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topic] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topic(topic: JsonField<String>) = apply { body.topic(topic) }

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
         * Returns an immutable instance of [PressSimulateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .question()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PressSimulateParams =
            PressSimulateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request for press conference response. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val question: JsonField<String>,
        private val hostile: JsonField<Boolean>,
        private val topic: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("question")
            @ExcludeMissing
            question: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hostile") @ExcludeMissing hostile: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("topic") @ExcludeMissing topic: JsonField<String> = JsonMissing.of(),
        ) : this(question, hostile, topic, mutableMapOf())

        /**
         * The press question to answer
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun question(): String = question.getRequired("question")

        /**
         * Is this a hostile question from Trent Crimm?
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hostile(): Optional<Boolean> = hostile.getOptional("hostile")

        /**
         * Topic category
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun topic(): Optional<String> = topic.getOptional("topic")

        /**
         * Returns the raw JSON value of [question].
         *
         * Unlike [question], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("question") @ExcludeMissing fun _question(): JsonField<String> = question

        /**
         * Returns the raw JSON value of [hostile].
         *
         * Unlike [hostile], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hostile") @ExcludeMissing fun _hostile(): JsonField<Boolean> = hostile

        /**
         * Returns the raw JSON value of [topic].
         *
         * Unlike [topic], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("topic") @ExcludeMissing fun _topic(): JsonField<String> = topic

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
             * .question()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var question: JsonField<String>? = null
            private var hostile: JsonField<Boolean> = JsonMissing.of()
            private var topic: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                question = body.question
                hostile = body.hostile
                topic = body.topic
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The press question to answer */
            fun question(question: String) = question(JsonField.of(question))

            /**
             * Sets [Builder.question] to an arbitrary JSON value.
             *
             * You should usually call [Builder.question] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun question(question: JsonField<String>) = apply { this.question = question }

            /** Is this a hostile question from Trent Crimm? */
            fun hostile(hostile: Boolean) = hostile(JsonField.of(hostile))

            /**
             * Sets [Builder.hostile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostile] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hostile(hostile: JsonField<Boolean>) = apply { this.hostile = hostile }

            /** Topic category */
            fun topic(topic: String?) = topic(JsonField.ofNullable(topic))

            /** Alias for calling [Builder.topic] with `topic.orElse(null)`. */
            fun topic(topic: Optional<String>) = topic(topic.getOrNull())

            /**
             * Sets [Builder.topic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topic] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun topic(topic: JsonField<String>) = apply { this.topic = topic }

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
             * .question()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("question", question),
                    hostile,
                    topic,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            question()
            hostile()
            topic()
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
            (if (question.asKnown().isPresent) 1 else 0) +
                (if (hostile.asKnown().isPresent) 1 else 0) +
                (if (topic.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                question == other.question &&
                hostile == other.hostile &&
                topic == other.topic &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(question, hostile, topic, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{question=$question, hostile=$hostile, topic=$topic, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PressSimulateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PressSimulateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
