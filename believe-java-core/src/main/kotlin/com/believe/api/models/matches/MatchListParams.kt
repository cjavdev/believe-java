// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import com.believe.api.core.Params
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a paginated list of all matches with optional filtering. */
class MatchListParams
private constructor(
    private val limit: Long?,
    private val matchType: MatchType?,
    private val result: MatchResult?,
    private val skip: Long?,
    private val teamId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Maximum number of items to return (max: 100) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter by match type */
    fun matchType(): Optional<MatchType> = Optional.ofNullable(matchType)

    /** Filter by result */
    fun result(): Optional<MatchResult> = Optional.ofNullable(result)

    /** Number of items to skip (offset) */
    fun skip(): Optional<Long> = Optional.ofNullable(skip)

    /** Filter by team (home or away) */
    fun teamId(): Optional<String> = Optional.ofNullable(teamId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MatchListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [MatchListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MatchListParams]. */
    class Builder internal constructor() {

        private var limit: Long? = null
        private var matchType: MatchType? = null
        private var result: MatchResult? = null
        private var skip: Long? = null
        private var teamId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(matchListParams: MatchListParams) = apply {
            limit = matchListParams.limit
            matchType = matchListParams.matchType
            result = matchListParams.result
            skip = matchListParams.skip
            teamId = matchListParams.teamId
            additionalHeaders = matchListParams.additionalHeaders.toBuilder()
            additionalQueryParams = matchListParams.additionalQueryParams.toBuilder()
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

        /** Filter by match type */
        fun matchType(matchType: MatchType?) = apply { this.matchType = matchType }

        /** Alias for calling [Builder.matchType] with `matchType.orElse(null)`. */
        fun matchType(matchType: Optional<MatchType>) = matchType(matchType.getOrNull())

        /** Filter by result */
        fun result(result: MatchResult?) = apply { this.result = result }

        /** Alias for calling [Builder.result] with `result.orElse(null)`. */
        fun result(result: Optional<MatchResult>) = result(result.getOrNull())

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

        /** Filter by team (home or away) */
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
         * Returns an immutable instance of [MatchListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MatchListParams =
            MatchListParams(
                limit,
                matchType,
                result,
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
                matchType?.let { put("match_type", it.toString()) }
                result?.let { put("result", it.toString()) }
                skip?.let { put("skip", it.toString()) }
                teamId?.let { put("team_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MatchListParams &&
            limit == other.limit &&
            matchType == other.matchType &&
            result == other.result &&
            skip == other.skip &&
            teamId == other.teamId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            limit,
            matchType,
            result,
            skip,
            teamId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MatchListParams{limit=$limit, matchType=$matchType, result=$result, skip=$skip, teamId=$teamId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
