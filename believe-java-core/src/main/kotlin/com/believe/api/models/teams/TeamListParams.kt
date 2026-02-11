// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.teams

import com.believe.api.core.Params
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a paginated list of all teams with optional filtering by league or culture score. */
class TeamListParams
private constructor(
    private val league: League?,
    private val limit: Long?,
    private val minCultureScore: Long?,
    private val skip: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by league */
    fun league(): Optional<League> = Optional.ofNullable(league)

    /** Maximum number of items to return (max: 100) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Minimum culture score */
    fun minCultureScore(): Optional<Long> = Optional.ofNullable(minCultureScore)

    /** Number of items to skip (offset) */
    fun skip(): Optional<Long> = Optional.ofNullable(skip)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TeamListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TeamListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TeamListParams]. */
    class Builder internal constructor() {

        private var league: League? = null
        private var limit: Long? = null
        private var minCultureScore: Long? = null
        private var skip: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(teamListParams: TeamListParams) = apply {
            league = teamListParams.league
            limit = teamListParams.limit
            minCultureScore = teamListParams.minCultureScore
            skip = teamListParams.skip
            additionalHeaders = teamListParams.additionalHeaders.toBuilder()
            additionalQueryParams = teamListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by league */
        fun league(league: League?) = apply { this.league = league }

        /** Alias for calling [Builder.league] with `league.orElse(null)`. */
        fun league(league: Optional<League>) = league(league.getOrNull())

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

        /** Minimum culture score */
        fun minCultureScore(minCultureScore: Long?) = apply {
            this.minCultureScore = minCultureScore
        }

        /**
         * Alias for [Builder.minCultureScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minCultureScore(minCultureScore: Long) = minCultureScore(minCultureScore as Long?)

        /** Alias for calling [Builder.minCultureScore] with `minCultureScore.orElse(null)`. */
        fun minCultureScore(minCultureScore: Optional<Long>) =
            minCultureScore(minCultureScore.getOrNull())

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
         * Returns an immutable instance of [TeamListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TeamListParams =
            TeamListParams(
                league,
                limit,
                minCultureScore,
                skip,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                league?.let { put("league", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                minCultureScore?.let { put("min_culture_score", it.toString()) }
                skip?.let { put("skip", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TeamListParams &&
            league == other.league &&
            limit == other.limit &&
            minCultureScore == other.minCultureScore &&
            skip == other.skip &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(league, limit, minCultureScore, skip, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TeamListParams{league=$league, limit=$limit, minCultureScore=$minCultureScore, skip=$skip, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
