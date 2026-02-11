// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.conflicts

import com.believe.api.core.Enum
import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.Params
import com.believe.api.core.checkKnown
import com.believe.api.core.checkRequired
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
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

/** Get Ted Lasso-style advice for resolving conflicts. */
class ConflictResolveParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Type of conflict
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun conflictType(): ConflictType = body.conflictType()

    /**
     * Describe the conflict
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = body.description()

    /**
     * Who is involved in the conflict
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun partiesInvolved(): List<String> = body.partiesInvolved()

    /**
     * What you've already tried
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attemptsMade(): Optional<List<String>> = body.attemptsMade()

    /**
     * Returns the raw JSON value of [conflictType].
     *
     * Unlike [conflictType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _conflictType(): JsonField<ConflictType> = body._conflictType()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [partiesInvolved].
     *
     * Unlike [partiesInvolved], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _partiesInvolved(): JsonField<List<String>> = body._partiesInvolved()

    /**
     * Returns the raw JSON value of [attemptsMade].
     *
     * Unlike [attemptsMade], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _attemptsMade(): JsonField<List<String>> = body._attemptsMade()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConflictResolveParams].
         *
         * The following fields are required:
         * ```java
         * .conflictType()
         * .description()
         * .partiesInvolved()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConflictResolveParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(conflictResolveParams: ConflictResolveParams) = apply {
            body = conflictResolveParams.body.toBuilder()
            additionalHeaders = conflictResolveParams.additionalHeaders.toBuilder()
            additionalQueryParams = conflictResolveParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [conflictType]
         * - [description]
         * - [partiesInvolved]
         * - [attemptsMade]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Type of conflict */
        fun conflictType(conflictType: ConflictType) = apply { body.conflictType(conflictType) }

        /**
         * Sets [Builder.conflictType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conflictType] with a well-typed [ConflictType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conflictType(conflictType: JsonField<ConflictType>) = apply {
            body.conflictType(conflictType)
        }

        /** Describe the conflict */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Who is involved in the conflict */
        fun partiesInvolved(partiesInvolved: List<String>) = apply {
            body.partiesInvolved(partiesInvolved)
        }

        /**
         * Sets [Builder.partiesInvolved] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partiesInvolved] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun partiesInvolved(partiesInvolved: JsonField<List<String>>) = apply {
            body.partiesInvolved(partiesInvolved)
        }

        /**
         * Adds a single [String] to [Builder.partiesInvolved].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPartiesInvolved(partiesInvolved: String) = apply {
            body.addPartiesInvolved(partiesInvolved)
        }

        /** What you've already tried */
        fun attemptsMade(attemptsMade: List<String>?) = apply { body.attemptsMade(attemptsMade) }

        /** Alias for calling [Builder.attemptsMade] with `attemptsMade.orElse(null)`. */
        fun attemptsMade(attemptsMade: Optional<List<String>>) =
            attemptsMade(attemptsMade.getOrNull())

        /**
         * Sets [Builder.attemptsMade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attemptsMade] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attemptsMade(attemptsMade: JsonField<List<String>>) = apply {
            body.attemptsMade(attemptsMade)
        }

        /**
         * Adds a single [String] to [Builder.attemptsMade].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttemptsMade(attemptsMade: String) = apply { body.addAttemptsMade(attemptsMade) }

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
         * Returns an immutable instance of [ConflictResolveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .conflictType()
         * .description()
         * .partiesInvolved()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConflictResolveParams =
            ConflictResolveParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request for conflict resolution. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val conflictType: JsonField<ConflictType>,
        private val description: JsonField<String>,
        private val partiesInvolved: JsonField<List<String>>,
        private val attemptsMade: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("conflict_type")
            @ExcludeMissing
            conflictType: JsonField<ConflictType> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parties_involved")
            @ExcludeMissing
            partiesInvolved: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("attempts_made")
            @ExcludeMissing
            attemptsMade: JsonField<List<String>> = JsonMissing.of(),
        ) : this(conflictType, description, partiesInvolved, attemptsMade, mutableMapOf())

        /**
         * Type of conflict
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun conflictType(): ConflictType = conflictType.getRequired("conflict_type")

        /**
         * Describe the conflict
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * Who is involved in the conflict
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun partiesInvolved(): List<String> = partiesInvolved.getRequired("parties_involved")

        /**
         * What you've already tried
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attemptsMade(): Optional<List<String>> = attemptsMade.getOptional("attempts_made")

        /**
         * Returns the raw JSON value of [conflictType].
         *
         * Unlike [conflictType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("conflict_type")
        @ExcludeMissing
        fun _conflictType(): JsonField<ConflictType> = conflictType

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [partiesInvolved].
         *
         * Unlike [partiesInvolved], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parties_involved")
        @ExcludeMissing
        fun _partiesInvolved(): JsonField<List<String>> = partiesInvolved

        /**
         * Returns the raw JSON value of [attemptsMade].
         *
         * Unlike [attemptsMade], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attempts_made")
        @ExcludeMissing
        fun _attemptsMade(): JsonField<List<String>> = attemptsMade

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
             * .conflictType()
             * .description()
             * .partiesInvolved()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var conflictType: JsonField<ConflictType>? = null
            private var description: JsonField<String>? = null
            private var partiesInvolved: JsonField<MutableList<String>>? = null
            private var attemptsMade: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                conflictType = body.conflictType
                description = body.description
                partiesInvolved = body.partiesInvolved.map { it.toMutableList() }
                attemptsMade = body.attemptsMade.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Type of conflict */
            fun conflictType(conflictType: ConflictType) = conflictType(JsonField.of(conflictType))

            /**
             * Sets [Builder.conflictType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conflictType] with a well-typed [ConflictType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun conflictType(conflictType: JsonField<ConflictType>) = apply {
                this.conflictType = conflictType
            }

            /** Describe the conflict */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Who is involved in the conflict */
            fun partiesInvolved(partiesInvolved: List<String>) =
                partiesInvolved(JsonField.of(partiesInvolved))

            /**
             * Sets [Builder.partiesInvolved] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partiesInvolved] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun partiesInvolved(partiesInvolved: JsonField<List<String>>) = apply {
                this.partiesInvolved = partiesInvolved.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.partiesInvolved].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPartiesInvolved(partiesInvolved: String) = apply {
                this.partiesInvolved =
                    (this.partiesInvolved ?: JsonField.of(mutableListOf())).also {
                        checkKnown("partiesInvolved", it).add(partiesInvolved)
                    }
            }

            /** What you've already tried */
            fun attemptsMade(attemptsMade: List<String>?) =
                attemptsMade(JsonField.ofNullable(attemptsMade))

            /** Alias for calling [Builder.attemptsMade] with `attemptsMade.orElse(null)`. */
            fun attemptsMade(attemptsMade: Optional<List<String>>) =
                attemptsMade(attemptsMade.getOrNull())

            /**
             * Sets [Builder.attemptsMade] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attemptsMade] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attemptsMade(attemptsMade: JsonField<List<String>>) = apply {
                this.attemptsMade = attemptsMade.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.attemptsMade].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttemptsMade(attemptsMade: String) = apply {
                this.attemptsMade =
                    (this.attemptsMade ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attemptsMade", it).add(attemptsMade)
                    }
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .conflictType()
             * .description()
             * .partiesInvolved()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("conflictType", conflictType),
                    checkRequired("description", description),
                    checkRequired("partiesInvolved", partiesInvolved).map { it.toImmutable() },
                    (attemptsMade ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            conflictType().validate()
            description()
            partiesInvolved()
            attemptsMade()
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
            (conflictType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (partiesInvolved.asKnown().getOrNull()?.size ?: 0) +
                (attemptsMade.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                conflictType == other.conflictType &&
                description == other.description &&
                partiesInvolved == other.partiesInvolved &&
                attemptsMade == other.attemptsMade &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                conflictType,
                description,
                partiesInvolved,
                attemptsMade,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{conflictType=$conflictType, description=$description, partiesInvolved=$partiesInvolved, attemptsMade=$attemptsMade, additionalProperties=$additionalProperties}"
    }

    /** Type of conflict */
    class ConflictType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val INTERPERSONAL = of("interpersonal")

            @JvmField val TEAM_DYNAMICS = of("team_dynamics")

            @JvmField val LEADERSHIP = of("leadership")

            @JvmField val EGO = of("ego")

            @JvmField val MISCOMMUNICATION = of("miscommunication")

            @JvmField val COMPETITION = of("competition")

            @JvmStatic fun of(value: String) = ConflictType(JsonField.of(value))
        }

        /** An enum containing [ConflictType]'s known values. */
        enum class Known {
            INTERPERSONAL,
            TEAM_DYNAMICS,
            LEADERSHIP,
            EGO,
            MISCOMMUNICATION,
            COMPETITION,
        }

        /**
         * An enum containing [ConflictType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ConflictType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INTERPERSONAL,
            TEAM_DYNAMICS,
            LEADERSHIP,
            EGO,
            MISCOMMUNICATION,
            COMPETITION,
            /**
             * An enum member indicating that [ConflictType] was instantiated with an unknown value.
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
                INTERPERSONAL -> Value.INTERPERSONAL
                TEAM_DYNAMICS -> Value.TEAM_DYNAMICS
                LEADERSHIP -> Value.LEADERSHIP
                EGO -> Value.EGO
                MISCOMMUNICATION -> Value.MISCOMMUNICATION
                COMPETITION -> Value.COMPETITION
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
                INTERPERSONAL -> Known.INTERPERSONAL
                TEAM_DYNAMICS -> Known.TEAM_DYNAMICS
                LEADERSHIP -> Known.LEADERSHIP
                EGO -> Known.EGO
                MISCOMMUNICATION -> Known.MISCOMMUNICATION
                COMPETITION -> Known.COMPETITION
                else -> throw BelieveInvalidDataException("Unknown ConflictType: $value")
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

        fun validate(): ConflictType = apply {
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

            return other is ConflictType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConflictResolveParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ConflictResolveParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
