// File generated from our OpenAPI spec by Stainless.

package com.believe.api.models.matches

import com.believe.api.core.BaseDeserializer
import com.believe.api.core.BaseSerializer
import com.believe.api.core.ExcludeMissing
import com.believe.api.core.JsonField
import com.believe.api.core.JsonMissing
import com.believe.api.core.JsonValue
import com.believe.api.core.Params
import com.believe.api.core.allMaxBy
import com.believe.api.core.checkKnown
import com.believe.api.core.getOrThrow
import com.believe.api.core.http.Headers
import com.believe.api.core.http.QueryParams
import com.believe.api.core.toImmutable
import com.believe.api.errors.BelieveInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update specific fields of an existing match (e.g., update score). */
class MatchUpdateParams
private constructor(
    private val matchId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun matchId(): Optional<String> = Optional.ofNullable(matchId)

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attendance(): Optional<Long> = body.attendance()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awayScore(): Optional<Long> = body.awayScore()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun awayTeamId(): Optional<String> = body.awayTeamId()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun date(): Optional<OffsetDateTime> = body.date()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun episodeId(): Optional<String> = body.episodeId()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun homeScore(): Optional<Long> = body.homeScore()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun homeTeamId(): Optional<String> = body.homeTeamId()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lessonLearned(): Optional<String> = body.lessonLearned()

    /**
     * Types of matches.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun matchType(): Optional<MatchType> = body.matchType()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun possessionPercentage(): Optional<Double> = body.possessionPercentage()

    /**
     * Match result types.
     *
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<MatchResult> = body.result()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tedHalftimeSpeech(): Optional<String> = body.tedHalftimeSpeech()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ticketRevenueGbp(): Optional<TicketRevenueGbp> = body.ticketRevenueGbp()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun turningPoints(): Optional<List<TurningPoint>> = body.turningPoints()

    /**
     * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weatherTempCelsius(): Optional<Double> = body.weatherTempCelsius()

    /**
     * Returns the raw JSON value of [attendance].
     *
     * Unlike [attendance], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _attendance(): JsonField<Long> = body._attendance()

    /**
     * Returns the raw JSON value of [awayScore].
     *
     * Unlike [awayScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _awayScore(): JsonField<Long> = body._awayScore()

    /**
     * Returns the raw JSON value of [awayTeamId].
     *
     * Unlike [awayTeamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _awayTeamId(): JsonField<String> = body._awayTeamId()

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _date(): JsonField<OffsetDateTime> = body._date()

    /**
     * Returns the raw JSON value of [episodeId].
     *
     * Unlike [episodeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _episodeId(): JsonField<String> = body._episodeId()

    /**
     * Returns the raw JSON value of [homeScore].
     *
     * Unlike [homeScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _homeScore(): JsonField<Long> = body._homeScore()

    /**
     * Returns the raw JSON value of [homeTeamId].
     *
     * Unlike [homeTeamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _homeTeamId(): JsonField<String> = body._homeTeamId()

    /**
     * Returns the raw JSON value of [lessonLearned].
     *
     * Unlike [lessonLearned], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lessonLearned(): JsonField<String> = body._lessonLearned()

    /**
     * Returns the raw JSON value of [matchType].
     *
     * Unlike [matchType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _matchType(): JsonField<MatchType> = body._matchType()

    /**
     * Returns the raw JSON value of [possessionPercentage].
     *
     * Unlike [possessionPercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _possessionPercentage(): JsonField<Double> = body._possessionPercentage()

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _result(): JsonField<MatchResult> = body._result()

    /**
     * Returns the raw JSON value of [tedHalftimeSpeech].
     *
     * Unlike [tedHalftimeSpeech], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _tedHalftimeSpeech(): JsonField<String> = body._tedHalftimeSpeech()

    /**
     * Returns the raw JSON value of [ticketRevenueGbp].
     *
     * Unlike [ticketRevenueGbp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _ticketRevenueGbp(): JsonField<TicketRevenueGbp> = body._ticketRevenueGbp()

    /**
     * Returns the raw JSON value of [turningPoints].
     *
     * Unlike [turningPoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _turningPoints(): JsonField<List<TurningPoint>> = body._turningPoints()

    /**
     * Returns the raw JSON value of [weatherTempCelsius].
     *
     * Unlike [weatherTempCelsius], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _weatherTempCelsius(): JsonField<Double> = body._weatherTempCelsius()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MatchUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [MatchUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MatchUpdateParams]. */
    class Builder internal constructor() {

        private var matchId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(matchUpdateParams: MatchUpdateParams) = apply {
            matchId = matchUpdateParams.matchId
            body = matchUpdateParams.body.toBuilder()
            additionalHeaders = matchUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = matchUpdateParams.additionalQueryParams.toBuilder()
        }

        fun matchId(matchId: String?) = apply { this.matchId = matchId }

        /** Alias for calling [Builder.matchId] with `matchId.orElse(null)`. */
        fun matchId(matchId: Optional<String>) = matchId(matchId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [attendance]
         * - [awayScore]
         * - [awayTeamId]
         * - [date]
         * - [episodeId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun attendance(attendance: Long?) = apply { body.attendance(attendance) }

        /**
         * Alias for [Builder.attendance].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun attendance(attendance: Long) = attendance(attendance as Long?)

        /** Alias for calling [Builder.attendance] with `attendance.orElse(null)`. */
        fun attendance(attendance: Optional<Long>) = attendance(attendance.getOrNull())

        /**
         * Sets [Builder.attendance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attendance] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun attendance(attendance: JsonField<Long>) = apply { body.attendance(attendance) }

        fun awayScore(awayScore: Long?) = apply { body.awayScore(awayScore) }

        /**
         * Alias for [Builder.awayScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun awayScore(awayScore: Long) = awayScore(awayScore as Long?)

        /** Alias for calling [Builder.awayScore] with `awayScore.orElse(null)`. */
        fun awayScore(awayScore: Optional<Long>) = awayScore(awayScore.getOrNull())

        /**
         * Sets [Builder.awayScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awayScore] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun awayScore(awayScore: JsonField<Long>) = apply { body.awayScore(awayScore) }

        fun awayTeamId(awayTeamId: String?) = apply { body.awayTeamId(awayTeamId) }

        /** Alias for calling [Builder.awayTeamId] with `awayTeamId.orElse(null)`. */
        fun awayTeamId(awayTeamId: Optional<String>) = awayTeamId(awayTeamId.getOrNull())

        /**
         * Sets [Builder.awayTeamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.awayTeamId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun awayTeamId(awayTeamId: JsonField<String>) = apply { body.awayTeamId(awayTeamId) }

        fun date(date: OffsetDateTime?) = apply { body.date(date) }

        /** Alias for calling [Builder.date] with `date.orElse(null)`. */
        fun date(date: Optional<OffsetDateTime>) = date(date.getOrNull())

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun date(date: JsonField<OffsetDateTime>) = apply { body.date(date) }

        fun episodeId(episodeId: String?) = apply { body.episodeId(episodeId) }

        /** Alias for calling [Builder.episodeId] with `episodeId.orElse(null)`. */
        fun episodeId(episodeId: Optional<String>) = episodeId(episodeId.getOrNull())

        /**
         * Sets [Builder.episodeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.episodeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun episodeId(episodeId: JsonField<String>) = apply { body.episodeId(episodeId) }

        fun homeScore(homeScore: Long?) = apply { body.homeScore(homeScore) }

        /**
         * Alias for [Builder.homeScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun homeScore(homeScore: Long) = homeScore(homeScore as Long?)

        /** Alias for calling [Builder.homeScore] with `homeScore.orElse(null)`. */
        fun homeScore(homeScore: Optional<Long>) = homeScore(homeScore.getOrNull())

        /**
         * Sets [Builder.homeScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.homeScore] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun homeScore(homeScore: JsonField<Long>) = apply { body.homeScore(homeScore) }

        fun homeTeamId(homeTeamId: String?) = apply { body.homeTeamId(homeTeamId) }

        /** Alias for calling [Builder.homeTeamId] with `homeTeamId.orElse(null)`. */
        fun homeTeamId(homeTeamId: Optional<String>) = homeTeamId(homeTeamId.getOrNull())

        /**
         * Sets [Builder.homeTeamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.homeTeamId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun homeTeamId(homeTeamId: JsonField<String>) = apply { body.homeTeamId(homeTeamId) }

        fun lessonLearned(lessonLearned: String?) = apply { body.lessonLearned(lessonLearned) }

        /** Alias for calling [Builder.lessonLearned] with `lessonLearned.orElse(null)`. */
        fun lessonLearned(lessonLearned: Optional<String>) =
            lessonLearned(lessonLearned.getOrNull())

        /**
         * Sets [Builder.lessonLearned] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lessonLearned] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lessonLearned(lessonLearned: JsonField<String>) = apply {
            body.lessonLearned(lessonLearned)
        }

        /** Types of matches. */
        fun matchType(matchType: MatchType?) = apply { body.matchType(matchType) }

        /** Alias for calling [Builder.matchType] with `matchType.orElse(null)`. */
        fun matchType(matchType: Optional<MatchType>) = matchType(matchType.getOrNull())

        /**
         * Sets [Builder.matchType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matchType] with a well-typed [MatchType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun matchType(matchType: JsonField<MatchType>) = apply { body.matchType(matchType) }

        fun possessionPercentage(possessionPercentage: Double?) = apply {
            body.possessionPercentage(possessionPercentage)
        }

        /**
         * Alias for [Builder.possessionPercentage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun possessionPercentage(possessionPercentage: Double) =
            possessionPercentage(possessionPercentage as Double?)

        /**
         * Alias for calling [Builder.possessionPercentage] with
         * `possessionPercentage.orElse(null)`.
         */
        fun possessionPercentage(possessionPercentage: Optional<Double>) =
            possessionPercentage(possessionPercentage.getOrNull())

        /**
         * Sets [Builder.possessionPercentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.possessionPercentage] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun possessionPercentage(possessionPercentage: JsonField<Double>) = apply {
            body.possessionPercentage(possessionPercentage)
        }

        /** Match result types. */
        fun result(result: MatchResult?) = apply { body.result(result) }

        /** Alias for calling [Builder.result] with `result.orElse(null)`. */
        fun result(result: Optional<MatchResult>) = result(result.getOrNull())

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [MatchResult] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun result(result: JsonField<MatchResult>) = apply { body.result(result) }

        fun tedHalftimeSpeech(tedHalftimeSpeech: String?) = apply {
            body.tedHalftimeSpeech(tedHalftimeSpeech)
        }

        /** Alias for calling [Builder.tedHalftimeSpeech] with `tedHalftimeSpeech.orElse(null)`. */
        fun tedHalftimeSpeech(tedHalftimeSpeech: Optional<String>) =
            tedHalftimeSpeech(tedHalftimeSpeech.getOrNull())

        /**
         * Sets [Builder.tedHalftimeSpeech] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tedHalftimeSpeech] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tedHalftimeSpeech(tedHalftimeSpeech: JsonField<String>) = apply {
            body.tedHalftimeSpeech(tedHalftimeSpeech)
        }

        fun ticketRevenueGbp(ticketRevenueGbp: TicketRevenueGbp?) = apply {
            body.ticketRevenueGbp(ticketRevenueGbp)
        }

        /** Alias for calling [Builder.ticketRevenueGbp] with `ticketRevenueGbp.orElse(null)`. */
        fun ticketRevenueGbp(ticketRevenueGbp: Optional<TicketRevenueGbp>) =
            ticketRevenueGbp(ticketRevenueGbp.getOrNull())

        /**
         * Sets [Builder.ticketRevenueGbp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ticketRevenueGbp] with a well-typed [TicketRevenueGbp]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ticketRevenueGbp(ticketRevenueGbp: JsonField<TicketRevenueGbp>) = apply {
            body.ticketRevenueGbp(ticketRevenueGbp)
        }

        /** Alias for calling [ticketRevenueGbp] with `TicketRevenueGbp.ofNumber(number)`. */
        fun ticketRevenueGbp(number: Double) = apply { body.ticketRevenueGbp(number) }

        /** Alias for calling [ticketRevenueGbp] with `TicketRevenueGbp.ofString(string)`. */
        fun ticketRevenueGbp(string: String) = apply { body.ticketRevenueGbp(string) }

        fun turningPoints(turningPoints: List<TurningPoint>?) = apply {
            body.turningPoints(turningPoints)
        }

        /** Alias for calling [Builder.turningPoints] with `turningPoints.orElse(null)`. */
        fun turningPoints(turningPoints: Optional<List<TurningPoint>>) =
            turningPoints(turningPoints.getOrNull())

        /**
         * Sets [Builder.turningPoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.turningPoints] with a well-typed `List<TurningPoint>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun turningPoints(turningPoints: JsonField<List<TurningPoint>>) = apply {
            body.turningPoints(turningPoints)
        }

        /**
         * Adds a single [TurningPoint] to [turningPoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTurningPoint(turningPoint: TurningPoint) = apply {
            body.addTurningPoint(turningPoint)
        }

        fun weatherTempCelsius(weatherTempCelsius: Double?) = apply {
            body.weatherTempCelsius(weatherTempCelsius)
        }

        /**
         * Alias for [Builder.weatherTempCelsius].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun weatherTempCelsius(weatherTempCelsius: Double) =
            weatherTempCelsius(weatherTempCelsius as Double?)

        /**
         * Alias for calling [Builder.weatherTempCelsius] with `weatherTempCelsius.orElse(null)`.
         */
        fun weatherTempCelsius(weatherTempCelsius: Optional<Double>) =
            weatherTempCelsius(weatherTempCelsius.getOrNull())

        /**
         * Sets [Builder.weatherTempCelsius] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weatherTempCelsius] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun weatherTempCelsius(weatherTempCelsius: JsonField<Double>) = apply {
            body.weatherTempCelsius(weatherTempCelsius)
        }

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
         * Returns an immutable instance of [MatchUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MatchUpdateParams =
            MatchUpdateParams(
                matchId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> matchId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Model for updating a match (all fields optional). */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attendance: JsonField<Long>,
        private val awayScore: JsonField<Long>,
        private val awayTeamId: JsonField<String>,
        private val date: JsonField<OffsetDateTime>,
        private val episodeId: JsonField<String>,
        private val homeScore: JsonField<Long>,
        private val homeTeamId: JsonField<String>,
        private val lessonLearned: JsonField<String>,
        private val matchType: JsonField<MatchType>,
        private val possessionPercentage: JsonField<Double>,
        private val result: JsonField<MatchResult>,
        private val tedHalftimeSpeech: JsonField<String>,
        private val ticketRevenueGbp: JsonField<TicketRevenueGbp>,
        private val turningPoints: JsonField<List<TurningPoint>>,
        private val weatherTempCelsius: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attendance")
            @ExcludeMissing
            attendance: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("away_score")
            @ExcludeMissing
            awayScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("away_team_id")
            @ExcludeMissing
            awayTeamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("date")
            @ExcludeMissing
            date: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("episode_id")
            @ExcludeMissing
            episodeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("home_score")
            @ExcludeMissing
            homeScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("home_team_id")
            @ExcludeMissing
            homeTeamId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lesson_learned")
            @ExcludeMissing
            lessonLearned: JsonField<String> = JsonMissing.of(),
            @JsonProperty("match_type")
            @ExcludeMissing
            matchType: JsonField<MatchType> = JsonMissing.of(),
            @JsonProperty("possession_percentage")
            @ExcludeMissing
            possessionPercentage: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("result")
            @ExcludeMissing
            result: JsonField<MatchResult> = JsonMissing.of(),
            @JsonProperty("ted_halftime_speech")
            @ExcludeMissing
            tedHalftimeSpeech: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ticket_revenue_gbp")
            @ExcludeMissing
            ticketRevenueGbp: JsonField<TicketRevenueGbp> = JsonMissing.of(),
            @JsonProperty("turning_points")
            @ExcludeMissing
            turningPoints: JsonField<List<TurningPoint>> = JsonMissing.of(),
            @JsonProperty("weather_temp_celsius")
            @ExcludeMissing
            weatherTempCelsius: JsonField<Double> = JsonMissing.of(),
        ) : this(
            attendance,
            awayScore,
            awayTeamId,
            date,
            episodeId,
            homeScore,
            homeTeamId,
            lessonLearned,
            matchType,
            possessionPercentage,
            result,
            tedHalftimeSpeech,
            ticketRevenueGbp,
            turningPoints,
            weatherTempCelsius,
            mutableMapOf(),
        )

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attendance(): Optional<Long> = attendance.getOptional("attendance")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun awayScore(): Optional<Long> = awayScore.getOptional("away_score")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun awayTeamId(): Optional<String> = awayTeamId.getOptional("away_team_id")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun date(): Optional<OffsetDateTime> = date.getOptional("date")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun episodeId(): Optional<String> = episodeId.getOptional("episode_id")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun homeScore(): Optional<Long> = homeScore.getOptional("home_score")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun homeTeamId(): Optional<String> = homeTeamId.getOptional("home_team_id")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lessonLearned(): Optional<String> = lessonLearned.getOptional("lesson_learned")

        /**
         * Types of matches.
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun matchType(): Optional<MatchType> = matchType.getOptional("match_type")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun possessionPercentage(): Optional<Double> =
            possessionPercentage.getOptional("possession_percentage")

        /**
         * Match result types.
         *
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun result(): Optional<MatchResult> = result.getOptional("result")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tedHalftimeSpeech(): Optional<String> =
            tedHalftimeSpeech.getOptional("ted_halftime_speech")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ticketRevenueGbp(): Optional<TicketRevenueGbp> =
            ticketRevenueGbp.getOptional("ticket_revenue_gbp")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun turningPoints(): Optional<List<TurningPoint>> =
            turningPoints.getOptional("turning_points")

        /**
         * @throws BelieveInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun weatherTempCelsius(): Optional<Double> =
            weatherTempCelsius.getOptional("weather_temp_celsius")

        /**
         * Returns the raw JSON value of [attendance].
         *
         * Unlike [attendance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attendance") @ExcludeMissing fun _attendance(): JsonField<Long> = attendance

        /**
         * Returns the raw JSON value of [awayScore].
         *
         * Unlike [awayScore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("away_score") @ExcludeMissing fun _awayScore(): JsonField<Long> = awayScore

        /**
         * Returns the raw JSON value of [awayTeamId].
         *
         * Unlike [awayTeamId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("away_team_id")
        @ExcludeMissing
        fun _awayTeamId(): JsonField<String> = awayTeamId

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

        /**
         * Returns the raw JSON value of [episodeId].
         *
         * Unlike [episodeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("episode_id") @ExcludeMissing fun _episodeId(): JsonField<String> = episodeId

        /**
         * Returns the raw JSON value of [homeScore].
         *
         * Unlike [homeScore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("home_score") @ExcludeMissing fun _homeScore(): JsonField<Long> = homeScore

        /**
         * Returns the raw JSON value of [homeTeamId].
         *
         * Unlike [homeTeamId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("home_team_id")
        @ExcludeMissing
        fun _homeTeamId(): JsonField<String> = homeTeamId

        /**
         * Returns the raw JSON value of [lessonLearned].
         *
         * Unlike [lessonLearned], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lesson_learned")
        @ExcludeMissing
        fun _lessonLearned(): JsonField<String> = lessonLearned

        /**
         * Returns the raw JSON value of [matchType].
         *
         * Unlike [matchType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match_type")
        @ExcludeMissing
        fun _matchType(): JsonField<MatchType> = matchType

        /**
         * Returns the raw JSON value of [possessionPercentage].
         *
         * Unlike [possessionPercentage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("possession_percentage")
        @ExcludeMissing
        fun _possessionPercentage(): JsonField<Double> = possessionPercentage

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<MatchResult> = result

        /**
         * Returns the raw JSON value of [tedHalftimeSpeech].
         *
         * Unlike [tedHalftimeSpeech], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ted_halftime_speech")
        @ExcludeMissing
        fun _tedHalftimeSpeech(): JsonField<String> = tedHalftimeSpeech

        /**
         * Returns the raw JSON value of [ticketRevenueGbp].
         *
         * Unlike [ticketRevenueGbp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ticket_revenue_gbp")
        @ExcludeMissing
        fun _ticketRevenueGbp(): JsonField<TicketRevenueGbp> = ticketRevenueGbp

        /**
         * Returns the raw JSON value of [turningPoints].
         *
         * Unlike [turningPoints], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("turning_points")
        @ExcludeMissing
        fun _turningPoints(): JsonField<List<TurningPoint>> = turningPoints

        /**
         * Returns the raw JSON value of [weatherTempCelsius].
         *
         * Unlike [weatherTempCelsius], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("weather_temp_celsius")
        @ExcludeMissing
        fun _weatherTempCelsius(): JsonField<Double> = weatherTempCelsius

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var attendance: JsonField<Long> = JsonMissing.of()
            private var awayScore: JsonField<Long> = JsonMissing.of()
            private var awayTeamId: JsonField<String> = JsonMissing.of()
            private var date: JsonField<OffsetDateTime> = JsonMissing.of()
            private var episodeId: JsonField<String> = JsonMissing.of()
            private var homeScore: JsonField<Long> = JsonMissing.of()
            private var homeTeamId: JsonField<String> = JsonMissing.of()
            private var lessonLearned: JsonField<String> = JsonMissing.of()
            private var matchType: JsonField<MatchType> = JsonMissing.of()
            private var possessionPercentage: JsonField<Double> = JsonMissing.of()
            private var result: JsonField<MatchResult> = JsonMissing.of()
            private var tedHalftimeSpeech: JsonField<String> = JsonMissing.of()
            private var ticketRevenueGbp: JsonField<TicketRevenueGbp> = JsonMissing.of()
            private var turningPoints: JsonField<MutableList<TurningPoint>>? = null
            private var weatherTempCelsius: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                attendance = body.attendance
                awayScore = body.awayScore
                awayTeamId = body.awayTeamId
                date = body.date
                episodeId = body.episodeId
                homeScore = body.homeScore
                homeTeamId = body.homeTeamId
                lessonLearned = body.lessonLearned
                matchType = body.matchType
                possessionPercentage = body.possessionPercentage
                result = body.result
                tedHalftimeSpeech = body.tedHalftimeSpeech
                ticketRevenueGbp = body.ticketRevenueGbp
                turningPoints = body.turningPoints.map { it.toMutableList() }
                weatherTempCelsius = body.weatherTempCelsius
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun attendance(attendance: Long?) = attendance(JsonField.ofNullable(attendance))

            /**
             * Alias for [Builder.attendance].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun attendance(attendance: Long) = attendance(attendance as Long?)

            /** Alias for calling [Builder.attendance] with `attendance.orElse(null)`. */
            fun attendance(attendance: Optional<Long>) = attendance(attendance.getOrNull())

            /**
             * Sets [Builder.attendance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attendance] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attendance(attendance: JsonField<Long>) = apply { this.attendance = attendance }

            fun awayScore(awayScore: Long?) = awayScore(JsonField.ofNullable(awayScore))

            /**
             * Alias for [Builder.awayScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun awayScore(awayScore: Long) = awayScore(awayScore as Long?)

            /** Alias for calling [Builder.awayScore] with `awayScore.orElse(null)`. */
            fun awayScore(awayScore: Optional<Long>) = awayScore(awayScore.getOrNull())

            /**
             * Sets [Builder.awayScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awayScore] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awayScore(awayScore: JsonField<Long>) = apply { this.awayScore = awayScore }

            fun awayTeamId(awayTeamId: String?) = awayTeamId(JsonField.ofNullable(awayTeamId))

            /** Alias for calling [Builder.awayTeamId] with `awayTeamId.orElse(null)`. */
            fun awayTeamId(awayTeamId: Optional<String>) = awayTeamId(awayTeamId.getOrNull())

            /**
             * Sets [Builder.awayTeamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awayTeamId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awayTeamId(awayTeamId: JsonField<String>) = apply { this.awayTeamId = awayTeamId }

            fun date(date: OffsetDateTime?) = date(JsonField.ofNullable(date))

            /** Alias for calling [Builder.date] with `date.orElse(null)`. */
            fun date(date: Optional<OffsetDateTime>) = date(date.getOrNull())

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

            fun episodeId(episodeId: String?) = episodeId(JsonField.ofNullable(episodeId))

            /** Alias for calling [Builder.episodeId] with `episodeId.orElse(null)`. */
            fun episodeId(episodeId: Optional<String>) = episodeId(episodeId.getOrNull())

            /**
             * Sets [Builder.episodeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.episodeId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun episodeId(episodeId: JsonField<String>) = apply { this.episodeId = episodeId }

            fun homeScore(homeScore: Long?) = homeScore(JsonField.ofNullable(homeScore))

            /**
             * Alias for [Builder.homeScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun homeScore(homeScore: Long) = homeScore(homeScore as Long?)

            /** Alias for calling [Builder.homeScore] with `homeScore.orElse(null)`. */
            fun homeScore(homeScore: Optional<Long>) = homeScore(homeScore.getOrNull())

            /**
             * Sets [Builder.homeScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.homeScore] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun homeScore(homeScore: JsonField<Long>) = apply { this.homeScore = homeScore }

            fun homeTeamId(homeTeamId: String?) = homeTeamId(JsonField.ofNullable(homeTeamId))

            /** Alias for calling [Builder.homeTeamId] with `homeTeamId.orElse(null)`. */
            fun homeTeamId(homeTeamId: Optional<String>) = homeTeamId(homeTeamId.getOrNull())

            /**
             * Sets [Builder.homeTeamId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.homeTeamId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun homeTeamId(homeTeamId: JsonField<String>) = apply { this.homeTeamId = homeTeamId }

            fun lessonLearned(lessonLearned: String?) =
                lessonLearned(JsonField.ofNullable(lessonLearned))

            /** Alias for calling [Builder.lessonLearned] with `lessonLearned.orElse(null)`. */
            fun lessonLearned(lessonLearned: Optional<String>) =
                lessonLearned(lessonLearned.getOrNull())

            /**
             * Sets [Builder.lessonLearned] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lessonLearned] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lessonLearned(lessonLearned: JsonField<String>) = apply {
                this.lessonLearned = lessonLearned
            }

            /** Types of matches. */
            fun matchType(matchType: MatchType?) = matchType(JsonField.ofNullable(matchType))

            /** Alias for calling [Builder.matchType] with `matchType.orElse(null)`. */
            fun matchType(matchType: Optional<MatchType>) = matchType(matchType.getOrNull())

            /**
             * Sets [Builder.matchType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchType] with a well-typed [MatchType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchType(matchType: JsonField<MatchType>) = apply { this.matchType = matchType }

            fun possessionPercentage(possessionPercentage: Double?) =
                possessionPercentage(JsonField.ofNullable(possessionPercentage))

            /**
             * Alias for [Builder.possessionPercentage].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun possessionPercentage(possessionPercentage: Double) =
                possessionPercentage(possessionPercentage as Double?)

            /**
             * Alias for calling [Builder.possessionPercentage] with
             * `possessionPercentage.orElse(null)`.
             */
            fun possessionPercentage(possessionPercentage: Optional<Double>) =
                possessionPercentage(possessionPercentage.getOrNull())

            /**
             * Sets [Builder.possessionPercentage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.possessionPercentage] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun possessionPercentage(possessionPercentage: JsonField<Double>) = apply {
                this.possessionPercentage = possessionPercentage
            }

            /** Match result types. */
            fun result(result: MatchResult?) = result(JsonField.ofNullable(result))

            /** Alias for calling [Builder.result] with `result.orElse(null)`. */
            fun result(result: Optional<MatchResult>) = result(result.getOrNull())

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [MatchResult] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<MatchResult>) = apply { this.result = result }

            fun tedHalftimeSpeech(tedHalftimeSpeech: String?) =
                tedHalftimeSpeech(JsonField.ofNullable(tedHalftimeSpeech))

            /**
             * Alias for calling [Builder.tedHalftimeSpeech] with `tedHalftimeSpeech.orElse(null)`.
             */
            fun tedHalftimeSpeech(tedHalftimeSpeech: Optional<String>) =
                tedHalftimeSpeech(tedHalftimeSpeech.getOrNull())

            /**
             * Sets [Builder.tedHalftimeSpeech] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tedHalftimeSpeech] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tedHalftimeSpeech(tedHalftimeSpeech: JsonField<String>) = apply {
                this.tedHalftimeSpeech = tedHalftimeSpeech
            }

            fun ticketRevenueGbp(ticketRevenueGbp: TicketRevenueGbp?) =
                ticketRevenueGbp(JsonField.ofNullable(ticketRevenueGbp))

            /**
             * Alias for calling [Builder.ticketRevenueGbp] with `ticketRevenueGbp.orElse(null)`.
             */
            fun ticketRevenueGbp(ticketRevenueGbp: Optional<TicketRevenueGbp>) =
                ticketRevenueGbp(ticketRevenueGbp.getOrNull())

            /**
             * Sets [Builder.ticketRevenueGbp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ticketRevenueGbp] with a well-typed
             * [TicketRevenueGbp] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun ticketRevenueGbp(ticketRevenueGbp: JsonField<TicketRevenueGbp>) = apply {
                this.ticketRevenueGbp = ticketRevenueGbp
            }

            /** Alias for calling [ticketRevenueGbp] with `TicketRevenueGbp.ofNumber(number)`. */
            fun ticketRevenueGbp(number: Double) =
                ticketRevenueGbp(TicketRevenueGbp.ofNumber(number))

            /** Alias for calling [ticketRevenueGbp] with `TicketRevenueGbp.ofString(string)`. */
            fun ticketRevenueGbp(string: String) =
                ticketRevenueGbp(TicketRevenueGbp.ofString(string))

            fun turningPoints(turningPoints: List<TurningPoint>?) =
                turningPoints(JsonField.ofNullable(turningPoints))

            /** Alias for calling [Builder.turningPoints] with `turningPoints.orElse(null)`. */
            fun turningPoints(turningPoints: Optional<List<TurningPoint>>) =
                turningPoints(turningPoints.getOrNull())

            /**
             * Sets [Builder.turningPoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.turningPoints] with a well-typed
             * `List<TurningPoint>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun turningPoints(turningPoints: JsonField<List<TurningPoint>>) = apply {
                this.turningPoints = turningPoints.map { it.toMutableList() }
            }

            /**
             * Adds a single [TurningPoint] to [turningPoints].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTurningPoint(turningPoint: TurningPoint) = apply {
                turningPoints =
                    (turningPoints ?: JsonField.of(mutableListOf())).also {
                        checkKnown("turningPoints", it).add(turningPoint)
                    }
            }

            fun weatherTempCelsius(weatherTempCelsius: Double?) =
                weatherTempCelsius(JsonField.ofNullable(weatherTempCelsius))

            /**
             * Alias for [Builder.weatherTempCelsius].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun weatherTempCelsius(weatherTempCelsius: Double) =
                weatherTempCelsius(weatherTempCelsius as Double?)

            /**
             * Alias for calling [Builder.weatherTempCelsius] with
             * `weatherTempCelsius.orElse(null)`.
             */
            fun weatherTempCelsius(weatherTempCelsius: Optional<Double>) =
                weatherTempCelsius(weatherTempCelsius.getOrNull())

            /**
             * Sets [Builder.weatherTempCelsius] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weatherTempCelsius] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun weatherTempCelsius(weatherTempCelsius: JsonField<Double>) = apply {
                this.weatherTempCelsius = weatherTempCelsius
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
             */
            fun build(): Body =
                Body(
                    attendance,
                    awayScore,
                    awayTeamId,
                    date,
                    episodeId,
                    homeScore,
                    homeTeamId,
                    lessonLearned,
                    matchType,
                    possessionPercentage,
                    result,
                    tedHalftimeSpeech,
                    ticketRevenueGbp,
                    (turningPoints ?: JsonMissing.of()).map { it.toImmutable() },
                    weatherTempCelsius,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            attendance()
            awayScore()
            awayTeamId()
            date()
            episodeId()
            homeScore()
            homeTeamId()
            lessonLearned()
            matchType().ifPresent { it.validate() }
            possessionPercentage()
            result().ifPresent { it.validate() }
            tedHalftimeSpeech()
            ticketRevenueGbp().ifPresent { it.validate() }
            turningPoints().ifPresent { it.forEach { it.validate() } }
            weatherTempCelsius()
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
            (if (attendance.asKnown().isPresent) 1 else 0) +
                (if (awayScore.asKnown().isPresent) 1 else 0) +
                (if (awayTeamId.asKnown().isPresent) 1 else 0) +
                (if (date.asKnown().isPresent) 1 else 0) +
                (if (episodeId.asKnown().isPresent) 1 else 0) +
                (if (homeScore.asKnown().isPresent) 1 else 0) +
                (if (homeTeamId.asKnown().isPresent) 1 else 0) +
                (if (lessonLearned.asKnown().isPresent) 1 else 0) +
                (matchType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (possessionPercentage.asKnown().isPresent) 1 else 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tedHalftimeSpeech.asKnown().isPresent) 1 else 0) +
                (ticketRevenueGbp.asKnown().getOrNull()?.validity() ?: 0) +
                (turningPoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (weatherTempCelsius.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                attendance == other.attendance &&
                awayScore == other.awayScore &&
                awayTeamId == other.awayTeamId &&
                date == other.date &&
                episodeId == other.episodeId &&
                homeScore == other.homeScore &&
                homeTeamId == other.homeTeamId &&
                lessonLearned == other.lessonLearned &&
                matchType == other.matchType &&
                possessionPercentage == other.possessionPercentage &&
                result == other.result &&
                tedHalftimeSpeech == other.tedHalftimeSpeech &&
                ticketRevenueGbp == other.ticketRevenueGbp &&
                turningPoints == other.turningPoints &&
                weatherTempCelsius == other.weatherTempCelsius &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attendance,
                awayScore,
                awayTeamId,
                date,
                episodeId,
                homeScore,
                homeTeamId,
                lessonLearned,
                matchType,
                possessionPercentage,
                result,
                tedHalftimeSpeech,
                ticketRevenueGbp,
                turningPoints,
                weatherTempCelsius,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{attendance=$attendance, awayScore=$awayScore, awayTeamId=$awayTeamId, date=$date, episodeId=$episodeId, homeScore=$homeScore, homeTeamId=$homeTeamId, lessonLearned=$lessonLearned, matchType=$matchType, possessionPercentage=$possessionPercentage, result=$result, tedHalftimeSpeech=$tedHalftimeSpeech, ticketRevenueGbp=$ticketRevenueGbp, turningPoints=$turningPoints, weatherTempCelsius=$weatherTempCelsius, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = TicketRevenueGbp.Deserializer::class)
    @JsonSerialize(using = TicketRevenueGbp.Serializer::class)
    class TicketRevenueGbp
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): TicketRevenueGbp = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitString(string: String) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TicketRevenueGbp && number == other.number && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(number, string)

        override fun toString(): String =
            when {
                number != null -> "TicketRevenueGbp{number=$number}"
                string != null -> "TicketRevenueGbp{string=$string}"
                _json != null -> "TicketRevenueGbp{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TicketRevenueGbp")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = TicketRevenueGbp(number = number)

            @JvmStatic fun ofString(string: String) = TicketRevenueGbp(string = string)
        }

        /**
         * An interface that defines how to map each variant of [TicketRevenueGbp] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [TicketRevenueGbp] to a value of type [T].
             *
             * An instance of [TicketRevenueGbp] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws BelieveInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BelieveInvalidDataException("Unknown TicketRevenueGbp: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<TicketRevenueGbp>(TicketRevenueGbp::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TicketRevenueGbp {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                TicketRevenueGbp(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                TicketRevenueGbp(number = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> TicketRevenueGbp(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<TicketRevenueGbp>(TicketRevenueGbp::class) {

            override fun serialize(
                value: TicketRevenueGbp,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TicketRevenueGbp")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MatchUpdateParams &&
            matchId == other.matchId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(matchId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MatchUpdateParams{matchId=$matchId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
