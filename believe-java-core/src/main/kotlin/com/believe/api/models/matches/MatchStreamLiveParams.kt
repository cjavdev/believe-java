// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import com.believe.api.core.Params
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * WebSocket endpoint for real-time live match simulation.
 *
 * Connect to receive a stream of match events as they happen in a simulated football match.
 *
 * ## Connection
 *
 * Connect via WebSocket with optional query parameters to customize the simulation.
 *
 * ## Example WebSocket URL
 *
 * ```
 * ws://localhost:8000/matches/live?home_team=AFC%20Richmond&away_team=Manchester%20City&speed=2.0&excitement_level=7
 * ```
 *
 * ## Server Messages
 *
 * The server sends JSON messages with these types:
 * - `match_start` - When the match begins
 * - `match_event` - For each match event (goals, fouls, cards, etc.)
 * - `match_end` - When the match concludes
 * - `error` - If an error occurs
 * - `pong` - Response to client ping
 *
 * ## Client Messages
 *
 * Send JSON to control the simulation:
 * - `{"action": "ping"}` - Keep-alive, server responds with `{"type": "pong"}`
 * - `{"action": "pause"}` - Pause the simulation
 * - `{"action": "resume"}` - Resume a paused simulation
 * - `{"action": "set_speed", "speed": 2.0}` - Change playback speed (0.1-10.0)
 * - `{"action": "get_status"}` - Request current match status
 */
class MatchStreamLiveParams
private constructor(
    private val awayTeam: String?,
    private val excitementLevel: Long?,
    private val homeTeam: String?,
    private val speed: Double?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Away team name */
    fun awayTeam(): Optional<String> = Optional.ofNullable(awayTeam)

    /** How eventful the match should be (1=boring, 10=chaos) */
    fun excitementLevel(): Optional<Long> = Optional.ofNullable(excitementLevel)

    /** Home team name */
    fun homeTeam(): Optional<String> = Optional.ofNullable(homeTeam)

    /** Simulation speed multiplier (1.0 = real-time) */
    fun speed(): Optional<Double> = Optional.ofNullable(speed)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MatchStreamLiveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [MatchStreamLiveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MatchStreamLiveParams]. */
    class Builder internal constructor() {

        private var awayTeam: String? = null
        private var excitementLevel: Long? = null
        private var homeTeam: String? = null
        private var speed: Double? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(matchStreamLiveParams: MatchStreamLiveParams) = apply {
            awayTeam = matchStreamLiveParams.awayTeam
            excitementLevel = matchStreamLiveParams.excitementLevel
            homeTeam = matchStreamLiveParams.homeTeam
            speed = matchStreamLiveParams.speed
            additionalHeaders = matchStreamLiveParams.additionalHeaders.toBuilder()
            additionalQueryParams = matchStreamLiveParams.additionalQueryParams.toBuilder()
        }

        /** Away team name */
        fun awayTeam(awayTeam: String?) = apply { this.awayTeam = awayTeam }

        /** Alias for calling [Builder.awayTeam] with `awayTeam.orElse(null)`. */
        fun awayTeam(awayTeam: Optional<String>) = awayTeam(awayTeam.getOrNull())

        /** How eventful the match should be (1=boring, 10=chaos) */
        fun excitementLevel(excitementLevel: Long?) = apply {
            this.excitementLevel = excitementLevel
        }

        /**
         * Alias for [Builder.excitementLevel].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun excitementLevel(excitementLevel: Long) = excitementLevel(excitementLevel as Long?)

        /** Alias for calling [Builder.excitementLevel] with `excitementLevel.orElse(null)`. */
        fun excitementLevel(excitementLevel: Optional<Long>) =
            excitementLevel(excitementLevel.getOrNull())

        /** Home team name */
        fun homeTeam(homeTeam: String?) = apply { this.homeTeam = homeTeam }

        /** Alias for calling [Builder.homeTeam] with `homeTeam.orElse(null)`. */
        fun homeTeam(homeTeam: Optional<String>) = homeTeam(homeTeam.getOrNull())

        /** Simulation speed multiplier (1.0 = real-time) */
        fun speed(speed: Double?) = apply { this.speed = speed }

        /**
         * Alias for [Builder.speed].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun speed(speed: Double) = speed(speed as Double?)

        /** Alias for calling [Builder.speed] with `speed.orElse(null)`. */
        fun speed(speed: Optional<Double>) = speed(speed.getOrNull())

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
         * Returns an immutable instance of [MatchStreamLiveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MatchStreamLiveParams =
            MatchStreamLiveParams(
                awayTeam,
                excitementLevel,
                homeTeam,
                speed,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                awayTeam?.let { put("away_team", it) }
                excitementLevel?.let { put("excitement_level", it.toString()) }
                homeTeam?.let { put("home_team", it) }
                speed?.let { put("speed", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MatchStreamLiveParams &&
            awayTeam == other.awayTeam &&
            excitementLevel == other.excitementLevel &&
            homeTeam == other.homeTeam &&
            speed == other.speed &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            awayTeam,
            excitementLevel,
            homeTeam,
            speed,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MatchStreamLiveParams{awayTeam=$awayTeam, excitementLevel=$excitementLevel, homeTeam=$homeTeam, speed=$speed, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
