// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teammembers

import com.believe.api.core.Enum
import com.believe.api.core.JsonField
import com.believe.api.core.Params
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get a paginated list of all team members.
 *
 * This endpoint demonstrates **union types (oneOf)** in the response. Each team member can be one
 * of: Player, Coach, MedicalStaff, or EquipmentManager. The `member_type` field acts as a
 * discriminator to determine the shape of each object.
 */
class TeamMemberListParams
private constructor(
    private val limit: Long?,
    private val memberType: MemberType?,
    private val skip: Long?,
    private val teamId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Maximum number of items to return (max: 100) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter by member type */
    fun memberType(): Optional<MemberType> = Optional.ofNullable(memberType)

    /** Number of items to skip (offset) */
    fun skip(): Optional<Long> = Optional.ofNullable(skip)

    /** Filter by team ID */
    fun teamId(): Optional<String> = Optional.ofNullable(teamId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TeamMemberListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TeamMemberListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TeamMemberListParams]. */
    class Builder internal constructor() {

        private var limit: Long? = null
        private var memberType: MemberType? = null
        private var skip: Long? = null
        private var teamId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(teamMemberListParams: TeamMemberListParams) = apply {
            limit = teamMemberListParams.limit
            memberType = teamMemberListParams.memberType
            skip = teamMemberListParams.skip
            teamId = teamMemberListParams.teamId
            additionalHeaders = teamMemberListParams.additionalHeaders.toBuilder()
            additionalQueryParams = teamMemberListParams.additionalQueryParams.toBuilder()
        }

        /** Maximum number of items to return (max: 100) */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Filter by member type */
        fun memberType(memberType: MemberType?) = apply { this.memberType = memberType }

        /** Alias for calling [Builder.memberType] with `memberType.orElse(null)`. */
        fun memberType(memberType: Optional<MemberType>) = memberType(memberType.getOrNull())

        /** Number of items to skip (offset) */
        fun skip(skip: Long?) = apply { this.skip = skip }

        /**
         * Alias for [Builder.skip].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun skip(skip: Long) = skip(skip as Long?)

        /** Alias for calling [Builder.skip] with `skip.orElse(null)`. */
        fun skip(skip: Optional<Long>) = skip(skip.getOrNull())

        /** Filter by team ID */
        fun teamId(teamId: String?) = apply { this.teamId = teamId }

        /** Alias for calling [Builder.teamId] with `teamId.orElse(null)`. */
        fun teamId(teamId: Optional<String>) = teamId(teamId.getOrNull())

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
         * Returns an immutable instance of [TeamMemberListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TeamMemberListParams =
            TeamMemberListParams(
                limit,
                memberType,
                skip,
                teamId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                limit?.let { put("limit", it.toString()) }
                memberType?.let { put("member_type", it.toString()) }
                skip?.let { put("skip", it.toString()) }
                teamId?.let { put("team_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by member type */
    class MemberType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * An enum containing [MemberType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MemberType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PLAYER,
            COACH,
            MEDICAL_STAFF,
            EQUIPMENT_MANAGER,
            /**
             * An enum member indicating that [MemberType] was instantiated with an unknown value.
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
                PLAYER -> Value.PLAYER
                COACH -> Value.COACH
                MEDICAL_STAFF -> Value.MEDICAL_STAFF
                EQUIPMENT_MANAGER -> Value.EQUIPMENT_MANAGER
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
                PLAYER -> Known.PLAYER
                COACH -> Known.COACH
                MEDICAL_STAFF -> Known.MEDICAL_STAFF
                EQUIPMENT_MANAGER -> Known.EQUIPMENT_MANAGER
                else -> throw BelieveInvalidDataException("Unknown MemberType: $value")
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MemberType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamMemberListParams &&
            limit == other.limit &&
            memberType == other.memberType &&
            skip == other.skip &&
            teamId == other.teamId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(limit, memberType, skip, teamId, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TeamMemberListParams{limit=$limit, memberType=$memberType, skip=$skip, teamId=$teamId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
