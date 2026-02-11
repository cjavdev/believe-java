// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.reframe

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

/** Transform negative thoughts into positive perspectives with Ted's help. */
class ReframeTransformNegativeThoughtsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The negative thought to reframe
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun negativeThought(): String = body.negativeThought()

    /**
     * Is this a recurring thought?
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recurring(): Optional<Boolean> = body.recurring()

    /**
     * Returns the raw JSON value of [negativeThought].
     *
     * Unlike [negativeThought], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _negativeThought(): JsonField<String> = body._negativeThought()

    /**
     * Returns the raw JSON value of [recurring].
     *
     * Unlike [recurring], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recurring(): JsonField<Boolean> = body._recurring()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReframeTransformNegativeThoughtsParams].
         *
         * The following fields are required:
         * ```java
         * .negativeThought()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReframeTransformNegativeThoughtsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            reframeTransformNegativeThoughtsParams: ReframeTransformNegativeThoughtsParams
        ) = apply {
            body = reframeTransformNegativeThoughtsParams.body.toBuilder()
            additionalHeaders = reframeTransformNegativeThoughtsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                reframeTransformNegativeThoughtsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [negativeThought]
         * - [recurring]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The negative thought to reframe */
        fun negativeThought(negativeThought: String) = apply {
            body.negativeThought(negativeThought)
        }

        /**
         * Sets [Builder.negativeThought] to an arbitrary JSON value.
         *
         * You should usually call [Builder.negativeThought] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun negativeThought(negativeThought: JsonField<String>) = apply {
            body.negativeThought(negativeThought)
        }

        /** Is this a recurring thought? */
        fun recurring(recurring: Boolean) = apply { body.recurring(recurring) }

        /**
         * Sets [Builder.recurring] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recurring] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recurring(recurring: JsonField<Boolean>) = apply { body.recurring(recurring) }

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
         * Returns an immutable instance of [ReframeTransformNegativeThoughtsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .negativeThought()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReframeTransformNegativeThoughtsParams =
            ReframeTransformNegativeThoughtsParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request to reframe a negative thought. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val negativeThought: JsonField<String>,
        private val recurring: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("negative_thought")
            @ExcludeMissing
            negativeThought: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recurring")
            @ExcludeMissing
            recurring: JsonField<Boolean> = JsonMissing.of(),
        ) : this(negativeThought, recurring, mutableMapOf())

        /**
         * The negative thought to reframe
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun negativeThought(): String = negativeThought.getRequired("negative_thought")

        /**
         * Is this a recurring thought?
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recurring(): Optional<Boolean> = recurring.getOptional("recurring")

        /**
         * Returns the raw JSON value of [negativeThought].
         *
         * Unlike [negativeThought], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("negative_thought")
        @ExcludeMissing
        fun _negativeThought(): JsonField<String> = negativeThought

        /**
         * Returns the raw JSON value of [recurring].
         *
         * Unlike [recurring], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recurring") @ExcludeMissing fun _recurring(): JsonField<Boolean> = recurring

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
             * .negativeThought()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var negativeThought: JsonField<String>? = null
            private var recurring: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                negativeThought = body.negativeThought
                recurring = body.recurring
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The negative thought to reframe */
            fun negativeThought(negativeThought: String) =
                negativeThought(JsonField.of(negativeThought))

            /**
             * Sets [Builder.negativeThought] to an arbitrary JSON value.
             *
             * You should usually call [Builder.negativeThought] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun negativeThought(negativeThought: JsonField<String>) = apply {
                this.negativeThought = negativeThought
            }

            /** Is this a recurring thought? */
            fun recurring(recurring: Boolean) = recurring(JsonField.of(recurring))

            /**
             * Sets [Builder.recurring] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recurring] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recurring(recurring: JsonField<Boolean>) = apply { this.recurring = recurring }

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
             * .negativeThought()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("negativeThought", negativeThought),
                    recurring,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            negativeThought()
            recurring()
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
            (if (negativeThought.asKnown().isPresent) 1 else 0) +
                (if (recurring.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                negativeThought == other.negativeThought &&
                recurring == other.recurring &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(negativeThought, recurring, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{negativeThought=$negativeThought, recurring=$recurring, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReframeTransformNegativeThoughtsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ReframeTransformNegativeThoughtsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
